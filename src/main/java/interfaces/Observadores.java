package interfaces;

public interface Observadores {

    void update(String[] palavras);

    public interface Observador {
        public void update(String[] palavras);
    }
}
