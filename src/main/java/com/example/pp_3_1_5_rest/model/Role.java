package com.example.pp_3_1_5_rest.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;


@Entity
@Data
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
}
