package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        try{
            System.out.println(arr[10]);  // current exception: OutOfBoundException
        }catch(RuntimeException e){  // when we enter a parameter which doesn't match with the current exception, print statement will not be got execute
            System.out.println("Catch Block");
            e.printStackTrace();

            System.exit(0);  // in order to stop execution of finally block, we need to call exit method
        }finally{
            System.out.println("Finally Block");
        }


    }
}
