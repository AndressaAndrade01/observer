package impl;

import interfaces.Observadores;

public class ContarPalavras implements Observadores {

    @Override
    public void update(String[] palavras) {
        int quantidadePalavras = palavras.length;
        QuantidadePalavras(quantidadePalavras);
    }
    public void QuantidadePalavras(int quantidade) {
        System.out.println("A quantidade de palavras contidas na frase é : " + quantidade);
    }
}
