package lab2.attacks.StatusMove;
import ru.ifmo.se.pokemon.*;

public class LightScreen extends StatusMove{
    public LightScreen() {
        super(Type.PSYCHIC, 0, 0);
    }

    protected  void applyOppEffects (Pokemon p) {
        Effect e = new Effect().turns(5).stat(Stat.ATTACK, (int) (-0.5 * p.getStat(Stat.ATTACK)));
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "Покемон создает защитный световой барьер, который снижает урон от специальных атак противников в следующие несколько ходов!";
    }
}
