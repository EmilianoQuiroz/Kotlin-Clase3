fun main(){
    //Operadores relacionales
    var a = 20
    var b =20
    println("a es igual a b: ${a == b}")//El operador == es de igualdad
    //Y el operador = es de asignación
    println("a es diferente de b: ${a != b}")
    println("a es mayor que b: ${a > b}")
    println("a es menor que b: ${a < b}")
    println("a es menor o igual que b: ${a <= b}")
    println("a es mayor o igual que b: ${a >= b}")

    /*
    TABLA DE VERDAD:
    A   B   AND OR
    V   V   V   V
    V   F   F   V
    F   V   F   V
    F   F   F   F

    OPERADOR NOT (negación)
    A   NOT
    V   F
    F   V
    */

    //Operadores lógicos (operadores de tipo booleano - el resultado es de tipo booleano)
    /*
    && and
    || or
    ! not
    */
    var log1 = true
    var log2 = false

    println("AND: ${log1 && log2}")
    println("OR: ${log1 || log2}")
    println("Not: ${!log1}")

    //Manejo de string
    var nombre = "Santiago"
    println(nombre)
    println("length: ${nombre.length}")//.length nos da el número de caracteres del string
    //Devuelve un entero con la longitud del string
    println("isEmpty: ${nombre.isEmpty()}")//Nos devuelve un booleano que nos indica si el str esta vacio
    println("contains: ${nombre.contains("mili")}")//devuelve un booleano que nos indica si contiene la subcadedna indicada

    //010219










}