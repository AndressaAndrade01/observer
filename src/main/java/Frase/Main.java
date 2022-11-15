package Frase;

import impl.ContarPalavras;
import impl.PalavrasMaiusculas;
import impl.PalavrasPares;
import impl.Frase;

public class Main {
    public static void main(String[] args) {

        String texto="A vida É Bela";

        Frase frase=new Frase();

        ContarPalavras contar=new ContarPalavras();
        PalavrasPares pares=new PalavrasPares();
        PalavrasMaiusculas maiuscula=new PalavrasMaiusculas();

        frase.registraObservador(contar);
        frase.registraObservador(pares);
        frase.registraObservador(maiuscula);

        frase.setRecebeFrase(texto);
    }
}