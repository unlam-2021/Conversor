# Programacion avanzada - Clase 1

## Conversor
La idea es tener un aplicacion que permita convertir pulgas a centimetros y viceversa. 

### Sobre la solucion

`Main.Conversor` (Dentro de la carpeta `src`) es la interfaz grafica hecha con JFrameFrorm. Se utiliza un flag y chequeo de eventos keyRelease para decidir que conversion debe hacerse. Al clickear en el boton convertir se llama a un converter especifico para realizar la operacion. 

Aunque esta fuera del alcance de la primera clase se considero oportuno crear la interfaz `ConverterInterface` y las implementaciones correspondientes para tener un flujo de ejecucion mas limpio. 
