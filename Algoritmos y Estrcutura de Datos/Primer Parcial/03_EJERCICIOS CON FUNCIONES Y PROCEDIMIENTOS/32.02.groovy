/* Diseñe una función que devuelva la suma de los dígitos del número natural suministrado como parámetro*/
Accion SUM_NATU Es
    Ambiente
    num,result:Entero
    Funcion naturales (nro:Entero):Entero Es
    digito,suma:Entero //variables Locales
        suma:=0
        Mientras nro > 0 hacer
            digito:= nro MOD 10  //123 MOD 10 =3
            suma:= suma + digito
            nro:= nro DIV 10 //123 DIV 10= 12
        Fin_Mientras    //hasta tener destripado a mi numero 1+2+3=6
        suma_digitos:= suma
    Fin_Funcion
    Proceso
        Escribir("Ingrese un numero")
        Leer(num)
        result:= naturales(num)

        Escribir("La suma de los digitos es:",result)
Fin_Accion