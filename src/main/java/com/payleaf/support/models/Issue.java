package com.payleaf.support.models;

import com.payleaf.support.models.User;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Issue {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String name;

    @NotNull
    private String env;

    @NotNull
    private String detail;

    @NotNull
    private boolean unresolved = true;

    //
    @OneToMany
    @JoinColumn(name="issue_id")
    private List<User> users = new ArrayList<>();

    public Issue(String name, String env, String detail, boolean unresolved) {
        this.name = name;
        this.env = env;
        this.detail = detail;
        this.unresolved = unresolved;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isUnresolved() {
        return unresolved;
    }

    public void setUnresolved(boolean unresolved) {
        this.unresolved = unresolved;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
