package org.affaled.model;

public abstract class Creature {
    protected String name;
    protected int currentHp;
    protected int maxHp;
    protected boolean isAlive;

    protected Creature(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
        this.isAlive = true;
    }

    public void takeDamage(int amount) {
        currentHp -= amount;
        if (this.currentHp < 0) this.currentHp = 0;
    }

    public void heal(int amount) {
        currentHp -= amount;
        if (this.currentHp > maxHp) this.currentHp = maxHp;
    }

    public abstract void attack(Creature target);
}
