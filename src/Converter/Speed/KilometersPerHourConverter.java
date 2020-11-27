/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter.Speed;

import Converter.AbstractConverter;
/**
 *
 * @author potedesorvete
 */
public class KilometersPerHourConverter extends AbstractConverter {
    public KilometersPerHourConverter() {
        super("kilometer/h (km/h)");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 3.6; //Km/h para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value /3.6; // Metros/s paraKm/h
     }
 }

