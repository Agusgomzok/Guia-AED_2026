/*Se desea calcular la superficie de un trapecio, para la cual se ingresa la longitud de ambas bases y la altura.
En base a la fórmula:
S = (Bmay + Bmen) * h
2*/
Accion CalculoTrapecio Es
    Ambiente
        Bmay:Entero
        Bmen:Entero
        h:Entero
    Proceso
        Escribir("Ingrese Base Mayor del trapecio")
        Leer(Bmay)
        Escribir("Ingrese Base Menor del trapecio")
        Leer(Bmen)
        Escribir("ingrese altura")
        Leer(h)
        Escribir("--- Datos del Trapecio ---")
        Escribir("Base Mayor ingresada: ", Bmay)
        Escribir("Base Menor ingresada: ", Bmen)
        Escribir("Altura ingresada: ", h)
        Escribir("El resultado es ",((Bmay+Bmen)*h/2))
Fin_Accion