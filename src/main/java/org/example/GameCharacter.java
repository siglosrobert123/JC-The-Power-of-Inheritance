package org.example;

public class GameCharacter {
    int health = 100;

    public void takeDamage(int damage){
        this.health -= damage;
        if (this instanceof  ArmoredCharacter){
            System.out.println("Armored Character takes " + damage + " damage. New Health: " + this.health);
            return;
        }
        System.out.println("Regular Character takes " + damage + " damage. New Health: " + this.health);
    }
}
