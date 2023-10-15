package lab2.pokemons;

import lab2.attacks.PhysicalMove.Magnitude;
import lab2.attacks.SpecialMove.HydroPump;
import lab2.attacks.StatusMove.LightScreen;
import ru.ifmo.se.pokemon.*;

public class Electabuzz extends Pokemon{
    public Electabuzz (String name, int level) {
        super (name, level);
        setStats (65, 83, 57, 95, 85, 105);
        setType (Type.ELECTRIC);
        setMove (new Magnitude(),
                 new HydroPump(),
                 new LightScreen());
    }
}
