import java.util.Scanner;

public class PatternPrinter {

    public static void main(String[] args) {
        System.out.println("Enter your string:");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toUpperCase();

        for (int i = 0; i < 7; i++) {

            for (int k = 0; k < word.length(); k++) {

                char ch = word.charAt(k);

                switch (ch) {
                    case 'A':
                        printA(i);
                        break;
                    case 'B':
                        printB(i);
                        break;
                    case 'C':
                        printC(i);
                        break;
                    case 'D':
                        printD(i);
                        break;
                    case 'E':
                        printE(i);
                        break;
                    case 'M':
                        printM(i);
                        break;
                    case 'N':
                        printN(i);
                        break;
                    case 'G':
                        printG(i);
                        break;
                    case 'F':
                        printF(i);
                        break;
                    case 'H':
                        printH(i);
                        break;
                    case 'I':
                        printI(i);
                        break;
                    case 'J':
                        printJ(i);
                        break;
                    case 'K':
                        printK(i);
                        break;
                    case 'L':
                        printL(i);
                        break;
                    case 'O':
                        printO(i);
                        break;
                    case 'P':
                        printP(i);
                        break;
                    case 'Q':
                        printQ(i);
                        break;
                    case 'R':
                        printR(i);
                        break;
                    case 'S':
                        printS(i);
                        break;
                    case 'T':
                        printT(i);
                        break;
                    case 'U':
                        printU(i);
                        break;
                    case 'V':
                        printV(i);
                        break;
                    case 'W':
                        printW(i);
                        break;
                    case 'X':
                        printX(i);
                        break;
                    case 'Y':
                        printY(i);
                        break;
                    case 'Z':
                        printZ(i);
                        break;    
  
                    case ' ':
                        System.out.print("     ");
                        break;
                }

                System.out.print("  ");
            }

            System.out.println();
        }
    }

    static void printA(int i) {
        for (int j = 0; j < 7; j++) {
            if ((j == 0 || j == 6) && i != 0 ||
                    (i == 0 && j > 0 && j < 6) ||
                    (i == 3))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printM(int i) {
        for (int j = 0; j < 7; j++) {
            if (j == 0 || j == 6 ||
                    (i == j && i <= 3) ||
                    (i + j == 6 && i <= 3))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printN(int i) {
        for (int j = 0; j < 7; j++) {
            if (j == 0 || j == 6 || i == j)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printE(int i) {
        for (int j = 0; j < 5; j++) {
            if (j == 0 || i == 0 || i == 3 || i == 6)
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printG(int i) {
        for (int j = 0; j < 7; j++) {
            if ((i == 0 && j > 0) ||
                    (i == 6 && j > 0 && j < 6) ||
                    (j == 0 && i > 0 && i < 6) ||
                    (j == 6 && i >= 3 && i < 6) ||
                    (i == 3 && j >= 3))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printB(int i) {
        for (int j = 0; j < 7; j++) {
            if (j == 0 ||
                    (j == 6 && i != 0 && i != 3 && i != 6) ||
                    ((i == 0 || i == 3 || i == 6) && j < 6))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printC(int i) {
        for (int j = 0; j < 7; j++) {
            if ((i == 0 || i == 6) && j > 0 ||
                    (j == 0 && i > 0 && i < 6))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }

    static void printD(int i) {
        for (int j = 0; j < 7; j++) {
            if (j == 0 ||
                    (j == 6 && i > 0 && i < 6) ||
                    ((i == 0 || i == 6) && j < 6))
                System.out.print("*");
            else
                System.out.print(" ");
        }
    }
    static void printF(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 || i == 0 || i == 3)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printH(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 || j == 6 || i == 3)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printI(int i) {
    for (int j = 0; j < 7; j++) {
        if (i == 0 || i == 6 || j == 3)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printJ(int i) {
    for (int j = 0; j < 7; j++) {
        if (i == 0 || j == 3 || (i == 6 && j < 4) || (j == 0 && i > 4))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printK(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 || i + j == 3 || i - j == 3)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printL(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 || i == 6)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printO(int i) {
    for (int j = 0; j < 7; j++) {
        if (((i == 0 || i == 6) && j > 0 && j < 6) ||
            ((j == 0 || j == 6) && i > 0 && i < 6))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printP(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 ||
            (i == 0 && j < 6) ||
            (i == 3 && j < 6) ||
            (j == 6 && i > 0 && i < 3))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}
static void printQ(int i) {
    for (int j = 0; j < 7; j++) {
        if (((i == 0 || i == 5) && j > 0 && j < 6) ||
            ((j == 0 || j == 6) && i > 0 && i < 5) ||
            (i == 6 && j == 5) ||
            (i == 5 && j == 4))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printR(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 ||
            (i == 0 && j < 6) ||
            (i == 3 && j < 6) ||
            (j == 6 && i > 0 && i < 3) ||
            (i - j == 0 && i > 3))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printS(int i) {
    for (int j = 0; j < 7; j++) {
        if ((i == 0 || i == 3 || i == 6) ||
            (j == 0 && i > 0 && i < 3) ||
            (j == 6 && i > 3 && i < 6))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printT(int i) {
    for (int j = 0; j < 7; j++) {
        if (i == 0 || j == 3)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printU(int i) {
    for (int j = 0; j < 7; j++) {
        if ((j == 0 || j == 6) && i < 6 ||
            (i == 6 && j > 0 && j < 6))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printV(int i) {
    for (int j = 0; j < 7; j++) {
        if ((j == i && i > 3) ||
            (i + j == 6 && i > 3) ||
            (j == 0 && i <= 3) ||
            (j == 6 && i <= 3))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printW(int i) {
    for (int j = 0; j < 7; j++) {
        if (j == 0 || j == 6 ||
            (i >= 3 && (i == j || i + j == 6)))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printX(int i) {
    for (int j = 0; j < 7; j++) {
        if (i == j || i + j == 6)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printY(int i) {
    for (int j = 0; j < 7; j++) {
        if ((i <= 3 && (i == j || i + j == 6)) ||
            (i > 3 && j == 3))
            System.out.print("*");
        else
            System.out.print(" ");
    }
}

static void printZ(int i) {
    for (int j = 0; j < 7; j++) {
        if (i == 0 || i == 6 || i + j == 6)
            System.out.print("*");
        else
            System.out.print(" ");
    }
}
}