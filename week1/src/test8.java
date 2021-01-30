import javax.swing.plaf.basic.BasicRadioButtonMenuItemUI;

public class test8 {
    public static void main(String args[]){
        Rabbit rabbit = new Rabbit();
        rabbit.eat();
        rabbit.sleep();
        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sleep();
    }
}
class Animal{
    private int height;
    private int weight;
    public void eat(){

    }
    public void sleep(){

    }
}
class Rabbit extends Animal{
    public void eat(){
       System.out.println("兔子是吃草的。");
    }
    public void sleep(){
        System.out.println("兔子是晚上睡白天工作。");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("老虎是吃肉的。");
    }
    public void sleep(){
        System.out.println("老虎也是晚上睡白天工作。");
    }
}
