package com.elmonko.model;

import java.util.List;

/**
 * Created by ElMonko on 09/06/2014.
 */
public class Armor {

    private long id;

    private String name;

    private ReferenceData rank;

    private List<ArmorItem> items;

    private Monster monster;

    /**
     * get armor database id
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * get armor name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set armor name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get armor rank
     * @return
     */
    public ReferenceData getRank() {
        return rank;
    }

    /**
     * set armor rank
     * @param rank
     */
    public void setRank(ReferenceData rank) {
        this.rank = rank;
    }

    /**
     * Get item armor composition
     * @return
     */
    public List<ArmorItem> getItems() {
        return items;
    }

    /**
     * Set itme armor composition
     * @param items
     */
    public void setItems(List<ArmorItem> items) {
        this.items = items;
    }

    /**
     *
     * @return
     */
    public Monster getMonster() {
        return monster;
    }

    /**
     *
     * @param monster
     */
    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
