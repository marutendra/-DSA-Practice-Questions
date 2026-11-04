package String_Questions;

public class Remove_duplicate_characters_from_a_string {
    public static void main(String[] args) {
        String str="aabbccaaahjddeeff";
        String newstring="";
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            boolean alreadyCount=false;
            for (int j = 0; j <i ; j++) {
                if (str.charAt(i) == str.charAt(j)|| str.charAt(i)==' ') {
                    alreadyCount = true;
                    break;
                }
            }
            if (alreadyCount){
                continue;
            }else{
                newstring+=str.charAt(i);
            }

//            for (int k = 0; k < str.length(); k++) {
//                if (str.charAt(i)==str.charAt(k)){
//                    count++;
//                }

            }
        System.out.println(newstring);
        }
}
