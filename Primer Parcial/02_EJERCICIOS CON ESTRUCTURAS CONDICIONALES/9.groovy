/*Escriba un algoritmo que permita conocer la edad de una persona, con solo ingresar la fecha de nacimiento y la
fecha actual, ambas en el formato: DIA, MES, AÑO.*/
Accion Saber_Edad Es
    Ambiente
        Dnac,Mnac,Anac,Dactual,Mactual,Aactual,Edad:Entero
    Proceso
        Escribir("ingrese año de nacimiento en el formato DD/MM/AA")
        Leer(Dnac,Mnac,Anac)
        Escribir("Ingrese dia actual en el formato DD/MM/AA")
        Leer(Dactual,Mactual,Aactual)

        Edad:= Aactual - Anac
        Si (Mactual < Mnac) Entonces
            Edad:= Edad - 1
        Sino
            Si (Mactual==Mnac) y (Dactual < Dnac) Entonces
                Edad:= Edad - 1
            Fin_Si
        Fin_Si
        Escribir("La Edad Actual es: ",Edad)
Fin_Accion