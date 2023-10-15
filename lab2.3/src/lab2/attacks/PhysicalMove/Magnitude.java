package lab2.attacks.PhysicalMove;
import ru.ifmo.se.pokemon.*;
//готово
public class Magnitude extends PhysicalMove{

    public Magnitude() {
        super(Type.GROUND, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK,randPower());
    }

    @Override
    protected String describe() {
        return "Покемон вызывает мощные подземные колебания, в результате чего возникает случайная величина, определяющая силу этой атаки!";
    }
    private static int randPower() {
        double a = Math.random() * 100;
        if (a <= 5)
            return 10;
        else if (a <= 15)
            return 30;
        else if (a <= 25)
            return 50;
        else if (a <= 55)
            return 70;
        else if (a <= 75)
            return 90;
        else if (a <= 85)
            return 110;
        else
            return 150;
    }
}
