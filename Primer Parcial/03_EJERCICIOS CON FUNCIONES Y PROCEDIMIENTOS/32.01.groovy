/* Realice una función que dado un número devuelva su cuadrado.*/
Accion cuadrado Es
    Ambiente
        n;result:Entero
        Funcion cuadrado (num:Entero):Entero
            cuadrado:= num * num
        Fin_Funcion
    Proceso
        Escribir("Ingrese un numero para devolverle su cuadrado")
        Leer(n)
        result:= cuadrado(n)
        Escribir("El cuadrado de ",n, "es:"result)
Fin_Accion