package domain;

public class LeenRequest {
    public double prijs;
    public String naam;

    public LeenState huidigState;

    private LeenState uitgeleend;
    private LeenState beschadigd;
    private LeenState uitleenbaar;
    private LeenState verwijderd;

    public LeenRequest(double prijs, String naam){
        this.prijs = prijs;
        this.naam = naam;

        this.uitgeleend = new Uitgeleend(this);
        this.beschadigd = new Beschadigd(this);
        this.uitleenbaar = new Uitleenbaar(this);
        this.verwijderd = new Verwijderd(this);

        this.huidigState = uitleenbaar;
    }

    public void uitlenen(){
        huidigState.uitlenen();
    }

    public void terugbrengen(){
        huidigState.terugbrengen();
    }

    public void terugbrengenBeschadigd(){
        huidigState.terugbrengenBeschadigd();
    }

    public void verwijderen(){
        huidigState.verwijderen();
    }

    public void herstellen(){
        huidigState.herstellen();
    }

    public LeenState getUitgeleend(){
        return this.uitgeleend;
    }

    public LeenState getBeschadigd(){
        return this.beschadigd;
    }

    public LeenState getUitleenbaar(){
        return this.uitleenbaar;
    }

    public LeenState getVerwijderd(){
        return this.verwijderd;
    }

    public void setHuidigState(LeenState newState){
        this.huidigState = newState;
    }

    public String getNaam() {
        return naam;
    }

    public double getPrijs() {
        return prijs;
    }
}
