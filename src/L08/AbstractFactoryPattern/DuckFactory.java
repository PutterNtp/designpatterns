package L08.AbstractFactoryPattern;

import L08.AdapterPattern.*;
import L08.Duck.DuckCall;
import L08.Duck.MallardDuck;
import L08.Duck.RedheadDuck;
import L08.Duck.RubberDuck;

public class DuckFactory extends AbstractDuckFactory { //WithOut Decolator
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
