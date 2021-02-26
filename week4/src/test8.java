import java.io.*;
import java.nio.charset.StandardCharsets;

public class test8 {
    public static void main(String[] args) throws IOException {
        File file = new File("c:" + File.separator + "csatest");
        if(!file.exists()){
            file.mkdirs();
        }
        File text = new File("c:" + File.separator + "csatest" + File.separator + "demo.txt");
        try{
            boolean b1 = text.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String string = "csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021csa2021";
        FileOutputStream fos = new FileOutputStream("c:" + File.separator + "csatest" + File.separator + "demo.txt");
        byte[] bytes = string.getBytes(StandardCharsets.UTF_8);
        fos.write(bytes);
        fos.close();
        File file1 = new File("c:" + File.separator + "csatest" + File.separator + "demo.txt");
        if(file1.exists()){
            InputStream input = new FileInputStream(file1);
            byte data[] = new byte[1024];
            int len = input.read(data);
            input.close();
            String string1 = new String(data,0,len);
            int sum = 0;
            int index = 0;
            while((index = string1.indexOf("2021",index))!= -1){
                sum++;
                index = index + 4;

            }
            System.out.println(sum);
        }
    }

}
