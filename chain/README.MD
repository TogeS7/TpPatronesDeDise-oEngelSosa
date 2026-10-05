# Chain of Responsibility

## Problema
Se necesita procesar una petición o problema que puede requerir distintos niveles de atención. Si se intenta vincular directamente el emisor de la petición con el receptor específico, el código queda muy acoplado y es difícil agregar nuevos niveles de procesamiento.

## Solución
Se utiliza el patrón Chain of Responsibility. Se crea una cadena de objetos receptores (eslabones). El emisor envía la petición al primer eslabón, y cada objeto decide si la procesa o si se la pasa al siguiente eslabón en la cadena.

## Consecuencias

**Ventajas:**
- Reduce el acoplamiento: el emisor no necesita saber qué objeto específico procesará su petición.
- Añade flexibilidad: se pueden agregar, quitar o reordenar eslabones dinámicamente sin romper el código.

**Desventajas:**
- No hay garantía de que la petición sea procesada (si llega al final de la cadena sin ser manejada, se pierde).
- Puede ser difícil seguir el rastro de la ejecución o hacer "debug" si la cadena es muy larga.

## Implementación
`ManejadorSoporte.java` define la clase abstracta para enlazar los objetos.  
`SoporteBasico.java`, `SoporteAvanzado.java` y `Gerente.java` son los manejadores concretos que deciden si actúan o delegan.  
`Main.java` configura la cadena y realiza llamadas de prueba.

## Ejecución
Ejecutar `Main.java`.

Resultado esperado:

--- Reportando problema Nivel 1 ---
Soporte Básico: Problema resuelto (ej. reiniciar router).

--- Reportando problema Nivel 2 ---
Soporte Básico: Problema muy complejo, derivando al siguiente nivel...
Soporte Avanzado: Problema resuelto (ej. configurar base de datos).

--- Reportando problema Nivel 3 ---
Soporte Básico: Problema muy complejo, derivando al siguiente nivel...
Soporte Avanzado: Problema crítico, derivando al gerente...
Gerente: Resolviendo problema crítico de nivel 3 (ej. caída de servidores).