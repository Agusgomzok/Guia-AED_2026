<<<<<<< HEAD
/* Diseñe una función que permita ingresar 3 números y devuelva el mínimo valor. El programa principal debe permitir que este proceso se repita la cantidad de veces que el usuario desee.
*/
Accion Es
    Ambiente
        num1,num2,num3,nummin:Entero
        condicion:("Si","No")
        Funcion ValorMin(n1,n2,n3:Entero):Entero
            ValMin:Entero
                Si (n1 <= n2) y (n1 <= n3) Entonces
                    ValMin:=n1
                Sino
                    Si (n2<= n1) y (n2 <= n1)
                        ValMin:=n2
                    Sino
                        ValMin:=n3
                    Fin_Si
                Fin_Si
        Fin_Funcion
    Proceso
        Repetir
            Escribir("Ingrese 3 numeros para saber cual es el valor minimo")
            Leer(num1,num2,num3)
            nummin:= ValorMin(num1,num2,num3)  //podria ahorrar linea 23 con "Esc("el valor min es:", ValorMin(num1, num2, num3))"
            Escribir("El valor minimo es: ",nummin)
            Escribir("¿Desea seguir?(Si/No)")
            Leer(condicion)
        Hasta que condicion = "No"
=======
/* Diseñe una función que permita ingresar 3 números y devuelva el mínimo valor. El programa principal debe permitir que este proceso se repita la cantidad de veces que el usuario desee.
*/
Accion Es
    Ambiente
        num1,num2,num3,nummin:Entero
        condicion:("Si","No")
        Funcion ValorMin(n1,n2,n3:Entero):Entero
            ValMin:Entero
                Si (n1 <= n2) y (n1 <= n3) Entonces
                    ValMin:=n1
                Sino
                    Si (n2<= n1) y (n2 <= n1)
                        ValMin:=n2
                    Sino
                        ValMin:=n3
                    Fin_Si
                Fin_Si
        Fin_Funcion
    Proceso
        Repetir
            Escribir("Ingrese 3 numeros para saber cual es el valor minimo")
            Leer(num1,num2,num3)
            nummin:= ValorMin(num1,num2,num3)  //podria ahorrar linea 23 con "Esc("el valor min es:", ValorMin(num1, num2, num3))"
            Escribir("El valor minimo es: ",nummin)
            Escribir("¿Desea seguir?(Si/No)")
            Leer(condicion)
        Hasta que condicion = "No"
>>>>>>> 3cecf56 (11/05)
Fin_Accion