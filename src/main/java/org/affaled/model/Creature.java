package org.affaled.model;

public abstract class Creature {
    protected String name;
    protected int currentHp;
    protected int maxHp;

    public Creature(String name, int maxHp) {
        this.name = name;
        this.maxHp = maxHp;
        this.currentHp = maxHp;
    }

    public void takeDamage(int damage) {
        currentHp -= damage;
        if (this.currentHp < 0) this.currentHp = 0;
    }
}
