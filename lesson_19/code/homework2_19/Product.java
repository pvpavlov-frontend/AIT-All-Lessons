package homework2_19;

public class Product {

    public static int temp;
    private static int counter=0;
    private final int id;
    private final String title;
    private final double price;


    public Product ( String title, double price){
        counter++;
        this.id=counter;
        this.title=title;
        this.price=price;
    }

    public String toString(){
        return id+"."+ title + " "+price +" static temp:"+temp;
    }

    public String getTitle(){
        return this.title;
    }

    public double getPrice(){
        return price;
    }
    public int getId(){
        return id;
    }

    public void print(){
        System.out.println("I'm product" + getTitle());
    }
}
