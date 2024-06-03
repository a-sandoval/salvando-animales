package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Estudio;

import jakarta.persistence.*;
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
@Table(name="estudio")
public class Estudio extends Persistente {

    @Column
    private String nombre;
    @Column
    private String descripcion;
    @Column
    private LocalDateTime fecha;
    @ManyToOne
    @JoinColumn(name="cientifico_id", referencedColumnName = "id")
    private Cientifico cientifico;

    @ManyToOne
    @JoinColumn(name="colonia_id", referencedColumnName = "id")
    private Colonia coloniaEstudiada;

    @OneToMany
    @JoinColumn(name="estudio_id", referencedColumnName = "id")
    private List<Seccion> secciones;

    @Enumerated(EnumType.STRING)
    @Column(name="estado_actual")
    private EstadoEstudio estadoActual;

    @OneToMany
    @JoinColumn(name="estudio_id", referencedColumnName = "id")
    private List<CambioDeEstado> cambiosDeEstado;
    @Column
    private String pathPDFFirmado;

    public Estudio() {
        this.secciones = new ArrayList<>();
    }


}
