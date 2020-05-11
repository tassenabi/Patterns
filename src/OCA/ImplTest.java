package OCA;

public class ImplTest implements Test {
    @Override
    public void arsch() {

    }

    public static void main(String[] args) {

        Test n = new ImplTest();
        String a = n.getstring();
        System.out.println(a);
    }
}
