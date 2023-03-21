package com.example.diplom.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "Field can't be empty!")
    @Size(min = 4, message = "Username must be greater than 4")
    private String username;
    @NotEmpty(message = "Field can't be empty!")
    @Size(min = 4, message = "Your password too weak, try a bit stronger!")
    private String password;
    @ManyToMany
    private Set<Role> roles;

    @OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY,
    mappedBy = "user")
    private List<Exercises> exercises = new ArrayList<>();

    @OneToMany (cascade = CascadeType.ALL,fetch = FetchType.LAZY,
            mappedBy = "users")
    private List<Value> values  = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "user")
    private List<Note> notes;

    public List<Exercises> getExercises() {
        return exercises;
    }

    public void setExercises(List<Exercises> exercises) {
        this.exercises = exercises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
