package exemplo2;


/*
CRIE UM PROGRAMA QUE CRIE ALUNOS COM NOME, SERIE E NOTAS(TRÊS).
QUANDO TODOS OS ALUNOS FOREM CRIADOS E ARMAZENADOS,
LISTE OS ALUNOS POR SERIE E EXIBA A MEDIA DAS NOTAS DELE.
*/


import exemplo2.entidade.Aluno;
import exemplo2.repositorios.AlunoRepositorio;
import exemplo2.util.ListaUtil;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaComplexa {

    public static void main(String[] args) {
        AlunoRepositorio repositorioAlunos = AlunoRepositorio.getInstance();
        repositorioAlunos.adicionaAluno(
                new Aluno("Everson", "5", Arrays.asList(new BigDecimal(8), new BigDecimal(7), new BigDecimal(5.5)
                ))
        );
        repositorioAlunos.adicionaAluno(
                new Aluno("Beta", "6", Arrays.asList(new BigDecimal(8), new BigDecimal(10), new BigDecimal(10)
                ))
        );
        repositorioAlunos.adicionaAluno(
                new Aluno("Snoopy", "5", Arrays.asList(new BigDecimal(4.5), new BigDecimal(7.5), new BigDecimal(9.5)
                ))
        );
        repositorioAlunos.adicionaAluno(
                new Aluno("Zé", "3", Arrays.asList(new BigDecimal(10), new BigDecimal(8.5), new BigDecimal(9.5)
                ))
        );

        List<String> seriesLista =
                ListaUtil.
                retornaTodaSerieLista(repositorioAlunos.retornaTodosAlunos());

        Collections.sort(seriesLista);

        seriesLista.forEach(
                serieAtual -> {
                    System.out.println("Serie: "+ serieAtual);
                    repositorioAlunos.retornaTodosAlunos().forEach(
                            alunoAtual -> {
                                if(serieAtual.equals(alunoAtual.getSerie()))
                                    System.out.println(alunoAtual.getNome());
                            }
                    );
                }
        );
    }


}
