public class Test2 {
    public static void main(String[] args) {
        String s="abac";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        if(isPalindrome(s)){
            return true;
        }else {
            for(int i=0;i<s.length();i++){
                String tmp = new StringBuilder(s).deleteCharAt(i).toString();
                if(isPalindrome(tmp)){
                    return true;
                }
            }
        }
        return false;
    }


    //此方法用于判断一个字符串是不是回文串
    public static boolean isPalindrome(String s){
        String reverse = new StringBuilder(s).reverse().toString();
        return reverse.equals(s);
    }
}



