package nickolasaranha.javacore.introducaoclasses.test;

import nickolasaranha.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Junior";
        estudante.age = 18;
        estudante.gender = 'M';

        System.out.println(estudante.age);

    }
}
