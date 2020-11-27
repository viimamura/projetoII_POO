/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter.Time;

import Converter.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class MinutesConverter extends AbstractConverter{
    
    
     public MinutesConverter() {
        super("Minutes (m)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value * 60; //Hora para Segundo
    }

    @Override
    public double fromBasicUnit(double value) {
        return value/60; //Segundo para Hora
    }
}
