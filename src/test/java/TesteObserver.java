import impl.ContarPalavras;
import impl.PalavrasMaiusculas;
import impl.Frase;
import impl.PalavrasPares;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteObserver {

    @Test
    public void testeRegistroContarPalavras(){
        Frase frase=new Frase();
        ContarPalavras contar=new ContarPalavras();
        frase.registraObservador(contar);
        assertTrue(!frase.getObservadores().isEmpty());
    }
    @Test
    public void teste2RegistroContarPalavras(){

        Frase frase=new Frase();
        ContarPalavras contar=new ContarPalavras();
        ContarPalavras contar1=new ContarPalavras();
        frase.registraObservador(contar);
        frase.registraObservador(contar1);
        assertEquals(frase.getObservadores().size(), 2);
    }
    @Test
    public void teste3RegistroPalavrasMaiusculas(){

        Frase frase=new Frase();
        PalavrasMaiusculas mauiscula1=new PalavrasMaiusculas();
        PalavrasMaiusculas mauiscula2=new PalavrasMaiusculas();
        PalavrasMaiusculas mauiscula3=new PalavrasMaiusculas();
        frase.registraObservador(mauiscula1);
        frase.registraObservador(mauiscula2);
        frase.registraObservador(mauiscula3);
        assertEquals(frase.getObservadores().size(), 3);
    }
    @Test
    public void teste2RegistroPalavraPares(){

        Frase frase=new Frase();
        PalavrasPares pares=new PalavrasPares();
        PalavrasPares par=new PalavrasPares();
        frase.registraObservador(pares);
        frase.registraObservador(par);
        assertEquals(frase.getObservadores().size(), 2);
    }


}
