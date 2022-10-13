import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean goAgain = true;
        displayMenu();
        while (goAgain) {
            String input = scan.nextLine();
            if (input.equals("1")) {
                System.out.println("Ange x antal ord separera dem med radbrytning, avsluta med att skriva END");
                UppOchNer uppOchNer = new UppOchNer();
                uppOchNer.reverseString();
                System.out.println();
                displayMenu();
            } else if (input.equals("2")) {
                System.out.println("Ange 5 heltal, använd enter för att separera dem");
                MinMax minMax = new MinMax();
                minMax.largestNumber();
                System.out.println();
                displayMenu();
            } else if (input.equals("3")) {
                StenSaxPase stenSaxPase = new StenSaxPase();
                stenSaxPase.rps();
                System.out.println();
                displayMenu();
            } else if (input.equals("4")) {
                System.out.println("Ange 5 heltal separera dem med mellanslag");
                sort();
                System.out.println();
                displayMenu();
            } else if (input.equals("e")) {
                goAgain = false;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1. Upp och Ner");
        System.out.println("2. Min Max");
        System.out.println("3. Sten Sax Påse");
        System.out.println("4. Ordning och reda");
        System.out.println("e. Avsluta");
    }

    private static void sort() {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int numOfIt = 5;
        String[] inputNum = scan.nextLine().split(" ");
        int[] arrayOfNum = new int[5];
        for (int i = 0; i < inputNum.length; i++) {
            arrayOfNum[i] = Integer.parseInt(inputNum[i]);
            sum = Integer.parseInt(inputNum[i]) + sum;
        }
        int[] copyOfArrayOfNum = new int[arrayOfNum.length];
        System.arraycopy(arrayOfNum, 0, copyOfArrayOfNum, 0, copyOfArrayOfNum.length);

        for (int i = 0; i < numOfIt; i++) {
            for (int j = i + 1; j < numOfIt; j++) {
                if (arrayOfNum[i] > arrayOfNum[j]) {
                    int temp = arrayOfNum[i];
                    arrayOfNum[i] = arrayOfNum[j];
                    arrayOfNum[j] = temp;
                }
            }
        }
        if (Arrays.equals(arrayOfNum, copyOfArrayOfNum)) {
            System.out.println("Talen är i ordning");
        } else {
            System.out.println("Talen är inte i ordning");
        }

        System.out.println("Max value: " + arrayOfNum[numOfIt - 1]);
        System.out.println("Min value: " + arrayOfNum[0]);
        System.out.println("2Max value: " + arrayOfNum[numOfIt - 2]);
        System.out.println("2Min value: " + arrayOfNum[1]);
        System.out.println("Summa: " + sum);

    }

}

