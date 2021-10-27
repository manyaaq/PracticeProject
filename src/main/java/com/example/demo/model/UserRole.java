package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table (name = "user_role_1")
public class UserRole {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "role")
    private String role;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public UserRole() {
    }

    public UserRole(String role, User user) {
        this.role = role;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", user=" + user +
                '}';
    }
}
