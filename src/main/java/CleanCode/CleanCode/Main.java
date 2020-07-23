package CleanCode.CleanCode;
import java.util.Scanner;
public class Main {
	Scanner s = new Scanner(System.in);
	public void interest(float p,float t,float r,int type)
	{
		Interest I = new Interest(p,t,r);
		float interest = I.type(type);
		System.out.println("Interest : "+interest);
	}
	public void construction(String std,float area,boolean automation)
	{
		ConstructionCost c = new ConstructionCost(std,area,automation);
		float cost = c.CostCalculation();
		System.out.println("Cost : "+cost);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.interest(200,2,4,1);
		obj.interest(200,2,4,2);
		obj.construction("high standard", 729.7f, false);
	}

}
