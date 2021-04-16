/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Converter.CentimetersConverter;
import Converter.InchesConverter;
import Converter.KilometersConverter;
import Converter.MetersConverter;
import Converter.MilesConverter;
import Converter.MilimetersConverter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author flescano
 */
public class ConverterController {
    public ConverterController () {
        originUnit = MILIMETERS;
        finalUnit = MILIMETERS;
        
        convertInstances.put(MILIMETERS, new MilimetersConverter());
        convertInstances.put(METERS, new MetersConverter());
        convertInstances.put(INCHES, new InchesConverter());
        convertInstances.put(MILES, new MilesConverter());
        convertInstances.put(KILOMETERS, new KilometersConverter());
        convertInstances.put(CENTIMETERS, new CentimetersConverter());
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
        return convertInstances.get(originUnit).toMilimeters(value);
    }
    
    private Double toFinalUnit(Double value) {
        return convertInstances.get(finalUnit).fromMilimeters(value);
    }
    
    public void toggle() {
        String temp = originUnit;
        originUnit = finalUnit;
        finalUnit = temp;
    }
    
    private static final String MILIMETERS = "Milimetros"; 
    private static final String METERS = "Metros";
    private static final String INCHES = "Pulgadas"; 
    private static final String MILES = "Millas";
    private static final String KILOMETERS = "Kilometros"; 
    private static final String CENTIMETERS = "Centimetros";
    
    private static Map<String, Converter.Converter> convertInstances = new HashMap<String, Converter.Converter>();
    
    private String originUnit;
    private String finalUnit;
}
