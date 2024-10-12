package Moves;

import ru.ifmo.se.pokemon.*;

public class Thunder_Wave extends StatusMove {
    public Thunder_Wave(double power, double accuracy){
        super(Type.ELECTRIC, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
        Effect.paralyze(pokemon);
    }

    @Override
    protected String describe(){
        return "становится Зевсом (на секунду) (Thunder Wave)";
    }
}
