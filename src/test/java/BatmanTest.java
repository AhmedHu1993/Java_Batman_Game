import enemies.Joker;
import heroes.Batman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BatmanTest {

    Batman batman;
    Joker joker;

    @Before
    public void before(){
        batman = new Batman();
        joker = new Joker();
    }

    @Test
    public void hasName(){
        assertEquals("BatMan", batman.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(200, batman.getHealthPoints());
    }

    @Test
    public void hasWeapons(){
        batman.addWeapons();
        assertEquals(3, batman.getWeaponsCount());
    }

    @Test
    public void hasAttackEffect(){
        batman.attack(joker);
        assertEquals(12, joker.getHealthPoints(), 3);
    }
}
