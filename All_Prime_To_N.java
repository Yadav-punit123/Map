package Lab8.Map;

public class All_Prime_To_N {
	
	public static void main(String args[]) {
		int[] prime =new int[15];
		int n=50;
		int cnt=0;
		for(int i=2;i<n;i++) {
			for(int j=2;j<=i-1;j++) {
				if(i%j == 0) {
					break;
				}
				if(j==(i-1)) {
					prime[cnt]=i;
					cnt++;
				}
			}
		}
		for(int n1:prime) {
			System.out.println(n1);
		}
		
		
	}

}
