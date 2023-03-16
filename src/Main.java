import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задание 1");
        System.out.print("Числа от 1 до 100 кратные 3 и 7: ");
       for(int i=1;i<=100;i++){
           if(i%3==0 && i%7==0){
               System.out.print(i+", ");
           }
       }
        System.out.println();
        System.out.println("_______________________________________");
        System.out.println("Задание 2");
        System.out.print("Введите первое число: ");
        int numA = in.nextInt();
        System.out.print("Введите второе число: ");
        int numB = in.nextInt();
        int secondeTaskSum = 0;
        if(numA>numB){
            int vrNumB = numB;
            for(;numB<=numA;numB++){
                secondeTaskSum+=numB;
            }
            System.out.println("Сумма чисел от "+vrNumB+" до "+numA+" ,включительно, равняется: "+secondeTaskSum+".");
        }else if(numA<numB){
            int vrNumA = numA;
            for(;numA<=numB;numA++){
                secondeTaskSum+=numA;
            }
            System.out.println("Сумма чисел от "+vrNumA+" до "+numB+" ,включительно, равняется: "+secondeTaskSum+".");

        }else {
            System.out.println("Вы ввели два одинаковых числа "+numA+", их сумма равна "+numA*2+".");
        }
            System.out.println(" ");
            System.out.println("_______________________________________");
            System.out.println("Задание 3");
            System.out.print("Введите число которое не заканчивается на 0: " );
            int num3A = in.nextInt();
            int temporaryNum3A =num3A;
           int num3K;
            temporaryNum3A%=10;
            if(temporaryNum3A != 0) {
                temporaryNum3A =num3A;
                System.out.print("Число "+temporaryNum3A+" в обратном порядке: ");
                while (num3A > 0) {
                num3K=num3A%10;
                System.out.print(num3K);
                num3A/=10;
                }

            }else{
                System.out.println("Попробуйте еще раз. Нужно ввести число которое не заканчивается на 0");
            }

            System.out.println(" ");
            System.out.println("_______________________________________");
            System.out.println("Задание 4");
            System.out.print("Введите число которое не заканчивается на 0: " );
            int num4A = in.nextInt();
            int temporaryNum4A =num4A;
            boolean textWritten1 = false , textWritten2 = false;
           int num4K;
            temporaryNum4A%=10;
            if(temporaryNum4A != 0) {
                int temporaryNum4A1 =temporaryNum4A =num4A;
                while (num4A > 0) {
                    num4K = num4A % 10;
                    if (num4K % 2 == 0) {
                        if (!textWritten1) {
                            System.out.print("Четные цифры числа " + temporaryNum4A1 + " :");
                            textWritten1 = true;
                        }
                        System.out.print(num4K);
                    }
                    num4A /= 10;
                }
                    while (temporaryNum4A > 0) {
                        num4K = temporaryNum4A % 10;
                        if (temporaryNum4A % 2 != 0) {
                            if (!textWritten2) {
                                System.out.println();
                                System.out.print("Нечетные цифры числа " + temporaryNum4A1 + " :");
                                textWritten2 = true;
                            }
                            System.out.print(num4K);
                        }
                        temporaryNum4A /= 10;
                    }


            }else{
                System.out.println("Попробуйте еще раз. Нужно ввести число которое не заканчивается на 0");
            }



        }
}
