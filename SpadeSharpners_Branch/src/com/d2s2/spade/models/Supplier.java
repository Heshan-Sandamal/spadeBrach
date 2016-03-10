package com.d2s2.spade.models;

/**
 *
 * @author Dimuth Tharaka
 */
public class Supplier {

    String supplierId;
    String name;
    String email;
    public static final String SUPPLIERID = "supplierId";
    public static final String NAME = "name";
    public static final String EMAIL = "email";

    public Supplier(String supplierId, String name,String email) {
        this.supplierId = supplierId;
        this.name = name;
        this.email=email;
    }

    public Supplier() {
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object obj) {
        String supplierId = (String) obj;
        if (this.getSupplierId().equals(supplierId)) {
            return true;
        } else {
            return false;
        }

    }
}
