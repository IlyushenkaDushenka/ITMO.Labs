package Moves;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(double power, double accuracy){
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
        pokemon.addEffect(effect);
        Effect.freeze(pokemon);
    }

    @Override
    protected String describe(){
        return "призывает Генерала Мороза (Blizzard)";
    }
}
