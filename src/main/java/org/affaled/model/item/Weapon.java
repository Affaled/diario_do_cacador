package org.affaled.model.item;

import org.affaled.enums.WeaponType;

public class Weapon extends Equipment {
    protected int damage;
    protected WeaponType type;
    protected int slotsRequired;
    protected boolean isHeavy;

    public Weapon(String name, String description, int damage, WeaponType type, int slotsRequired, boolean isHeavy) {
        super(name, description);

        this.damage = damage;
        this. type = type;
        this. slotsRequired = slotsRequired;
        this.isHeavy = isHeavy;
    }
}
