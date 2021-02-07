public class test9 {
    public static void main(String args[]){
        Star star = new Star();
        star.shine();
        Universe sun = new Sun();
        sun.doAnything();
    }
}
interface Universe{
    public abstract void doAnything();
}
class Star{
    public void shine(){
        System.out.println("star: 星星一闪一闪亮晶晶");
    }
}
class Sun extends Star implements Universe{
    public void doAnything(){
        System.out.println("=====================");
        System.out.println("sun: 太阳吸引着9大行星旋转");
        System.out.println("sun: 光照八分钟，到达地球");
    }
}
