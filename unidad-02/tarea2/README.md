## Desarrollo y pruebas del alumno

### Cómo funciona mi programa

- `Scanner`: Lo he usado para leer los datos que escribe el usuario por la consola

- `String`: Sirve para guardar el nombre del usuario

- `int`: Lo uso para guardar el número de opción que elige el usuario en el menú y también para la variable contador

- `float`: Lo utilizo para las distancias, ya que nos permite trabajar con números que llevan decimales.

- `Bucle while`: Me permite mantener el menú en pantalla repitiéndose una y otra vez hasta que el usuario marque la opción de salir

- `Contador`: Es una variable que empieza en 0 y le sumo 1 cada vez que el usuario hace una conversión con éxito, para saber cuántas ha hecho al final

### Validaciones implementadas

- Opción incorrecta: Si el usuario escribe un número que no está en el menú (por ejemplo un 5), el programa entra por la opción default del switch, le avisa de que esa opción no existe y le vuelve a mostrar el menú sin cerrarse.


### Pruebas realizadas

#### Prueba 1
- Escribí mi nombre y comprobé que el programa me saludaba y mostraba el menú.

#### Prueba 2
- Introduje 2 km y comprobé que me devolvía correctamente 2000 metros.

- #### Prueba 3
- Probé con 5 metros y me dio 500 cm.

#### Prueba 4
- Puse 1 km y calculó bien las 0.62 millas.

#### Prueba 5
- Introduje un 8 en el menú y me avisó de que la opción no era válida.

#### Prueba 6
- Hice 3 conversiones seguidas para comprobar que no fallaba el flujo.

#### Prueba 7
- Marqué la opción de salir y comprobé que me mostraba mi nombre y el total de conversiones hechas.

### Dificultades y soluciones

- El programa se quedaba congelado: Al principio el programa se quedaba parado al pedir la opción. Me di cuenta de que era por el salto de línea que dejaba el teclado al leer números. Lo solucioné poniendo un teclado.nextLine(); justo después

- Error con las funciones: Al intentar crear las funciones me daba error porque no sabía dónde ponerlas. Aprendí que en Java tienen que ir dentro de la clase principal, pero fuera del main, y llevar la palabra static