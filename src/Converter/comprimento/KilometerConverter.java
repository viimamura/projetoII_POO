
package Converter.comprimento;

import Converter.AbstractConverter;

/**
 *
 * @author jvcco
 */
public class KilometerConverter extends AbstractConverter {
  
    public KilometerConverter() {
        super("kilometers (km)");
    }

    @Override
    public double toBasicUnit(double value) {
        return value * 1000; //Km para Metros
    }

    @Override
    public double fromBasicUnit(double value) {
        return value * 0.001; //Metros para KM
    }
}
