package L08.AbstractFactoryPattern;

import L08.AdapterPattern.QuackCounter;
import L08.AdapterPattern.Quackable;
import L08.DecolatorPattern.QuackEcho;
import L08.Duck.DuckCall;
import L08.Duck.MallardDuck;
import L08.Duck.RedheadDuck;
import L08.Duck.RubberDuck;

public class EchoDuckFactory extends AbstractDuckFactory {

    @Override
    public Quackable createMallardDuck() {
        return new QuackEcho(new QuackCounter(new MallardDuck()));
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackEcho(new QuackCounter(new RedheadDuck()));
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackEcho(new QuackCounter(new DuckCall()));
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackEcho(new QuackCounter(new RubberDuck()));
    }
}
