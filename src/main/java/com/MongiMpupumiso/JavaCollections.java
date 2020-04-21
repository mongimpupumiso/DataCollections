package com.MongiMpupumiso;
import java.util.ArrayList;
import java.util.Iterator;


public class JavaCollections {

        public static  void main(String[] args) {

            // static array --> size is fixed
            int[] a = new int[3];


            ArrayList ar = new ArrayList();

            //index position 0,1,2,3,4,5
            ar.add(2);//0
            ar.add(2);//1
            ar.add(3);//2
            System.out.println(ar.size());
            ar.add(7);//3
            ar.add(7);//4
            System.out.println(ar.get(4));


            for (int i = 0; i < ar.size(); i++) {
                System.out.println(ar.get(i));
            }

            ArrayList<Integer> ar1 = new ArrayList<>();
            ar1.add(100);
            ar1.add(200);

            ArrayList<String> ar2 = new ArrayList<>();


            JavaCollections emp = new JavaCollections();
            JavaCollections emp1 = new JavaCollections();
            JavaCollections emp2 = new JavaCollections();


            ArrayList<JavaCollections> ar4 = new ArrayList();
            ar4.add(emp);
            ar4.add(emp1);
            ar4.add(emp2);

            Iterator<JavaCollections> it = ar4.iterator();

            while (it.hasNext()) {
                JavaCollections animals = it.next();
            }
            System.out.println("\n*************************************************");
            System.out.println("addAll()");
            ArrayList<String> ar5 = new ArrayList();
            ar5.add("");
            ar5.add("Lion");
            ar5.add("Goat");
            ArrayList<String> ar6 = new ArrayList();
            ar6.add("Cat");
            ar6.add("Cow");
            ar6.add("Dog");

            ar5.addAll(ar6);
            for (int i = 0; i < ar5.size(); i++) {
                System.out.println(ar5.get(i));
            }

            System.out.println("\n*************************************************");
            System.out.println("removeAll()");
            //removeAll():
            ar5.removeAll(ar6);
            for (int i = 0; i < ar5.size(); i++) {
                System.out.println(ar5.get(i));
            }

            System.out.println("\n*************************************************");
            System.out.println("retainAll()");
            //retainAll()
            ArrayList<String> ar7 = new ArrayList();
            ar7.add("Eggs");
            ar7.add("Orange");
            ar7.add("Cheese");


            for (int i = 0; i < ar7.size(); i++) {
                System.out.println(ar7.get(i));
            }
            System.out.println("\nyou can print array list like this : "+ar7);

        }

    }


