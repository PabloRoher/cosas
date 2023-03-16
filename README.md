# cosas

Repositorio: 
https://github.com/PabloRoher/cosas.git


# Ejercicio 1 (3 puntos) Tiempo estimado: 30 minutos.
# a) Escribir una función recursiva que calcule xy mediante multiplicaciones sucesivas, siendo x e y
dos números enteros. ¿Cuál es el tipo de recursividad empleado?
# b) Escribir una función recursiva que calcule xy con un orden computacional de O log(n)
aprovechando la propiedad
Xn*m = (Xn)m
Por ejemplo:
216 = (22)
8 =(24)
4
Y aplicando la metodología de divide y vencerás
x
17 = x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x * x =
x
8 * x * x8 = (x4 * x4) * x * (x4 * x4) = (x2 * x2) * (x2 * x2) * x * (x2 * x2) * (x2 * x2) = (x * x) * (x * x) * (x * x) * (x * x) *
x * (x * x) * (x * x) * (x * x) * (x * x) =
(x2)
17//2 * x = (x2*2)
17//4 * x = (x2*2*2)
17//8 * x = (x2*2*2*2)
17//16 * x

# Ejercicio 2 (7 puntos) Tiempo estimado: 90 minutos
En la aplicación de contactos de un móvil con sistema operativo Android, el usuario tiene una
Agenda que incluye una lista de contactos. Cada Contacto almacena, entre otras características, el
nombre, el apodo, una lista de direcciones de email, una lista de Teléfonos y un valor lógico
(true/false) que indica si las llamadas de este contacto hay que silenciarlas. Por su parte, cada
Teléfono incluye su tipología (casa, trabajo, móvil, otros), el número de teléfono al que hace
referencia y un valor lógico que indica si es el teléfono preferido para llamar a esa persona.
En base a estas especificaciones se solicita que:
a) Programe la clase Teléfono en lenguaje Java.
• Cree sus atributos y establezca la visibilidad adecuada (pública, privada, protegida).
• Si es necesario, defina algún enumerado.
• Programe un constructor que reciba los datos necesarios para crear un teléfono. Por defecto,
el teléfono se creará como no preferido.
• Programe los métodos setters y getters para el atributo número de teléfono.
• Programe el método setPreferido(valor). Este método establece si el teléfono se marca como
preferido (o no). Se debe hacer el control de excepciones para este método.
• Programe el método equals(Object otherTelefon) de la clase Teléfono.
• Instancie un objeto de la clase Teléfono en un método main, sin realizar pruebas.
• Asuma que la función boolean isCorrectNumber(String telephoneNumber) está ya
implementada y devuelve un valor booleano (true o false) si el número es correcto o
incorrecto, haciendo comprobaciones de tipo y controlando en su interior todas las posibles
excepciones (esto es, esta función no lanza excepciones).
a) Programe la clase Contacto.
• Incluya sus atributos y establezca la visibilidad adecuada.
• Suponga que la clase Email está correctamente implementada.
• Programe un constructor que reciba los datos necesarios para crear un contacto.
• Programe el método def silenciar(). Este método anota que las llamadas de este contacto
hay que silenciarlas.
• Programe el método def telefonoFavorito(telefono). Este método busca entre todos los
teléfonos del contacto y marca el teléfono indicado como preferido (y desmarca el resto de
teléfonos). Al finalizar este método, sólo puede quedar un teléfono marcado como preferido.
Tenga en cuenta que, si el teléfono que se intenta marcar como preferido no está en la lista
del usuario, debería lanzar una excepción indicándolo.
• Para realizar este apartado, puede dar por supuesto que ha implementado correctamente la
clase Teléfono del apartado anterior.
b) Programe la clase Agenda.
• Incluya sus atributos y establezca la visibilidad adecuada.
• Programe un constructor por defecto para esta clase.
• def preferidoTelefonoContacto(contacto, telefono) es un método que se utiliza para marcar el
teléfono teléfono del contacto contacto de la agenda como favorito. Programe el método y
gestione las excepciones que puedan surgir.
• Para realizar este apartado, puede dar por supuesto que ha implementado correctamente las
clases Contacto y Teléfono de los apartados anteriores.
• Añada, si lo necesita, los métodos auxiliares que crea convenientes
