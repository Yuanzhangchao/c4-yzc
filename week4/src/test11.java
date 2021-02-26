public class test11 {
    public static void main(String[] args) {
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
class Message{
    private String content;
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
class Producer implements Runnable{
    private Message msg = null;
    public Producer(Message msg){
        this.msg = msg;
    }
    public void run(){
        for(int x= 0;x<50;x++){
            if(x%2 == 0){
                this.msg.setTitle("李兴华");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("JAVA讲师");
            }
            else{
                this.msg.setTitle("mldn");
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.msg.setContent("www.mldnjava.cn");
            }
        }
    }
}
class Consumer implements Runnable{
    private Message msg = null;
    public Consumer(Message msg){
        this.msg = msg;
    }
    public void run(){
        for(int x = 0; x<50; x++){
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.msg.getTitle() + "-->" + this.msg.getContent());

        }
    }
}
