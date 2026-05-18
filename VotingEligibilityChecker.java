import java.util.*;
public class Voterseligibility {
    public static void main(String args[]){
       int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age : ");
        a = sc.nextInt();
        if(a < 18){
        System.out.println("You are not eligible for voting ");    
        }else{
            System.out.println("You are eligible for voting ");
            
        }
        

    }
}