package controller;

public class CalculateBMI {

	public static String description(double res){
        String op ="";
        if(res<18.5)
			op="Under Weight";
		else if(res>=18.5 && res<24.9)
			op="Normal";
		else if(res>=25 && res<29.9)
			op="Over wieght";
		else if(res>=30 && res<24.9)
		    op="Obese";
		else if(res<35)
			op="Extremely Obese";
		return op;
	}

	
	public static double calculate(double height,double weight){
        double res = 0;
        res = weight / (height * height);
		return res;
	}
}
