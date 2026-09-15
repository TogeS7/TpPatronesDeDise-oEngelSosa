# Singleton

## Problema
Se necesita garantizar que exista una única instancia de la clase `Configuracion`.

## Solución
Se utiliza el patrón Singleton, con un constructor privado y un método `getInstancia()` que crea la instancia una sola vez y luego devuelve siempre la misma.

## Consecuencias

**Ventajas:**
- Garantiza una única instancia.
- Permite acceder a ella desde diferentes partes del programa.

**Desventajas:**
- Puede dificultar las pruebas.
- Genera dependencia de una instancia global.

## Implementación
`Configuracion.java` implementa el patrón Singleton y `Main.java` comprueba que dos llamadas a `getInstancia()` devuelven la misma instancia.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

Las dos variables apuntan a la misma instancia.