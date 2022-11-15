package impl;

import interfaces.Observadores;

public class PalavrasMaiusculas implements Observadores {
    int idFrase;
    @Override
    public void update(String[] palavras) {
        int cont = 0;
        for (int i = 0; i < palavras.length; i++) {
            char ch = palavras.toString().charAt(i);
            if (ch>='A' || ch<='Z' ) {
                cont++;
            }

        }
        palavrasMaiusculas(cont-1);
    }
    public void palavrasMaiusculas(int quantidade) {
        System.out.println("A quantidade de letras maiuscúlas contidas no início de cada palavra é : " +quantidade);
    }
    public void Observador(int id) {
        this.idFrase = id;
    }


}
