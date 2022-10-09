package lotr;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    Character createCharacter() {
        try {
            List<Class<? extends Character>> characters = List.of(Elf.class, Hobbit.class, King.class, Knight.class);
            return characters.get((new Random(characters.size())).nextInt()).getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
