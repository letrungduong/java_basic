public class If_else {
    public static void main (String[] args){

       /* if (điều_kiện) {
            // Code thực thi nếu điều kiện đúng
        } else {
            // Code thực thi nếu điều kiện sai
        }*/

//Ví dụ 1: if
        int number = 10;
        if(number > 0){
        System.out.println("so duong"); //so duong
        }
//Vis duj 2: if..else
        int number2 = -5;
        if(number2 > 0){
            System.out.println("so duong");
        }else{
            System.out.println("so khong hoac am"); // so khong hoac am
        }
//Ví dụ 3: if...else if...else
        int number3 = 0;
        if (number3 > 0) {
            System.out.println("so duong");
        } else if (number3 < 0) {
            System.out.println("so am");
        } else {
            System.out.println("so 0");
        }

    }
}
