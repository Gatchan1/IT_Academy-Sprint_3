package tasca1.n3.vehicles;

public abstract class Vehicle {
    private boolean started;
    private int velocity;

    public void setStarted(boolean started) {
        this.started = started;
        velocity = 0;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getVelocity() {
        return velocity;
    }

    public boolean isStarted() {
        return started;
    }
}
