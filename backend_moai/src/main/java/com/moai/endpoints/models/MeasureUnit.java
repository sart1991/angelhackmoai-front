package com.moai.endpoints.models;
// Generated 5/08/2018 04:10:19 AM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * MeasureUnit generated by hbm2java
 */
public class MeasureUnit  implements java.io.Serializable {


     private int idMunit;
     private String nameMunit;
     private List<Property> properties = new ArrayList<>(0);

    public MeasureUnit() {
    }

	
    public MeasureUnit(int idMunit, String nameMunit) {
        this.idMunit = idMunit;
        this.nameMunit = nameMunit;
    }

    public int getIdMunit() {
        return idMunit;
    }

    public void setIdMunit(int idMunit) {
        this.idMunit = idMunit;
    }

    public String getNameMunit() {
        return nameMunit;
    }

    public void setNameMunit(String nameMunit) {
        this.nameMunit = nameMunit;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }
}


