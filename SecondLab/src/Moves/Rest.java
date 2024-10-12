package Moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(double power, double accuracy){
        super(Type.PSYCHIC, power, accuracy);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon){
        super.applyOppEffects(pokemon);
        Effect effect = new Effect();
        effect.turns(2);
        pokemon.addEffect(effect);
        pokemon.setMod(Stat.HP, (-(int) (pokemon.getStat(Stat.HP) - pokemon.getHP())));
        Effect.sleep(pokemon);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon){
        super.applySelfEffects(pokemon);
    }

    @Override
    protected String describe(){
        return "отхилился и спит (Rest)";
    }
}