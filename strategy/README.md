# Strategy

## Problema
Se necesita poder cambiar el método de pago de una compra sin modificar la clase principal.

## Solución
Se utiliza el patrón Strategy, donde `MetodoPago` define una estrategia y las clases `PagoEfectivo`, `PagoTarjeta` y `PagoTransferencia` implementan diferentes formas de pago.

## Consecuencias

**Ventajas:**
- Permite cambiar de estrategia fácilmente.
- Separa cada forma de pago en una clase diferente.

**Desventajas:**
- Aumenta la cantidad de clases.
- El programa debe conocer las estrategias disponibles.

## Implementación
`MetodoPago.java` define la interfaz.  
`PagoEfectivo.java`, `PagoTarjeta.java` y `PagoTransferencia.java` implementan las estrategias.  
`Compra.java` utiliza la estrategia seleccionada.  
`Main.java` comprueba el funcionamiento del patrón.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

Pago en efectivo: $10000.0  
Pago con tarjeta: $15000.0  
Pago por transferencia: $20000.0