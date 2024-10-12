package Moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Rock_Slide extends PhysicalMove {
    public Rock_Slide(double power, double accuracy){
        super(Type.ROCK, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect effect = new Effect();
        effect.chance(0.3);
        pokemon.addEffect(effect);
        Effect.flinch(pokemon);
    }

    @Override
    protected String describe(){
        return "призывает каменный дождь (Rock Slide)";
    }
}
