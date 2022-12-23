package java_tutorial;

public class JavaString {
    public static void main(String[] args) {
        String str1 = "java"; // tao chuoi bang String literal
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(ch); // convert mang char thanh chuoi
        String str3 = new String("World");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String txt = "hello";
        System.out.println("The length of the txt string is: " + txt.length());

        //compare in java String
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = "mekloooo";
//        String s4 = "helo";
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.compareTo(s3));
//        System.out.println(s1.compareTo(s4));

        // concat
//        String s1 = "java string";
//        s1 = s1.concat("is immutable");
//        System.out.println(s1);
        // contain
        String name = "what do you know about me";
        System.out.println(name.contains("do"));
        //----------------------------------------------
        String targetString = "Java is fun to learn";
        String s1= "JAVA";
        String s2= "Java";
        String s3 = "  Hello Java  ";

        System.out.println("Char at index 2(third position): " + targetString.charAt(2));
        System.out.println("After Concat: "+ targetString.concat("-Enjoy-"));
        System.out.println("Checking equals ignoring case: " +s2.equalsIgnoreCase(s1));
        System.out.println("Checking equals with case: " +s2.equals(s1));
        System.out.println("Checking Length: "+ targetString.length());
        System.out.println("Replace function: "+ targetString.replace("fun", "easy"));
        System.out.println("SubString of targetString: "+ targetString.substring(8));
        System.out.println("SubString of targetString: "+ targetString.substring(8, 12));
        System.out.println("Converting to lower case: "+ targetString.toLowerCase());
        System.out.println("Converting to upper case: "+ targetString.toUpperCase());
        System.out.println("Triming string: " + s3.trim());
        System.out.println("searching s1 in targetString: " + targetString.contains(s1));
        System.out.println("searching s2 in targetString: " + targetString.contains(s2));

        char [] charArray = s2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);
        System.out.println("Printing last element of array: " + charArray[3]);

    }
}
