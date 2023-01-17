import java.util.ArrayList;

public class NumSei {
    ArrayList<ArrayList<String>> list= new ArrayList<>();
    ArrayList<String> listS;


    public int rollChar(){
        int roll = MyTools.rng(2);
        int rangeType;

        if(roll==1){
            rangeType = MyTools.rng(25)+65;
        }else{
            rangeType = MyTools.rng(25)+97;
        }
        return rangeType;
        }

    public char[] letter(){
        //65 to90; 97 to 122
        char[] letter = new char[10];

        for (int i = 0; i < letter.length; i++) {

            letter[i] = (char)rollChar();
        }

        return letter;
    }

    public String word(){

        return new String(letter())+" ";
    }
    public void listWord(){


        class ListLimit{
            private ListLimit(){}
            static int aux;


            private static int rngAux(){
                aux = MyTools.rng(25);

                while(aux==0){
                    rngAux();
                    if(aux>0){
                        break;
                    }
                }
                return aux;
            }

        }
        int firstList = ListLimit.rngAux();
        int scdList = ListLimit.rngAux();

        for (int i = 0; i < firstList ; i++) {

            listS = new ArrayList<>();

            for (int j = 0; j < scdList; j++) {

                listS.add(word());
            }
            list.add(listS);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print("i: "+i+"\t");
            for (int j = 0; j < listS.size(); j++) {
                System.out.print("  "+list.get(i).get(j));
            }
            System.out.println();
        }
        System.out.println("Number os lists: "+ list.size()+", "+ listS.size());
        System.out.println("Numbers os strings: "+ list.size()*listS.size());
    }

}
