package Sliding_Window;

import java.util.HashMap;

public class Remove_Duplicate_with_N_time_compelxity {
    public static void main(String[] args) {
        int []arr ={10,20,30,40,10,30,40,20};
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (hashMap.containsKey(arr[i])){
                Integer i1 = hashMap.get(arr[i]);
                i1++;
                hashMap.put(arr[i],i1);
            }
            else{
                hashMap.put(arr[i],0);
            }
        }
        System.out.println(hashMap.keySet());
    }
}
