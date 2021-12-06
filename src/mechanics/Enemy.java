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
        System.out.println("Nome do inimigo: " + name);
        System.out.println("Vida do inimigo: " + health);
        System.out.println("Dano do inimigo: " + damage);
    }
}
