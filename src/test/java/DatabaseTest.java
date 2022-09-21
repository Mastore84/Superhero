import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class DatabaseTest {

    Database database;

    @BeforeEach
    void setup() {
        database = new Database();
        Superhero superhero1 = new Superhero("Superman", "Clark Kent", 1938, "Flyve, styrke", false, 9002.98);
        Superhero superhero2 = new Superhero("Spiderman", "Peter Parker", 1938, "Flyve, styrke", false, 9002.98);
        Superhero superhero3 = new Superhero("Batman", "Bruce Wayne", 1938, "Flyve, styrke", false, 9002.98);
        database.getSuperheroes().add(superhero1);
        database.getSuperheroes().add(superhero2);
        database.getSuperheroes().add(superhero3);
    }
    @Test
    public void addSuperhero() {
        database.addSuperhero("jebr", "skjdf", 27, "afer", true, 8324.89);
        assertEquals(4, database.getSize());
    }
}