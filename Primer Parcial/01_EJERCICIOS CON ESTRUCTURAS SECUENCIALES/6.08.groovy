/*Escriba un algoritmo que halle la media geométrica de tres valores X, Y, Z. Este debe emitir los tres valores por
separado y luego el valor medio. La media geométrica es igual a (X*Y*Z) / 3.
*/
Accion Es
    Ambiente
    X,Y,Z:Real
    Proceso
    Escribir("ingrese el valor de las coordenadas de X, Y , Z ")
    Leer(X,Y,Z)
    Escribir("El valor de X es",X)
    Escribir("El valor de Y es",Y)
    Escribir("El valor de Z es",Z)
    Escribir("La media geometrica entre esos 3 valores es ", (X*Y*Z)/3); ///Media = (X * Y * Z)^(1/3)
Fin_Accion