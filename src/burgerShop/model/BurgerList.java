package burgerShop.model;

public class BurgerList {

    private Node first;
    
    public boolean add(int index, BurgerOrder burgerOrder){
        if(index>=0 && index<=size()){
            Node node = new Node(burgerOrder);
            Node temp = first;
            int count=0;
            while(count<index-1){
                temp=temp.next;
                count++;
            }
            node.next = temp.next;
            temp.next=node;
        }
        return false;
    }
    
    public int size(){
        int count=0;
        Node temp=first;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    
    //Inner Class
    class Node {

        private BurgerOrder burgerOrder;
        private Node next;

        public Node(BurgerOrder burgerOrder) {
            this.burgerOrder = burgerOrder;
        }
    }
}
