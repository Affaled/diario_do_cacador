package org.affaled.model.item;

public abstract class Equipment implements Item {
    protected String name;
    protected String description;
    protected boolean isEquipped;

    protected Equipment(String name, String description) {
        this.name = name;
        this.description = description;
        this.isEquipped = false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void equip() {
        isEquipped = true;
    }

    public void unequip() {
        isEquipped = false;
    }

    public boolean isEquipped() {
        return isEquipped;
    }
}
