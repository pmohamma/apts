package apt3;

public class DoubleList {
    public ListNode bigify(ListNode list) {
    	
    	ListNode firstNode = list;
    	
    	while (! (firstNode == null)) {
    		
			ListNode node = new ListNode(firstNode.info, firstNode.next);
			firstNode.next = node;
			firstNode = firstNode.next;
    		if (!(firstNode == null))
    			firstNode = firstNode.next;
    	
    	}
    	
        return list;
    }
}