package com.elmonko.model;

/**
 * Created by elmonko on 09/06/2014.
 * Reference data class
 * @author elmonko
 */
public class ReferenceData {

    private long id;

    private String type;

    private String value;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
