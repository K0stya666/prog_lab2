package lab2.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;
//готово
public class TripleKick extends PhysicalMove{
    public TripleKick() {
        super(Type.FIGHTING, 60, 90);
    }

    @Override
    protected String describe() {
        return "Покемон сосредотачивает свою энергию и внимание," +
                " увеличивая свои шансы нанести критический удар в следующем ходу!" +
                " Он ударяет три раза подряд с силой 10, 20, 30";
    }
}
