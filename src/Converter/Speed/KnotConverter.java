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
public class KnotConverter extends AbstractConverter {
    public KnotConverter () {
        super("Knot (kt)");
    }

     
     @Override
     public double toBasicUnit(double value) {
         return value * 1.944; //Knot para Metros/s
     }
 
     @Override
     public double fromBasicUnit(double value) {
         return value /1.944; //Metros/s para Knot
     }
 }

