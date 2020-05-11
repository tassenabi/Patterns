package Erzeugungsmuster.builder.robotExample;

public class test {

    private int [] allNumbers;

    void isPrimeNumber(int number){

        fillNumbers(number);

        for (int i = 0; i<allNumbers.length; i++){

            if(number%allNumbers[i] == 0 &&(number!=1) && (number!=0)){


                break;

            }
            System.out.println("Ist Primzahl");
        }
       }

       void fillNumbers(int number) {


           for (int i = 0; i <= number; i++) {

               int j = 1;
               allNumbers[i] = number - j;
               j++;
           }
       }

    public static void main(String[] args) {

        test n = new test();
        n.isPrimeNumber(4);


    }
}
