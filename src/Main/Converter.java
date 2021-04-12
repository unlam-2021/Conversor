/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author flescano
 */
public class Converter {
    public Converter () {
        originUnit = MILIMETERS;
        finalUnit = MILIMETERS;
        
        convertValues.put(MILIMETERS, 1D);
        convertValues.put(METERS, 0.001);
        convertValues.put(INCHES, 0.0393701);
        convertValues.put(MILES, 6.21371e-7);
        convertValues.put(KILOMETERS, 1e-6);
        convertValues.put(CENTIMETERS, 0.1);
    }
    
    public String[] getUnits() {
        String values[] = { MILIMETERS, METERS, INCHES, MILES, KILOMETERS, CENTIMETERS };
        
        return values;
    }

    public String getFinalUnit() {
        return finalUnit;
    }

    public String getOriginUnit() {
        return originUnit;
    }

    public void setFinalUnit(String finalUnit) {
        this.finalUnit = finalUnit;
    }

    public void setOriginUnit(String originUnit) {
        this.originUnit = originUnit;
    }
    
    public Double convert(Double value) {
        return toFinalUnit(toMilimeters(value));
    }
    
    private Double toMilimeters(Double value) {
        return value/convertValues.get(originUnit);
    }
    
    private Double toFinalUnit(Double value) {
        return value*convertValues.get(finalUnit);
    }
    
    
    private static final String MILIMETERS = "Milimetros"; 
    private static final String METERS = "Metros";
    private static final String INCHES = "Pulgadas"; 
    private static final String MILES = "Millas";
    private static final String KILOMETERS = "Kilometros"; 
    private static final String CENTIMETERS = "Centimetros";
    
    private static Map<String, Double> convertValues = new HashMap<String, Double>();
    
    private String originUnit;
    private String finalUnit;
}
