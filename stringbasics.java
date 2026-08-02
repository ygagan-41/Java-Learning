import java.util.Scanner;
public class stringbasics {
    static void main(){
       String firstname="jon";
       String lastname="snow";
       System.out.println(firstname  +" "+ lastname);
       System.out.println(firstname.length());
       System.out.println(lastname.length());
       System.out.println(firstname.charAt(2));
       //string is immutable-cant be change
       //string comparable 
       if(firstname.equals(lastname)){
        System.out.println("both are equal");
       }
       else{
        System.out.println("both are not equal");
       }
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the middle name: ");
       String middlename= sc.nextLine();
       System.out.println("the value of middle name is " + middlename);
       sc.close();

    }
}
