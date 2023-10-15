package lab2.attacks.SpecialMove;
import ru.ifmo.se.pokemon.*;
//готово
public class Aeroblast extends SpecialMove{
    public Aeroblast() {
        super(Type.FLYING, 100, 95);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 3.0 * super.calcCriticalHit(att, def);
    }

    @Override
    protected String describe() {
        return "Покемон выпускает мощный взрыв воздушных вихрей, поражая цель силой ветра!";
    }
}
