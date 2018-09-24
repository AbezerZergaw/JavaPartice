import java.util.ArrayList;

public class ArrayListDemo {


    public static void main (String[] args){

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("bmw");
        cars.add("honda");
        cars.add("yaris");
        cars.add("corlao");
        int size = cars.size();

        System.out.println(size);

        System.out.println(cars.get(3));
      /*  for(int i=0; i<size; i++){
            System.out.println(cars.get(i));*/



                cars.remove(size - 1);

                for(String car: cars){
                    System.out.println(car);
            }
        }
    }

