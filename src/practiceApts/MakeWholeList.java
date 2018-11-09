package practiceApts;

public class MakeWholeList {
	public ListNode MakeWhole(int n) {
		if (n < 1) return null;
		ListNode first = new ListNode(1, null);
		ListNode ret = first;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				first.next = new ListNode(i, null);
				first = first.next;
			}
			first = first.next;
		}
		
		return ret;
	}
}
