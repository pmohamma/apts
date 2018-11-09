package practiceApts;

public class PairDown {
    public int[] fold(int[] list) {
        int[] ret;
       	ret = new int[(list.length+1)/2];
       	for (int i=0; i < list.length-1; i+=2) {
       		ret[i/2] = (list[i] + list[i+1]);
       	}
       	if (list.length%2==1) {
       		ret[ret.length-1] = list[list.length-1];
       	}
        return ret;
    }
}