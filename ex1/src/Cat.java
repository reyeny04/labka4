public class Cat extends Animal{

    Cat(String name) {
        super(name);
    }

    void speak() {
        System.out.println(Name + " мяукает.");
    }

    void eat(String food, int quantity) {
        System.out.println(Name + " кушает " + quantity + " порции " + food);
    }
}
