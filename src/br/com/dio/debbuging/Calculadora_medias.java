package br.com.dio.debbuging;

import java.util.Scanner;

public class Calculadora_medias {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas","Rodrigo"};

        double media = calculadoraMediaTurma(alunos, scan);

        System.out.println("Media da turma %.1f" + media);
    }
    public static double calculadoraMediaTurma(String[] alunos, Scanner scanner){

        double soma = 0;
        for (String aluno : alunos){
            System.out.println("Nota do aluno é %s: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
