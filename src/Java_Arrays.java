public class Java_Arrays {
    public static void main(String[] args) {
       String[] cars;
       String[] cars2 ={"Volvo", "BMW", "Ford", "Mazda"};
       int[] myNum={10, 20, 30, 40};

       //access the element of an array
        System.out.println (cars2[0]);

        //change an array element
        cars2[0]="Opel";
        System.out.println(cars2[0]);

        // array length
        System.out.println(cars2.length);

    }
}
