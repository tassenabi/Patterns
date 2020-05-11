package OCA;

public class CastProblems {

    public static void main(String[] args) {
    byte a = 40, b = 50;
    //ok
    byte sum = (byte)(a + b);

    //notOk
        //byte sum = (byte)a + b;

        /**Line 4 generates a possible loss of precision compiler error. The cast operator has the highest precedence, so it is evaluated first, casting a to a byte. Then, the addition is evaluated, causing both a and b to be promoted to int values. The value 90 is an int and cannot be assigned to the byte sum without an explicit cast, so the code does not compile. The code could be corrected with parentheses around (a + b), in which case option C would be the correct answer.
         *
         */
    }
}
