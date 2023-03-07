package LinkedListDemo;

import java.util.LinkedList;


public class demo1 {
    public static void main(String[] args) {

        LinkedList <String> countryName = new LinkedList<>();
        countryName.add("Afghanistan ");
        countryName.add("Bangladesh");
        countryName.add("Canada");
        countryName.add("Denmark");
        countryName.add("England");
        countryName.add(0,"Australia");
        countryName.add(6,"France");
        countryName.addFirst("USA");
        countryName.addLast("Pakistan");


        System.out.println("Size of list : " + countryName.size());
       // using for loop
        for (int i = 0; i < 8 ; i++) {
            System.out.println(countryName.get(i));

        }





       // using forEach loop
        for (String x : countryName){
            System.out.println("list of Linkedlist are : " + x);
        }




    }
}
