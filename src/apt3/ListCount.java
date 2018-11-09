package apt3;

public class ListCount {
    public int count (ListNode list) {
    	int ret = 0;
    	while (! (list == null)) {
    		ret +=1;
    		list = list.next;
    	}
    	
    	return ret;
    }
}