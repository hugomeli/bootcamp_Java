package entities;

public class Product {

    private String name;
    private double price;
    private int amount;


    public Product(String name, double price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double subTotal(){
        return this.amount * this.price;
    }

    @Override
    public String toString() {
        return  name +
                "\nR$" + price +
                "\nQuantidade: " + amount;
    }
}