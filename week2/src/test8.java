public class test8 {
    public static void main(String args[]){
        C c = new C();
        c.showA();
        c.showB();
        c.showC();
    }
}
abstract class A{
    public int numa = 10;
    public abstract void showA();

}
abstract class B extends A{
    public int numb = 20;
    public abstract void showB();
}
class C extends B{
    private int numc = 30;

    @Override
    public void showB() {
        System.out.println(numb);
    }

    @Override
    public void showA() {
        System.out.println(numa);
    }
    public void showC(){
        System.out.println(numc);
    }
}
