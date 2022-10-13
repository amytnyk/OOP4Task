package lotr.characters;

import lotr.Character;

import java.util.Random;

public class Knight extends Character {
    public Knight() {
        hp = new Random().nextInt(11) + 2;
        power = new Random().nextInt(11) + 2;
    }
    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - new Random().nextInt(power) - 1);
    }
}
