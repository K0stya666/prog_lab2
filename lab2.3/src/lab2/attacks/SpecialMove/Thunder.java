package lab2.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove{
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    public void applyOppEffects(Pokemon p) {
        if (!p.hasType(Type.ELECTRIC)) {
            Effect e = new Effect().condition(Status.PARALYZE);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "Покемон вызывает мощную грозу и направляет молнию в сторону цели, нанося урон и имея шанс вызвать паралич!";
    }
}
