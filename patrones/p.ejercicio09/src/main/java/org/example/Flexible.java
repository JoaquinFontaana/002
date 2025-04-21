package org.example;

import java.time.LocalDate;

public class Flexible extends PoliticaCancelacion{
    @Override
    public double calcularRembolso(double monto, long diasDeDiferencia) {
        return monto;
    }
}
