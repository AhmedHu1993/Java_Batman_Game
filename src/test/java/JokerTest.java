import enemies.Joker;
import heroes.Batman;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JokerTest {

    Joker joker;
    Batman batman;

    @Before
    public void before(){
        joker = new Joker();
        batman = new Batman();
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, joker.getHealthPoints());
    }

    @Test
    public void hasDamageAffect(){
        joker.takeDamage(5);
        assertEquals(15, joker.getHealthPoints());
    }

    @Test
    public void hasAttackEffect(){
        joker.attack(batman);
        assertEquals(185, batman.getHealthPoints());
    }

}
