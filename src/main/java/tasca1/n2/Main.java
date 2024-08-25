package tasca1.n2;

import tasca1.n2.datafactories.*;
import tasca1.n2.helpers.Input;

public class Main {
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean exit = false;
        do{
            switch(menuOptions()){
                case 1: inputData();
                    break;
                case 2: showData();
                    break;
                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
                    exit = true;
                    break;
            }
        }while(!exit);
    }

    private static byte menuOptions(){
        byte option;
        final byte min = 0;
        final byte max = 2;

        do{
            option = Input.readByte("""
                    Escoge la opción deseada:
                    1. Introducir dirección y/o teléfono.
                    2. Ver datos almacenados en la agenda.
                    0. Cerrar el programa.
                    """);
            if(option < min || option > max){
                System.out.println("Escoge una opción válida");
            }
        }while(option < min || option > max);
        return option;
    }

    private static void inputData() {
        DataFactory dataCreator = chooseDataFactory();

        String name = Input.readString("Escribe el nombre de la persona o empresa.");

        Phone phone = null;
        boolean askPhone = Input.readYesNo("""
                        ¿Quieres introducir su número de teléfono?
                        's': sí
                        'n': no""");
        if (askPhone) {
            phone = askPhone(dataCreator);
        }

        Address address = null;
        boolean askAddress = Input.readYesNo("""
                        ¿Quieres introducir su dirección?
                        's': sí
                        'n': no""");
        if (askAddress) {
            address = askAddress(dataCreator);
        }
        PersonData personData;
        if (askPhone && askAddress) {
            personData = new PersonData(name, phone, address);
        } else if (askPhone) {
            personData = new PersonData(name, phone);
        } else if (askAddress) {
            personData = new PersonData(name, address);
        } else  {
            personData = new PersonData(name);
        }
        Directory.getInstance().addData(personData);
        System.out.println("Registro añadido correctamente en la agenda.");
    }

    private static DataFactory chooseDataFactory() {
        byte option;
        final byte min = 1;
        final byte max = 4;
        DataFactory dataFactory = null;

        do{
            option = Input.readByte("""
                    Escoge el país del registro:
                    1. España.
                    2. Dinamarca.
                    3. Polonia
                    4. Reino Unido
                    """);
            if(option < min || option > max){
                System.out.println("Escoge una opción válida");
            }
        }while(option < min || option > max);

        dataFactory = switch (option) {
            case 1 -> new SpainDataFactory();
            case 2 -> new DenmarkDataFactory();
            case 3 -> new PolandDataFactory();
            case 4 -> new UKDataFactory();
            default -> dataFactory;
        };

        return dataFactory;
    }

    private static Phone askPhone(DataFactory dataCreator) {
        Phone phone;
        do {
            String phoneString = Input.readString("Introduce el número de teléfono, " +
                    "sin espacios e incluyendo el prefijo internacional correcto.");
            phone = dataCreator.createPhone(phoneString);
            if (phone == null) {
                System.out.println("El número introducido no es correcto. Vuelve a intentarlo.");
            }
        } while (phone == null);
        return phone;
    }

    private static Address askAddress(DataFactory dataCreator) {
        Address address;
        do {
            String street = Input.readString("Introduce la calle.");
            int houseNumber = Input.readInt("Introduce el número de portal.");
            String floorAndDoor = Input.readString("Introduce piso y puerta (opcional).");
            String postalCode = Input.readString("Introduce el código postal." +
                    "Comprueba que el formato corresponde con el país.");
            String city = Input.readString("Introduce la localidad.");
            address = dataCreator.createAddress(street, houseNumber, floorAndDoor, postalCode, city);
            if (address == null) {
                System.out.println("La dirección introducida no es correcta. Vuelve a intentarlo.");
            }
        } while (address == null);
        return address;
    }

    private static void showData() {
        System.out.println(Directory.getInstance());
    }
}