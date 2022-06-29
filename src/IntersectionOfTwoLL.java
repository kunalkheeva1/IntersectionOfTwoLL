import java.util.HashMap;

public class IntersectionOfTwoLL {

     static class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
             this.next = null;
         }

         public static Node intersectionOfTwoLL(Node headA, Node headB){
             HashMap<Node, Boolean> map = new HashMap<>();

             while(headA != null){
                 map.put(headA, true);
                 headA = headA.next;
             }

             while (headB != null){
                 if(map.containsKey(headB)){
                    return headB;
                 }
                 headB = headB.next;
             }return null;

         }
     }

    public static void main(String[] args) {

    }
}
