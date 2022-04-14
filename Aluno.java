class Aluno {

  String nome;
  int matricula;
  String curso;
  float media = 60;


  void exibirRelatorio(){
  System.out.println("Nome" + nome + "Curso:" + curso + "Resultado do aluno:" + media);
  }
}