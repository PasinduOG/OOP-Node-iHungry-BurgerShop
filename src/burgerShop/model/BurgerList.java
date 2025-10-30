package burgerShop.model;

public class BurgerList {

    private Node first;

    private boolean isEmpty() {
        return first == null;
    }

    public boolean add(BurgerOrder burgerOrder) {
        return add(size(), burgerOrder);
    }

    public boolean addFirst(BurgerOrder burgerOrder) {
        return add(0, burgerOrder);
    }

    public boolean addLast(BurgerOrder burgerOrder) {
        return add(burgerOrder);
    }

    public int indexOf(BurgerOrder burgerOrder) {
        int index = 0;
        Node temp = first;
        while (temp != null) {
            if (burgerOrder.getOrderId().equalsIgnoreCase(temp.burgerOrder.getOrderId())) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }
    
    public int search(String orderId) {
        int index = 0;
        Node temp = first;
        while (temp != null) {
            if (temp.burgerOrder.getOrderId().equalsIgnoreCase(orderId)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public boolean add(int index, BurgerOrder burgerOrder) {
        if (index >= 0 && index <= size()) {
            Node node = new Node(burgerOrder);
            if (index == 0) {
                node.next = first;
                first = node;
            } else {
                int count = 0;
                Node temp = first;
                while (count < index - 1) {
                    count++;
                    temp = temp.next;
                }
                node.next = temp.next;
                temp.next = node;
            }
            return true;
        }
        return false;
    }

    public BurgerOrder get(int index) {
        if (index >= 0 && index < size()) {
            int count = 0;
            Node temp = first;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            return temp.burgerOrder;
        }
        return null;
    }

    public boolean set(BurgerOrder burgerOrder) {
        int index = indexOf(burgerOrder);
        if (index >= 0 && index < size()) {
            int count = 0;
            Node temp = first;
            while (count < index) {
                count++;
                temp = temp.next;
            }
            temp.burgerOrder = burgerOrder;
            return true;
        }
        return false;
    }

    public int size() {
        int count = 0;
        Node temp = first;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public BurgerOrder[] toArray(){
        BurgerOrder[] burgerOrders = new BurgerOrder[size()];
        Node temp=first;
        for(int i=0; i<burgerOrders.length; i++){
            burgerOrders[i]=temp.burgerOrder;
            temp=temp.next;
        }
        return burgerOrders;
    }
    
    public void clear(){
        first=null;
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
