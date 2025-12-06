package org.affaled.model.item;

public class Armor extends Equipment {
    protected int currentProtectionPoints;
    protected int maxProtectionPoints;

    public Armor(String name, String description, int maxProtectionPoints){
        super(name, description);

        this.maxProtectionPoints = maxProtectionPoints;
        this.currentProtectionPoints = maxProtectionPoints;
    }
}
