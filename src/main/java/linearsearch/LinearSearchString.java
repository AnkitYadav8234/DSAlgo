package linearsearch;

public class LinearSearchString {
    public static void main(String[] args) {
        String str = "Ankit";
        System.out.println(linearSearch(str, 'a'));
        System.out.println(linearSearch1(str, 'a'));
    }

     static boolean linearSearch(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for (int index = 0; index < str.length(); index++){
            if (target == str.toLowerCase().charAt(index)){
                return true;
            }
        }
         return false;
     }
    static boolean linearSearch1(String str, char target) {
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toLowerCase().toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
