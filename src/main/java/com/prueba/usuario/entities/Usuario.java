package com.prueba.usuario.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name= "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//@Audited
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name= "name")
    private String name;
    @Column(name= "email")
    private String email;
    @Column(name= "password")
    private String password;
    @Column(name= "profile")
    private String profile;
}
