/*Debido a los frecuentes aumentos de combustible, el propietario de una estación de servicio le pide a usted que
escriba un algoritmo para una “calculadora de precios”. El mismo debe recibir el precio actual, el porcentaje de
aumento, calcular el nuevo precio y al final mostrar todo.*/
Accion calculadora de precios Es
    Ambiente
        NewPrecio,Pactual,Paument:Real
    Proceso
        Escribir("Ingrese el precio actual del combustible")
        Leer(Pactual)
        Escribir("Ingrese el porcentaje de aumento")
        Leer(Paument)
        NewPrecio:=Pactual * (1+Paument/100)
        Escribir("-----------------------Precios de Combustible----------------")
        Escribir("El precio actual del combustible es " Pactual)
        Escribir("El procentaje de aumento es", Paument, "%")
        Escribir("el nuevo precio es", NewPrecio)
Fin_Accion
