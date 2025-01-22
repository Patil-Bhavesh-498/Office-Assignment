class Car {
    // Private variables
    private String brand;
    private int year;

    // Public setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Public getter for brand
    public String getBrand() {
        return brand;
    }

    // Public setter for year
    public void setYear(int year) {
        if (year > 0) {  // Ensuring year is a valid number
            this.year = year;
        }
    }

    // Public getter for year
    public int getYear() {
        return year;
    }
}

public class Encapsulation_1 {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setBrand("Toyota");
        myCar.setYear(2022);

        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Year: " + myCar.getYear());
    }
}
