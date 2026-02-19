public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int[] createIntArray() {
		int[] x= new int[5];
		for (int y=1; y<6; y++) {
			x[y-1]=y;
		}
		return x;

	}

	public static String[] createArray(String a, String b, String c, String d) {
		String[] x= new String[] {a,b,c,d};
		return x;
	}

	public static int findValue(int x, int[] y) {
		int z=-1;
		for (int a=0; a<y.length; a++) {
			if (x==y[a]) {
				z=a;
				break;
			}
		}
		return z;
	}

	public static int findThirdValue(String x, String[] y) {
		int z=-1;
		int count=0;
		for (int a=0;a<y.length; a++) {
			if (x.equals(y[a])) {
					count+=1;
				}
			if (count==3) {
				z=a;
				break;
			}

		}
		return z;
	}

}
