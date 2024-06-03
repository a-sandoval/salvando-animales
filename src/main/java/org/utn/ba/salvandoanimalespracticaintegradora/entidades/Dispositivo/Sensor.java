package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.EstrategiaRecepcion.EstrategiaRecepcion;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.EstrategiaRecepcion.converterEstrategiaDeRecepcion;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table
public class Sensor extends Persistente {
    private TipoSensor tipoSensor;

    @OneToMany
    @JoinColumn(name="sensor_id", referencedColumnName = "id")
    private List<Medicion> mediciones;

    @Convert(converter = converterEstrategiaDeRecepcion.class)
    @Column(name = "estrategia_recepcion")
    private EstrategiaRecepcion receptor;

    @ManyToOne
    private Dispositivo dispositivo;

    public Sensor() {
        mediciones = new ArrayList<>();
    }

    public void recibirMedicion(String s){
        this.receptor.recibir(s);
    }
    public void agregarMedicion(Medicion m){

    }
}
