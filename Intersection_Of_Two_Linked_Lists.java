public class Intersection_Of_Two_Linked_Lists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap <ListNode,Integer> map = new HashMap<>();
        ListNode currentA = headA;
        ListNode currentB = headB;
        int countA =0, countB=0;
        while(currentA!=null){currentA = currentA.next;countA++;}
        while(currentB!=null){currentB = currentB.next; countB++;}
        currentA = headA;
        currentB = headB;
        if(countA>countB){
            while(currentB!=null){
                map.put(currentB,1);
                currentB=currentB.next;
            }
            while(currentA!=null){
                if(map.containsKey(currentA))
                    return currentA;
                currentA=currentA.next;
            }
            return null;
        }
        else
        {
            while(currentA!=null){
                map.put(currentA,1);
                currentA=currentA.next;
            }
            while(currentB!=null){
                if(map.containsKey(currentB))
                    return currentB;
                currentB=currentB.next;
            }
            return null;
        }   
    }
}