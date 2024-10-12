package Moves;

import ru.ifmo.se.pokemon.*;

public class Defence_Curl extends StatusMove {
    public Defence_Curl(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect effect = new Effect();
        effect.stat(Stat.DEFENSE, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "одевается в кольчугу (Defence Curl)";
    }
}
