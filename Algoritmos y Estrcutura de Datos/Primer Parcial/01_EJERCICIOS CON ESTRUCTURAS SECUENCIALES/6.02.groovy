/*Dado un número entero de tres cifras ingresado por el usuario, escriba un algoritmo que determine el valor de
la centena, la decena y la unidad. Finalmente, muestre por pantalla los tres componentes por separado y el resultado
de la suma de sus dígitos*/
Accion C,DyU Es
    Amniente
        Num:Entero
        C,D,U:Entero
    Proceso
        Escribir("Ingrese el numero a desgloce")
        Leer(num) //139
        C:= num DIV 100 //C:=1
        D:= (num MOD 100) DIV 10 //D:=3
        U:= num MOD 10 U:=9
        Escribir("Centena",C)
        Escribir("Decena",D)
        Escribir("Unidad",U)
        Escribir("La sumatoria por separado es", C+D+U)
Fin_Accion