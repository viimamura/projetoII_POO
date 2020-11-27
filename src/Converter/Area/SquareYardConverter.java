/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter.Area;

import Converter.AbstractConverter;

/**
 *
 * @author potedesorvete
 */
public class SquareYardConverter extends AbstractConverter {
     public SquareYardConverter() {
        super("Square Yard(yd)");
    }

    
    @Override
    public double toBasicUnit(double value) {
        return value/1.196 ; //Yard para m^2
    }

    @Override
    public double fromBasicUnit(double value) {
        return value*1.196 ; //m^2 para Yard
    }
}
