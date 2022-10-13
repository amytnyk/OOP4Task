package lotr;

public class Main {
    public static void main(String[] args) {
        new GameManager().fight(CharacterFactory.createCharacter(), CharacterFactory.createCharacter());
    }
}