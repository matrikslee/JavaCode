
public class Demo {

	/**
	 * @param args
	 */
	public static int calc(int a, int b){
		int sum = 0;
		for ( int i = a; i <= b; i++ ) {
			sum += i;
		}
		return sum;
	}
	public static void g(int[] a){
		for (int i=0;i<a.length;i++){
			a[i]++;
		}
		for (int k:a){
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum;
//		int i;
//		int[] a = {1,20,35};
//		int[] b = {10,30,45}；
//		for ( int k = 0; k<a.length; k++){
//			sum = 0;
//			for ( i = a[k]; i<=b[k]; i++){
//				sum += i;
//			}
//		}
//		sum = 0;
//		for ( i = 1; i<=10; i++ ) {
//			sum += i;
//		}
//		System.out.println(sum);
//		sum = 0;
//		for ( i = 20; i<=30; i++ ) {
//			sum += i;
//		}
//		System.out.println(sum);
//		sum = 0;
//		for ( i = 35; i<=45; i++ ) {
//			sum += i;
//		}
//		System.out.println(sum);
//		System.out.println(calc(1,10));
//		System.out.println(calc(20,30));
//		System.out.println(calc(35,45));
//		int[] a={1,2,3,4,5};
//	    int[] b = new int[4];
//		g(a);
//		g(b);
//		Integer x = a[0];
//		String s = Integer.toString(a[1]);
//		System.out.println("hhhh"+x.toString()+"hha"+s);
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.parseInt("12"));
//		System.out.println(Integer.valueOf("122"));
//		System.out.println("--------------------------------");
//		for (int k:a){
//			System.out.println(k);
//		}
//		Integer i = 10;
//		Integer j = i;
//		System.out.println(j);		
//		j = 11;
//		System.out.println(i);
	}

}
