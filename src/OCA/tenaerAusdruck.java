package OCA;

public class tenaerAusdruck {


public static void main(String[] args) {
int x=0;
//int x = 5;
//x = 1;
//x = 3;

//Bei x=5
//Bei x=1
//Bei x=3 --> 7
    for (int i = 0; i<6;i++) {

        //Innerer Ausdruck zuerst
        System.out.println("Value of x is " +x);
        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
        x++;
    }

//So zu lesen: ((x > 2) ? ((x < 4) ? 10 : 8) : 7)
}
}
