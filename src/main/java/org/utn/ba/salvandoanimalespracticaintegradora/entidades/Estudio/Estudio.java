package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Animal.Colonia;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Estudio extends Persistente {

    private String nombre;
    private String descripcion;
    private LocalDateTime fecha;
    private Cientifico cientifico;
    private Colonia coloniaEstudiada;
    private List<Seccion> secciones;
    private EstadoEstudio estadoActual;
    private List<CambioDeEstado> cambiosDeEstado;
    private String pathPDFFirmado;

    public Estudio() {
        this.secciones = new ArrayList<>();
    }


}
