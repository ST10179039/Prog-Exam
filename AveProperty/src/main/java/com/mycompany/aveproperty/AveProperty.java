

package com.mycompany.aveproperty;


public class AveProperty {

    public static void main(String[] args) { // variables required for calculations
            int total=0,total2=0,total3=0,tt=0,tt2=0,tt3=0;
            int PropertPrices[][]={{800000,1500000,2000000},{700000,1200000,1600000},{750000,1300000,1800000}};
              String Provinces[]={" Gauteng", " Natal"," Cape"};

            System.out.println("************************************************");
          
System.out.println("************************************************");
            System.out.println(" \t\tFLAT " + "   " + "\tTOWNHOUSE " + " \tHOUSE ");
            // printing each devices sales
                System.out.print(Provinces[0]+ "\t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print("R"+PropertPrices[0][j]+" \t");
                                // calculating total property prices for Gauteng
                                total=total+PropertPrices[0][j];
                        }
                    System.out.println(total);

                System.out.print( "  "+Provinces[1]+ "\t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print("R"+PropertPrices[1][j]+" \t");
                            // calculating total property prices for natal
                                total2=total2+PropertPrices[1][j];
                        }
                    System.out.println(total2);
                System.out.print("   "+Provinces[2] + "\t");
                    for(int j=0;j<=2;j++)
                        {
                            System.out.print("R"+PropertPrices[2][j]+" \t");
                            // calculating total property prices for Cape
                                total3=total3+PropertPrices[2][j];
                        }
                    System.out.println(total3);
            System.out.println("*************************************************");
// calculating per month total sales
        for(int j=0;j<=2;j++)
                tt=tt+PropertPrices[j][0];
        for(int j=0;j<=2;j++)
                tt2=tt2+PropertPrices[j][1];
        for(int j=0;j<=2;j++)
               tt3=tt3+PropertPrices[j][2];

            System.out.println("\n");
            System.out.println("Average property prices in Gauteng = R"+ total/3);
            System.out.println("Average property prices in Natal = R"+ total2/3);
            System.out.println("Average property prices in Cape = R"+ total3/3);
            System.out.println("**************************************************");
}// end of main
}// end of class
        
    

