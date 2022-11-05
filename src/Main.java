//ArrayLists in Java


import java.util.ArrayList;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); // adds elements to the list
        numbers.add(18);
        numbers.add(5);
        numbers.add(4);
        numbers.add(9);


        System.out.println(numbers); // prints out the array list

        System.out.println(numbers.size()); // Number of elements

        System.out.println(numbers.get(4)); // prints out the number in the 4th index

        numbers.remove(2); //remove element in the 2nd index
        System.out.println(numbers);

        numbers.remove(Integer.valueOf(4)); // remove the element with the value 4
        System.out.println(numbers);

        //updating ArrayList
        numbers.set(0, Integer.valueOf(30));

        System.out.println(numbers);

        //sorting arrayList

        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers);

        numbers.forEach(number -> {
            System.out.println(number * 2); // multiplies each number with 2
        });


    }
}