Problema: Crear un objeto complejo requiere invocar un constructor con demasiados parámetros (antipatrón "Telescoping Constructor"). Es difícil identificar qué valor corresponde a qué atributo, especialmente si hay parámetros opcionales.

Solución: Delegar la creación del objeto a una clase independiente (Builder) que proporciona métodos paso a paso para configurar los atributos y un método final build() para devolver la instancia construida.

Consecuencias:

Positivas: Mejora la legibilidad del código (permite encadenamiento de métodos) y asegura que el objeto no se devuelva en un estado inconsistente o incompleto.

Negativas: Incrementa la cantidad total de clases en el proyecto.