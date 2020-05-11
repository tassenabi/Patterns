package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Examples {


    ArrayList<String> list1 = new ArrayList<String>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();

    Examples() {

        list1.add("Robert");
        list1.add("Kim");
        list2.add(2);
        list2.add(3);

    }

    /** Lambda Ausdrücke werden auch Closures und anoynme Methode genannt **/
    /** Generell -->  filter fist, then sort or map **/


    /** forEach -> applies the same function to each element **/
    public void forEach() {

        String[] ar = {"a", "b", "c"};
        Arrays.asList(ar).forEach(x -> System.out.println(x));

        //oder
        Arrays.asList(ar).forEach(System.out::println);

        //oder

        list1.forEach(x -> System.out.println(x));

    }

    /**Filter and set results in new list **/
    public void lambdaSaveResultsInExistingList() {

        list2.stream().filter(x -> list2.get(x) == 200).collect(Collectors.toList());
    }

    /**Filter and set results in new list **/
    public void lambdaSaveResultsInNewList() {

        list2.stream().filter(x -> list2.get(x) == 200);
    }

    /** Klassische::statischeMethode oder Objekt::Methode **/
    /** Referenzen auf Methoden zu übergeben **/
    public void DoppelPunktSynatax() {
        List<Integer> data = Arrays.asList(7, 2, 5, 3);
        Optional<Integer> minimum = data.stream().reduce(Math::min);
        System.out.println(minimum);

        //Oder
        data.stream().reduce((x, y) -> Math.min(x, y));

    }

    /** collect -> saves the elements into a collection**/
    public void collect() {

    }

    /** reduce -> the stream to a single summary element**/
    public void reduce() {

    }

    /** map -> ... **/
    public void map() {

    }

    /** filter -> ...**/
    public void filter() {

    }
}