package homework02;

   public class Main {

       private static void zadanie1(int[] array) {
           int[] arr;
           arr = new int[10];
           arr[0] = 0;
           arr[1] = 0;
           arr[2] = 1;
           arr[3] = 0;
           arr[4] = 0;
           arr[5] = 1;
           arr[6] = 1;
           arr[7] = 1;
           arr[8] = 0;
           arr[9] = 1;
           for (int i = 0; i < 10; i++) {
               if (arr[i] == 0)
                   System.out.println(1);
               else
                   System.out.println(0);


           }
       }
   }
       private static void zadanie3(int[] arrray) {
           int[] arr;
           arr = new int[12];
           arr[0] = 1;
           arr[1] = 5;
           arr[2] = 3;
           arr[3] = 2;
           arr[4] = 11;
           arr[5] = 4;
           arr[6] = 5;
           arr[7] = 2;
           arr[8] = 4;
           arr[9] = 8;
           arr[10] = 9;
           arr[11] = 1;
           for (int i = 0; i < 12; i++) {
               if (arr[i] < 6)
                   System.out.println(arr[i] * 2);
           }
       }
       public static void main(int[] arrray) {
           int[] arr;
           arr = new int[4];
           arr[0] = 1;
           arr[1] = 5;
           arr[2] = 3;
           arr[3] = 2;
           for (int i = 0; i < 4; i++) {
               if (arr[i] >= arr[i])
                   System.out.println(arr[i] + "Максимальное");
                   else (arr[i] <= arr[i])
               System.out.println(arr[i] + "Минимальное");
           }
       }
   }



