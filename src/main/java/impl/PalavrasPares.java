package impl;

import interfaces.Observadores;

public class PalavrasPares implements Observadores {
    int idFrase;
    @Override
    public void update(String[] palavras) {
        int cont = 0;

        for (int i = 0; i < palavras.length; i++) {
            int number = palavras[i].length();
            if (number % 2 == 0) {
                cont++;
            }
        }
        quantidadePalavrasPares(cont);

    }
    public void quantidadePalavrasPares(int quantidade) {
        System.out.println("A quantidade de palavras pares contidas na frase é: " + quantidade);
    }

    public void Observador(int id) {
        this.idFrase = id;
    }
}
