package com.example.userservice.model;

import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name= "USER_TABLE")
@NoArgsConstructor
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "user_id")
    private int id;
    @Column (name = "user_name")
    private String name;
    @Column (name = "user_city")
    private String city;

    public User(String name, String city) {
        super();
        this.city=city;
        this.name= name;
    }
}
