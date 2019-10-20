package domain;

public class Uitleenbaar implements LeenState{
    private LeenRequest lr;

    public Uitleenbaar(LeenRequest lr){
        this.lr = lr;
    }

    @Override
    public void uitlenen() {
        lr.setHuidigState(lr.getUitgeleend());
    }

    @Override
    public void verwijderen() {
        lr.setHuidigState(lr.getVerwijderd());
    }

    @Override
    public void terugbrengen() {
        throw new DBException("Het product dat u probeert terug te brengen is al terug gebracht!");
    }

    @Override
    public void terugbrengenBeschadigd() {
        throw new DBException("Het product dat u probeert terug te brengen is al terug gebracht!");
    }

    @Override
    public void herstellen() {
        throw new DBException("Het product dat u probeert te herstellen is niet beschadigd!");
    }
}
