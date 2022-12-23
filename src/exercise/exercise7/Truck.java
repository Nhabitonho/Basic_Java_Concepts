package exercise.exercise7;

public class Truck extends Car{
    int weight;

    public Truck(int weight, int produceYear, String color, double regularPrice) {
        super(produceYear, color, regularPrice);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if(weight > 2000){
            return (super.getSalePrice() - super.getSalePrice()*0.1);
        }
        return (super.getSalePrice()-super.getSalePrice()*0.2);
    }
}
