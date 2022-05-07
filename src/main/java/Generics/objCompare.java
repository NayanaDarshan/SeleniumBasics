package Generics;

public class objCompare {
	int a;
	int b;
	public static objCompare obj3;
	
	public objCompare(int a, int b){
		
		System.out.println(a+" "+b);
		
	}

	public static void main(String[] args) {
		
		
		objCompare obj1 = new objCompare(10, 20);
		
		objCompare obj2= new objCompare(100, 200);
		
		if(obj1.equals(obj2) ){
			System.out.println("objects are equal");
		}
		else {
			System.out.println("Objects are NOT equal");
		}

		
		try {
			obj3= (objCompare) obj2.clone();
			
	
			System.out.println(obj3.a);
			
			System.out.println(obj3.b);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
