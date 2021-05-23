package edu.utp.chamcha.model;


import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "t_contact")
public class Contacto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private String name;
    private String email;
    private String direccion; 
    private String apellido; 
    private String password; 

  
}

