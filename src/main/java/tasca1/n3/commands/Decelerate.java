package tasca1.n3.commands;

import tasca1.n3.vehicles.Vehicle;

public class Decelerate extends VehicleCommand {
    private final int velocityDecrease;

    public Decelerate(Vehicle vehicle, int velocityDecrease) {
        this.vehicle = vehicle;
        this.velocityDecrease = velocityDecrease;
    }

    @Override
    public void execute() {
        vehicle.setVelocity(vehicle.getVelocity() - velocityDecrease);
        System.out.println("A " + vehicle.getClass().getSimpleName() + " has decelerated and its new speed is "
                + vehicle.getVelocity() + "km/s.");
    }
}
