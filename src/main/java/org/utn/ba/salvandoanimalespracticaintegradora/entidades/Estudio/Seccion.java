package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="seccion")
public class Seccion extends Persistente  {
    @Column
    private String nombre;

    @ElementCollection()
    @CollectionTable(name="contenido_seccion", joinColumns = @JoinColumn(referencedColumnName = "id"))
    private List<String> contenido;

    public void agregarLineas(String ... s) {
        contenido.addAll(List.of(s));
    }

    public Seccion() {
        this.contenido = new ArrayList<>();
    }
}
