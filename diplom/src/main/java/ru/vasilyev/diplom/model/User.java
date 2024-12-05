package ru.vasilyev.diplom.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Arrays;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "users")

@EqualsAndHashCode
@ToString

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String nickName;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private Integer age;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<Adventure> adventures;

    @ManyToMany
    @JoinTable(
            name = "user_adventure",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "adventure_id"))
    private List<Adventure> joinAdventures;

    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private List<Role> roles;


    public User(String nickName, String firstName, String lastName, Integer age, List<Adventure> adventures) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.adventures = adventures;
    }

//    public String getFirstName() {
//    }
//
//    public String getPassword() {
//    }
//
//    public Arrays getRoles() {
//        return null;
//    }
}
