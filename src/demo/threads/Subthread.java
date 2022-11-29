package demo.threads;

public class Subthread extends Thread{
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("Subthread i= "+i);
            System.out.println("---------------");
            try {
                Thread.sleep(1000);//1000 milisecs
            }catch(Exception e) {

            }
        }
    }
}
