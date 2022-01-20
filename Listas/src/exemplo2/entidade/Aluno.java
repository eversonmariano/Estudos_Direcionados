package exemplo2.entidade;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String nome;
    private String serie;
    private List<BigDecimal> notas;

    public Aluno(String nome,
                 String serie,
                 List<BigDecimal> notas){
        //usando os proprios modificadores de acesso (set), garantimos a integridade do contrutor
        setNome(nome);
        setSerie(serie);
        setNotas(notas);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public List<BigDecimal> getNotas() {
        if(notas != null){ //faz-se essa verificaçao para eliminar null pointers,
            // ou seja,a listas nunca iniciarar como vazia ou null.
            notas = new ArrayList<>();
        }
        return notas;
    }

    public void setNotas(List<BigDecimal> notas) {
        this.notas = notas;
    }
}
