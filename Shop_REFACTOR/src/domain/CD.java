package domain;

public class CD extends Product {
    public CD(String id, String title){
        super(id, title);
    }
<<<<<<< HEAD
=======
    public CD(String id, String title,boolean b){
        super(id, title,b);
    }
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67

    @Override
    public double getPrice(int dagen) {
        return dagen * 1.5;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "CD: " + this.getTitle() + " " + "id: " + this.getId();
=======
        return "CD," + super.toString();
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
    }
}
