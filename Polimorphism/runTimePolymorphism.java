// run time Polymorphism 
//
public class runTimePolymorphism {
    public static void main(String[]args) {
        Animal a;
        a = new Dog();
        a.sound();
        a = new Cat();
        a.sound();
    }
}

class Animal {
    void sound(){
        System.out.println("Animal sound Default");
    }
}

class Dog extends Animal {
    @Override
    void sound(){
        // super.sound();
        System.out.println("Dog sound Woof woof");
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        // super.sound();
        System.out.println("Cat sound Meuo");
    }
}