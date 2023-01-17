import java.util.ArrayList;
import java.util.Arrays;

public class NumSei {
    ArrayList<ArrayList<String>> list= new ArrayList<>();
    ArrayList<String> listS;

    public char[] letter(){
        //65 to90; 97 to 122
        int aux;
        char letterAux;
        char[] letter = new char[10];

        for (int i = 0; i < letter.length; i++) {
            aux =MyTools.rng(25)+ 97;
            letterAux = (char)aux;

            letter[i] = letterAux;
        }

        return letter;
    }

    public String word(){

        return new String(letter())+" ";
    }
    public void listWord(){
        int size = 5;

        for (int i = 0; i < size ; i++) {
            listS = new ArrayList<>();
            for (int j = 0; j < size; j++) {

                listS.add(word());
            }
        list.add(listS);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(i).get(j));
            }
            System.out.println();
        }
    }

}
