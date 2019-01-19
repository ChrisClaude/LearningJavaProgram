package ChapterTwo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * LearningCollections.java
 * This program is intended for learning concept of list and arraylist.
 * We use two lists then the items they have in common with each other
 * are deleted in the first list, using a static method in the main class
 *
 * @author Claude C DE-TCHAMBILA
 * Date: 10 November 2018
 */

public class LearningCollections {

    public static void main(String[] args) {
        String[] universities = {"massachusetts", "harvard", "cput", "yale", "stellenbosh"};
        List<String> list1 = new ArrayList<>();

        // adding items to list1
        for (String u :
                universities) {
            list1.add(u);
        }

        String[] otheruniv = {"cput", "yale"};
        List<String> list2 = new ArrayList<>();

        // adding items to list2
        for (String v :
                otheruniv) {
            list2.add(v);
        }

        for (int i=0; i<list1.size(); i++) {
            System.out.printf("%s, ", list1.get(i));
        }

        // editing list1 by removing identical item with list2
        editlist(list1, list2);
        System.out.println();

        // print out edited list1
        for (int i=0; i<list1.size(); i++) {
            System.out.printf("%s, ", list1.get(i));
        }

    }

    public static void editlist(Collection<String> l1, Collection<String> l2){
        Iterator it = l1.iterator();

        while(it.hasNext()) {
            if(l2.contains(it.next()))
                it.remove();
        }
    }

}
