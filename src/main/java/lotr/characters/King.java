package lotr.characters;

import lotr.Character;

import java.util.Random;

public class King extends Knight {
    public King() {
        hp = new Random().nextInt(11) + 5;
        power = new Random().nextInt(11) + 5;
    }
}
