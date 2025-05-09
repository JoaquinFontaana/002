package org.example;

public class RC4Adapter implements Cifrado{
    private RC4 rc4;
    private String key;
    public RC4Adapter(RC4 rc4, String key){
        this.key = key;
        this.rc4 = rc4;
    }
    @Override
    public String cifrar(String mensaje) {
        return rc4.encriptar(mensaje,this.key);
    }

    @Override
    public String descifrar(String mensaje) {
        return this.rc4.desencriptar(mensaje,this.key);
    }
}
