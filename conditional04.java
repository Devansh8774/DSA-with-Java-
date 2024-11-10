
// import java.util.Scanner;

// public class conditional04 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int age = sc.nextInt();


//         if (age>18){
//             System.out.println("adult");

//         }else{
//             System.out.println("not adult");
//         }
//     }
// }


// cheq number is even or odd 
// import java.util.Scanner;
// public class conditional04 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner (System.in);
//         int x = sc.nextInt();


//         if (x%2==0){
//             System.out.println("even ");

//         }else{
//             System.out.println("odd");
//         }
//     }
// }

/// cheq which number is greater 
// import java.util.*;
// public class conditional04 {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int a = sc.nextInt();
//             int b = sc.nextInt();

//             if (a ==b){
//                 System.out.println("equal");

//             }else{
//                 if(a>b){
//                     System.out.println(" a is greater");

//                 }else{
//                     System.out.println(" a is lesser");
//                 }
//             }


//         }
// }

/// if , elseif statements 
// import java.util.*;
// public class conditional04 {
//          public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);
//             int button = sc.nextInt();

//             if(button == 1){
//                 System.out.println("Hello");

//             }else if(button ==2 ){
//                 System.out.println("Nameste");

//             }else if (button == 3){
//                 System.out.println("Bonjour");

//             }else{
//                 System.out.println("Invalid button ");
//             }


//     }

// }

// Switch statements 
import java.util.*;
public class conditional04 {
         public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int button = sc.nextInt(); 

            switch(button){
                case 1:System.out.println("Hello");
                break;
                case 2:System.out.println("Nameste");
                break;
                case 3: System.out.println("bonjour");
                break;
                default: System.out.println("Invalid Syntax ");

        
        }
}
}
 
