package shape_project;

import java.util.Scanner;

public class Game {
	public Game() {
		System.out.println("======Game has Started ======");
	}
	public int selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 For 2DShape");
		System.out.println("Press 2 For 3DShape");
		int choice=sc.nextInt();
		if(choice==1)
			return 1;
		else if (choice==2) 
			return 2;
		else {
			System.out.println("Invalid Choice");
			
			return selectShape();
		}
	}
		
		public TwoDShape selectTwoDShape() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 For Circle");
			System.out.println("Press 2 For Triangle");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have selected Circle ");
				System.out.println("Enter radius :");
				double r=sc.nextDouble();
				Circle c1=new Circle(r);
				return c1;
			}
			else if(choice==2) {
				System.out.println("You have selected triangle");
				System.out.println("Enter side: ");
				double side1=sc.nextDouble();
				System.out.println("Enter side2: ");
				double side2=sc.nextDouble();
				System.out.println("Enter side3; ");
				double side3=sc.nextDouble();
				return new Triangle(side1, side2 ,side3);
				}
			else {
				System.out.println("invalid choice!");
				return selectTwoDShape();
			}
			}
		public ThreeDShape selecThreeDShape() {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press 1 For Cylinder :");
			System.out.println("Press 2 For Cube :");
			int choice=sc.nextInt();
			if(choice==1) {
				System.out.println("You have selected Cylinder ");
				System.out.println("Enter Radius:");
				double r=sc.nextDouble();
				System.out.println("Enter Height :");
				double h=sc.nextDouble();
				return new Cylinder(r,h);
			}
				else if (choice==2) {
					System.out.println("You have selected Cube :");
					System.out.println("Enter side:");
					double side=sc.nextDouble();
					return new Cube(side);
				}
				else {
					System.out.println("Invalid choice!");
					return selecThreeDShape();
				}
					
		}
					
					
					
	}
			




