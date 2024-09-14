package tasca1.n3.commands;

import tasca1.n3.vehicles.Vehicle;

public class StartEngine extends VehicleCommand {
    public StartEngine(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.setStarted(true);
        System.out.println("A " + vehicle.getClass().getSimpleName() + " was just started.");
    }
}
