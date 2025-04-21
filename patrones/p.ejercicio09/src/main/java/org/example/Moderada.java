package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada extends PoliticaCancelacion{
    @Override
    public double calcularRembolso(double monto, long diasDeDiferencia) {
        if(diasDeDiferencia >= 7){
            return monto;
        }
        else if (diasDeDiferencia >= 2){
            return monto * 0.5;
        }
        return 0;
    }
}
