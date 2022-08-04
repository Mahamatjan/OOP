public class Person {
    public String name;
    public double weight;
    public String citizenship;
    public int age;
    public Laptop laptop = new Laptop();

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", citizenship='" + citizenship + '\'' +
                ", age=" + age +
                ", laptop=" + laptop +
                '}';
    }
}
