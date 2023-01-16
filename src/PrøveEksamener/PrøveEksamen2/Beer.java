package PrøveEksamener.PrøveEksamen2;

public class Beer {
    private String name;
    private int alcoholPercentage;
    private double price;

    public Beer(String name, int alcoholPercentage, double price) throws Exception {
        this.name = name;
        setPrice(price);
        setAlcoholPercentage(alcoholPercentage);
    }

    public void setPrice(double price) throws Exception {
        if (price >= 0){
            this.price = price;
        }else throw new Exception("Price cannot be negative");
    }
    public void setAlcoholPercentage(int percentage) throws Exception {
        if (percentage >= 0) {


            if (percentage <= 100) {
                this.alcoholPercentage = percentage;
            }
            else throw new Exception("Alcohol percentage cannot be more than 100");

        } else throw new Exception("Percentage cannot be negative");
    }

    @Override
    public String toString() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
