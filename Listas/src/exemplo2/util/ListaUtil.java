package exemplo2.util;

import exemplo2.entidade.Aluno;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    public static List<String> retornaTodaSerieLista(List<Aluno> listaAtual){
        List<String> retornoProcessamento = new ArrayList<>();
        for (Aluno alunoAtual: listaAtual){
            if(!retornoProcessamento.contains(alunoAtual.getSerie()))
                retornoProcessamento.add(alunoAtual.getSerie());
        }
        return retornoProcessamento;
    }
}
