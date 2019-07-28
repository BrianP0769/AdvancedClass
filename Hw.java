import java.util.*;
public class Hw{

        public static int checkDist(Integer start, Integer finish){
                int dist = 0;
                Queue L1 = new Queue();
                Queue temp = new Queue();
                L1.enqueue(start);
                while(true){
                        while(L1.isEmpty() == false){
                                if(L1.peek() != finish){
                                        temp.enqueue(hmap.get(L1.peek()));
                                        System.out.println(L1.peek());
                                        L1.dequeue();
                                }
                                else{
                                        return dist;
                                }
                        }
                        L1 = temp;
                        temp = new Queue();
                        dist ++;
                }
        }

        static HashMap<Integer, Integer> hmap = new HashMap<>();
        public static void main(String[] args) {
                hmap.put(0, 1);
                hmap.put(0, 2);
                hmap.put(1, 4);
                hmap.put(2, 3);
                hmap.put(2, 5);
                hmap.put(3, 4);
                hmap.put(4, 6);
                hmap.put(5, 4);
                hmap.put(6, 7);
                System.out.println("distance:" + checkDist(0,7));
        }
}

class Queue{
        private ArrayList<Integer> data;
        public Queue(){
                data = new ArrayList<>();
        }
        public void enqueue(Integer x){
                data.add(x);
        }
        public void dequeue(){
                data.remove(0);
        }
        public int length(){
                return data.size();
        }
        public boolean isEmpty(){
                return data.isEmpty();
        }
        public Integer peek(){
                return data.get(0);
        }
}
