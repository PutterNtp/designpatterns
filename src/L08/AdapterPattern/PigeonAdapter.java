package L08.AdapterPattern;

import L08.Duck.Pigeon;

public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon)
    {
        this.pigeon = pigeon;
    }
    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }
}
