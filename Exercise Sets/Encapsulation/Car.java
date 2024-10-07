public class Car {
    private String color;
    private double price;
    private char size;

    public Car(String color, double price, char size) {
        this.color = color;
        this.price = price;
        this.size = Character.toUpperCase(size);
    }

    public String getColor() {return color;}
    public double getPrice() {return price;}
    public char getSize() {return size;}
    public void setColor(String color) {this.color = color;}
    public void setPrice(double price) {this.price = price;}
    public void setSize(char size) {this.size = Character.toUpperCase(size);}
    
    @Override
    public String toString() {
        String sizeDescriptor = (size == 'S') ? "small" : (size == 'M') ? "medium" : (size == 'L') ? "large" : "unknown";
        return String.format("Car (%s) - P%.2f - %s", color, price, sizeDescriptor);
    }

    public static void main(String[] args) {
        Car car1 = new Car("cyan", 19999.85, 'm');
        Car car2 = new Car("magenta", 50000.00, 'L');

        System.out.println(car1);
        System.out.println(car2);

        car1.setColor("lime");
        car1.setPrice(25000.00);
        car1.setSize('s');
        System.out.println(car1);
    }
}