package org.example;

public class Main {
    public static void main(String[] args) {
        /*
        Car myCar = new Car();
        myCar.honk();
        myCar.display();

        Bicycle myBike = new Bicycle();
        System.out.print("Bicycle says: ");
        myBike.honk();
        System.out.print("Bicycle says: ");
        myBike.ringBell();
        */

        /*
        // Shape myShape = new Shape(); // This line would cause a compile error
        Circle myCircle = new Circle();
        System.out.println(myCircle.display());

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle.display());

        Dog dog = new Dog();
        dog.breathe();
        dog.makeSound();
        */

        /*
        Editor myEditor = new Editor();
        CodeEditor myCodeEditor = new CodeEditor();
        Editor polyEditor = new CodeEditor();
        System.out.println("--- Regular Editor ---");
        myEditor.openFile();
        System.out.println("\n--- Code Editor ---");
        myCodeEditor.openFile();
        System.out.println("\n--- Polymorphic Editor ---");
        polyEditor.openFile();

        GameCharacter gameCharacter = new GameCharacter();
        ArmoredCharacter armoredCharacter = new ArmoredCharacter();
        int damage = 100;
        gameCharacter.takeDamage(damage);
        armoredCharacter.takeDamage(damage);
        */

        CheckingAccount myChecking = new CheckingAccount(100.0);
        myChecking.deductMonthlyFee();

    }
}