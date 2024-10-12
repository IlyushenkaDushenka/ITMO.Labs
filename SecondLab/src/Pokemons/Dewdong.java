package Pokemons;

import Moves.Aurora_Beam;
import Moves.Blizzard;
import Moves.Frost_Breath;
import Moves.Ice_Beam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Dewdong extends Pokemon {
    public Dewdong(String name, int level){
        super(name, level);
        super.setStats(65, 45, 55, 45, 70, 45);
        super.setType(Type.WATER);
        Aurora_Beam aurora_beam = new Aurora_Beam(65, 100);
        Ice_Beam ice_beam = new Ice_Beam(95, 100);
        Blizzard blizzard = new Blizzard(120, 70);
        Frost_Breath frost_breath = new Frost_Breath(40, 90);
        setMove(aurora_beam, ice_beam, blizzard, frost_breath);
    }
}