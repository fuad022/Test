package Enumeration;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
//        Animal animal = Animal.CAT;
//
//        switch (animal) {
//            case CAT:
//                System.out.println("Cat");
//                break;
//            case DOG:
//                System.out.println("Dog");
//                break;

        float x1 = 30;
        float x2 = 198;
        float y1 = 663;
        float y2 = 680;

        float[] nums1 = {x1, x1, y1, y2};
        float[] nums2 = {x1, x2, y2, y2};
        float[] nums3 = {x1, x2, y1, y1};
        float[] nums4 = {x2, x2, y1, y2};
        List<float[]> listFull = Arrays.asList(nums1, nums2, nums3, nums4);
//        System.out.println(listFull.size());
//        list1.add(nums);
//        list1.add(nums2);
//        list1.add(nums3);
//        list1.add(nums4);
//        System.out.println(list1.size());
        for (float[] a : listFull) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[0]);
            }
//            for (float value : a)
//                System.out.println(value);
        }
    }
}
