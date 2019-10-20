package domain;

public class Beschadigd implements  LeenState{
    private LeenRequest lr;

    public Beschadigd(LeenRequest lr){
        this.lr = lr;
    }

    @Override
    public void herstellen(){
        lr.setHuidigState(lr.getUitleenbaar());
    }

    @Override
    public void verwijderen(){
        lr.setHuidigState(lr.getVerwijderd());
    }

    @Override
    public void uitlenen() {
        throw new DBException("Het product dat u probeert te lenen, is momenteel niet beschikbaar!");
    }

    @Override
    public void terugbrengen() {
        throw new DBException("U hebt het boek niet tot uw beschikking, u kan het niet terugbrengen!");
    }

    @Override
    public void terugbrengenBeschadigd() {
        throw new DBException("U hebt het boek niet tot uw beschikking, u kan het niet terugbrengen!");
    }
}