package impl;

import interfaces.Observado;
import interfaces.Observadores;

import java.util.ArrayList;
import java.util.List;

public class Frase implements Observado {
    public List<Observadores> observadores = new ArrayList<>();
    private String texto;

    @Override
    public void registraObservador(Observadores obs) {
        observadores.add(obs);
    }

    @Override
    public void notificaObservadores(String[] palavras) {
        for (Observadores observador : observadores) {
            observador.update(palavras);
        }
    }
    public void setRecebeFrase(String texto) {

        this.texto = texto;
        String[] palavras = texto.split("\\s+");

        novasMedidas(palavras);
    }

    public void novasMedidas(String[] palavras) {
        notificaObservadores(palavras);
    }


    public void setInscritos(List<Observadores> inscritos) {
        this.observadores = observadores;
    }

    public List<Observadores> getObservadores() {
        return observadores;
    }

}
