package NeetCode150;

public class ValidAnagram {
    public static boolean anagram(String s,String t){
        if(s.length()!=t.length())
    {
            return false;
    }
    int[] charry = new int[26];

    for(int i=0;i<s.length();i++){
       charry[s.charAt(i)-'a']++;
       charry[t.charAt(i)-'a']--;
    }

    for(int num:charry){
        if( num !=0){
            return false;
        }
    }
    return true;
}
}