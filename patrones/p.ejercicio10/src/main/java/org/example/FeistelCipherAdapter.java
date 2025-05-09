package org.example;

public class FeistelCipherAdapter implements Cifrado{
    private FeistelCipher feistelCipher;

    public FeistelCipherAdapter (FeistelCipher feistelCipher){
        this.feistelCipher = feistelCipher;
    }
    @Override
    public String descifrar(String mensaje) {
        return feistelCipher.encode(mensaje);
    }

    @Override
    public String cifrar(String mensaje) {
        return feistelCipher.encode(mensaje);
    }
}
