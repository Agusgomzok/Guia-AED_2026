/*Escribir un algoritmo que permita calcular el precio de un artículo para un año dado, considerando que la
inflación es del 4 por 100 anual.La fórmula del precio es: P = C * (1+R) ^ (N - A)
C - Precio actual. R - Tasa de Inflación.
N - Año futuro. A - Año actual.*/
Accion Articulo_Inf Es
    Ambiente
        R=0,04
        P,C:Real
        A,N:Entero
    Proceso
        Escribir("Ingrece precio del articulo a calcular y año actual");
        Leer(C,A)
        Escribir("Ingrece para que año quiere calcular");
        Leer(N)
        Escribir("el precio del articulo sera de",P = C * (1+R) ** (N - A))
Fin_Accion