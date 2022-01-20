package exemplo2.repositorios;

import exemplo2.entidade.Aluno;

import java.util.ArrayList;
import java.util.List;

/*Aqui temos um 'parttern REPOSITORIES' que é responsavel pelo armazenamento e acesso aos dados
*
* */
public class AlunoRepositorio {
    private List<Aluno> alunosSalvos;

    private  static AlunoRepositorio instance;

    private AlunoRepositorio(){
        alunosSalvos = new ArrayList<>();
    }

    /* A partir daqui temos um parttern do tipo SINGLETON, que garante que sempre a MESMA instância do objeto sera retornada*/

    public static AlunoRepositorio getInstance(){
        if(instance == null)
            instance = new AlunoRepositorio();
        return instance;
    }
    public void adicionaAluno(Aluno aluno){
        alunosSalvos.add(aluno);
    }
    public List<Aluno> retornaTodosAlunos(){
        return alunosSalvos;
    }

}
