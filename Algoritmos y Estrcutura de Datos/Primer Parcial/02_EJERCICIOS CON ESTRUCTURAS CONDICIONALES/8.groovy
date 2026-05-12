/*Escriba un algoritmo que acepte dos números, calcule la suma e imprima el mensaje de acuerdo al resultado
obtenido.
suma <= 50
suma > 50 y <= 100
suma > 100 y <= 200
suma > 200*/
Accion Es
    Ambiente
        n1,n2,Suma:Entero
    Proceso
        Escribir("Ingrese dos numeros para poder sumarlos")
        Leer(n1,n2)
        Si Suma <= 50 Entonces
            Escribir("La suma es menor o igual a 50")
        Sino
            Si Suma <= 100 Entonces
                Escribir("La suma es mayor a 50 y menor o igual a 100")
            Sino
                Si Suma <= 200 Entonces
                    Escribir("La duma es mayor a 100 y menor o igual a 200")
                Sino
                    Escribir("La suma es mayor a 200")
                Fin_Si
            Fin_Si
        Fin_Si
Fin_Accion