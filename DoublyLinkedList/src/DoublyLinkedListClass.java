public class DoublyLinkedListClass {
    Node head;
    Node tail;

    /** Constructor
     * set head as null;
     */
    public DoublyLinkedListClass(){
        head = null;
        tail = null;
    }

    private boolean noDupes(int key){
        Node current = head;


        while(current!=null){
            if(current.data == key)
                return true;
            current=current.next;
        }
        return false;
    }
    private boolean isEmpty(){ return head == null; }

    public boolean insertLast(int key){
       Node newNode = new Node();
       newNode.data = key;

        if(isEmpty())
            head = newNode;
        else if(noDupes(key))
            return false;
        else {
            tail.next = newNode;
            newNode.previous = tail;
            }
            tail = newNode;
        return true;
    }

    public boolean insertFirst(int key){

            Node newNode = new Node();
            newNode.data = key;

            if(isEmpty())
                tail = newNode;
            else if(noDupes(key))
                return false;
            else
                head.previous = newNode;
            newNode.next =head;
            head = newNode;

            return true;
    }

    public boolean insertBefore(int key, int myData){


        Node current = head;

        if(isEmpty())
            return false;
        else if(noDupes(myData))
                return false;

        while(current!=null){
            if(current.data==key){
                Node newNode = new Node();
                newNode.data=myData;
                if(current == head){
                    newNode.previous = null;
                    head = newNode;
                    head.next = current;
                }
                else{
                   current.previous.next = newNode;
                   newNode.previous = current.previous;
                }
                current.previous = newNode;
                newNode.next=current;

                return true;
            }
            current=current.next;
        }

        return false;
    }

    public boolean insertAfter(int key, int myData){

        Node current = head;

        if(isEmpty())
            return false;
        else if(noDupes(myData))
                return false;

        while(current!=null){
            if(current.data==key){
                Node newNode = new Node();
                newNode.data=myData;
                if(current == tail){
                    newNode.next=null;
                    tail=newNode;
                }
                else{
                    newNode.next=current.next;
                    current.next=newNode;
                }
                newNode.previous = current;
                current.next = newNode;
                return true;
            }
            current=current.next;
        }

        return false;
    }
    public boolean deleteFirst(){
        if(isEmpty())
            return false;
        if(head == tail)
            tail=null;
        else
            head.next.previous = null;
        head = head.next;
        return true;
    }

    public boolean deleteLast(){
        if(isEmpty())
            return false;
        if(head == tail)
            head=null;
        else
            tail.previous.next = null;
        tail = tail.previous;
        return true;
    }

    public int displayTail(){
        if(isEmpty())
            return 1;
        return tail.data;
    }

    public int displayHead(){
        if(isEmpty())
            return -1;
        return head.data;
    }

    public void displayListForward(){
        if(isEmpty()){
            System.out.println("Empty List!");
            return;
        }
        Node current = head;
        while(current !=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }

    public void displayListBackward(){
        if(isEmpty()){
            System.out.println("Empty List!");
            return;
        }
        Node current = tail;
        while(current !=null){
            System.out.print(current.data+" ");
            current=current.previous;
        }
    }

    public int displayPrevious(int key){
        Node current = head;

        if(isEmpty())
            return -1;

        while(current != null){
            if(head.data == key)
                return -1;
            else if(current.data == key)
                return current.previous.data;
            current = current.next;
        }
         return -1;
    }

    public int displayNext(int key){
        Node current = head;

        if(isEmpty())
            return -1;

        while(current != null){
            if(current.data == key){
                if(current.next == null) return -1;
                else return current.next.data;
            }
            current = current.next;
        }
        return -1;
    }

    public boolean search(int key){
        Node current = head;

        while(current != null){
            if(current.data == key)
                return true;
            current=current.next;
        }
        return false;
    }

    public boolean delete(int key){
        Node current = head;

        while(current != null){
            if(current.data == key){
                if(current == head)
                    head = current.next;
                else
                    current.previous.next = current.next;
                if(current.next == null)
                    current = current.previous;
                else
                     current.next.previous = current.previous;
                return true;
                }

            current=current.next;
            }
            return false;
        }
    }
