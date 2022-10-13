package lotr;

import java.util.Random;

public class GameManager {
    void fight(Character character1, Character character2) {
        Character[] characters = {character1, character2};
        for (int i = new Random().nextInt(2); character1.isAlive() && character2.isAlive(); i = (i + 1) % 2) {
            System.out.printf("%s kicks %s\n", characters[i], characters[1 - i]);
            characters[i].kick(characters[1 - i]);
        }
        for (int i = 0; i < 2; i++)
            if (characters[i].isAlive())
                System.out.println(characters[i] + " win!");
    }
}
