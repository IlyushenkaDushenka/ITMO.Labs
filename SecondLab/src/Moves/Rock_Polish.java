package Moves;

import ru.ifmo.se.pokemon.*;

public class Rock_Polish extends StatusMove{
    public Rock_Polish(double power, double accuracy){
        super(Type.ROCK, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect effect = new Effect();
        effect.stat(Stat.SPEED, +2);
        pokemon.addEffect(effect);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "становится Молнией МакКвином (Rock Polish)";
    }
}