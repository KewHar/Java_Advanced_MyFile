import animals.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Sparky", 0, "M", 0, "Shepperd");
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

    }
}
