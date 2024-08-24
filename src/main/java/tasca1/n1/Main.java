package tasca1.n1;

public class Main {
    private static final String symbols = "x*/+-";
    private static double result;
    private static double prevResult;

    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        result = Input.readDouble("Bienvenido a la calculadora sencilla." +
                "\nIntroduce un número para empezar.");
        newCommand();
        menu();
    }

    private static void menu() {
        boolean exit = false;
        do {
            switch (options()) {
                case 1:
                    newCommand();
                    break;
                case 2:
                    undoCommand();
                    break;
                case 3:
                    showCommandsHistory();
                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar l'aplicació");
                    exit = true;
                    break;
            }
        } while (!exit);
    }

    private static void newCommand() {
        prevResult = result;
        String command;
        System.out.println("El actual resultado es " + prevResult + ".");
        do {
            command = Input.readString("\nIntroduce un operador (+, -, *, /) seguido de otro número.");
        }
        while (!process(command));
        System.out.println(prevResult + " " + command + " =" +
                "\n   " + result);
    }

    private static void undoCommand() {
        String command = Undo.getInstance().undo();
        result = prevResult;
        System.out.println("Comando deshecho: " + command +
                "\nEl actual resultado es: " + result);
    }

    private static void showCommandsHistory() {
        Undo.getInstance().printHistory();
    }


    private static byte options() {
        byte option;
        final byte min = 0;
        final byte max = 3;

        do {
            option = Input.readByte("""
                    Escoge la opción deseada:
                    1. Seguir operando.
                    2. Deshacer comando.
                    3. Ver listado de últimos comandos.
                    0. Cerrar la calculadora.
                    """);
            if (option < min || option > max) {
                System.out.println("Escoge una opción válida");
            }
        } while (option < min || option > max);
        return option;
    }

    private static boolean process(String command) {
        boolean noErrors = false;
        try {
            char operator = getOperator(command.trim());
            double number = getNumber(command.trim());
            Undo.getInstance().add(command);
            execute(operator, number);
            noErrors = true;
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre cero.");
        } catch (CommandFormatException | NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("El comando introducido no es válido.");
        }
        return noErrors;
    }

    private static void execute(char operator, double number) throws ArithmeticException {
        switch (operator) {
            case 'x':
            case '*':
                result = result * number;
                break;
            case '/':
                if (number == 0) {
                    throw new ArithmeticException();
                }
                result = result / number;
                break;
            case '+':
                result = result + number;
                break;
            case '-':
                result = result - number;
                break;
        }
    }

    private static char getOperator(String command) throws CommandFormatException {
        if (command.isEmpty() || !symbols.contains("" + command.charAt(0))) {
            throw new CommandFormatException("El operador introducido no es válido.");
        }
        return command.charAt(0);
    }

    private static Double getNumber(String command) throws NumberFormatException, IndexOutOfBoundsException {
        String numStr = command.substring(1).trim();
        return Double.valueOf(numStr);
    }

}