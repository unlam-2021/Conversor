/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Converter;

/**
 *
 * @author flescano
 */
public abstract class Converter {
    protected Double unit;
    public Double toMilimeters(Double value) {
        return value/unit;
    };
    
    public Double fromMilimeters(Double value) {
        return value*unit;
    }
}
