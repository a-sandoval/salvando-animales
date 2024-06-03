package org.utn.ba.salvandoanimalespracticaintegradora.entidades.Dispositivo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.utn.ba.salvandoanimalespracticaintegradora.entidades.Persistente;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
public class Dispositivo extends Persistente {

    @OneToMany(mappedBy = "dispositivo", cascade = CascadeType.ALL)
    private List<Sensor> sensores;

    public Dispositivo() {
        sensores = new ArrayList<>();
    }
}
