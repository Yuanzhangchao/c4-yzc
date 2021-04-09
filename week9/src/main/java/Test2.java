public class Test2 {
    public static void main(String[] args) {
        int n = 10,m = 17;
        StringBuilder ss = new StringBuilder();
        for(int i = 0 ; i  < n ; i ++){
            ss.append(i);
        }
        int index= 0;
        while(ss.length() > 1 ){
            index = (index + m -1)%ss.length();
            ss.deleteCharAt(index);
        }
        System.out.println(ss);
    }
}
