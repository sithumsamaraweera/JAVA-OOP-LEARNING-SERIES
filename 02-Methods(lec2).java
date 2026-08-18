/*THIS IS A EXAMPLE FOR PARAMETERIZED METHOD IN JAVA,FALLOWING CODE BLOCK PERFORMC ALCULATE AREA OF A REGTANGLE  BY GETTING
USRE INPUT (WITDTH AND LENGTH) AND
*/
import java.util.Scanner;// UTILITY FILE
public class parameeter {
    public static void Area(int Hight,int wight){//CREATING PARAMETERS
        Scanner input=new Scanner(System.in);//CREATING SCANNNER OBJECT
        System.out.print("Enter HIGHT OF THE RECTANGALE: ");// ASKIN FOR INPUT
        Hight= input.nextInt();//TAKING INPUT VALUE FOR HIGHT
        System.out.print("ENTER WHIDTH FOR THE REGTANGLE: ");
        wight=input.nextInt();

        int Area= Hight*wight;// CALCULATION ON INPUTS
        System.out.print("THE AREA OF YOUR RECTANGE IS ="+Area);//SHOWING OUTPUT


    }
    public static void main(String[] args){
        Area(0,0);
    }
}