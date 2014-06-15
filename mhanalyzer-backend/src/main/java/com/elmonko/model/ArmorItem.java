package com.elmonko.model;

/**
 * Created by ElMonko on 15/06/2014.
 */
public class ArmorItem {

    private long id;

    private Item item;

    private Armor armor;

    private int number;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
