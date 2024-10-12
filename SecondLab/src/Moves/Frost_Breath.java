package Moves;

import ru.ifmo.se.pokemon.*;

public class Frost_Breath extends SpecialMove {
    public Frost_Breath(double power, double accuracy){
        super(Type.ICE, power, accuracy);
    }
    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected double calcCriticalHit(Pokemon pokemon, Pokemon pokemon1) {
        return 2.0;
    }

    @Override
    protected String describe(){
        return "критически наносит критичекий удар (Frost Breath)";
    }
}
