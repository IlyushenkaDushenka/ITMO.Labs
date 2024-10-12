package Pokemons;

import Moves.Defence_Curl;
import Moves.Double_Team;
import Moves.Thunder_Wave;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Clefable extends Pokemon {
    public Clefable(String name, int level){
        super(name, level);
        super.setType(Type.FAIRY);
        super.setStats(95, 70, 73, 95, 90, 60);
        Double_Team double_team = new Double_Team(0, 100);
        Defence_Curl defence_curl = new Defence_Curl(0, 100);
        Thunder_Wave thunder_wave = new Thunder_Wave(0,100);
        setMove(double_team, defence_curl, thunder_wave, thunder_wave);
    }
}
