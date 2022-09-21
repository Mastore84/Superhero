import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

public class DatabaseTest {

    Superhero superhero = new Superhero("Superman", "Clark Kent", 1938, "Flyve, styrke", false, 9002.98);

    @Test
    public void showSuperhero() {
        System.out.println(superhero);
    }
}