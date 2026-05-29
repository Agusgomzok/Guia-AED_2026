<<<<<<< HEAD
/*Escriba un algoritmo que acepte un número entero mayor a 100 y menor a 1000, y muestre cómo está compuesto
(unidades, decenas y centenas) y si es múltiplo de 3.*/
Accion 999 Es
    Ambiente
        num:101..999
    Proceso
        Escribir("Ingrese un numero del 101 al 999 para poder descomponerlos")
        Leer(num)//123
        si (num MOD 3 = 0) Entonces
            Escribir(Es divisible por 3)
        Fin_Si
        Escribir("Unidades es:" num MOD 10)3
        num:= num div 10 //12
        Escribir("Decenas es:" num MOD 10)2
        Escribir("Centenas es:" num DIV 10 )1
=======
/*Escriba un algoritmo que acepte un número entero mayor a 100 y menor a 1000, y muestre cómo está compuesto
(unidades, decenas y centenas) y si es múltiplo de 3.*/
Accion 999 Es
    Ambiente
        num:101..999
    Proceso
        Escribir("Ingrese un numero del 101 al 999 para poder descomponerlos")
        Leer(num)//123
        si (num MOD 3 = 0) Entonces
            Escribir(Es divisible por 3)
        Fin_Si
        Escribir("Unidades es:" num MOD 10)3
        num:= num div 10 //12
        Escribir("Decenas es:" num MOD 10)2
        Escribir("Centenas es:" num DIV 10 )1
>>>>>>> ff4bdc6 (11/05)
Fin_Accion