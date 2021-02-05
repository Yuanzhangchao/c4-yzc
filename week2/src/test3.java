import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class test3 {
    public static void main(String args[]){
        Scanner in  = new Scanner(System.in);
        String str = in.next();
        Vector digital = new Vector();
        char[] aa = str.toCharArray();
        for(int i = 0 ; i < aa.length; i++){
            String bb = "";
            boolean tr = false;
            while(aa[i] >= 48 && aa[i] <= 57)
            {
                tr = true;
                bb += aa[i];
                i++;
                if( i == aa.length)
                    break;;
            }
            if(tr)
                digital.add(bb);
        }
        Iterator it = digital.iterator();
        if(!it.hasNext())
        {

            System.out.println("");
        }
        while(it.hasNext())
        {
            System.out.print(it.next() + " ");
        }

    }
}
