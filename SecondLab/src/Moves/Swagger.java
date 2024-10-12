package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(double power, double accuracy){
        super(Type.ICE, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
        Effect effect = new Effect();
        effect.stat(Stat.ATTACK, +2);
        pokemon.addEffect(effect);
        Effect.confuse(pokemon);
    }

    @Override
    protected String describe(){
        return "увеличает атаку противника и вводит его в ступор (Swagger)";
    }
}