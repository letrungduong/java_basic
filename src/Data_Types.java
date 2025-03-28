
//Class
class Person{
    String name;
    int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void Display(){
        System.out.println("name" + name + ", age: " + age);
    }
}


public class Data_Types {
    public static void main(String[] args) {
        //Example
        int myNum = 5;
        float myFloat = 5.99f;
        char myLetter = 'D';
        String myText = "HELLO";

//Primitive data types
        // Integer Types (kiểu số nguyên)
        byte a = 10;          //so nguyen 8-bit                (-128 to 127)
        short b = 200;        //so nguyen 16-bit               (-32768 to 32767)
        int c = 100000;       //so nguyen 32-bit               (-2147483648 to 2147483647)
        long d = 123456789L;  //so nguyen 64-bit(add L last)   (-9223372036854775808 to 9223372036854775807)
        // Floating Point Types (kiểu số thực)
        float e = 5.75f;      //so thuc 32-bit(add f last)
        double f = 19.99;     //so thuc 64-bit
        // Character type
        char g = 'J';         //Mot ky tu unicode
        //kieu boolean
        boolean h = true;     //only value true/false
        // kieu String
        String message = "Hello";

        // Display screen
        System.out.println("Byte: " + a);
        System.out.println("Short: " + b);
        System.out.println("Int: " + c);
        System.out.println("Long: " + d);
        System.out.println("Float: " + e);
        System.out.println("Double: " + f);
        System.out.println("Char: " + g);
        System.out.println("Boolean: " + h);
        System.out.println("String: " + message);


//Non_Primitive data types
        // String
        String message2 = "Hello";
        System.out.println(message2);
        System.out.println("length:" + message2.length());
        System.out.println("upper case:" + message2.toUpperCase());
        System.out.println("lower case:" + message2.toLowerCase());

        // Array
        int[] numbers = {1,2,3,4,5};
        System.out.println("element first: " + numbers[0]); // element first: 1
        // loop element
        System.out.println("cac phan tu:");
        for(int num: numbers){
            System.out.println(num + "");  // elements: 1 2 3 4 5
        }
        // Class
        Person person = new Person("duong", 25);
        person.Display();



        // Interface
        // Collections(List,set,map)
    }
}
