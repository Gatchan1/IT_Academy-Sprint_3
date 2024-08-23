package tasca1.n1;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Input {
    static Scanner sc = new Scanner(System.in);

    public static byte readByte(String missatge) {
        byte reading = 0;
        boolean askUser = true;
        while (askUser) {
            try {
                System.out.println(missatge);
                reading = sc.nextByte();
                sc.nextLine();
                askUser = false;
            } catch (InputMismatchException e) {
                System.out.println("Error en la introducción del dato.");
                sc.nextLine();
            }
        }
        return reading;
    }

    public static double readDouble(String message) {
        String reading;
        double value = 0;
        boolean askUser = true;
        while (askUser) {
            try {
                System.out.println(message);
                reading = sc.nextLine();
                value = Double.parseDouble(reading);
                askUser = false;
            } catch (NumberFormatException e) {
                System.out.println("Error en la introducción del dato.");
            }
        }
        return value;
    }

    public static String readString(String message) {
        String reading = "a";
        boolean askUser = true;
        while (askUser) {
            try {
                System.out.println(message);
                reading = sc.nextLine();
                askUser = false;
            } catch (NoSuchElementException e) {
                System.out.println("Error en la introducción del dato.");
            }
        }
        return reading;
    }
}
