package L08.AbstractFactoryPattern;

import L08.AdapterPattern.*;
import L08.Duck.DuckCall;
import L08.Duck.MallardDuck;
import L08.Duck.RedheadDuck;
import L08.Duck.RubberDuck;

public class CoutingDuckFactory extends AbstractDuckFactory { //Have Decolator
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
