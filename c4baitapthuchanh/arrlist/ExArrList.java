package c4baitapthuchanh.arrlist;

import java.util.ArrayList;

public class ExArrList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<String>(3);
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("orange");
        colors.remove("green");
        colors.add("pink");
        colors.add("yellow");
        System.out.println(colors.get(1));
        System.out.println(colors.contains("orange"));
        System.out.println(colors.size());
        System.out.println(colors);
    }
}
