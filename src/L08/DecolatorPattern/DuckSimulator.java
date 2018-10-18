package L08.DecolatorPattern;

import L08.AdapterPattern.QuackCounter;
import L08.AdapterPattern.Quackable;
import L08.Duck.DuckCall;
import L08.Duck.MallardDuck;
import L08.Duck.RedheadDuck;
import L08.Duck.RubberDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate()
    {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);


        System.out.println("The duck quacked " + QuackCounter.getQuacks() + " times");
    }
    void simulate(Quackable duck)
    {
        duck.quack();
    }

}
