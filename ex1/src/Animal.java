public class Animal {
    String Name;

    Animal(String name) {
        Name = name;
    }

    void speak() {
        System.out.println(Name + " помяукал/a.");
    }

    void eat(String food) {
        System.out.println(Name + " поел/а " + food);
    }
}
