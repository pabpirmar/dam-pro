## Desarrollo y pruebas del alumno

### Cómo funciona mi programa

Scanner: Sirve para leer lo que escribo por el teclado (nombre, cantidades y precios).

Variables: Guardan la información (nombre para el cliente, productos para la cantidad, y precio y precioTotal para los costos).

Bucle for: Repite el bloque de preguntas tantas veces como los productos que haya indicado el cliente.

Acumulador (precioTotal): Empieza en 0 y va sumando el precio de cada producto en cada vuelta del bucle.

### Pruebas realizadas

#### Prueba 1:

- Entrada: 1 producto de 5 euros.

- Resultado esperado: Muestra los datos y el precio total de 5 euros.

#### Prueba 2:

- Entrada: Dos productos de 2 y 3 euros.

- Resultado esperado: Muestra los productos y el precio total de 5 euros.

#### Prueba 3:

- Entrada: Tres productos de 1,50; 2,50 y 4 euros.

- Resultado esperado: Muestra los tres productos y el precio total de 8 euros.

#### Prueba 4:

- Entrada: Cuatro productos de 1 euro cada uno.

- Resultado esperado: Muestra los cuatro productos y el precio total de 4 euros.
### Dificultades y soluciones

- Dificultad: Al combinar números (nextInt o nextFloat) con textos (nextLine), el teclado a veces se saltaba una pregunta.

- Solución: Añadir un teclado.nextLine() después de leer los números.