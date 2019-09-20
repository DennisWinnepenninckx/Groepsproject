package domain;

public abstract class Product {
    private String id,title;

    public Product(String id, String title){
        setId(id);
        setTitle(title);
    }

    //getters
    public String getId(){
        if (this.id ==null){
            throw new IllegalArgumentException("ID is null");
        }else{
            return this.id;
        }
    }
    public String getTitle(){
        if(this.title == null){
            throw new IllegalArgumentException("Title is null");
        }else{
            return this.title;
        }
    }
    //setters
    // ID en title mochten "" zijn in programma
    private void setId(String id){
        if(id == null){
            throw new IllegalArgumentException("id mag niet null zijn");
        }else{
            this.id = id;
        }
    }
    private void setTitle(String title){
        if (title == null){
            throw new IllegalArgumentException("title mag niet null zijn");
        }else{
            this.title = title;
        }
    }
    public abstract double getPrice(int dagen);

    @Override
    public abstract String toString();
}
