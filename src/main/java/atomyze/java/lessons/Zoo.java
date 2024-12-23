package atomyze.java.lessons;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Симба", 2, 120);
        Eagle eagle = new Eagle("Петя", 5, 3);
        Shark shark = new Shark("Рыбов", 20, 2500);


        lion.voice();
        shark.voice();
        eagle.voice();

        lion.eat();
        shark.eat();
        eagle.eat();

        lion.hunt();
        shark.swim();
        eagle.fly();
    }

}
