public class Dragon {
    private int health;
    private int strength;
    private int level;
    private boolean dead;
    private int attack;
    private int healthTrack;

    public Dragon()
    {
        health = 100;
        strength = 1;
        level = 1;
        dead = false;
    }

    public void takeDamage(int damage)
    {
        if (dead)
        {
            System.out.println("The dragon is already dead!");
        }
        else
        {
            health -= damage;
            System.out.println("The dragon takes " + damage + " damage and now has " + health + " health");
        }
        if (health <= 0)
        {
            dead = true;
            System.out.println("The dragon has been slayed!");
            health = 0;
        }

    }

    public void attack()
    {
        attack = strength * level;
        System.out.println("The dragon attacks for " + attack + " health points!\nDamage: " + attack);
        healthTrack += attack;
        if (healthTrack >= 50)
        {
            level ++;
            healthTrack = 0;
            System.out.println("The dragon has reached level " + level);
        }
    }

    public void powerUp(int p)
    {
        if (p == 1)
        {
            health = health * 2;
            System.out.println("Your dragon's health has increased to " + health);
        }
        else if (p == 2)
        {
            strength = strength * 2;
            System.out.println("Your dragon's strength has increased to " + strength);
        }
        else
        {
            System.out.println("This is not a choice");
        }
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getLevel() {
        return level;
    }

    public boolean isDead() {
        return dead;
    }

    public String toString()
    {
        return "Health: " + health + "\nStrength: " + strength + "\nLevel: " + level + "\nisDead: " + dead;
    }
}
