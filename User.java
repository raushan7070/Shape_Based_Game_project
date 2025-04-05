package shape_project;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Game g=new Game();
		char c;
		do {
			int choice =g.selectShape();
			if(choice==1) {
			System.out.println("Yau have selected 2D shape");
			TwoDShape td=g.selectTwoDShape();
			td.getArea();
			td.GetPerimeter();
		}
		else {
			System.out.println("You have selected 3D shape");
			ThreeDShape td=g.selecThreeDShape();
			td.getVolume();
			td.getCurvedSurfaceArea();
			td.getTotalSurfaceArea();
		}
			System.out.println("Press y/Y to restart...");
			c=sc.next().charAt(0);
		}while(c=='y' || c=='Y');
		System.out.println("======Thank you for playing game ========");
	}

}

