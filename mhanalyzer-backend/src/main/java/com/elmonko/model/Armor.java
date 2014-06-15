package com.elmonko.model;

/**
 * Created by ElMonko on 09/06/2014.
 */
public class Armor {

    private long id;

    private String name;

    private ReferenceData rank;

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
}
