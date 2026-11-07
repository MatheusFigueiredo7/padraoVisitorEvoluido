package visitor;

public interface Visitor {

    String exibirAluno(visitor.Aluno aluno);
    String exibirProfessor(visitor.Professor professor);
    String exibirFuncionario(visitor.Funcionario funcionario);

}
