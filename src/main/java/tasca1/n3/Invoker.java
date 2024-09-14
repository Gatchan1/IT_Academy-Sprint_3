package tasca1.n3;

import tasca1.n3.commands.VehicleCommand;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<VehicleCommand> commands = new ArrayList<VehicleCommand>();

    public void addCommand(VehicleCommand command) {
         commands.add(command);
    }

    public void executeCommands() {
        commands.forEach(VehicleCommand::execute);
    }
}
