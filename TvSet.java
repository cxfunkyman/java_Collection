import java.util.Scanner;

class TV{
	private int price;
	private String brand;
	
	TV(int p,String b){
		
		this.price = p;
		this.brand = b;
		
		System.out.println("Defaults are set.");
	}
	void set(int p,String b) {
		
		if(p>0) {
			
			this.price = p;
			this.brand = b;
			
			System.out.println("Info updated.");
		}
	}
	void get() {
		System.out.println("Brand is " + this.brand + " and price is " + this.price + " CAD$");
	}
}
class TvSet{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TV t=new TV(200,"Samsung");
		boolean flag=true;
		while(flag) {
			System.out.print("Menu\n1- Show the last update.\n2- Update.\n3- Exit\nChoose your option: ");
			int c=in.nextInt();
			switch(c) {
			case 1: t.get();break;
			case 2: System.out.print("Enter the brand name: ");
			String str=in.next();
			System.out.print("Enter the price: ");
			int p=in.nextInt();
			t.set(p,str);break;
			case 3:flag=!flag;break;   
			default: System.out.print("Wrong entry. Bye.");
			}
		}
	}
}