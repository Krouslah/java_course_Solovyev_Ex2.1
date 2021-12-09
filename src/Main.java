public class Main {
        public static void main (String[] args) {
            int[] array = {3,22,1,13,4,6,16,5};
//        for (int i=0; i< array.length;i++)
//            if (array[i]%2==0) System.out.print(array[i] + " "); // вывод четных числе в массиве

            for (int j : array) if (1 <= j / 10) System.out.print(j + " "); // вывод двузначных чисел

//        int maxValue=array[0]; int j = 0;
//        for (int i=1; i< array.length;i++)
//            if (array[i] >= j) j=array[i];
//        System.out.print(j); // поиск наибольшего значения в массиве

//        int sum = 0;
//        for (int i=0; i< array.length;i++)
//            sum = sum + array[i];
//        System.out.print(sum); // сумма всех элментов
        }
    }

