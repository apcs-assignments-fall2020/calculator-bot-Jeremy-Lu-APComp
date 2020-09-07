//Jeremy Lu -- AP Computer Science
//Calculator_Bot
import java.math.*;
import static java.lang.Math.sqrt;
import java.util.Scanner;
class Main {
  public static int median(int a_med, int b_med, int c_med){
      int med = (a_med+b_med+c_med) / 3;
      return med;
  } //MEDIAN
  public static int multiplication(int a_mult, int b_mult){
      int mult = (a_mult*b_mult);
      return mult;
  } //MULTIPLICATION
  public static int division(int a_div, int b_div){
      int div = (a_div/b_div);
      return div;
  } //DIVISION
  public static int addition(int a_add, int b_add){
      int add = (a_add+b_add);
      return add;
  } //ADDITION
  public static int subtraction(int a_sub, int b_sub){
      int sub = (a_sub-b_sub);
      return sub;
  } //SUBTRACTION
  public static int pythagoras(int a_py, int b_py){
      int py = a_py*a_py; //couldn't use pow method
      int py_2 = b_py*b_py;
      int py_add = py+py_2;
      double f = Math.sqrt(py_add);
      int py_sqrt = (int) f; // I think it is a problem with the Math method. I'm not entirely sure how to reconvert it without producing an error message.
      return py_sqrt;
  } //PYTHAG
  public static int magnitude(int a_mag, int b_mag){
      int abs_a = (int) Math.abs(a_mag);
      int abs_b = (int) Math.abs(b_mag);
      int max_ab = (int) Math.max(a_mag, b_mag);
      return max_ab;
  } //MAGNITUDE
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    //System.out.print("What command would you like to execute? ");
    //String command = scan.next();
    String command = "";
    do{
      System.out.print("What command would you like to execute? ");
      command = scan.next();
      if(command.equals("hi")){
        System.out.println("hello");
      }
      
    } while(command.equals("division") && command.equals("multiplication") && command.equals("addition") && command.equals("subtraction") && command.equals("pythag") && command.equals("median") && command.equals("magnitude"));
    

    if (command.equals("median")){ 
      int a_med;
      System.out.println("What is your A variable? ");
      a_med = scan.nextInt();
      int b_med;
      System.out.println("What is your B variable? ");
      b_med = scan.nextInt();
      int c_med;
      System.out.println("What is your C variable? ");
      c_med = scan.nextInt();
      System.out.println(median(a_med, b_med, c_med));
    }
    if (command.equals("multiplication")){
      int a_mult;  
      System.out.println("What is your A variable? ");
      a_mult = scan.nextInt();
      int b_mult;
      System.out.println("What is your B variable? ");
      b_mult = scan.nextInt();
      System.out.println(multiplication(a_mult, b_mult));
    }
    if (command.equals("addition")){
      int a_add;  
      System.out.println("What is your A variable? ");
      a_add = scan.nextInt();
      int b_add;
      System.out.println("What is your B variable? ");
      b_add = scan.nextInt();
      System.out.println(addition(a_add, b_add));
    }
    if (command.equals("division")){ 
      int a_div;  
      System.out.println("What is your A variable? ");
      a_div = scan.nextInt();
      int b_div;
      System.out.println("What is your B variable? ");
      b_div = scan.nextInt();
      System.out.println(division(a_div, b_div));
    }
    if (command.equals("subtraction")){ 
      int a_sub;  
      System.out.println("What is your A variable? ");
      a_sub = scan.nextInt();
      int b_sub;
      System.out.println("What is your B variable? ");
      b_sub = scan.nextInt();
      System.out.println(subtraction(a_sub, b_sub));
    }
    if (command.equals("pythag")){ 
      int a_py;  
      System.out.println("What is your A variable? ");
      a_py = scan.nextInt();
      int b_py;
      System.out.println("What is your B variable? ");
      b_py = scan.nextInt();
      System.out.println(pythagoras(a_py, b_py));
    }
    if (command.equals("magnitude")){ 
      int a_mag;  
      System.out.println("What is your A variable? ");
      a_mag = scan.nextInt();
      int b_mag;
      System.out.println("What is your B variable? ");
      b_mag = scan.nextInt();
      System.out.println(magnitude(a_mag, b_mag));
    }
    }
	}
//NOTE: I tested this code in repl.it and it worked fine. I'm not entirely sure why it isn't translating well into GitPod