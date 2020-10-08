package com.bookstore.bookstorepractice.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="role")
@Data
public class Role {

    private Integer id;

    private RoleName roleName;
}
