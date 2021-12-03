package mechanics;

import java.util.Random;
import java.util.Scanner;

import global.Variables;
import mechanics.*;

public class Enemy {

    public int vida;
    public int dano;

    public Enemy(int vida,int dano){
        this.vida = vida;
        this.dano = dano;
    }

    public void printar(){
        System.out.println("Vida"+this.vida);
        System.out.println("Dano"+this.dano);
    }
}
