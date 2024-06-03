package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.EstrategiaRecepcion.EstrategiaRecepcion;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Sensor extends Persistente {
    private Long identificador;
    private TipoSensor tipoSensor;
    private List<Medicion> mediciones;
    private EstrategiaRecepcion receptor;

    public Sensor() {
        mediciones = new ArrayList<>();
    }

    public void recibirMedicion(String s){
        this.receptor.recibir(s);
    }
    public void agregarMedicion(Medicion m){

    }
}
