package mechanics;

import java.util.Random;
import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Enemy {

    public int health;
    public int damage;

    public Enemy(int health,int damage){
        this.health = health;
        this.damage = damage;
    }

    public void print(){
        System.out.println("Vida"+this.health);
        System.out.println("Dano"+this.damage);
    }
}
