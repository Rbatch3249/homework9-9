import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

public static void Grills(int price, double discount){

    System.out.println(price * discount);


}
public static void greetUser(String loggedInUser){
    System.out.println("Hello " + loggedInUser);
}



    public static void main(String[] args) {
int dice = 12;
String roll = (dice > 6) ? "No game" : "you win";
        System.out.println(roll);

 int holidays = 2;
 switch (holidays){
     case 1:
         System.out.println("Merry Christmas");
         break;
     case 2:
         System.out.println("Happy fucking Newyear");
         break;
     default:
         System.out.println("Happy holidays");
 }
 int x =1;
 while(x<45){
     System.out.println(x);
     x++;
 }
 for(int i = 1; i<=3; i++){
     System.out.println("outer loop i" +i);
     for(int j = 1; j <=3; j++){
         System.out.println("inner loop j"+ j);
     }
     System.out.println();
 }
String[] rides = {"Tesla", "Rolls Royce", "Aston Martin"};
 for(String e:  rides){
     System.out.println(e);
 }
 for(int p = 1; p<6;p++){
     if(p ==4){
         break;
     }
     System.out.println("Loop "+p+" times");
 }
 int z =1;
 while(z<6){
     if(z ==3){
         z++;
         continue;
     }
     System.out.println(z);
     z++;
 }
 String user = "Mr. President";
 greetUser(user);
        Grills(100,.25);
    }


}
