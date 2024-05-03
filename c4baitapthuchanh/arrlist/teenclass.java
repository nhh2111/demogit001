package c4baitapthuchanh.arrlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class teenclass {
    public static void main(String[] args) {
        ArrayList<String> arrlistString = new ArrayList<>();
        arrlistString.add("Java");
        arrlistString.add("css");
        arrlistString.add("html");
        arrlistString.add("c#");
        System.out.println("Cac phan tu co trong arrlistString la: ");
        for(int i = 0 ; i< arrlistString.size(); i++){
            System.out.println(arrlistString.get(i));
        }

        ArrayList<Integer> arrayListInt = new ArrayList<>();
        arrayListInt.add(5);
        arrayListInt.add(204);
        arrayListInt.add(10);
        arrayListInt.add(24);
        System.out.println("Cac phan tu co trong arrListInt la: ");
        for (Integer i : arrayListInt) {
            System.out.println(i);
        }

        ArrayList<Float> arrayListFloats = new ArrayList<>();
        arrayListFloats.add(5.7f);
        arrayListFloats.add(204.6f);
        arrayListFloats.add(10.3f);
        arrayListFloats.add(24.2f);
        Iterator<Float> inIterator = arrayListFloats.iterator();
        System.out.println("Cac phan tu co trong arrayListFloats la: ");
        while (inIterator.hasNext()) {
            System.out.println(inIterator.next());
        }   

        ArrayList<Character> aCharacters = new ArrayList<>();
        aCharacters.add('a');
        aCharacters.add('b');
        aCharacters.add('c');
        aCharacters.add('d');
        ListIterator<Character> cIterator = aCharacters.listIterator();
        System.out.println("Cac phan tu co trong arrayListCharacters la: ");
        while (cIterator.hasNext()) {
            System.out.println(cIterator.next());
        }   
    }
}
