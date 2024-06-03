package org.utn.ba.salvandoanimalespracticaintegradora.entidades.EstrategiaRecepcion;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import jakarta.persistence.Converter;

@Converter

public class converterEstrategiaDeRecepcion implements AttributeConverter<EstrategiaRecepcion, String>{

    @Override
    public String convertToDatabaseColumn(EstrategiaRecepcion estrategiaRecepcion) {
        String s = String.valueOf(estrategiaRecepcion.getClass());
        return s;
    }

    @Override
    public EstrategiaRecepcion convertToEntityAttribute(String s) {

        switch (s){
            case "RecibirCSV":{ return new RecibirCSV();}
            case "RecibirJSON":{return new RecibirJSON();}
            case "RecibirTXT":{return new RecibirTXT();}
            default: return null;
        }

    }
}
