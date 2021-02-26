import java.io.*;
public class test9 {
    public static void main(String[] args) throws Exception{
        //1.定义源头文件路径
        File sourceFile=new File("C:/csatest/demo.txt");
        if(!sourceFile.exists()) {//如果源文件不存在
            System.out.println("源文件不存在，请确认执行路径");
            System.exit(1);
        }
        //2.定义目标文件路径
        File targetFile=new File("C:/csatest2/demo2.txt");
        if(!targetFile.getParentFile().exists()){//如果输出文件路径不存在
            targetFile.getParentFile().mkdirs();//创建目录
        }
        //3.实现文件内容的复制，分别定义输出流和输入流对象
        InputStream input=new FileInputStream(sourceFile);
        OutputStream output=new FileOutputStream(targetFile);
        int temp=0;
        byte[] data=new byte[1024];
        while ((temp=input.read(data))!=-1){//循环读入
            output.write(data,0,temp);//输出
        }
        System.out.println("复制成功！");
        input.close();
        output.close();
    }
}
