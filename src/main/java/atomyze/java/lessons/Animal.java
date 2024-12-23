package atomyze.java.lessons;

public class Animal {
    String name;
    int age;
    int weight;

    public Animal(){

    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Ем");
    }

    public void sleep(){
        System.out.println("Сплю");
    }

    public void voice(){

    }
}
