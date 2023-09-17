package src.lessons.datastructures;

import java.util.ArrayList;
import java.util.List;

public class MyList {

    public static void main(String[] args) {

        List<Integer> elements = new ArrayList<>();

        elements.add(11);
        elements.add(51);
        elements.add(10);
        elements.add(5);

        for (int num: elements)
            System.out.println(num);

    }

}
