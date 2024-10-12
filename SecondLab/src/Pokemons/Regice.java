package Pokemons;
import Moves.Rest;
import Moves.Rock_Polish;
import Moves.Rock_Slide;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Regice extends Pokemon {
    public Regice(String name, int level){
        super(name, level);
        super.setStats(80, 50, 100, 100, 200, 50);
        super.setType(Type.ICE);
        Rock_Slide rock_slide = new Rock_Slide(75, 90);
        Rest rest = new Rest(0, 100);
        Rock_Polish rock_polish = new Rock_Polish(0, 100);
        Swagger swagger = new Swagger(0, 90);
        super.setMove(rock_slide, rest, rock_polish, swagger);
    }
}