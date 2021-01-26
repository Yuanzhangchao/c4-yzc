public class test2 {
    public static void main(String args[]){
        int sum = 0;
        for(int i = 100 ; i < 1000 ; i++){
            int j = i;
            int ge = j % 10;
            j/=10;
            int shi = j % 10;
            j/=10;
            int bai = j;
            if(i == (Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3)))
                    sum++;
        }
        System.out.print(sum);
    }
}
