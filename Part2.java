import java.util.*;
public class Part2{
        public static int getDistR(Node start, Node finish){
                int dist = 0;
                if(start == finish){
                        return dist;
                }
                if(start.hasLeft()){
                        dist ++;
                        return dist += getDistR(start.childLeft, finish);
                }
                if(start.hasRight()){
                        dist ++;
                        return dist += getDistR(start.childRight, finish);
                }
                return -1;
        }
        public static int getDist(Node start, Node finish){
                Stack<Node> stack = new Stack<>();
                Node reader = start;
                stack.push(reader);
                while(true){
                        if(reader.hasLeft()){
                                stack.push(reader.childLeft);
                                if(reader.childLeft == finish){
                                        return stack.search(start) - 1;
                                }
                                reader = reader.childLeft;
                        }
                        else if(reader.hasRight()){
                                stack.push(reader.childLeft);
                                if(reader.childRight == finish){
                                        return stack.search(start) - 1;
                                }
                                reader = reader.childRight;
                        }
                        else{
                                stack.pop();
                                reader = stack.peek();
                        }
                        return -1;
                }

        }

        public static void main(String[] args) {
                Node node1 = new Node(1);
                Node node2 = new Node(2);
                Node node3 = new Node(3);
                Node node4 = new Node(4);
                Node node5 = new Node(5);
                Node node6 = new Node(6);
                Node node7 = new Node(7);
                Node node8 = new Node(8);
                Node node9 = new Node(9);
                Node node10 = new Node(10);

                node1.childLeft = node2;
                node1.childRight = node3;
                node2.childLeft = node4;
                node2.childRight = node5;
                node4.childLeft = node8;
                node8.childLeft = node10;
                node3.childLeft = node6;
                node3.childRight = node7;
                node6.childRight = node9;



                System.out.println("distance: " + getDist(node1, node10));
        }
}

class Node{
        public int index;
        public Node childRight;
        public Node childLeft;
        public Node(int index){
                this.index = index;
        }
        public String toString(){
                return Integer.toString(index);
        }
        public boolean hasRight(){
                if(childRight == null){
                        return false;
                }
                return true;
        }
        public boolean hasLeft(){
                if(childLeft == null){
                        return false;
                }
                return true;
        }
}
