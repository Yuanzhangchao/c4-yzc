public class test7 {
    public static void main(String args[]){
        Duck duck = new Duck("发烧", 2, "感冒");
        duck.showMsg();
    }
}
abstract class Poultry{
    private String name;
    private String symptom;
    private int age;
    private String illness;
    Poultry(){}
    Poultry(String name, String symptom, int age, String illness){
        this.age = age;
        this.name = name;
        this.illness = illness;
        this.symptom =symptom;
    }
    abstract public void showSymptom();
    public void showMsg(){
        System.out.println("动物种类：" + getName() + "，年龄:" + getAge() + "岁");
        System.out.println("入院原因：" + getIllness());
        System.out.println("症状为：" + getSymptom());
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSymptom(String symptom){
        this.symptom = symptom;

    }
    public void setAge(int age){
        this.age = age;
    }
    public void setIllness(String illness){
        this.illness = illness;
    }
    public String getName(){
        return this.name;
    }
    public String getSymptom(){
        return this.symptom;
    }
    public String getIllness(){
        return this.illness;
    }
    public int getAge() {
        return age;
    }
}
class Duck extends Poultry{
    Duck(){
        super();
    }
    Duck(String symptom, int age, String illnees){
        super("鸭子",symptom,age,illnees);
    }
    public void showSymptom() {
        System.out.println("症状为：" + getSymptom());
    }
}
