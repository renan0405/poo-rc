import java.util.Scanner;
public class Principal{
	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		
	public static int maior(int a, int b) {
		if (a>b)
			return a;
		else if(b>a)
			return b;
		else
			return 0;
			}
	public static int  menor(int a, int b) {
		if (a<b)
			return a;
		else if (b<a)
			return b;
		else
			return 0;
	}
	public static void renan() {
		System.out.println("Renan");
	}
	public static void renan1() {
		for (int i = 0; i<101; i++) {;
			if (i %2== 0) 
			System.out.println("Renan");
			else {
				System.out.println("Silva");
				}
			}
		}
	}
	
}

