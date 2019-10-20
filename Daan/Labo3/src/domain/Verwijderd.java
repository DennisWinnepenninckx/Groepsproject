package domain;

public class Verwijderd implements LeenState{
    private LeenRequest lr;

    public Verwijderd(LeenRequest lr){
        this.lr = lr;
    }

    @Override
    public void uitlenen() {
        throw new DBException("Het product dat u probeert te lenen is uit het aanbod verwijderd!");
    }

    @Override
    public void terugbrengen() {
        throw new DBException("Het product dat u probeert terug te brengen is uit het aanbod verwijderd!");
    }

    @Override
    public void terugbrengenBeschadigd() {
        throw new DBException("Het product dat u probeert terug te brengen is uit het aanbod verwijderd!");
    }

    @Override
    public void verwijderen() {
        throw new DBException("Het product dat u probeert te verwijderen is al uit het aanbod verwijderd!");
    }

    @Override
    public void herstellen() {
        throw new DBException("Het product dat u probeert te herstellen is uit het aanbod verwijderd!");
    }
}
