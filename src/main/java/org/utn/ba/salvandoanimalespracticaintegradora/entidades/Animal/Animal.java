package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

@Getter
@Setter
@Entity
public class Animal extends Persistente {

    @Column
    private Double pesoKg;

    @Column
    private Double alturaEnMetros;

    @ManyToOne
    @JoinColumn(name = "especie_id", referencedColumnName = "id")
    private Especie especie;
    private String nombre;
}
