package Rest;

public class Meal {
    public String name ,description;
    public float price;

    public Meal(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Meal(String name, String description, float price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void displayInfo()
    {
        System.out.println("Meal name: "+ this.name +"\nMeal price: "+this.price);
    }
}
