import behaviours.IHero;
import behaviours.IVillain;
import enemies.Joker;
import enemies.Penguin;
import heroes.Batman;
import other.Arena;
import other.Game;

public class Runner {

    public static void main(String[] args) {

        IHero batman = new Batman();
        IVillain joker = new Joker();
        IVillain penguin = new Penguin();
        Arena arena = new Arena("Bat Cave");
        Game game = new Game(batman, joker, arena);

        System.out.println(game.startGame());

        

//        while (true) {
//            game.heroAttackVillain();
//            if (checkDead) break;
//            game.villainAttackhero();
//            if (checkDead) break;
//        }


    }
}
