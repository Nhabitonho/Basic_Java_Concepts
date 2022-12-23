package exercise.exercise7;

public class BMW extends Car{
    int length;
    BMW(int length, int produceYear, String color, double regularPrice){
        super(produceYear, color, regularPrice);
        this.length = length;
    }


    public double getSalePrice() {
        if (length > 20){
            return (super.getSalePrice()-super.getSalePrice()*0.05);
        }
        else {
            return (super.getSalePrice()-super.getSalePrice()*0.1);
        }
    }
}
