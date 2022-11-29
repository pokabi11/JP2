package demo.threads;

public class Subrun implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("Runnnnnnnnnnn i= "+i);
            System.out.println("---------------");
            try {
                Thread.sleep(1000);//1000 milisecs
            }catch(Exception e) {

            }
        }

        Runnable r1 = new Runnable() {
            @Override
            public void run() {

            }
        };

        Thread t2 = new Thread(r1);
        t2.start();

        Runnable r2 = ()->{};

        new Thread(()->{

        }).start();
    }
}
