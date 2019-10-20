package domain;

public class Uitgeleend implements LeenState{
    private LeenRequest lr;

    public Uitgeleend(LeenRequest lr){
        this.lr = lr;
    }

    @Override
    public void terugbrengen() {
        lr.setHuidigState(lr.getUitleenbaar());
    }

    @Override
    public void terugbrengenBeschadigd() {
        lr.setHuidigState(lr.getBeschadigd());
    }

    @Override
    public void uitlenen() {
        throw new DBException("Het product dat u probeert te lenen is momenteel al uitgeleend!");
    }

    @Override
    public void verwijderen() {
        throw new DBException("Het product dat u probeert te  verwijderen is momenteel uitgeleend, probeer later opnieuw!");
    }

    @Override
    public void herstellen() {
        throw new DBException("Het product dat u probeert te  herstellen is momenteel uitgeleend, probeer later opnieuw!");
    }
}
