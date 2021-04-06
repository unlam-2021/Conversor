package Converter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flescano
 */
public class CentToPulConverter implements ConverterInterface {
    public Double convert(Double value) {
        return value/(2.54);
    }
}
