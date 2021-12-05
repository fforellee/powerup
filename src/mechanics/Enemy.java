package mechanics;

public class Enemy {

    public String name;
    public int health;
    public int damage;

    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void printEnemyData() {
        System.out.println("Nome: " + name);
        System.out.println("Vida: " + health);
        System.out.println("Dano: " + damage);
    }
}
