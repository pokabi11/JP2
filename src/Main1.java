import demo.collections.Car;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Main1 {
    public static void main(String[] args) {
        HashSet<String>hsStr = new HashSet<String>();
        hsStr.add("Hello");
        hsStr.add("world");
        hsStr.add("Hello");

        for (String s: hsStr) {
           System.out.println(s);
        }

        System.out.println("------");

        HashMap<String,String> hm = new HashMap<>();
        hm.put("name","Annie");
        hm.put("email","annie12@gmail.com");
        System.out.println("Student name: " + hm.get("name"));

        PriorityQueue<Integer> pri = new PriorityQueue<>();
        pri.add(9);
        pri.add(4);
        pri.add(5);
        pri.add(8);

        while (!pri.isEmpty()) {
            System.out.println(pri.poll()); //peek(): cao đến thấp
        }

        System.out.println("------");

        Car car1 = new Car("Toyota Camry",2015);
        Car car2 = new Car("Huyndai Santafe",2020);
        Car auto1 = new Car("BMW X7",2019);
        Car auto2 = new Car("Tesla X",2022);

        PriorityQueue<Car> priCar = new PriorityQueue<Car>(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getProduceYear() - o2.getProduceYear();
            }
        });
        priCar.add(car1);
        priCar.add(car2);
        priCar.add(auto1);
        priCar.add(auto2);

        while (!priCar.isEmpty()){
            Car c = priCar.poll();
            System.out.println(c.getBrand());
        }
    }
}