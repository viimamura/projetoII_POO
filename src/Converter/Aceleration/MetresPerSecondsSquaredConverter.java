/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter.Aceleration;

import Converter.AbstractConverter;
/**
 *
 * @author jvcco
 */
public class MetresPerSecondsSquaredConverter extends AbstractConverter {
 public MetresPerSecondsSquaredConverter() {
        super("m/s\u00b2");
    }

    @Override
    public double toBasicUnit(double value) {
        return value;
    }

    @Override
    public double fromBasicUnit(double value) {
        return value;
    }
}
