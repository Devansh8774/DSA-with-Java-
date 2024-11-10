// public class Array {
//     public static void main(String[] args) {
//         int[] marks =new int[3];
//         marks[0]=97;
//         marks[1]=98;
//         marks[2]=95;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);

//         for(int i=0;i<3;i++){
//             System.out.println(marks[i]);

//         }
        
//     }
// }


// Make a array by taking user as an input.....

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size =sc.nextInt();
        
//         int numbers[] =new int[size];

//         // input
//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }
//         // output
//         for(int i=0;i<size;i++){
//             System.out.println(numbers[i]);

//         }

//     }
// }


//take an array as input from the user.Search for a Given number X and print the index at which it occurs.


// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size =sc.nextInt();
        
//         int numbers[] =new int[size];

//         // input
//         for(int i=0;i<size;i++){
//             numbers[i]=sc.nextInt();
//         }

//         int x = sc.nextInt();
//         // output
//         for(int i=0;i<numbers.length;i++){
//             if(numbers[i]==x){
//                 System.out.println("x found at index :"+ i);
//             }
            

//         }


//     }
// }

// Two D-array..

// import java.util.Scanner;
// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols]; 

//         // input 
//         for(int i=0;i<rows;i++){
//             //columns
//             for(int j=0;j<cols;j++){
//                 numbers[i][j]= sc.nextInt();
//             }
//         }

//         //output
//         for(int i=0;i<rows;i++){
//             for(int j=0;j<cols;j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//              System.out.println();
//         }
//     }

// }
