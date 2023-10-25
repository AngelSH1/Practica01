package com.tienda.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
////el domain es hacer una clase en java para la tabla de bd
@Data
@Entity
@Table(name="arbol")
public class Arbol implements Serializable{
    ///basicamente sirializable va a guardar informacion en memoria,
    //funciona para almacenar ciertos datos en el disco
    private static final long serialVersionUID = 1L;///para poder hacer el ciclo de la sumatoriia del id de arbol
    @Id//decir que la tabla arbol tiene una lleve key que va a ser el ID
    ///LOS VALORRE generados que tipo de estrategia utilizanm idetico = sea igual en la bd y en la clase
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_arbol")
    private long idArbol;
    private String nombre;
    private String rutaImagen;
    private String flor;
    private String paisOrigen;
    

    public Arbol() {
    }

    public Arbol(String nombre, String flor, String paisOrigen) {
        this.nombre = nombre;
        this.flor = flor;
        this.paisOrigen = paisOrigen;
    }

    

    
    
    
}
