package com.bookstore.bookstorepractice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private String username;
    private String password;
    private String firstName;
    private String lastName;


    private String email;
    private String phone;
    private boolean enabled;

    @ManyToMany
    @JoinTable(name = "user_role",
               joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roleSet = new HashSet<>();


}
