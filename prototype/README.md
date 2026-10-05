Problema: Instanciar un objeto desde cero (con new) consume demasiados recursos de procesamiento, red o base de datos.

Solución: Crear nuevos objetos mediante la clonación de una instancia previamente configurada (el prototipo), aprovechando interfaces nativas como Cloneable.

Consecuencias:

Positivas: Reduce significativamente el tiempo y costo de creación de objetos repetitivos.

Negativas: Implementar una clonación profunda (deep copy) cuando hay referencias circulares o dependencias de otros objetos complejos es propenso a errores.