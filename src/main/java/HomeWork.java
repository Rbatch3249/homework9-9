import java.util.Scanner;

public class HomeWork {
    public static void Toasters(int price, double discount) {//Question2
        System.out.println(price * discount);
    }

    public int lengthOfStringMethod(String x) {//Question 3

        return 0;
    }

    public static int square() {//Question 4
        int y = 12;
        return y * y;
    }
public static double circumferenceOfACircle(){//Question 10
        Scanner scan = new Scanner(System.in);
    System.out.println("Radius");
    double radius = scan.nextDouble();
    double pie = Math.PI;
    return radius * 2 * pie;
}
    public static void main(String[] args) {
        String passWord = "honey";//Question 1
        Scanner userInput = new Scanner(System.in);
        int maxAttemps = 5;
        int attempts = 1;
        String password = "";
        while (maxAttemps-- > 0 && !passWord.equals(password)) {
            System.out.println("Enter your password: ");
            password = userInput.nextLine();
            if (password.equals(passWord)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Incorrect. Try again");
                System.out.println("Attempt: " + attempts);
                attempts++;

            }


        }
        Toasters(100, .25);//Question2
        System.out.println(square());//Question4
        int c = 10;//Qestion5
        while (c > 1) {
            if (c == 5) {
                    c--;
                    break;
                }
                System.out.println(c);
                c--;
            }


        Scanner scan = new Scanner(System.in);//Question 6
        System.out.println("Input Grade");
        int Grade = scan.nextInt();
        if (Grade >= 90) {
            System.out.println("you got an A");
        }
        if (Grade < 89) {
            System.out.println("you got a B");
        }
        if (Grade < 79) {
            System.out.println("you got a C");
        }
        if (Grade < 69) {
            System.out.println("you got a D");
        }
        if (Grade < 59) {
            System.out.println("you got a F");
        }



    String[] artists = {"Rezz", "Griz", "Seven Lions", "DeathPact", "Kompany"};//Question 8
    for(int r = 0; r < artists.length; r++){
        System.out.println(artists[r]);
    }

        //Question 9 is the same as Question 5
        System.out.println(circumferenceOfACircle());//Question10


        for(int p =45; p>=0; p-- ){ //Question 7
            if(p%3 ==0 && p %5==0){
                System.out.println("Year Up");
            }
           else if(p%3 == 0){
                System.out.println("Year");
            }
           else if(p%5 ==0){
                System.out.println("Up");
            }

            else System.out.println(p);
        }
    }


}