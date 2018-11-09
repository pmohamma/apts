package apt2;

import java.util.Arrays;
import java.util.HashSet;

public class MemberCheck {
	public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {
		HashSet<String> dishonest = new HashSet<String> (Arrays.asList(club1));
		HashSet<String> clubSet1 = new HashSet<String> (Arrays.asList(club1));
		HashSet<String> clubSet2 = new HashSet<String> (Arrays.asList(club2));
		HashSet<String> clubSet3 = new HashSet<String> (Arrays.asList(club3));
		dishonest.retainAll(clubSet2);
		clubSet1.retainAll(clubSet3);
		clubSet2.retainAll(clubSet3);
		dishonest.addAll(clubSet1);
		dishonest.addAll(clubSet2);
		String[] ret = dishonest.toArray(new String[0]);
		Arrays.sort(ret);
		return (ret);
	}
}
