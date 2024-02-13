package org.nuriddin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] sonlar = new int[5];
        System.out.println(Arrays.toString(sonlar));

        ArrayList<Integer> sonList = new ArrayList<>();
        System.out.println(sonList);
        sonList.add(10);
        sonList.add(1);
        sonList.add(11);
        sonList.add(-5);

        System.out.println(sonList.get(3));//-5
        System.out.println(sonList.get(0));//10
//        System.out.println(sonList.get(5));//exception : out of bound

        System.out.println(sonList);

        sonList.add(0,80);
        System.out.println(sonList);
        sonList.addFirst(40);
        sonList.addLast(-70);
        System.out.println(sonList);

        for (int i = 0; i < sonList.size(); i++) {
            System.out.print(i + " : " + sonList.get(i) + "; ");
        }

        System.out.println();
        for (Integer son : sonList) {
            System.out.print(son + " ");
        }

        //1) oila a'zolaringiz ismini o'z ichiga olgan arraylist oching va
        // uni iteratsiya qilib qiymatlarni chiqaring

        ArrayList<String> oilaList = new ArrayList<>();
        oilaList.add("Aliy");
        oilaList.add("Fotima");
        oilaList.add("Hasan");
        oilaList.add("Husayn");

        for (String azo : oilaList) {
            System.out.print(azo + " ");
        }

        //2) Ismlarni bosh harflari va oxirgi harflarini chiqaring

        for (String azo : oilaList) {
            System.out.println(azo + " 1 - "+ azo.charAt(0) + " 2 - " + azo.charAt(azo.length() - 1));
        }

        //3) OilaAzo deb atalgan class oching, ism va qarindoshlik,
        //object yaratib ularni listga oling va chiqaring

        OilaAzo ota = new OilaAzo("Aliy", "Ota");
        OilaAzo ona = new OilaAzo("Fotima", "Ona");
        OilaAzo aka = new OilaAzo("Hasan", "O'g'il");
        OilaAzo uka = new OilaAzo("Husayn", "O'g'il");
        ArrayList<OilaAzo> oila = new ArrayList<>(
                List.of(ota, ona, uka, aka)
        );
//        oila.addAll(List.of(ota, ona, uka, aka));

        for (OilaAzo oilaAzo : oila) {
            System.out.println(oilaAzo.getQarishdoshlik() + " : " + oilaAzo.getIsm());
        }



    }
}