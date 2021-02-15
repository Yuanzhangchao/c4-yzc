import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test2 {
    public static void main(String args[]){
        List<Message> messages = new ArrayList<>();
        Message message1 = new Message(1,"Joe",70000,"3");
        messages.add(message1);
        messages.add(new Message(2,"Henry",80000,"4"));
        messages.add(new Message(3,"Sam",60000));
        messages.add(new Message(4,"Max",90000));
        Iterator it =messages.iterator();
        System.out.println("Id  Name  Salary   ManagerId");
        while(it.hasNext()){
            System.out.printf("%5s",it.next().toString());
            System.out.println();
        }
    }
}
class Message{
    private int Id;
    private String Name;
    private int Salary;
    private String ManagerId ;
    public Message(int Id, String Name, int Salary, String ManagerId){
        this.Id = Id;
        this.ManagerId = ManagerId;
        this.Name = Name;
        this.Salary = Salary;
    }
    public Message(int Id, String Name, int Salary){
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
    }
    public String toString(){
        return Id + "   " +Name + "   "+Salary+ "    "+ManagerId;
    }
    public int getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public int getSalary() {
        return Salary;
    }

    public String getManagerId() {
        return ManagerId;
    }
}
