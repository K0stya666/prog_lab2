package lab2.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class FocusEnergy extends PhysicalMove{
    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected  double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3.0 * super.calcCriticalHit(att, def);
    }

    @Override
    protected String describe() {
        return "Покемон сосредотачивает свою энергию и внимание, увеличивая свои шансы нанести критический удар в следующем ходу!";
    }
}
