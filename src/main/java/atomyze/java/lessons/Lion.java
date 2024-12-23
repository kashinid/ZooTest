package atomyze.java.lessons;

public class Lion extends Animal{
    public Lion() {
    }

    public Lion(String name, int age, int weight) {
        super(name, age, weight);
    }

    @Override
    public void voice() {
        System.out.println("Мур-мур");;
    }

    public void hunt(){
        System.out.println("Охочусь");
    }
}
