package tasca1.n1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public enum Undo {
    INSTANCE;

    private final List<String> commands = Collections.synchronizedList(new ArrayList<>());

    public static Undo getInstance() {
        return INSTANCE;
    }

    public void add(String command) {
            commands.add(command);
    }

    public String undo() {
        return commands.removeLast();
    }

    public void printHistory() {
        if (commands.isEmpty()) {
            System.out.println("No hay comandos previos");
        } else {
            ListIterator<String> li = commands.listIterator(commands.size());
            System.out.println("Últimos comandos:");
            while (li.hasPrevious()) {
                System.out.println(li.previous());
            }
        }
    }
}
