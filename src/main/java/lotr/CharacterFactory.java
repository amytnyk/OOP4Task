package lotr;

import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    static Reflections reflections = new Reflections(Character.class);
    static Character createCharacter() {
        try {
            List<Class<? extends Character>> characters = reflections.getSubTypesOf(Character.class).stream().toList();
            return characters.get(new Random().nextInt(characters.size())).getConstructor().newInstance();
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
