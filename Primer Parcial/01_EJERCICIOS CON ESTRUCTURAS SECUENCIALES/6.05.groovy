/*Se desea calcular el valor de la sección (S) de un conductor, la cual se determina en función de la corriente
eléctrica I y de la conductividad C del material (C=I/S). Además, a la sección así obtenida se le incrementa un 25%
por razones de seguridad.*/ 
Accion Es
    Ambiente
        RzSec=0,25
        SConduc,I,C:Real
    Proceso
        Escribir("Ingrese el valor de la corriente electrica y segudo de la conductividad")
        Leer(I,C)
        Escribir("El valor de la seccion de un conductor mas el ingremento de seguridad es ", (I/C)* (1+RzSec))
Fin_Accion