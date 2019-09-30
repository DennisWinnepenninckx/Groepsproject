package domain;

public abstract class Product {
    private String id,title;
    private boolean isBeschikbaar;

    public Product(String id, String title){
        setId(id);
        setTitle(title);
        isBeschikbaar = true;
<<<<<<< HEAD
=======
    }
    public Product(String id, String title, boolean isBeschikbaar){
        this.isBeschikbaar = isBeschikbaar;
        setId(id);
        setTitle(title);
>>>>>>> 74de8dd1bbf5fc581fd79e1a3465ffaf889f3b67
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
    public boolean isBeschikbaar(){
        return isBeschikbaar;
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
    public void setisBeschikbaar(boolean beschikbaar){
        this.isBeschikbaar = beschikbaar;
    }
    public void changeBeschikbaar(){
        if (isBeschikbaar){isBeschikbaar = false;}else{isBeschikbaar = true;}
    }

    public abstract double getPrice(int dagen);

    public String toString(){
        return "title:" + this.getTitle() + "," + "id:" + this.getId() + ",beschikbaarheid:" + this.isBeschikbaar;
    }
}
