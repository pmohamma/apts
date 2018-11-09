package apt3;

public class RemoveMin {
    public ListNode remove (ListNode list) {
        if ((list == null) || (list.next == null)) return null;
    	
        ListNode first = list;
        int min = 99999999;
        
        while (list != null) {
        	if (list.info < min) {
        		min = list.info;
        	}
        	list = list.next;
        }
        
        list = first;
        
        if (min == first.info) {
        	return first.next;
        }
        
        else if (min == first.next.info) {
        	first.next = first.next.next;
        	return first;
        }
        
        while (list != null) {
        	if (list.next.next == null) {
        		list.next = list.next.next;
        		return first;
        	}
        	else if (list.next.next.info == min) {
        		list.next.next = list.next.next.next;
        		return first;
        	}
        	list = list.next;
        }
    	
    	return first;
    }
}