Problema: Se necesita añadir comportamientos adicionales a un objeto de forma dinámica sin alterar su estructura. El uso intensivo de la herencia genera una proliferación inmanejable de subclases para cada combinación posible.

Solución: Envolver el objeto original dentro de clases decoradoras que comparten la misma interfaz. El decorador ejecuta el comportamiento adicional y delega el flujo principal al objeto envuelto.

Consecuencias:

Positivas: Proporciona una alternativa flexible a la herencia para extender la funcionalidad en tiempo de ejecución.

Negativas: Resulta en sistemas con excesivos objetos pequeños instanciados simultáneamente, dificultando el seguimiento (debugging).