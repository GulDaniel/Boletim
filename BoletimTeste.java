public class BoletimTeste{
    public static void main(String[] args){

        int[] array2 = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        Boletim boletim = new Boletim("Programando em Java", array2);
        System.out.printf("Bem vindo ao boletim da disciplina%n%s%n%n",
                boletim.getCourseName());
        boletim.processGrades();
    }
}
