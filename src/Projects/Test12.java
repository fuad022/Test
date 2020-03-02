package Projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Test12 {
    public static void main(String[] args) {
        TreeSet<House> myHouseArrayList = new TreeSet<>();
//        ArrayList<House> myHouseArrayList = new ArrayList<>();

        House firstHouse = new House(100, 120000, "Tokyo", true);
        House secondHouse = new House(40, 70000, "Oxford", true);
        House thirdHouse = new House(70, 180000, "Paris", false);

        myHouseArrayList.add(firstHouse);
        myHouseArrayList.add(secondHouse);
        myHouseArrayList.add(thirdHouse);

        for (House h : myHouseArrayList) {
            System.out.println(h);
        }

//        PriceComparator priceComparator = new PriceComparator();
//        myHouseArrayList.sort(priceComparator);
//
//        System.out.println("Sorted: ");
//        for (House h : myHouseArrayList) {
//            System.out.println(h);
//        }


//        Collections.sort(myHouseArrayList);
//        for (House h : myHouseArrayList) {
//            System.out.println(h);
//        }

    }
}
