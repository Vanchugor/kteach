package com.physics30.ct.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(indexes = @Index(columnList = "name", unique = true))
public class Role {
    @Id
    @GeneratedValue
    private long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Name name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

    public Role() {
    }

    public Role(@NotNull Name name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public enum Name {
        ADMIN,
        TEACHER,
        STUDENT
    }
}
