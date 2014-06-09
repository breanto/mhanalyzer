package com.elmonko.model;

/**
 * Created by elmonko on 09/06/2014.
 * Reference data class
 * @author elmonko
 */
public class ReferenceData {

    private long id;

    private String name;

    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /**
     * get reference data name
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * set reference data name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get data reference value
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * set data reference value
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

}
