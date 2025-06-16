class AnimalSound {
    void makeSound() {
        System.out.println("animals sound");
    }
}
class Dog extends AnimalSound {
    @Override
    void makeSound() {
        System.out.println("dog does vau vau");
    }
}
class cat extends AnimalSound {
    @Override
    void makeSound() {
        System.out.println("cat does meow meow");
    }
}
class cow extends AnimalSound {
    @Override
    void makeSound() {
        System.out.println("cow does moooo");
    }
}
public class AnimalSounds {
    public static void main(String[] args) {
        AnimalSound[] animals = { new Dog(), new cat(), new cow() };
        // AnimalSounds dog = new dog();
        // AnimalSounds cat = new cat();
        // AnimalSounds cow = new cow();

        for (AnimalSound animal : animals) {
            animal.makeSound();
        }
    }
}