public class Main {
    public static void main(String[] args) {
        //Задание 1
        int [] firstArray = new int [3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray [2] = 3;
        double [] secondArray = {1.57, 7.654, 9.986};
        int [] thirdArray = {12, 16, 19};
        //Задание 2
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if( i != firstArray.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i != secondArray.length - 1){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i != thirdArray.length - 1 ){
                System.out.print(",");
            }
        }
        System.out.println();
        //Задача 3
        for (int i = firstArray.length - 1; i >= 0; i--) {
            System.out.print(firstArray[i]);
            if( i != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i != 0){
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i != 0 ){
                System.out.print(",");
            }
        }
        System.out.println();
        //Задача 4
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 == 1){
                firstArray[i]++;
            }
            System.out.print(firstArray[i]);
            if( i != firstArray.length - 1){
                System.out.print(",");
            }
        }

    }
}