package apt3;

public class ListLastFirst {
    public ListNode move(ListNode list) {
        ListNode first = list;
        if ((list == null) || (list.next == null)) return list;
        while (list.next.next != null) {
        	list = list.next;
        }
        
        ListNode newFirst = list.next;
        list.next = null;
        newFirst.next = first;
        return newFirst;
    }
}
