import java.util.ArrayList;
import java.util.Scanner;

public class AsciiChars {
    static int fourthNonMagicNumber;
    static int magicBall;
    static int fNonRandomNumber;
    static final int rNumber = 3;
    static final int lastNonMagicNumber = 6;
    static final int tRNumber = 12;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AsciiChars.printNumbers();
        AsciiChars.printLowerCase();
        AsciiChars.printUpperCase();
        ArrayList<Integer> $chosenNums = new ArrayList<Integer>();
        System.out.println("What is your name?\n");
        String name = input.nextLine();
        System.out.printf("Hello %s!\n", name);
        System.out.println("Press 1 if you would like to continue to the interactive portion. Press 0 if you would like to exit the program.\n");
        int answer = input.nextInt();

        if (answer == 0) {
            System.out.print("Please return later to complete the survey\n");
        } else if (answer != 0) {
            System.out.print("Let's continue!\n");
        }
        int secondChance;
        String cAnswer;
        do {
            System.out.println("Do you have a red car?");
            cAnswer = input.nextLine();
            System.out.println("What is the name of your favorite pet?\n");
            String pAnswer = input.nextLine();
            System.out.println("What is your pet's age?\n");
            int pAge = input.nextInt();
            $chosenNums.add(pAge);
            System.out.println("What is your lucky number?\n");
            int lNumber = input.nextInt();
            System.out.println("Do you have a favorite quarterback? If so what is their Jersey Number?\n");
            int fPlayerNumber = input.nextInt();
            System.out.println("What is the two-digit model of your car?\n");
            int dModel = input.nextInt();
            System.out.println("What is the first name of your favorite actor or actress?\n");
            String fActor = input.nextLine();
            System.out.println("The first number that comes to mind between 1 and 50?\n");
            int ranNumber = input.nextInt();
            $chosenNums.add(ranNumber);
            magicBall = multiply(fPlayerNumber, rNumber);
            int fNonMagicNumber = subtract(ranNumber, rNumber);
            int sNonMagicNumber = add(dModel, lNumber);
            int tNonMagicNumber = addTwo(pAge, dModel);

            int fourthNonMagicNumber = add(fPlayerNumber, pAge, lNumber);
            System.out.printf("Lotto Numbers: %s, %s, %s, %s, %s\n", fNonMagicNumber, sNonMagicNumber, tNonMagicNumber, fourthNonMagicNumber, lastNonMagicNumber);



            if (magicBall > 75) {
                magicBall -= 75;
                System.out.println("Magic Ball : " + magicBall);
            }
            System.out.println("Wummppppp TOO BAD SO SAD\n");
            System.out.println("Would you like to answer questions to generate another set of numbers? Press 1 for Yes, 2 for No");
            secondChance = input.nextInt();

        } while (secondChance == 1);

        if (secondChance != 1) {
            System.out.println("Thank you!");
        }

        input.close();
    }


    public static int multiply(int fPlayerNumber, int rNumber) {
        int magicBall= fPlayerNumber * rNumber;
        return magicBall;
    }

    public static int subtract(int ranNumber, int rNumber) {
        int fNonMagicNumber= ranNumber - rNumber;
        return fNonMagicNumber;
    }

    public static int add(int dModel, int lNumber) {
        int sNonMagicNumber= dModel + lNumber;
        return sNonMagicNumber;
    }

    public static int addTwo(int pAge, int dModel) {
        int tNonMagicNumber= pAge + dModel;
        return tNonMagicNumber;
    }

    public static int add(int fPlayerNumber,int pAge,int lNumber) {
        int fourthNonMagicNumber= fPlayerNumber + pAge + lNumber;
        return fourthNonMagicNumber;
    }


    public static void printNumbers() {
        char letter;


        for (int number = 48; number <= 57; number++) {
            letter = (char) number;
            System.out.print(letter + " \n");
        }
    }

    public static void printLowerCase() {
        char LowerCase;
        for (int num = 97; num <= 122; num++) {
            LowerCase = (char) num;
            System.out.print(LowerCase + " \n");
        }
    }

    public static void printUpperCase() {
        char UpperCase;
        for (int nNum = 65; nNum <= 90; nNum++) {
            UpperCase = (char) nNum;
            System.out.print(UpperCase + " \n");
        }
    }


}

