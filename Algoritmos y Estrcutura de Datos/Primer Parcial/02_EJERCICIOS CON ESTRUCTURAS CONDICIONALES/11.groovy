/*Dados dos números enteros A y B generar un algoritmo que permita determinar si A es divisor de B o B es divisor de A.*/
    ACCION divisores_AB ES
    Ambiente
        a,b:enteros
    Proceso
        ESCRIBIR("Ingrese dos numeros enteros:")
        LEER(a,b)

        SI (a = 0) Y (b = 0) ENTONCES
            ESCRIBIR("No se puede determinar divisibilidad con cero")
        SINO
            SI (a <> 0) ENTONCES
                SI (b MOD a = 0) ENTONCES
                    ESCRIBIR(a," es divisor de ",b)
                SINO
                    ESCRIBIR(a," no es divisor de ",b)
                FIN_SI
            SINO
                ESCRIBIR("A es cero, no puede ser divisor")
            FIN_SI

            SI (b <> 0) ENTONCES
                SI (a MOD b = 0) ENTONCES
                    ESCRIBIR(b," es divisor de ",a)
                SINO
                    ESCRIBIR(b," no es divisor de ",a)
                FIN_SI
            SINO
                ESCRIBIR("B es cero, no puede ser divisor")
            FIN_SI
        FIN_SI
FIN_ACCION