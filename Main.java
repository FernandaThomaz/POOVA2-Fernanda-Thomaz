class Main {
  public static void main(String[] args) {
    
   Aluno aluno01 = new Aluno();
    aluno01.nome = "Leticia";
    aluno01.curso = "Piscologia";
    
  Aluno aluno02 = new Aluno();
    aluno02.nome = "Carol";
    aluno02.curso = "Med Vet";
    
  Aluno aluno03 = new Aluno();
    aluno03.nome = "Lucas";
    aluno03.curso = "Ed.Fisica";

    Professor professor01 = new Professor();
    professor01.nome = "Pedro";

    Professor professor02 = new Professor();
    professor02.nome = "Junior";
    
    Professor professor03 = new Professor();
    professor03.nome = "Carol";

    Disciplina disciplina01 = new Disciplina();
    disciplina01.nome = "POO";

    Disciplina disciplina02 = new Disciplina();
    disciplina02.nome = "Robotica";

    Disciplina disciplina03 = new Disciplina();
    disciplina03.nome = "Sistemas Distribuidos";

    
    System.out.println("Calculo media de dois alunos:" + aluno01.nome + aluno02.nome + aluno01.media + aluno02.media);

    System.out.println("Consulta da nota de uma disc: " + disciplina01 + aluno02 + "");

    System.out.println(" " + disciplina01 + disciplina03 + "");

  System.out.println("Primeiro aluno" + aluno01 + "Segundo Aluno" + aluno02);

    
    }
  }

