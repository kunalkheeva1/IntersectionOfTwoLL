import java.util.HashMap;

public class IntersectionOfTwoLL {
    //get the node
     static class Node{
         int data;
         Node next;
         Node(int data){
             this.data = data;
             this.next = null;
         }
        //list one and two
         public static Node intersectionOfTwoLL(Node headA, Node headB){
             HashMap<Node, Boolean> map = new HashMap<>();
            //put list A in map
             while(headA != null){
                 map.put(headA, true);
                 headA = headA.next;
             }
            //now if at any point map contains the node of B, then return it otherwise go ahead
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
