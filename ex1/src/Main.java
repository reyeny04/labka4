public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal("Животное");
        Cat myCat = new Cat("Вискас");

        genericAnimal.speak();
        genericAnimal.eat("вискас");

        myCat.speak();
        myCat.eat("рыба");
        myCat.eat("едааааа", 100);
    }
}