import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Seel seel = new Seel("Львёнок", 100);
        Regice regice = new Regice("Снежок", 100);
        Dewdong dewdong = new Dewdong("Лев", 100);
        Cleffa cleffa = new Cleffa("Малыш", 100);
        Clefairy clefairy = new Clefairy("Подросток", 100);
        Clefable clefable = new Clefable("Батя", 100);
        battle.addAlly(seel);
        battle.addAlly(regice);
        battle.addAlly(dewdong);
        battle.addFoe(cleffa);
        battle.addFoe(clefairy);
        battle.addFoe(clefable);
        battle.go();
    }
}