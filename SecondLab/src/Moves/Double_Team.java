package Moves;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove {
    public Double_Team(double power, double accuracy){
        super(Type.NORMAL, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect effect = new Effect();
        effect.stat(Stat.EVASION, +1);
        pokemon.addEffect(effect);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "делает ВЖУХ (Double Team)";
    }
}
