import java.util.*;

class Restaurant1{
	public static void main(String[]args) {

		// while(true){
		Scanner sc=new Scanner(System.in);

		System.out.println("WelCome to Ace Restaurant");
		System.out.println();
		System.out.print("Please enter your name : ");
		String name=sc.nextLine();

		System.out.println("Hey "+name+","+" What do you like to Have.");
		System.out.println();

		System.out.println("1. veg pulao - 40rs  \n2. veg curd - 35rs \n3. Chicken curry - 120rs \n4. Chicken Biryani - 150rs \n5. Double ka meta - 25rs");
		System.out.println();



		// prices of items
		int veg_pulao=40;
		int veg_curd=35;
		int Chicken_curry=120;
		int Chicken_Biryani=150;
		int Doble_ka_meta=25;

		System.out.print("Select from the menu :");
		int item_num=sc.nextInt();

		if(item_num>1 && item_num<=5) {

			System.out.print("enter your Quantity : ");
			int quatity_num=sc.nextInt();

			switch(item_num) {
			case 1: {

				int t1=quatity_num*veg_pulao;

				System.out.println("You have selected Veg pulao , pay "+t1+"rs");

				int amt=sc.nextInt();
				System.out.println("you have paid : "+amt);

				if(amt==t1) {
					System.out.println("order placed, kindly wait .");
				} else {
					System.out.println("invalid amount");
				}
				break;
			}
			case 2:
			{
				int t2=quatity_num*veg_curd;
				System.out.println("You have selected Curd Rice , pay "+t2+"rs");
				int amt=sc.nextInt();
				System.out.println("you have paid : "+amt);
				if(amt==t2) {
					System.out.println("order placed, kindly wait .");
				} else {
					System.out.println("invalid amount");
				}
				break;
			}
			case 3:
			{
				int t3=quatity_num*Chicken_curry;
				System.out.println("You have selected Chicken curry , pay "+t3+"rs");
				int amt=sc.nextInt();
				System.out.println("you have paid : "+amt);
				if(amt==t3) {
					System.out.println("order placed, kindly wait .");
				} else {
					System.out.println("invalid amount");
				}
				break;
			}
			case 4:
			{
				int t4=quatity_num*Chicken_Biryani;
				System.out.println("You have selected chicken Biryani , pay "+t4+"rs");

				int amt=sc.nextInt();
				System.out.println("you have paid : "+amt);
				if(amt==t4) {
					System.out.println("order placed, kindly wait .");
				} else {
					System.out.println("invalid amount");
				}
				break;
			}
			case 5:
			{
				int t5=quatity_num*Doble_ka_meta;
				System.out.println("You have selected Double ka meta , pay "+t5+"rs");
				int amt=sc.nextInt();
				System.out.println("you have paid : "+amt);
				if(amt==t5) {
					System.out.println("order placed, kindly wait .");
					break;
				} else {
					System.out.println("invalid amount");
				}
				break;
			}
			default:
				System.out.println("your are entered invalid ");
			}

		}
		else {
			System.out.println();
			System.out.println("choose item in menu only");
			System.out.println();
		}
		//   }
	}
}