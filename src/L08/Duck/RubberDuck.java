package L08.Duck;

import L08.AdapterPattern.Quackable;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
