package H_3;

public class Linlist {
     private Node head;
  
    public void addFirst(int value){
        Node node = new Node();
        node.value = value;
        if (head != null){
            node.next = head;
        }
        head = node;
    }

   public void revert() {
        if (head == null) {
            System.out.println("Список пуст! Не могу развернуть");
        } else if (head.next == null) {
            System.out.println("В списке один элемент! Разворот не имеет смысла.");
        } else {
            Node current = head;
            Node previous = null;
            while (current != null) {
                Node next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            head = previous;
        }
    }

    
    public void print(){
        if (head == null){
            System.out.println("->");
            return;
        }
        Node node = head;
        while (node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }

    private class Node{
        private int value;
        private Node next;
    }
    
}
