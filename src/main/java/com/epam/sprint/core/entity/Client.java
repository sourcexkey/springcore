package com.epam.sprint.core.entity;

/**
 * @author Denys_Uzhvii
 */
public class Client {
    private Integer id = 1;
    private String fullName = "admin";

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
