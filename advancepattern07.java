


// public class advancepattern07 {
//     public static void main(String[] args) {
//         int n =5;
//         // upper half of butterfly

//         for (int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             int spaces = 2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }

//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         // lower half of butterfly

//         for (int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }

//             int spaces = 2*(n-i);
//             for(int j=1;j<=spaces;j++){
//                 System.out.print(" ");
//             }

//             for (int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
        
//     }
// }
// }

// print the solid Rohombus pattern.
// public class advancepattern07 {
//         public static void main(String[] args) {
//             int n =5;
//             for(int i=1;i<=n;i++){
//                 for(int j=1;j<=n-i;j++){
//                     System.out.print(" ");

//                 }
//                 for (int j=1;j<=5;j++){
//                     System.out.print("*");

//                 }
//                 System.out.println();
//             }
//         }
//     }

// print the number of pyramid 
// public class advancepattern07 {
//     public static void main(String[] args) {
//         int n =5;

//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");

//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print(i+" ");
//             }
//             System.out.println();
//         }
//     }
// }

// palindromic sequence.

// public class advancepattern07 {
//         public static void main(String[] args) {
//              int n =5;

//              for (int i=1;i<=n;i++){
//                 for(int j=i;j<=n-1;j++){
//                     System.out.print(" ");
//                 }

//                 for(int j=i;j>=1;j--){
//                     System.out.print(j);
//                 }

//                 for(int j=2;j<=i;j++){
//                     System.out.print(j);
//                 }
//                 System.out.println();
//              }
//         }
// }

// Diamond pattern 
public class advancepattern07 {
    public static void main(String[] args) {
        int n =5;

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            for (int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
    }
}
}