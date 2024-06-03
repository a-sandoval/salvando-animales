package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Seccion {
    private String nombre;
    private List<String> contenido;

    public void agregarLineas(String ... s) {
        contenido.addAll(List.of(s));
    }

    public Seccion() {
        this.contenido = new ArrayList<>();
    }
}
