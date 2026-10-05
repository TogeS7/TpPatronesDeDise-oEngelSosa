# Memento

## Problema
Se necesita guardar y restaurar el estado previo de un objeto (como deshacer cambios en un editor de texto) sin violar su encapsulamiento ni exponer sus detalles internos.

## Solución
Se utiliza el patrón Memento. El objeto original (`Editor`) crea una copia de su estado y la guarda en un objeto especial (`Memento`). Un objeto externo llamado cuidador (`Historial`) se encarga de almacenar estos mementos y devolvérselos al editor cuando se necesita restaurar un estado previo.

## Consecuencias

**Ventajas:**
- Permite implementar la funcionalidad de "Deshacer" (Undo) fácilmente.
- Mantiene intacto el encapsulamiento del objeto original, ya que solo él puede leer o modificar el interior del Memento.

**Desventajas:**
- Puede consumir mucha memoria RAM si se guardan muchos estados históricos o si el objeto original es muy pesado.
- El cuidador (`Historial`) debe gestionar el ciclo de vida de los mementos para borrar los obsoletos.

## Implementación
`Memento.java` almacena el estado (texto).
`Editor.java` es el creador que genera y restaura mementos.
`Historial.java` actúa como cuidador, guardando los mementos en una pila.
`Main.java` simula el proceso de escribir y deshacer cambios.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

Texto actual: Versión 3: Hola Mundo!!!
Después del primer deshacer: Versión 2: Hola Mundo
Después del segundo deshacer: Versión 1: Hola