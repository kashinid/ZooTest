package atomyze.java.lessons;

public class Eagle extends Animal {
    public Eagle() {
    }

    public Eagle(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Кар-кар");
    }

    public void fly(){
        System.out.println("Летаю");
    }
}
