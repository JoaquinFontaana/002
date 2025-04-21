package org.example;

public class Estricta extends PoliticaCancelacion{
    @Override
    public double calcularRembolso(double monto, long diasDeDiferencia) {
        return 0;
    }
}
