Problema: Se requiere integrar una clase existente o librería externa cuyo diseño de interfaz (métodos, parámetros) es incompatible con lo que el resto del sistema espera consumir.

Solución: Interponer una clase adaptadora que implemente la interfaz deseada por el cliente y traduzca internamente las peticiones hacia la clase incompatible.

Consecuencias:

Positivas: Habilita la reutilización de código heredado sin alterarlo y cumple con el Principio de Responsabilidad Única.

Negativas: Agrega complejidad estructural mediante nuevas clases e interfaces.