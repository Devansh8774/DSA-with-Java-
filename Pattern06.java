// print the pattern 
//*****
//*****
//*****
//*****
// public class Pattern06 {
//     public static void main(String[] args) {
//         int n =4;
//         int m =5;

//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }


// Print the pattern 
// *********
// *       *
// *       *
// *********


// public class Pattern06 {
//        public static void main(String[] args) {
//             int n =4;
//             int m =5;
            
//             // outer loop 
//             for (int i=1;i<=n;i++){
//                 // inner loop 
//                 for(int j=1;j<=m;j++){
//                     // cell ->(i,j)
//                     if(i == 1 || j ==1 || i ==n || j ==m){
//                         System.out.print("*");
//                     }else{
//                         System.out.print(" ");
//                     }
                    
//                 }
//                 System.out.println();

//             }

//        }
//     }


// print the half pyramid pattern

// public class Pattern06 {
//             public static void main(String[] args) {
//                 int n =4;

//                 // outer loop 
//                 for (int i=1;i<=n;i++){
//                     // inner loop 
//                     for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                     }
//                     System.out.println();                }
//             }
// }

// print the inverted pyramid reverse to 180 degree

// public class Pattern06 {
//     public static void main(String[] args) {
//         int n =4;

//         // outer loop 
//         for (int i = 1; i < n; i++) {
//             // inner loop -> space print
//             for (int j=1; j<=n-i;j++){
//                 System.out.print(" ");

//             }

//             // inner loop -> star print
//             for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
// }

// print the numbers on pyramid staructure 
// public class Pattern06 {
//         public static void main(String[] args) {
//         int n =5;

//         // outer loop
//         for(int i=1;i<n;i++){
//             // inner loop -> space print
//             for (int j=1;j<i;j++){
//                 System.out.print(j+" ");

//             }
           
            
//             System.out.println();
//         }
//             }
 
// }
 // floyds triangle pattern print
//  public class Pattern06 {
//     public static void main(String[] args) {
//     int n =5;
//     int number =1;

//     for(int i=1; i<=n;i++){
//         for (int j=1;j<=i;j++){
//             System.out.print(number +" ");
//             number++;

//         }
//         System.out.println();
//     }
//     }
// }

// print the 0-1 triangle 
// public class Pattern06 {
//     public static void main(String[] args) {
//     int n =8;
//     for(int i=1;i<n;i++){
//         for(int j=1;j<i;j++){
//             int sum = i+j;
//             if (sum%2==0){
//                 System.out.print("1 ");

//             }else{
//                 System.out.print("0 ");
//             }
//         }
//         System.out.println();
//     }
//     }
// }