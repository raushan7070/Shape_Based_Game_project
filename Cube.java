package shape_project;

 

public class Cube  implements ThreeDShape{
	double side;
    public Cube() {
		// TODO Auto-generated constructor stub
	}
    Cube(double side){
    	this.side=side;
    }
    public void  getVolume() {
    	System.out.println("Volume of Cube is: "+side*side*side+"cu.unit");
    }
    public void getCurvedSurfaceArea() {
    	System.out.println("Curved Surface Area is: "+4*side*side+"sq.unit");
    	
    }
    public void getTotalsurfaceArea() {
    	System.out.println("Total surface Area is :"+6*side*side+"sq.Unit");
    }
	@Override
	public void getTotalSurfaceArea() {
    	System.out.println("Total surface Area is :"+6*side*side+"sq.Unit");

	}

}
