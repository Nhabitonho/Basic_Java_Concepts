package exercise.exercise7;

public class Ford extends Car{
    int totalKm;
    int manuDiscount;

    Ford(int totalKm, int manuDiscount, int produceYear, String color, double regularPrice){
        super(produceYear, color, regularPrice);
        this.totalKm = totalKm;
        this.manuDiscount = manuDiscount;
    }

    @Override
    public double getSalePrice() {
        return (super.getSalePrice()-manuDiscount);
    }
}
