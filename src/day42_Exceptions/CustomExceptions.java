package day42_Exceptions;

class FadyException extends RuntimeException{   // custom unchecked exception

    public FadyException(){   // default constructor
        super("Time for a short break");
    }

    public FadyException(String message){   // constructor with parameter
        super(message);

    }

}

class NoBreakException extends Exception { // custom checked exception


}


    public class CustomExceptions {

        public static void main(String[] args)  {

           // throw  new FadyException("It's time for lunch break");

            try {
                throw new NoBreakException();  // an exception that we created
            } catch (NoBreakException e) {
                e.printStackTrace();
            }


        }

}


