package tasca1.n3;

import tasca1.n3.commands.Accelerate;
import tasca1.n3.commands.Decelerate;
import tasca1.n3.commands.StartEngine;
import tasca1.n3.invoker.Invoker;
import tasca1.n3.vehicles.*;

public class Main {
    public static void main(String[] args) {
        Bicicle bike = new Bicicle();
        Car car = new Car();

        StartEngine command1 = new StartEngine(bike);
        StartEngine command2 = new StartEngine(car);
        Accelerate command3 = new Accelerate(car, 30);
        Accelerate command4 = new Accelerate(bike, 20);
        Decelerate command5 = new Decelerate(car, 15);

        Invoker invoker = new Invoker();

        invoker.addCommand(command1);
        invoker.addCommand(command2);
        invoker.addCommand(command3);
        invoker.addCommand(command4);
        invoker.addCommand(command5);

        invoker.executeCommands();
    }

}
