package com.moai.endpoints.models;
// Generated 5/08/2018 04:10:19 AM by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User  implements java.io.Serializable {


     private int idUser;
     private String firstName;
     private String lastName;
     private String email;
     private List<Inversion> inversions = new ArrayList<>(0);

    public User() {
    }

	
    public User(int idUser, String firstName, String lastName, String email) {
        this.idUser = idUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Inversion> getInversions() {
        return inversions;
    }

    public void setInversions(List<Inversion> inversions) {
        this.inversions = inversions;
    }
}


