// import java.util.Scanner;
// public class Strings {
//     public static void main(String[] args) {
//         //String Declaration
//             // String name ="Tony";
//             // String FullName = "Tony Stark";
//             // String Sentence = "My name is tony stark.";
//         // for user input the string 
//         Scanner sc = new Scanner(System.in);
//         String name = sc.nextLine();
//         System.out.println("your name is :"+ name);


//     }
// }


// Concatenation
// public class Strings {
//     public static void main(String[] args) {
//         //concatenation
//         String FirstName ="tony";
//         String lastName ="stark";
//         String FullName =FirstName + lastName;
//         System.out.println(FullName.length());

//         //charAt(to print each caharacter one by one)
//         for(int i=0;i<FullName.length();i++){
//             System.out.println(FullName.charAt(i));


//         }
//     }
// }
// to find the length write the "".length"()on [System.out.println(FullName.length);]


// Compare
// public class Strings {
//     public static void main(String[] args) {
//         String name1="tony";
//         String name2="tony2";

//         // if(name1.compareTo(name2)==0){
//         //     System.out.println("string are equal");
//         // }else{
//         //     System.out.println("string are not equal");
//         // }


//         if(name1==name2){
//             System.out.println("string are equal");
//         }else{
//             System.out.println("string are not equal");
//         }

//     }
// }

// extract some substrings
// public class Strings {
//         public static void main(String[] args) {
//             //compare
//             String sentence ="my name is devansh";
//             String name = sentence.substring(11,sentence.length());
//             System.out.println(name);

//         }
//     }


// StringBuilder 

// public class Strings {
//         public static void main(String[] args) {
//             StringBuilder sb = new StringBuilder("Devansh");
//             System.out.println(sb);

//             //char at index 0
//             System.out.println(sb.charAt(0));

//             //set char at index 0
//             sb.setCharAt(0,'p');
//             System.out.println(sb);


//         }
// }
   

//insert
//delete

// public class Strings {
//         public static void main(String[] args) {
//             StringBuilder sb=new StringBuilder("Devansh");
//             System.out.println(sb);

//             //insert
//             sb.insert(2,'n');
//             System.out.println(sb);

//             //delete
//             sb.delete(2,4);
//             System.out.println(sb);
//         }
// }


// Append

// public class Strings {
//         public static void main(String[] args) {
//             StringBuilder sb =new StringBuilder("h");
//             sb.append("e");
//             sb.append("l");
//             sb.append("l");
//             sb.append("0");

//             System.out.println(sb);

//         }
// }