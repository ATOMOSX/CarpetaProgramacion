# Tarea 1 de programacion orientada a objeros interfaces

El objetivo de esta práctica es exponer los conceptos que hay detrás del polimorfismo implementando clases abstractas e interfaces.

Se requiere crear un catalogo de producto con un diseño de jerarquía de clases y uso de interfaces para los métodos (o comportamiento).

Primero, vamos a tener las interfaces que describen el comportamiento que deberán tener las clases de la jerarquía:

La interface IProducto con dos firmas de metodos int getPrecio() y double getPrecioVenta().

La interface IElectronico con una firma de método String getFabricante().

La interface ILibro con 4 firmas de métodos:

Date getFechaPublicacion();
String getAutor();
String getTitulo();
String getEditorial();


Segundo, vamos a tener las clases abstractas para las diferentes especializaciones de productos:

La clase abstracta Producto que debe implementar la interface IProducto y tener el atributo precio con su respectivo método getter y el constructor.

La clase abstracta Electronico que debe implementar la interface IElectronico, con el atributo fabricante con su respectivo método getter y constructor.



Tercero, las 4 clases concretas que deben heredar de las clases abstractas, y si corresponde implementar alguna interface:

La clase IPhone, poner especial atención en el extends de Electronico y en el método que debe implementar getPrecioVenta() de la interface IProducto, sus atributos color y modelo del tipo string con sus respectivos métodos getter y el constructor.

La clase TvLcd, poner especial atención en el extends de Electronico y en el método que debe implementar getPrecioVenta(), su atributo pulgada (int) con su respectivo método get y el constructor.

La clase Libro que debe de extender de Producto e implementar el método getPrecioVenta(), ademas debe tener 4 atributos fechaPublicacion (Date), autor (string), titulo (string) y editorial (string) con sus respectivos métodos getters y el constructor. Pero ademas debe implementar la interface ILibro.

Finalmente la clase Comics con en el extends de Libro e implementar el método de la interface getPrecioVenta() y su atributo personaje (string) con su respectivo método getter y constructor.

Al final crear la clase con el método main llamada ProyectoCatalogo y crear algunas instancias de ejemplo de cada clase concreta, entre 4 a 7 objetos, asociado al tipo mas genérico posible y mostrar los datos en consola. Por ejemplo:

IProducto[] productos = new Producto[6];
...
productos[2] = new TvLcd(340000, "Sony", 40);
productos[3] = new Libro(18000, "Eric Gamma", "Elementos reusables POO", "Alguna...");
productos[4] = new Libro(14000, "Martin Fowler", "UML Gota a Gota", "Alguna...");
...

