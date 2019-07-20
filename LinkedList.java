class Node{
    private Node nextNode;
    private Node prevNode;
    private Integer data;
    public Node next(){
    return nextNode;
  }
    public Node prev(){
      return prevNode;
  }
    public void setNext(Node other){
          nextNode = other;
  }
    public void setPrev(Node other){
          prevNode = other;
  }
    public int getData(){
          return data;
  }
    public Integer setData(Integer i){
          data = i;
          return data;
  }
    public String toString(){
          return Integer.toString(data);
  }
}
    public int get(int index){
        Node reader = start;
        for(int i = 0; i < index; i++){
              reader = reader.next();
  }
        return reader.getData();
  }
        public int set(int index, int value){
        Node reader = start;
        for(int i = 0; i < index - 1; i++){
        reader = reader.next();
  }
        reader.next().setData(value);
        return value;
  }
        public boolean contains(int value){
        Node reader = start;
        for(int i = 0; i < length - 1; i++){
          reader = reader.next();
          if(reader.getData() == value){
            return true;
  }
  }
            return false;
  }
        public int indexOf(int value){
            Node reader = start;
            for(int i = 0; i < length; i++){
                if(reader.getData() == value){
                return i;
  }
            reader = reader.next();
  }
            return -1;
  }
          public int remove(int index){
            if(index >= length){
            return -1;
  }
          Node reader = start;
            for(int i = 1; i <= index; i++){
              reader = reader.next();
  }
            if(length == 1){
              start = null;
              end = null;
  }
            if(reader.next() == null){
              reader.prev().setNext(null);
              return index;
  }
            if(reader.prev() == null){
              reader.next().setPrev(null);
              return index;
  }
                reader.prev().setNext(reader.next());
                reader.next().setPrev(reader.prev());
                return index;
  }
            public boolean remove(Integer value){
                if(contains(value) == false){
                  return false;
  }
              int index = indexOf(value);
              Node reader = start;
              for(int i = 1; i <= index; i++){
                reader = reader.next();
  }
              if(length == 1){
                start = null;
                end = null;
  }
              if(reader.next() == null){
                reader.prev().setNext(null);
                return true;
  }
              if(reader.prev() == null){
                reader.next().setPrev(null);
                return true;
  }
                reader.prev().setNext(reader.next());
                reader.next().setPrev(reader.prev());
                return true;
  }
        public static void main(String[] args) {
                MyLinkedList list = new MyLinkedList();
                list.add(1);
                list.add(2);
                list.add(3);
                System.out.println(list);
                list.remove(1);
                System.out.println(list);
                list.add(1, 2);
                System.out.println(list);
        }
  public class MyLinkedList{
  private Node start;
  private Node end;
  private int length;
  public MyLinkedList(){
    length = 0;
  }
  public boolean add(int value){
    length ++;
    Node next = new Node();
    next.setData(value);
    if(length == 1){
      end = next;
      start = next;
      return true;
  }
    end.setNext(next);
    next.setPrev(end);
    end = next;
    return true;
  }
  public int size(){
    return length;
  }
  public String toString(){
  Node reader = start;
  String result = "";
  while(reader != null){
    result += reader.toString() + ", ";
    reader = reader.next();
  }
      return result;

  }
}
