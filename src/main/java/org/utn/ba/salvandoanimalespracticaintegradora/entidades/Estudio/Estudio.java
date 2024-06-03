package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal.Colonia;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Estudio {

    private String nombre;
    private String descripcion;
    private LocalDateTime fecha;
    private Cientifico cientifico;
    private Colonia coloniaEstudiada;
    private List<Seccion> secciones;
    private EstadoEstudio estadoActual;
    private String pathPDFFirmado;

    public Estudio() {
        this.secciones = new ArrayList<>();
    }


}
