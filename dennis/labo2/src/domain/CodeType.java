package domain;

public enum CodeType {
    Caesar("caesar","domain.Caesarcode"),
    Spiegeling("spiegeling","domain.Spiegeling"),
    Dennis("dennis","domain.DennisCode");


    private final String name;
    private final String klasseNaam;

    CodeType(String name, String domain){
        this.name = name;
        this.klasseNaam = domain;
    }

    public String getName() {
        return name;
    }

    public String getKlasseNaam() {
        return klasseNaam;
    }
}
