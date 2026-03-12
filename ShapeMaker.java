import java.util.Scanner;
//SECOND PROJECT AS A BEGINNER(REWRITTEN)
public class ShapeMaker {
    public static void square(Scanner scanner) {
        System.out.print("Enter the length&width: ");
        int n = scanner.nextInt();
        scanner.nextLine();
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
        scanner.nextLine();
        System.out.print("Enter the length: ");
        int l = scanner.nextInt();
        scanner.nextLine();
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
                System.out.print("How many rows for the centered triangle?: ");
                int c = scanner.nextInt();
                scanner.nextLine();
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
                break;
            case "left":
                System.out.print("How many rows for the left sided triangle?: ");
                int r = scanner.nextInt();
                scanner.nextLine();
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
                break;
            case "right":
                System.out.print("How many rows for the right sided triangle?: ");
                int le = scanner.nextInt();
                scanner.nextLine();
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
                break;
            default:
                System.out.println("Invalid answer!");
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
    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's make patterns using stars!");
        String shapeChoice;
        //user input
        do {
            System.out.print("What pattern do you wanna make?\nSquare, Rectangle, Triangle, Hourglass, Diamond, Heart?\nType 'Exit' if you're done\nType here: ");
            shapeChoice = scanner.nextLine().toLowerCase().trim();
            //
            switch (shapeChoice) {
                case "square":
                    square(scanner);
                    break;
                case "rectangle":
                    rectangle(scanner);
                    break;
                case "triangle":
                    triangle(scanner);
                    break;
                case "exit":
                    System.out.println("Thank you for playing with us. Come again!");
                    break;
                case "hourglass":
                    hourglass(scanner);
                    break;
                case "diamond":
                    diamond();
                    break;
                case "heart":
                    heart();
                    break;
                default:
                    System.out.println("INVALID ANSWER!");
            }
        } while (!shapeChoice.equalsIgnoreCase("exit"));
        scanner.close();
    }
}
