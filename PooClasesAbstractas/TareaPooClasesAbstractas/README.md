# Tarea de programacion orientada a objetos clases abstractas

Se requiere escribir un programa para la administración de animales de un zoológico, inicialmente para los mamíferos, para leones, lobos, tigres, guepardos y perros salvaje africano.

Se necesita diseñar una jerarquías de clases en común a todos ellos, por ejemplo para los felinos (Leon, Tigre y Guepardo) vamos a necesitar la clase abstracta Felino, para los caninos (Lobo y Perro) vamos a necesitar la clase abstracta Canino y una clase que sea en comun para todos ellos, la clase abstracta Mamifero.

Para todos los mamíferos mencionados se requieren de los siguientes atributos en común (que deberan de implementar en la clase abstracta Mamifero): el habitat (string), altura (decimal), largo (decimal), peso (decimal), nombre científico (string) con sus respectivos métodos getters, usar constructor para inicializar los datos. También se necesitan 4 métodos abstractos que deberán implementar los tipos concretos: comer(), dormir(), correr(), comunicarse(), todos devuelven string.

Todos los caninos deberán tener ademas de lo anterior los atributos color (string), tamaño colmillos (decimal) e inicializar los datos mediante constructor con sus métodos getters.

Todos los felinos deberán tener los atributos tamaño garras (decimal) y velocidad (int), inicializar los datos mediante constructor y sus métodos getters.

Respecto a los tipos concretos:

- El Leon ademas tiene numero manada (int) y potencia rugido en decibel (decimal)

- El Tigre tiene el atributo especie tigre (string)

- El Guepardo sin atributos adicionales

- El Lobo tiene numero de camada (int) y especieLobo (string)

- El Perro tiene fuerza de mordida en psi (int)

Los métodos abstractos comer(), dormir(), correr() y comunicarse() tienen que ser implementados por las clases concretas devolviendo un string con alguna frase u oración que sea de acuerdo a cada tipo y que interactúe con sus atributos. No hay una regla para implementar estos métodos, pueden aplicar la creatividad, por ejemplo en la clase Leon el método comer() podría ser implementado devolviendo la cadena "El León caza junto a su grupo de " + numManada + " individuos en las llanuras africanas", o para el Lobo el método dormir() devolver "El Lobo " + color + " duerme en las cavernas de " + habitat.

Al final crear la clase con el método main llamada EjemploMamiferos y crear algunas instancias de ejemplo de cada clase concreta, entre 5 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

Mamifero[] mamiferos = new Mamifero[6];
 
Mamifero leon = new Leon(120d, 5, 7.5f, 58, "Sur Africa", 120, 220, 190);
Mamifero guepardo = new Guepardo(4.9f, 130, "Africa", 94, 140, 72);
...
mamiferos[0] = leon;
mamiferos[1] = guepardo;
...
 
for (Mamifero animal : mamiferos) {
    ....
}
...
A continuación dejo el diagrama UML de clases como una guía, los métodos getters y constructores se omitieron para simplificar, pero deben ir en el código.
