public class Main {

	public static void main(String[] args) {
		Bil bil1 = new Bil();
		bil1.bilname = "VOLVO";
		bil1.bilyear = 2001;
		bil1.bilprice = 10000;

		Bil bil2 = new Bil();
		bil2.bilname = "VOLVO";
		bil2.bilyear = 2001;
		bil2.bilprice = 10000;

		System.out.printf("bil1name is %s\nbil1year is %d\nbil1price is %,d\n",  bil1.bilname,bil1.bilyear , bil1.bilprice);
		System.out.printf("bil2name is %s\nbil2year is %d\nbil2price is %,d" , bil2.bilname , bil2.bilyear , bil2.bilprice);
	}
}

