package Practice;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

    private final static float[] flArr1 = {1, 2, 3, 4};
    private final static float[] flArr2 = {5, 6, 7, 8};
    private final static float[] flArr3 = {9, 10, 11, 12};
    private final static float[] flArr4 = {13, 14, 15, 16};
    private final static float[] flArr5 = {17, 18, 19, 20};

    public static void main(String[] args) {

        List<float[]> list = new ArrayList<>();
        list.add(flArr1);
        list.add(flArr2);
        list.add(flArr3);
        list.add(flArr4);
        list.add(flArr5);

        drawEmptyRec(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println();
//        }

//        List<Integer> actions = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            actions.add(i);
//        }
//
//        for (Integer action : actions) {
//            System.out.println(action);
//        }
    }

    private static void drawEmptyRec(List<float[]> list) {
        for (float[] s : list) {
            getEmptyRec(s[0], s[1], s[2], s[3]);
        }
    }

    private static void getEmptyRec(float x1, float x2, float y1, float y2) {
        float[] leftSide = {x1, x1, y1, y2};
        float[] topSide = {x1, x2, y2, y2};
        float[] bottomSide = {x1, x2, y1, y1};
        float[] rightSide = {x2, x2, y1, y2};
        List<float[]> listFull = Arrays.asList(leftSide, topSide, bottomSide, rightSide);
        for (float[] a : listFull) {
            for (int i = 0; i < a.length; i++) {
                System.out.println(i);
            }
        }
    }
}
