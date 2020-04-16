package thuchanh1;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for(Animal animal:animals){
            System.out.println(animal.makeSound());
            if(animal instanceof Chicken){
                Edible edible = (Chicken)animal;
                System.out.println(edible.howToEat());
            }
        }
        Fruits[] fruit = new Fruits[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();
        for(Fruits fruits:fruit){
            System.out.println(fruits.howToEat());
        }
    }
}
