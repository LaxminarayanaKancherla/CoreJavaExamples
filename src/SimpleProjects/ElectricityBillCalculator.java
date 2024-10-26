package SimpleProjects;

import java.util.Scanner;
public class ElectricityBillCalculator {
  public static void main(String[] args) {

   
    Scanner scan = new Scanner(System.in);

   
    System.out.print("Enter unit: ");
    int unit = scan.nextInt();

 
    double bill = calculateElectricBill(unit);

   
    System.out.println("Bill amount = " + bill);
  }

 
  public static double calculateElectricBill(int unit) {

    // tariff rates
    double fixed_price = 100;
    double rate0_100 = 6.30;
    double rate101_200 = 6.85;
    double rateMoreThan200 = 7.40;

    // calculate bill
    if(unit <= 100) {
      return fixed_price + (unit * rate0_100);
    }
    else if(unit <= 200) {
      return ( fixed_price + 
               (100 * rate0_100) + 
               (unit-100)*rate101_200 
             );
    }
    else {
      return ( fixed_price + 
              (100 * rate0_100) + 
               (100 * rate101_200) + 
               (unit-200)* rateMoreThan200 
             );
    }
  }
}
