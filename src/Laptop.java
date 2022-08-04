public class Laptop {
    public int memory = 256;
    public String brant = "Apple";
    public String colour = "black";
    public String model = "Macbook";
    public double weight;
    public int price;

    @Override
    public String toString() {
        return "Laptop{" +
                "memory=" + memory +
                ", brant='" + brant + '\'' +
                ", colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
