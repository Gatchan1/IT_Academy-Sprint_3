package tasca1.n2;

import tasca1.n2.addresses.Address;
import tasca1.n2.datafactories.*;
import tasca1.n2.helpers.Input;
import tasca1.n2.phones.Phone;

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
                case 0: System.out.println("Gracias por utilizar la aplicación.");
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
        boolean wantPhone = Input.readYesNo("""
                        ¿Quieres introducir su número de teléfono?
                        's': sí
                        'n': no""");
        if (wantPhone) {
            phone = askPhone(dataCreator);
        }

        Address address = null;
        boolean wantAddress = Input.readYesNo("""
                        ¿Quieres introducir su dirección?
                        's': sí
                        'n': no""");
        if (wantAddress) {
            address = askAddress(dataCreator);
        }
        PersonData personData;
        if (wantPhone && wantAddress) {
            personData = new PersonData(name, phone, address);
        } else if (wantPhone) {
            personData = new PersonData(name, phone);
        } else if (wantAddress) {
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
        String phoneString = Input.readString("Introduce el número de teléfono, " +
                    "sin espacios e incluyendo el prefijo internacional correcto.");
        return dataCreator.createPhone(phoneString);
    }

    private static Address askAddress(DataFactory dataCreator) {
        String street = Input.readString("Introduce la calle.");
            int houseNumber = Input.readInt("Introduce el número de portal.");
            String floorAndDoor = Input.readString("Introduce piso y puerta (opcional).");
            String postalCode = Input.readString("Introduce el código postal.");
            String city = Input.readString("Introduce la localidad.");
            return dataCreator.createAddress(street, houseNumber, floorAndDoor, postalCode, city);
    }

    private static void showData() {
        System.out.println(Directory.getInstance());
    }
}