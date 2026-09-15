# Observer

## Problema
Se necesita notificar automáticamente a varios usuarios cuando un canal publica un nuevo mensaje.

## Solución
Se utiliza el patrón Observer, donde `Canal` notifica a todos los usuarios suscriptos mediante la interfaz `Observador`.

## Consecuencias

**Ventajas:**
- Permite notificar a varios objetos automáticamente.
- Facilita agregar nuevos usuarios sin modificar el canal.

**Desventajas:**
- Puede generar muchas notificaciones si hay muchos observadores.
- Existe dependencia entre el canal y sus observadores.

## Implementación
`Observador.java` define la interfaz para recibir actualizaciones.  
`Usuario.java` implementa dicha interfaz.  
`Canal.java` administra los usuarios y envía las notificaciones.  
`Main.java` comprueba el funcionamiento del patrón.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

El canal publicó: Nuevo video disponible!
Juan recibió: Nuevo video disponible!
Pedro recibió: Nuevo video disponible!
Maria recibió: Nuevo video disponible!