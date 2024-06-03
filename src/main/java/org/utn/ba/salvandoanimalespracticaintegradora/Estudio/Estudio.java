package org.utn.ba.salvandoanimalespracticaintegradora.Estudio;

import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.Animal.Colonia;
import org.utn.ba.salvandoanimalespracticaintegradora.Animal.Grupo;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Setter
@Getter
public class Estudio {

    private String nombre;
    private String descripcion;
    private LocalDateTime fecha;
    private Cientifico cientifico;
    private Colonia coloniaEstudiada;
    private ArrayList<Grupo> gruposEstudiados;
    private ArrayList<Seccion> secciones;
    private EstadoEstudio estado;
    private String ubicacionAuditoriaDigital;


}
