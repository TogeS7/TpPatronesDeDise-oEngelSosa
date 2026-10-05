# State

## Problema
El comportamiento de las acciones de un personaje (como moverse o curarse) varía según su estado actual (Sano, Herido, Envenenado). Implementar esta lógica mediante sentencias `if/switch` dentro de la clase principal genera un código rígido y difícil de escalar al agregar nuevos estados.

## Solución
Se implementa el patrón State, delegando el comportamiento a una jerarquía de clases de estado que implementan la interfaz `EstadoPersonaje`. Cada estado concreto maneja su propia lógica para las acciones e incluye la responsabilidad de realizar la transición de estado cuando sea necesario.

## Consecuencias

**Ventajas:**
- Elimina sentencias condicionales extensas (`if/switch`).
- Facilita la escalabilidad: se pueden agregar nuevos estados sin alterar el contexto ni los estados existentes.
- Centraliza las reglas de transición de estado en las clases concretas (ej. de Envenenado se transiciona a Herido).

**Desventajas:**
- Incrementa la cantidad de clases en el proyecto.
- Puede resultar una arquitectura sobre-diseñada si la cantidad de estados es mínima y estática.

## Implementación
`Personaje.java` actúa como el Contexto, manteniendo una referencia al estado actual.
`EstadoSano.java`, `EstadoHerido.java` y `EstadoEnvenenado.java` implementan la interfaz `EstadoPersonaje` con la lógica específica de cada escenario.
`Main.java` ejecuta la prueba de comportamiento y transiciones dinámicas.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

--- Prueba de Estado Inicial ---
Estado Sano: Movimiento a velocidad normal.

--- Evento: Recibe Daño Físico ---
Estado Herido: Movimiento reducido. Salto bloqueado.

--- Evento: Recibe Daño Tóxico ---
Estado Envenenado: Movimiento crítico. Descontando puntos de salud (HP).

--- Acción: Curar (Intento 1) ---
Estado Envenenado: Aplicando antídoto... Transición a EstadoHerido.
Estado Herido: Movimiento reducido. Salto bloqueado.

--- Acción: Curar (Intento 2) ---
Estado Herido: Aplicando curación... Transición a EstadoSano.
Estado Sano: Movimiento a velocidad normal.