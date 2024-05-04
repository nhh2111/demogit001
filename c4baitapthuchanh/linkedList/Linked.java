package c4baitapthuchanh.linkedList;

import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("css");
        list.add("html");
        list.add("c#");
        System.out.println("Vi du su dung phuong thuc addAll() ");
        System.out.println("------------------------------");
       LinkedList<String> listA = new LinkedList<String>();
       listA.addAll(list);
       System.out.println("listA: ");
        showList(listA);
    }
    public static void showList(LinkedList<String> list) {
        for(String item : list) {
            System.out.println(item);
        }
    }

}
