Problema: Un cliente necesita operar con múltiples clases de un subsistema complejo, lo que acopla fuertemente el código del cliente a la lógica interna de ese subsistema.

Solución: Proveer una clase unificada (Fachada) que exponga una interfaz simplificada y de alto nivel, orquestando por detrás las llamadas a las distintas clases del subsistema.

Consecuencias:

Positivas: Desacopla el sistema cliente del subsistema complejo, promoviendo un código limpio y fácil de usar.

Negativas: Si no se diseña correctamente, la clase Fachada puede convertirse en un objeto monolítico que acapara responsabilidades ("God Object").