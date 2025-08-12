package org.example;

public class ArmoredCharacter extends GameCharacter{
    @Override
    public void takeDamage(int damage){
       super.takeDamage(damage/2);
    }
}
