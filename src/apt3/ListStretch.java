package apt3;

public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
    	if ((list == null) || (amount==1)) {
    		return list;
    	}

    	ListNode firstNode = list;
    	while (! (firstNode == null)) {
    		for (int i = 1; i<amount; i++) {
    			ListNode node = new ListNode(firstNode.info, firstNode.next);
    			firstNode.next = node;
    			firstNode = firstNode.next;
    		}
    		if (!(firstNode == null))
    			firstNode = firstNode.next;
    	}
    	
        return list;
    }
}