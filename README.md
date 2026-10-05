# Patrones de Diseño

## Objetivo
Implementar y analizar los principales patrones de diseño (creacionales, estructurales y de comportamiento) utilizando ejemplos prácticos en Java.

## Patrones implementados

### Patrones Creacionales
* **Singleton:** Garantiza la existencia de una única instancia de una clase y proporciona un punto de acceso global a ella.
* **Builder:** Permite construir objetos complejos paso a paso, separando la construcción de su representación.
* **Prototype:** Permite crear nuevos objetos clonando una instancia preexistente en lugar de crearlos desde cero.

### Patrones Estructurales
* **Adapter:** Actúa como un intermediario para que dos interfaces incompatibles puedan trabajar juntas.
* **Decorator:** Añade nuevas funcionalidades o responsabilidades a un objeto de forma dinámica sin modificar su estructura.
* **Facade:** Proporciona una interfaz unificada y simplificada para acceder a un subsistema complejo.

### Patrones de Comportamiento
* **Observer:** Permite notificar automáticamente a múltiples objetos (observadores) cuando ocurre un cambio de estado en otro objeto.
* **Strategy:** Define una familia de algoritmos y permite intercambiarlos dinámicamente sin modificar la clase que los usa.
* **State:** Permite a un objeto alterar drásticamente su comportamiento cuando su estado interno cambia.
* **Memento:** Captura y guarda el estado interno de un objeto para poder restaurarlo posteriormente (como la función "Deshacer").
* **Chain of Responsibility:** Pasa una petición a lo largo de una cadena de manejadores hasta que uno de ellos la procesa.

## Estructura del repositorio

```text
/
├── adapter/      → Patrón Adapter
├── builder/      → Patrón Builder
├── chain/        → Patrón Chain of Responsibility
├── decorator/    → Patrón Decorator
├── facade/       → Patrón Facade
├── memento/      → Patrón Memento
├── observer/     → Patrón Observer
├── prototype/    → Patrón Prototype
├── singleton/    → Patrón Singleton
├── state/        → Patrón State
└── strategy/     → Patrón Strategy