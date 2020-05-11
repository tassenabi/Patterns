package OCA;

public class While {

    int count;

    public void Main() {
        count = 4;
    }

public static void main(String[] args) {

    //Unterschied hier bereits auf x=1 gesetzt
    int x=0;
    while(x++ < 10) {

        System.out.println(x);

    }

    //Unterschied hier noch auf x=0 gesetzt
    x=0;
    while(x < 10) {

        System.out.println(x);
        x++;
    }

        }
}
