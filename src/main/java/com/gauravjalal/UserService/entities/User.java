package com.gauravjalal.UserService.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Entity
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private String UserId;
    @Column(name = "NAME",length = 50)
    private String Name;
    @Column(name="EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;
    @Transient
    private List<Rating> ratings= new ArrayList<>();
}
