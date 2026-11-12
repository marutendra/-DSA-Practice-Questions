package String_Questions;

import java.util.HashMap;
import java.util.Map;

public class Find_all_duplicate_characters_in_a_string {
    public static void main(String[] args) {
        String str= "Programmiiing";
        int count=1;
        HashMap<Character , Integer> hashMap = new HashMap<>();
        for (int i = 0; i <str.length(); i++) {

            char c = str.charAt(i);
            if(hashMap.containsKey(str.charAt(i))){
                Integer i1 = hashMap.get(c);
                i1++;
                hashMap.put(c,i1);
            }else{
                hashMap.put(c , count);
            }

        }
       for (Map.Entry<Character, Integer> entry :hashMap.entrySet()){
           if (entry.getValue()>1){
               System.out.print(entry.getKey()+" ");
           }
       }

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        for (int i = 0; i <str.length() ; i++) {
//            int count=0;
//            char c1= str.charAt(i);
//            for (int j = 1; j <str.length() ; j++) {
//                char c2= str.charAt(j);
//                if(c1==c2){
//                    count++;
//                }
//            }
//            if(count>1) {
//                hashMap.put(c1,count);
//            }
//        }
//        System.out.println(hashMap.keySet());
    }
}
