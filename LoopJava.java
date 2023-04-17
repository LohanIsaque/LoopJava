import java.util.ArrayList;
public class LoopJava{
    public static void main (String[] args){
        int [] notas = {10, 6, 9, 4, 3, 9};
        ArrayList<Integer> aprovados = new ArrayList<Integer>();
        for(int index = 0; index < notas.length; index++){
            if(notas[index] > 6){
                aprovados.add(notas[index]);
            }
        }
        System.out.println(aprovados);
    }
}

