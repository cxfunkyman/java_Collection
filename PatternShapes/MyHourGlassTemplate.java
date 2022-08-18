public class MyHourGlassTemplate {

	public static void main(String[] args) {
		 //main external loop 1, hemisphere 1
		 for(int i=0; i<10; i++){
		//first triangle increasing, t1
		    for(int j=0; j<i ; j++){
		        System.out.print("-");
		    }
		//second triangle decreasing, t2
		//both make whole rectangle together, first quadrant, q1
		    for(int k=10-i; k>0; k--){
//		    for(int k=10-i; k>i; k--){
		        System.out.print("|");
		    }
		//third triangle, t3
		    for(int l=10; l>i; l--){
		        System.out.print(".");
		    }
		//fourth triangle, t4
		//both make rectangle two, q2
		//t1 and t4 are the same code, just displaced by t2 and t3
		    for(int j=0; j<i ; j++){
		        System.out.print("+");
		    }
		    System.out.println(" ");
		}
		 
		 //need new for loop to start hemisphere 2
		for(int i=0; i<10; i++){
		//t5 is the inverse of t1, by making j closer to 10 than 0
		    for(int j=9; i<j ; j--){
		        System.out.print(".");
		    }
		//t6, inverse of t2
		//makes quad4 with t5
		    for(int k=i; k+1>0; k--){
		        System.out.print("-");
		    }
		//t7, inverse of t3
		    for(int l=0; l-1<i; l++){
		        System.out.print("+");
		    }
		//t8, same as t5, displaced by t6 and t7
		    for(int j=9; i<j ; j--){
		        System.out.print(".");
		    }
		    System.out.println(" ");
		}

	}

}
