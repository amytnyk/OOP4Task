package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    static Reflections reflections = new Reflections("org.example.lotr");
    Character createCharacter() {
        try {
            List<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class).stream().toList();
            return characters.get((new Random(characters.size())).nextInt()).getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
