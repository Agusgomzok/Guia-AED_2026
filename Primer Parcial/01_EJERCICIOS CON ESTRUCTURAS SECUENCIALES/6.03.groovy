/*Se desea comprar una PC y una impresora. Calcular el precio total: el cual está dado por la suma de los
precios de costos, los porcentajes de ganancia del vendedor y un 21% de IVA. Supóngase una ganancia del
vendedor del 12% por la PC y 7% por la impresora. Se leen los costos y se imprimen el precio total de ventas.*/
Accion PCyInpresora Es
    Ambiente
        IVA=0,21
        gcia_PC=0.12
        gcia_IMP=0.07
        costo_PC,costo_IMP,precio_PC,precio_IMP:Real
    Proceso
    Escribir("Ingrese costo de la PC y la impresora")
    Leer(costo_PC, costo_IMP)
    
    precio_PC:= (costo_PC + (costo_PC * gcia_PC)) * (1 + IVA)
    precio_IMP:=(costo_IMP + (costo_IMP * gcia_IMP)) * (1 + IVA)
    Escribir("El precio final de la PC es",precio_PC)
    Escribir("El precio final de la IMPRESORA es",precio_IMP)
Fin_Accion