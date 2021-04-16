# Programacion avanzada - TP 1

## Conversor
* Contener al menor 5 tipos de conversores. 
* Pueden incluir los dos vistos en clase.
* Dos TextFields, con UN solo botón para convertir.
* Presionando `<ENTER>` sobre los TextFields, debe convertir.
* No contener código repetido, esto es reutilizar sentencias de código que se necesitan en eventos diferentes.
* Manejo de error con Exceptions (ej.: NumberFormatException), mostrando un mensaje amigable via JOptionPane.
* Si se ingresa la `,` (coma) como separador decimal, que se realice la conversión.

### Sobre la solucion

Se utilzo una clase abstracta para las conversiones y cumplir con el polimorfismo. Como el enunciado pide dos inputs editables se tuvo que optar por tener un toggle en el controller de los conversores, para poder hacer un swap de origin unit y final unit de una forma un poco mas elegante. 
