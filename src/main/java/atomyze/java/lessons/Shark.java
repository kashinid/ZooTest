package atomyze.java.lessons;

public class Shark extends Animal {

    public Shark() {
    }

    public Shark(String name, int age, int weight) {
        super(name, age, weight);
    }

    public void swim() {
        System.out.println("Плаваю");
    }

    @Override
    public void voice() {
        System.out.println("Буль-буль");
    }
}
