import java.util.Scanner;
//SECOND PROJECT AS A BEGINNER
public class ShapeMaker {
    public static void square(Scanner scanner) {
        System.out.print("Enter the length&width: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("THE WIDTH AND LENGTH CANNOT BE ZERO!");
        } else {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }

    public static void rectangle(Scanner scanner) {
        System.out.print("Enter the width: ");
        int w = scanner.nextInt();
        System.out.print("Enter the length: ");
        int l = scanner.nextInt();

        if (w <= 0 || l <= 0) {
            System.out.println("The width or length cannot be zero!");
        } else if (w == l) {
            System.out.println("WIDTH AND LENGTH CANNOT BE EQUAL FOR A RECTANGLE.\nImma just add one in the length you've given.");
            l++;
            System.out.printf("Length is now: %d\n", l);

            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= l; j++) {
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
    }

    public static void triangle(Scanner scanner) {
        System.out.print("Do u want it center, right, left?: ");
        String triChoice = scanner.nextLine().trim().toLowerCase();

        switch (triChoice) {
            case "center":
                centerTri(scanner);
                break;
            case "right":
                rightTri(scanner);
                break;
            case "left":
                leftTri(scanner);
                break;
            default:
                System.out.println("Invalid answer!");
        }
    }

    public static void centerTri(Scanner scanner){
        System.out.print("How many rows for the centered triangle?: ");
        int c = scanner.nextInt();

        if (c <= 0) {
            System.out.println("ROWS CANNOT BE ZERO!");
        } else {
            for (int i = 1; i <= c; i++) {
                for (int j = i; j <= c; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k < i; k++) {
                    System.out.print("* ");
                }
                for (int h = 1; h <= i; h++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void rightTri(Scanner scanner){
        System.out.print("How many rows for the right sided triangle?: ");
        int le = scanner.nextInt();

        if (le <= 0) {
            System.out.println("ROWS CANNOT BE ZERO!");
        } else {
            for (int i = 1; i <= le; i++) {
                for (int j = i; j <= le; j++) {
                    System.out.print("  ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void leftTri(Scanner scanner){
        System.out.print("How many rows for the left sided triangle?: ");
        int r = scanner.nextInt();

        if (r <= 0) {
            System.out.println("ROWS CANNOT BE ZERO!");
        } else {
            for (int i = 1; i <= r; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void hourglass(Scanner scanner) {
        System.out.print("Enter how many rows: ");
        int r=scanner.nextInt();
        int n=r/2;

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for (int h=i; h<n; h++){
                System.out.print("*  ");
            }
            for (int k=i; k<=n; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("   ");
            }
            for (int h=1; h<i; h++){
                System.out.print("*  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void diamond(){
        int n=8;

        for (int i=1; i<n; i++){
            for (int j=i; j<=n; j++){
                System.out.print("   ");
            }
            for (int h=1; h<i; h++){
                System.out.print("*  ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("   ");
            }
            for (int h=i; h<n; h++){
                System.out.print("*  ");
            }
            for (int k=i; k<=n; k++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void heart(){
        int n=3;

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
                System.out.print("*  ");
            }
            for (int k=1;k<=n;k++){
                System.out.print("   ");
            }
            for (int h=1;h<=n;h++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1;j<i;j++){
                System.out.print("   ");
            }
            for (int k=i; k<=n; k++){
                System.out.print("*  ");
            }
            for (int h=1; h<=n; h++){
                System.out.print("*  ");
            }
            for (int c=i;c<=n;c++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=2; i++){
            for (int j=1; j<2; j++){
                System.out.print("   ");
            }
            for (int k=1; k<=i+1; k++){
                System.out.print("   ");
            }
            for (int h=i; h<2; h++){
                System.out.print("*  ");
            }
            for (int c=i; c<=2;c++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void house(){
        int n=3;

        for (int i=1; i<=2; i++){
            for (int j=1; j<2; j++){
                System.out.print("   ");
            }
            for (int k=i; k<=n; k++){
                System.out.print("   ");
            }
            for (int h=1; h<i; h++){
                System.out.print("*  ");
            }
            for (int c=1; c<=i;c++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=i;j<n;j++){
                System.out.print("   ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*  ");
            }
            for (int h=1; h<=n; h++){
                System.out.print("*  ");
            }
            for (int c=1;c<=i;c++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
                System.out.print("*  ");
            }
            for (int k=1;k<=n;k++){
                System.out.print("   ");
            }
            for (int h=1;h<=n;h++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void bangbang(){
        int n = 6;

        //barrel
        for (int i = 1; i <= n; i++) {
            for (int a=1; a<=i; a++){
                System.out.print("   ");
            }
            for (int b=i; b<=n-3; b++){
                System.out.print("*  ");
            }
            for (int c=1; c<=n; c++){
                System.out.print("*  ");
            }
            for (int d=1; d<=n; d++){
                System.out.print("*  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*  ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("*  ");
            }
            for (int h = i; h <= n-2; h++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

        //upper part of ammunition and trigger
        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n; a++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("|  ");
            }
            for (int b=1; b<=i-1; b++){
                System.out.print("   ");
            }
            for (int c=i; c<=n; c++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        //lower part of ammunition
        for (int i = 1; i <= n - 3; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("|  ");
            }
            System.out.println();
        }

        for (int i=1; i<=n-3; i++){
            for (int j = 1; j <= n; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.print("=  ");
            }
            System.out.println();
        }
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's make patterns using stars!");
        int shapeChoice;

        do {
            System.out.print("\nWhat pattern do you wanna make?\n1-Square\n2-Rectangle\n3-Triangle\n4-Hourglass\n5-Diamond\n6-Heart\n7-House\n8-Bangbang\n9-Exit: if you're done\nType here: ");
            shapeChoice = scanner.nextInt();
            scanner.nextLine();

            switch (shapeChoice) {
                case 1:
                    square(scanner);
                    break;
                case 2:
                    rectangle(scanner);
                    break;
                case 3:
                    triangle(scanner);
                    break;
                case 4:
                    hourglass(scanner);
                    break;
                case 5:
                    diamond();
                    break;
                case 6:
                    heart();
                    break;
                case 7:
                    house();
                    break;
                case 8:
                    bangbang();
                    break;
                case 9:
                    System.out.println("Thank you for playing with us. Come again!");
                    break;
                default:
                    System.out.println("INVALID ANSWER!");
            }

        } while (shapeChoice!=9);

        scanner.close();
    }
}
