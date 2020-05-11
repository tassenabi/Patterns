package OCA;

public class InfinityLoop {

    public static void main(String[] args) {

        for(int i=0; i<10 ; ) {
            //Unterschied zu i++
            i = i++;


            /**In this example, the update statement of the for loop is missing, which is fine as the statement is optional,
            so option D is incorrect. The expression inside the loop increments i but then assigns i the old value. Therefore, i
             ends the loop with the
            same value that it starts with: 0. The loop will repeat infinitely, outputting the same statement
            over and over again because i remains 0 after every iteration of the loop.
             **/
        }

    }
}
