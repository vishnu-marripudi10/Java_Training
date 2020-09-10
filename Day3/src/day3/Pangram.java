package day3;

public class Pangram {
	public static void main(String[] args) {  
        String s = "The quick brown fox jumps over the lazy dog sp";  
        System.out.println("Is given String Pangram ? : "  
                  + isPangramString(s.toLowerCase()));  
   }  
   public static boolean isPangramString(String s) {  
        if (s.length() < 26)  
             return false;  
        else {  
             for (char ch = 'a'; ch <= 'z'; ch++) {  
                  if (s.indexOf(ch) < 0) {  
                       return false;  
                  }  
             }  
        }  
        return true;  
   }  
   
}
