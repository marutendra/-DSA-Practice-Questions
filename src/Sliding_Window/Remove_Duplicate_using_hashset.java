package Sliding_Window;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicate_using_hashset {
    public static void main(String[] args) {
        int []arr={10,20,30,40,10,20};
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int element:arr){
            hashSet.add(element);
            linkedHashSet.add(element);
        }
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
    }
}
