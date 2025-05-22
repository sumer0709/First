public class LL {
    Node head;
    Node tail;
    int size;

    public class Node
    {
        int val;
        Node next ;
        Node(int val)
        {
            this.val=val;
        }
        Node(int val , Node next)
        {
            this.val=val;
            this.next=next;
        }
    }
    
    public void insert(int val )
    {
        Node node = new Node(val);
        Node temp=head;
       if(head == null)
       {
        head= node;
        size++;
        return ;
       }
      while(temp.next!= null)
      {
        temp=temp.next;
      }
      temp.next=node;
      size++;
    }
    public void display(Node node)
    {
        if(node==null)
        {
            return ;
        }
        System.out.print(node.val+" -> ");
        display(node.next);
    }
}
