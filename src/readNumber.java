import java.util.Scanner;

public class readNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = scanner.nextInt();

        if (number < 10 && number >=0){
            switch (number){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:System.out.println("Out of ability");
            }}
            if (number>10&&number<20){
                int ones = number%10;
                switch (ones){
                    case 1:
                        System.out.println("Eleven");
                        break;
                    case 2:
                        System.out.println("Twelve");
                        break;
                    case 3:
                        System.out.println("Thirteen");
                        break;
                    case 4:
                        System.out.println("Fourteen");
                        break;
                    case 5:
                        System.out.println("Fifteen");
                        break;
                    case 6:
                        System.out.println("Sixteen");
                        break;
                    case 7:
                        System.out.println("Seventeen");
                        break;
                    case 8:
                        System.out.println("Eighteen");
                        break;
                    case 9:
                        System.out.println("Nineteen");
                        break;
                }
            }
            if (number>=20&&number<100){
                int tens = number/10;
                int ones = number%10;

               switch (tens){
                   case 2:
                       System.out.print("Twenty");
                       break;
                   case 3:
                       System.out.print("Thirty");
                       break;
                   case 4:
                       System.out.print("Forty");
                       break;
                   case 5:
                       System.out.print("Fifty");
                       break;
                   case 6:
                       System.out.print("Sixty");
                       break;
                   case 7:
                       System.out.print("Seventy");
                       break;
                   case 8:
                       System.out.print("Eighty");
                       break;
                   case 9:
                       System.out.print("Ninety");
                       break;
               }
               switch (ones){
                   case 1:
                       System.out.print("one");
                       break;
                   case 2:
                       System.out.print("two");
                       break;
                   case 3:
                       System.out.print("three");
                       break;
                   case 4:
                       System.out.print("four");
                       break;
                   case 5:
                       System.out.print("five");
                       break;
                   case 6:
                       System.out.print("six");
                       break;
                   case 7:
                       System.out.print("seven");
                       break;
                   case 8:
                       System.out.print("eight");
                       break;
                   case 9:
                       System.out.print("nine");
                       break;
               }
            }

                int hundreds = number/100;
                int tens = (number/10)%10;
                int ones = number%10;
        if (number>=100&&number<1000){
                switch (hundreds){
                    case 1:
                        System.out.print("One hundred and ");
                        break;
                    case 2:
                        System.out.print("Two hundred and ");
                        break;
                    case 3:
                        System.out.print("Three hundred and ");
                        break;
                    case 4:
                        System.out.print("Four hundred and ");
                        break;
                    case 5:
                        System.out.print("Five hundred and ");
                        break;
                    case 6:
                        System.out.print("Six hundred and ");
                        break;
                    case 7:
                        System.out.print("Seven hundred and ");
                        break;
                    case 8:
                        System.out.print("Eight hundred and ");
                        break;
                    case 9:
                        System.out.print("Nine hundred and ");
                        break;
                }
                    switch (tens){
                        case 1:
                            if (ones==1) System.out.println("eleven");
                            if (ones==2) System.out.println("twelve");
                            if (ones==3) System.out.println("thirteen");
                            if (ones==4) System.out.println("fourteen");
                            if (ones==5) System.out.println("fifteen");
                            if (ones==6) System.out.println("sixteen");
                            if (ones==7) System.out.println("seventeen");
                            if (ones==8) System.out.println("eighteen");
                            if (ones==9) System.out.println("nineteen");
                        case 2:
                            System.out.print("Twenty ");
                            break;
                        case 3:
                            System.out.print("Thirty ");
                            break;
                        case 4:
                            System.out.print("Forty ");
                            break;
                        case 5:
                            System.out.print("Fifty ");
                            break;
                        case 6:
                            System.out.print("Sixty ");
                            break;
                        case 7:
                            System.out.print("Seventy ");
                            break;
                        case 8:
                            System.out.print("Eighty ");
                            break;
                        case 9:
                            System.out.print("Ninety ");
                            break;
                    }
                switch (ones){
                    case 1:
                        System.out.print("one");
                        break;
                    case 2:
                        System.out.print("two");
                        break;
                    case 3:
                        System.out.print("three");
                        break;
                    case 4:
                        System.out.print("four");
                        break;
                    case 5:
                        System.out.print("five");
                        break;
                    case 6:
                        System.out.print("six");
                        break;
                    case 7:
                        System.out.print("seven");
                        break;
                    case 8:
                        System.out.print("eight");
                        break;
                    case 9:
                        System.out.print("nine");
                        break;
                }
            }
    }
}

