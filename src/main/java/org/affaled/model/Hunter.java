package org.affaled.model;

import org.affaled.enums.Profession;
import org.affaled.model.item.Armor;
import org.affaled.model.item.Item;
import org.affaled.model.item.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Hunter extends Creature {
    private Profession profession;
    private int fatigue;
    private List<Item> backpack;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Hunter(String name, int maxHp, Profession profession) {
        super(name, maxHp);

        this.profession = profession;
        this.fatigue = 0;
        this.backpack = new ArrayList<>();
    }

    @Override
    public void attack(Creature target) {

    }
}
