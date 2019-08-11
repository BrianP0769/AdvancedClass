import java.util.*;
public class Lesson{


        public static void main(String[] args) {
                Node start = new Node();
                Node A  = new Node();
                Node B = new Node();
                Node finish = new Node();
                start.children.add(A);
                start.lengths.add(6);
                start.children.add(B);
                start.lengths.add(2);
                A.children.add(finish);
                A.lengths.add(1);
                B.children.add(A);
                B.lengths.add(3);
                B.children.add(finish);
                B.lengths.add(5);

                n = checkDist(start, finish);
                System.out.println(n);
        }

        public static int checkDist(Node start, Node finish){
                HashMap<Node, Integer> costs = new HashMap<>();
                HashMap<Node, Node> parents = new HashMap<>();
                for(int i = 0; i < start.children.size(); i ++){
                        costs.put(start.children.get(i), start.lengths.get(i));
                        parents.put(start.children.get(i), start);
                }
                while(true){
                        for()
                }
        }
}

class Node{
        ArrayList<Node> children;
        ArrayList<Integer> lengths;
        public Node(){
                children = new ArrayList<>();
                lengths= new ArrayList<>();
        }

}
