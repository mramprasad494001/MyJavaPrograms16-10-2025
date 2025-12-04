public class NSBike extends BikeCompany {
	// yha per override kiya gya hai 
	int nsBikePrice = 150;
	@Override
	public void milege(){
		// yha per kuch varible store kiya hun
		int a = 220;
		int b = 456;
		int ans = a+b;
		int horsePower = 55;
		// aur kuch print bhi kar rha hun
		System.out.println("is class me milege ko override kiya gya hai");
		System.out.println("A : " + a);
		System.out.println("B : " + b);
		System.out.println("A + B Ans : " + ans);
		System.out.println("Horse Power : " + horsePower);
		System.out.println("Price : " + nsBikePrice +"rs");
	}
}