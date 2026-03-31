/*Escriba un algoritmo que permita ingresar 3 valores numéricos y determine cuál es el mayor, el medio y el menor.*/
Accion M,M,M Es
    Ambiente
        Ma,Me,Min:Entero
    Proceso
        Si Ma > Me y Ma > Min Entonces
            Escribir("El numero mayor es", Ma)
        Sino
            Si Me > Min Entonces
                Escribir("El numero del medio es",Me)
            Sino
                Escribir("El numero menor es", Min)
            Fin_Si
        Fin_Si
Fin_Accion

Accion Mayor_Medio_Menor Es
    Ambiente
        n1, n2, n3: Entero
        Ma, Me, Min: Entero
    Proceso
        Escribir("Ingrese tres números:")
        Leer(n1, n2, n3)

        // 1. Buscamos quién es el Mayor (Ma)
        Si (n1 > n2) y (n1 > n3) Entonces
            Ma <- n1
            // Si n1 es el mayor, comparamos los otros dos para Me y Min
            Si n2 > n3 Entonces
                Me <- n2
                Min <- n3
            Sino
                Me <- n3
                Min <- n2
            Fin_Si
        Sino
            Si (n2 > n1) y (n2 > n3) Entonces
                Ma <- n2
                Si n1 > n3 Entonces
                    Me <- n1
                    Min <- n3
                Sino
                    Me <- n3
                    Min <- n1
                Fin_Si
            Sino
                // Si no fue n1 ni n2, el mayor es n3
                Ma <- n3
                Si n1 > n2 Entonces
                    Me <- n1
                    Min <- n2
                Sino
                    Me <- n2
                    Min <- n1
                Fin_Si
            Fin_Si
        Fin_Si

        Escribir("El mayor es: ", Ma)
        Escribir("El del medio es: ", Me)
        Escribir("El menor es: ", Min)
Fin_Accion