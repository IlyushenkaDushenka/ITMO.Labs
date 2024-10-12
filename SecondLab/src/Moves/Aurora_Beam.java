package Moves;

import ru.ifmo.se.pokemon.*;

public class Aurora_Beam extends SpecialMove {
    public Aurora_Beam(double power, double accuracy){
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
        effect.chance(0.1);
        effect.stat(Stat.ATTACK, -1);
        pokemon.addEffect(effect);
    }

    @Override
    protected String describe(){
        return "стреляет по Зимнему дворцу (Aurora Beam)";
    }
}
