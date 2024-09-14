package tasca1.n3.commands;

import tasca1.n3.vehicles.Vehicle;

public class Accelerate extends VehicleCommand {
    private final int velocityIncrease;

    public Accelerate(Vehicle vehicle, int velocityIncrease) {
        this.vehicle = vehicle;
        this.velocityIncrease = velocityIncrease;
    }

    @Override
    public void execute() {
        if (vehicle.isStarted()) {
            vehicle.setVelocity(vehicle.getVelocity() + velocityIncrease);
            System.out.println("A " + vehicle.getClass().getSimpleName() + " has accelerated " +
                    "and its new speed is " + vehicle.getVelocity() + "km/s.");
        }
    }
}
