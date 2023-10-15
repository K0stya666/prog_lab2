package lab2.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class ThunderWave extends StatusMove{
    public ThunderWave() {
        super(Type.ELECTRIC, 0, 90);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (!p.hasType(Type.ELECTRIC)) {
            Effect e = new Effect().chance(0.75).condition(Status.PARALYZE);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe() {
        return "Покемон создает грозовую волну, которая поражает цель мощным электрическим разрядом. Эта атака может парализовать цель и снизить ее скорость!";
    }
}
