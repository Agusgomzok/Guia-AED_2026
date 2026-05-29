<<<<<<< HEAD
Accion
    Ambiente
        num,cuad: Real
        Funcion Result (n:Real): Real
            Si n MOD 2 = 0 Entonces
                Result:= n*n
            Result:=n*n*n
        Fin_Funcion
    Proceso
        Escribir("Ingrese un numero")
        Leer(num)
        cuad:= Cuadrado(num)
        Escribir("el cuarado de",num,"es:", cuad)
Fin_Accion

Accion
    Ambiente
        num,Res: Real
        Funcion Result (n:Real): Real
            Cuadrado:= n*n
        Fin_Funcion
    Proceso
        Escribir("Ingrese un numero")
        Leer(num)
        Res:= Result(num)
        Escribir("el resultado de",num,"es:", Res)
=======
Accion
    Ambiente
        num,cuad: Real
        Funcion Result (n:Real): Real
            Si n MOD 2 = 0 Entonces
                Result:= n*n
            Result:=n*n*n
        Fin_Funcion
    Proceso
        Escribir("Ingrese un numero")
        Leer(num)
        cuad:= Cuadrado(num)
        Escribir("el cuarado de",num,"es:", cuad)
Fin_Accion

Accion
    Ambiente
        num,Res: Real
        Funcion Result (n:Real): Real
            Cuadrado:= n*n
        Fin_Funcion
    Proceso
        Escribir("Ingrese un numero")
        Leer(num)
        Res:= Result(num)
        Escribir("el resultado de",num,"es:", Res)
>>>>>>> ff4bdc6 (11/05)
Fin_Accion