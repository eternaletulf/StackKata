
# stack-kata

Esta Kata está inspirada en el trabajo presentado en:
 ["Specifics and Generics" publicada en el blog "The Clean Coder"]( http://thecleancoder.blogspot.com/2010/11/craftsman-63-specifics-and-generics.html )

## Requerimientos y Reglas 

Durante el desarrollo de esta Kata, estas encargado de la implementación de una Pila. Se te proveerá de la estructura inicial del proyecto para que puedas comenzar a trabajar. 

* Requerimientos:

	* Puedes crear un objeto del tipo Stack.
	* Todo Stack recién creado, deberá estar vacío.
	* Despues de hacer push una vez, el tamaño del Stack deberá ser uno.
	* Luego de un push y un pop, el Stack deberá estar vacío. 
	* Cuando haces push sobre un límite, el Stack deberá lanzar una excepción de overflow. 
	* Cuando haces pop sobre un Stack vacío, el Stack deberá lanzar una excepción de underflow.
	* Cuando dos se hace push a dos valores, y luego se realiza un pop, el tamaño, deberá ser uno.
	* Cuando se hace push a un elemento, el siguiente elemento recibido al hacer pop, debe ser el mismo.
	* Cuando se hace push a dos elementos, se deben retornar en el orden inverso al hacer dos pop.
	* Al crear un stack, considera un constructor, si el valor del tamaño máximo es negativo, debes lanzar una excepción del tipo IllegalCapacity.
	* Cuando se crea un Stack con capacidad 0, cualquier push deberá lanzar overflow.
	* Cuando se pasa un valor por push, el mismo valor estará en top.
	* Cuando el Stack está vacío, y se usa top, deberá devolver un vacio.
	* Cuando la capacidad es 0, top siempre retornara vacio

Recuerda usar los pasos del ciclo de Test-Driven Development:
 
* Reglas: 
    1. Escribir un test que falle.
    1. Escribir el mínimo código necesario para pasar el test.
    1. Refactoriza el código.

