package section08Fixacao.ExTres.entities;

public class Student {

    public String name;
    public double nota1, nota2, nota3;
    public String situation;

    public double totalGrade() {
        return nota1 + nota2 + nota3;
    }

    public double missingPoints() {
        if (totalGrade() < 60) {
            return 60 - totalGrade();
        } else {
            return 0;
        }
    }
}
