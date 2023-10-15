package lab2;
import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;


public class MyPokemon extends Pokemon {

    public static void main(String[] args){
        Battle battle = new Battle();
        Pokemon bibarel = new Bibarel("bibarel", 1);
        Pokemon bidoof = new Bidoof("bidoof", 1);
        Pokemon electabuzz = new Electabuzz("electabuzz", 1);
        Pokemon milotic = new Milotic("milotic", 1);
        Pokemon sentret = new Sentret("sentret", 1);
        Pokemon staraptor = new Staraptor("staraptor", 1);
        battle.addAlly(bibarel);
        battle.addAlly(bidoof);
        battle.addAlly(electabuzz);
        battle.addFoe(milotic);
        battle.addFoe(sentret);
        battle.addFoe(staraptor);
        battle.go();
    }
}