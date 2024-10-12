package Pokemons;

import Moves.Double_Team;
import Moves.Thunder_Wave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level){
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(50, 25, 28, 45, 55, 15);
        Double_Team double_team = new Double_Team(0, 100);
        Thunder_Wave thunder_wave = new Thunder_Wave(0,100);
        setMove(double_team, thunder_wave);
    }
}
