package conve;
import java.util.Scanner;
//TEMPERATURE CONVERTER
public class tempconverter {

	public static void main(String[]args) {
	double tem;int unit;
	
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter temperature value");
	tem=sc.nextDouble();
	System.out.println("Enter temperature unit (if tmparature in celcius type give 0  or fharenheet give 1)");
	unit=sc.nextInt();
	System.out.println("Enterd temperature value is " + tem);// given Temperature
	if(unit==0){
          tem=tem*(9/5)+32;
          System.out.println("Enter temperature value in farenheet is" + tem);// Temperature is  in Fahrenheit
	
	}else if (unit == 1) {
             tem=((tem-32)*5)/9  ;
            System.out.println("Temperature is  in celcius:  " + tem);// Temperature is  in celcius
        } else {
            System.out.println("Invalid unit. Please enter 0 for Celsius or 1 for Fahrenheit.");
        }

}


}
