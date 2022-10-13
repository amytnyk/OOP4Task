package lotr.characters;

import lotr.Character;

public class Elf extends Character {
    public Elf() {
        hp = 10;
        power = 10;
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < getPower())
            c.setHp(0);
        else
            c.decreasePower();
    }
}
