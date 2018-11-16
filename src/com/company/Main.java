package com.company;

public class Main {
    public static void main(String[] args) {
        one(5);
        two(60, 80, 6000, 30);
        three(5, 8, 2);
        four(-5);
        five(10, 20, 30);
        fiveNew(10,20,30);
        six(-7);
        seven(4, 8);
        eight(5, 6, 41);
        nine(2, 5, 2, 2);
        ten(9);
        eleven(7);
        twelve(8);
        thirteen(3, 8);
        fourteen(4, 8);
        fifteen(15);
        sixteen(100, 15);
        seventeen(17);
        eighteen(9876);
        nineteen(5, 15);
    }

    public static int one(int side) {

        System.out.println("one: " + side * side);
        return side * side;
    }

    public static void two(int V1, int V2, int S, int T) {
        int Distance = Math.abs(S - ((V1 + V2) * T));
        System.out.println("two: " + Distance);
    }

    public static void three(int A, int B, int C) {
        if (A == 0) {
            System.out.println("three: Write other number");
            return;
        }
        int D = B * B - 4 * A * C;
        double X1 = (-B + Math.sqrt(D)) / (2 * A);
        double X2 = (-B - Math.sqrt(D)) / (2 * A);
        System.out.println("three: " + X1 + " " + X2);
    }

    public static void four(int T) {
        if (T > 0) {
            System.out.println("four: " + (T + 1));
        } else if (T < 0) {
            System.out.println("four: " + (T - 2));
        } else System.out.println("four: " + 10);
    }

    public static void five(int a1, int a2, int a3) {
        int max1 = 0;
        int max2 = 0;
        if (a1 > a2) {
            if (a1 > a3) {
                max1 = a1;
                if (a2 > a3) {
                    max2 = a2;
                } else {
                    max2 = a3;
                }
            } else {
                max1 = a3;
                max2 = a1;
            }
        } else if (a2 > a1) {
            if (a2 > a3) {
                max1 = a2;
                if (a1 > a3) {
                    max2 = a1;
                } else {
                    max2 = a3;
                }
            } else {
                max1 = a3;
                max2 = a2;
            }
        }
        System.out.println("five: " + (max1 + max2));

    }

    public static void fiveNew(int a1, int a2, int a3) {
        int max1 = 0;
        int max2 = 0;
        if (a1 > a2 && a1 > a3) {
            max1 = a1;
            if (a2 > a3){
                max2 = a2;
            }
            else {
                max2 = a3;
            }
        } else if (a2 > a1 && a2 > a3) {
            max1 = a2;
            if (a1 > a3){
                max2 = a1;
            }
            else{
                max2 = a3;
            }
        } else {
            max1 = a3;
            if (a1 > a2){
                max2 = a1;
            }
            else{
                max2 = a2;
            }
        }
        System.out.println("five: " + (max1 + max2));
    }

    public static void six(int A) {
        if (A == 0) {
            System.out.println("six: Zero number");
        } else if (A > 0) {
            if ((A % 2) == 0) {
                System.out.println("six: Positive even number");
            } else {
                System.out.println("six: Positive odd number");
            }
        } else {
            if ((A % 2) == 0) {
                System.out.println("six: Negative even number");
            } else {
                System.out.println("six: Negative odd number");
            }
        }
    }

    public static void seven(int A, int B) {
        if (A < 2 && B >= 3) {
            System.out.println("seven: " + true);
        } else {
            System.out.println("seven: " + false);
        }
    }

    public static void eight(int A, int B, int C) {
        boolean FT;
        if (A < B && B < C) {
            FT = true;
        } else {
            FT = false;
        }
        System.out.println("eight: " + FT);
    }

    public static void nine(int A, int B, int C, int D) {
        if (A != B && A != C && A != D) {
            System.out.println("nine: tne first number");
        } else if (B != A && B != C && B != D) {
            System.out.println("nine: tne second number");
        } else if (C != A && C != B && C != D) {
            System.out.println("nine: tne third number");
        } else {
            System.out.println("nine: tne fourth number");
        }
    }

    public static void ten(int K) {
        //switch
        if (K == 1) {
            System.out.println("ten: bad");
        } else if (K == 2) {
            System.out.println("ten: not very bad");
        } else if (K == 3) {
            System.out.println("ten: not bad");
        } else if (K == 4) {
            System.out.println("ten: good");
        } else if (K == 5) {
            System.out.println("ten: exelent!");
        } else {
            System.out.println("ten: number is false");
        }
    }

    public static void eleven(int Month) {
        String Season = " ";
        switch (Month) {
            case 12:
            case 1:
            case 2:
                Season = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                Season = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                Season = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("eleven: " + Season);
                break;
            default:
                System.out.println("eleven: Invalid parameter!");
                return;
        }
        System.out.println("eleven: " + Season);
    }

    public static void twelve(int N) {
        int A = 55;
        int B = 33;
        switch (N) {
            case 1:
                System.out.println("twelve: " + (A + B));
                break;
            case 2:
                System.out.println("twelve: " + (A - B));
                break;
            case 3:
                System.out.println("twelve: " + (A * B));
                break;
            case 4:
                System.out.println("twelve: " + (A / B));
                break;
            default:
                System.out.println("twelve: wrong data");
        }
    }

    public static void thirteen(int A, int B) {
        int count = 0;
        System.out.print("thirteen: ");
        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
            count++;
        }
        System.out.print("\n");
        System.out.println("thirteen: count is " + count);
    }

    public static void fourteen(int A, int B) {
        int Sum = 0;
        for (int i = A; i <= B; i++) {
            Sum += i;
        }
        System.out.println("fourteen: " + Sum);
    }

    public static void fifteen(int N) {
        int Mult = 1;
        for (int i = 1; i <= N; i++) {
            Mult *= i;
        }
        System.out.println("fifteen: " + Mult);
    }

    public static void sixteen(int A, int B) {
        int C = B;
        while ((A - C) > B) {
            C += B;
        }
        System.out.println("sixteen: " + (A - C));
    }

    public static void seventeen(int N) {
        int K = 1;
        while (!((3 * K) > N)) {
            K++;
        }
        System.out.println("seventeen: " + K);
    }

    public static void eighteen(int N) {
        int D = 10;
        System.out.print("eighteen: ");
        while (N % D != 0) {
            int T = N % D;
            System.out.print(T + " ");
            N = (N - T) / D;
        }
        System.out.print("\n");
    }

    public static void nineteen(int A, int B) {
        System.out.print("nineteen: ");
        for (int i = A; i <= B; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}

