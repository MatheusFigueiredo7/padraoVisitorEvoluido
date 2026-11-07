package visitor;

public class PessoaVisitorJson implements Visitor {

    public String exibir(visitor.Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(visitor.Aluno aluno) {
        return "{\"matricula\":" + aluno.getMatricula() +
                ",\"nome\":\"" + aluno.getNome() + "\"" +
                ",\"curso\":\"" + aluno.getNomeCurso() + "\"}";
    }

    @Override
    public String exibirProfessor(visitor.Professor professor) {
        return "{\"matricula\":" + professor.getMatricula() +
                ",\"nome\":\"" + professor.getNome() + "\"" +
                ",\"titulacao\":\"" + professor.getTitulacao() + "\"}";
    }

    @Override
    public String exibirFuncionario(visitor.Funcionario funcionario) {
        return "{\"codigo\":" + funcionario.getCodigo() +
                ",\"nome\":\"" + funcionario.getNome() + "\"" +
                ",\"salario\":" + funcionario.getSalario() + "}";
    }

}
