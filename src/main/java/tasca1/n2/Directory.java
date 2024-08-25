package tasca1.n2;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    private static final Directory instance;

    private final List<PersonData> data;

    private Directory() {
        data = new ArrayList<PersonData>();
    }

    static {
        instance = new Directory();
    }

    public static Directory getInstance() {
        return instance;
    }

    public void addData(PersonData personData) {
        data.add(personData);
    }

    @Override
    public String toString() {
        if (data.isEmpty()) return "No hay registros almacenados";
        StringBuilder strB = new StringBuilder();
        data.forEach(personData -> {
            strB.append(personData.toString());
            strB.append("\n\n");
        });
        return strB.toString();
    }
}
