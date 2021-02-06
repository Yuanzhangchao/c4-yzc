public class test5 {
    public static void main(String args[]){
        Monkey monkey = new Monkey("猴子");
        monkey.speak();
        People people = new People("人类");
        people.speak();
        people.think();
    }
}
class Monkey{
    private String name;
    public Monkey(String s){
        this.name = s;
    }
    public void speak()
    {
        System.out.println("咿咿呀呀.....");
    }
}
class People extends Monkey{
    public People(String s){
        super(s);  //重点！！！！
    }
    public void speak()
    {
        System.out.println("小样的，不错嘛！会说话了！");
    }
    public void think(){
        System.out.println("别说话！认真思考！");
    }
}
