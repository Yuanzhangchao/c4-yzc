public class test10 {
    public static void main(String args[]){
        Computer computer = new Computer();
        computer.add(new Mouse());
        computer.add(new KeyBoard());
        computer.add(new Microphone());
        computer.powerOn();
        System.out.println("================");
        computer.powerOff();
    }
}
interface USB{
    public void turnOn();
    public void turnOff();
}
class Mouse implements USB{
    public void turnOn(){
        System.out.println("鼠标启动了！");
    }
    public void turnOff(){
        System.out.println("鼠标关闭了！");
    }
}
class KeyBoard implements USB{
    public void turnOn(){
        System.out.println("键盘启动了！");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘关闭了！");
    }
}
class Microphone implements USB{
    @Override
    public void turnOn() {
        System.out.println("麦克风启动了！");
    }

    @Override
    public void turnOff() {
        System.out.println("麦克风关闭了！");
    }
}
class Computer{
    private USB[] usbs = new USB[4];
    public void add(USB usb){
        for(int i = 0; i<usbs.length ; i++){
            if(usbs[i] == null){
                usbs[i] = usb;
                break;
            }
        }
    }
    public void powerOff(){
        for(int i = 0 ; i < usbs.length ; i++){
            if(usbs[i] != null)
            {
                usbs[i].turnOff();
            }
        }
        System.out.println("电脑关机了！");
    }
    public void powerOn(){
        for(int i = 0 ; i< usbs.length ;i++){
            if(usbs[i] != null){
                usbs[i].turnOn();
            }
        }
        System.out.println("电脑开机了！");
    }
}
