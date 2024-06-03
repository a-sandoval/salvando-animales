package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Seccion extends Persistente  {
    private String nombre;
    private List<String> contenido;

    public void agregarLineas(String ... s) {
        contenido.addAll(List.of(s));
    }

    public Seccion() {
        this.contenido = new ArrayList<>();
    }
}
