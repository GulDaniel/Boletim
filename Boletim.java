//programa simulando boletim
public class Boletim{
    private String CourseName; //nome do curso
    private int[] Grades; //array de notas

    public Boletim(String CourseName, int[] Grades){
        this.CourseName=CourseName; //inicializa CourseName
        this.Grades=Grades; //Inicializa Grades
    }

    //retorna nome do curso
    public String getCourseName(){return CourseName;} 

    //modifica o nome do curso
    public void setCourseName(String CourseName){this.CourseName=CourseName;}

    //processa as notas
    public void processGrades(){
        outPut();
        System.out.printf("%nMédia da classe: %.2f%n", getMedia());
        System.out.printf(
                "Menor nota: %d%nMaior nota: %d%n", getMin(), getMax());
        outBars();
    } 

    //obtém maior nota
    public int getMax(){
        int MaxNote = Grades[0];
        for(int note : Grades){
            if(note > MaxNote)
                MaxNote = note;
        }
        return MaxNote;
    }

    //obtém menor nota
    public int getMin(){
        int MinNote = Grades[0];
        for(int note : Grades){
            if(note < MinNote)
                MinNote = note;
        }
        return MinNote;
    }

    //obtém a média das notas
    public double getMedia(){
        int total = 0;
        for(int note : Grades){
            total += note;
        }
        return (double)total/Grades.length;
    }

    //imprime os estudantes e as notas
    public void outPut(){
        System.out.printf("Notas:%n%n");
        for(int count = 0; count < Grades.length; count++){
            System.out.printf("Estudante %2d: %3d%n", count+1, Grades[count]);
        }
    }

    //imprime gráfico de barras com asteriscos
    public void outBars(){
        System.out.printf("%nDistribuição das notas:%n%n");
        int[] freq = new int[11];
        for(int note : Grades)
            ++freq[note/10];

        for(int cont = 0; cont < freq.length; cont++){
            if(cont == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", cont*10, cont*10 + 9);

            for(int star = 0; star < freq[cont]; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
