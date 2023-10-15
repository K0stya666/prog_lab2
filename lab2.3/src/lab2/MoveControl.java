package lab2;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;

public class MoveControl extends PhysicalMove {

    protected  double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3.0 * super.calcCriticalHit(att, def);
    }
}
