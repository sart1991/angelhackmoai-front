package com.moai.endpoints.models;
// Generated 5/08/2018 04:10:19 AM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ResourceNeedCapacity generated by hbm2java
 */
public class ResourceNeedCapacity  implements java.io.Serializable {


     private int idNeedCapacity;
     private Project project;
     private Resource resource;
     private List<Property> properties = new ArrayList<>(0);
     private List<Inversion>inversions = new ArrayList<>(0);

    public ResourceNeedCapacity() {
    }

	
    public ResourceNeedCapacity(int idNeedCapacity, Resource resource) {
        this.idNeedCapacity = idNeedCapacity;
        this.resource = resource;
    }

    public int getIdNeedCapacity() {
        return idNeedCapacity;
    }

    public void setIdNeedCapacity(int idNeedCapacity) {
        this.idNeedCapacity = idNeedCapacity;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public List<Inversion> getInversions() {
        return inversions;
    }

    public void setInversions(List<Inversion> inversions) {
        this.inversions = inversions;
    }
}

