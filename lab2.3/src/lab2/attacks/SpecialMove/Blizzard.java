package lab2.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;
//готово
public class Blizzard extends SpecialMove{
    public Blizzard () {
        super(Type.ICE,110,70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (p.hasType(Type.ICE)) {
            Effect e = new Effect().chance(0.1).condition(Status.FREEZE);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "Покемон вызывает сильную метель с ледяными снежными буранами, нанося урон и имея шанс заморозить цель!";
    }
}
