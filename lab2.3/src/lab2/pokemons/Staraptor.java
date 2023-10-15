package lab2.pokemons;

import lab2.attacks.SpecialMove.Blizzard;
import lab2.attacks.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Staraptor extends Pokemon{
    public Staraptor (String name, int level) {
        super (name, level);
        setStats (85, 120, 70, 50, 60, 100);
        setType (Type.NORMAL, Type.FLYING);
        setMove (new Blizzard(),
                new ThunderWave());
    }
}