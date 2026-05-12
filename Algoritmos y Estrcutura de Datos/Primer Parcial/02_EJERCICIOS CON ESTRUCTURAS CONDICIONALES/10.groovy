<<<<<<< HEAD
/*Una persona decide realizar un viaje a Europa, para lo cual necesita una determinada cantidad de euros. La
persona tiene ahorrada una cierta suma en dólares y desea saber si es suficiente y, en caso de haber diferencia (demás o de menos) a cuántos pesos equivale. Realice un algoritmo que solucione el problema, para lo cual deberá prever que se ingresen las equivalencias de monedas que considere necesarias (por ejemplo la cotización en pesos de dólar y/o del euro, o a cuantos euros equivale un dólar).*/
Accion EuroTrip Es
    Ambiente
        Dolar, EuroNecesarios: Real
        CotDolar, CotEu:Real
        PesosDolar, PesosNecesarios: Real
        Diferencia: Real
    Proceso
        Escribir("ingrese cantidad de dolares ahorrados");
        Leer(Dolar)
        Escribir("Ingrese cantidad de Euros que necesita");
        Leer(EuroNecesarios)
        Escribir("Ingrese cotizacion del Dolar en pesos");
        Leer(CotDolar)
        Escribir("Ingrese cotizacion del Euro en pesos");
        Leer(CotEu)
        PesosDolar:= dolares * CotDolar
        PesosNecesarios:= EuroNecesarios * CotEu
        
        Si (PesosDolar >= PesosNecesarios) Entonces
            diferencia:=  PesosDolar - PesosNecesarios
            Escribir("Alcanza el dinero, la diferencia es: " Diferencia)
        Sino
            Diferencia:= PesosNecesarios - PesosDolar
            Escribir("No alcanza el dinero, faltan en pesos:" Diferencia)
        Fin_Si
Fin_Accion
=======
/*Una persona decide realizar un viaje a Europa, para lo cual necesita una determinada cantidad de euros. La
persona tiene ahorrada una cierta suma en dólares y desea saber si es suficiente y, en caso de haber diferencia (demás o de menos) a cuántos pesos equivale. Realice un algoritmo que solucione el problema, para lo cual deberá prever que se ingresen las equivalencias de monedas que considere necesarias (por ejemplo la cotización en pesos de dólar y/o del euro, o a cuantos euros equivale un dólar).*/
Accion EuroTrip Es
    Ambiente
        Dolar, EuroNecesarios: Real
        CotDolar, CotEu:Real
        PesosDolar, PesosNecesarios: Real
        Diferencia: Real
    Proceso
        Escribir("ingrese cantidad de dolares ahorrados");
        Leer(Dolar)
        Escribir("Ingrese cantidad de Euros que necesita");
        Leer(EuroNecesarios)
        Escribir("Ingrese cotizacion del Dolar en pesos");
        Leer(CotDolar)
        Escribir("Ingrese cotizacion del Euro en pesos");
        Leer(CotEu)
        PesosDolar:= dolares * CotDolar
        PesosNecesarios:= EuroNecesarios * CotEu
        
        Si (PesosDolar >= PesosNecesarios) Entonces
            diferencia:=  PesosDolar - PesosNecesarios
            Escribir("Alcanza el dinero, la diferencia es: " Diferencia)
        Sino
            Diferencia:= PesosNecesarios - PesosDolar
            Escribir("No alcanza el dinero, faltan en pesos:" Diferencia)
        Fin_Si
Fin_Accion
>>>>>>> 3cecf56 (11/05)
