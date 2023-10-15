package lab2.pokemons;

import lab2.attacks.SpecialMove.Blizzard;
import lab2.attacks.StatusMove.FocusEnergy;
import lab2.attacks.StatusMove.ThunderWave;
import ru.ifmo.se.pokemon.*;

public class Bidoof extends Pokemon {
    public Bidoof (String name, int level) {
        super (name, level);
        setStats (59, 45, 40, 35, 40, 31);
        setType (Type.NORMAL);
        setMove (new Blizzard(),
                new ThunderWave(),
                new FocusEnergy());
    }
}
