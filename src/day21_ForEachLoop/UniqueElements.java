package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Layan","Layan","Oleksandre","Olga","Adam","Adam","Adam","Cihad","Cihad","Cydeo"};

        for (String each : words) {   // each : each element in the String array

            int count =0;     // counted how many times is each element repeated

            for (String element : words) {   // element : (each element in the array) will be compared with each element of outside loop
                if(element.equals(each)){   //
                    count++;    // in order to find the unique characters
                }

            }
            if(count == 1){
                System.out.println(each);
            }

        }
    }
}
