package exercise.exercise7;

class Car {

    protected int produceYear;


    protected String color;
    protected double regularPrice;

    public Car(int produceYear, String color, double regularPrice) {
        this.produceYear = produceYear;
        this.color = color;
        this.regularPrice = regularPrice;
    }

    public double getSalePrice() {

        return regularPrice;
    }


}
