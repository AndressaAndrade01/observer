package interfaces;

public interface Observado {

    void registraObservador(Observadores obs);
    public void notificaObservadores(String[] palavras);
}
