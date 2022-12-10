import java.util.Scanner;

/**
 * beans
 */
public class Main {
    public static void main(String[] args) {
        bulkOfGame();
    }

    static void bulkOfGame()
    {

        Scanner keyboard = new Scanner(System.in);
        //start of the game
        intro();
        house();
        System.out.println
                (
                        "\n You are in a creepy house! Would you like to:" +
                                "\n1) Go into the kitchen? " +
                                "\n2) Leave?"
                );
        System.out.print("> ");
        //Fist input going up or down
        int Go;
        Go = Integer.parseInt(keyboard.next());
        switch (Go) {
            case 1:
                System.out.println
                        (
                                "There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may: " +
                                        "\n1) Open the refrigerator " +
                                        "\n2) Look in the pantry. "
                        );
                System.out.print(">  ");
                int Look = Integer.parseInt(keyboard.next());
                switch (Look) {
                    //Look option 1
                    case 1:
                        System.out.println
                                (
                                        "Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to: " +
                                                "\n1)Eat some of the food?" +
                                                "\n2)Leave it?"
                                );
                        System.out.print(">  ");
                        int Eat = Integer.parseInt(keyboard.next());
                        switch (Eat) {
                            //Eat option 1
                            case 1:
                                System.out.println("You live!");
                                gameOver();
                                break;
                            //Eat option 2
                            case 2:
                                System.out.println("You die of hunger.");
                                gameOver();
                                break;
                        }
                        break;
                    //Look option 2
                    case 2:
                        System.out.println
                                (
                                        "There is a killer inside. Do you want to: " +
                                                "\n1) Fight them?" +
                                                "\n2) Run away?"
                                );
                        System.out.print(">  ");
                        int Pantry = Integer.parseInt(keyboard.next());
                        switch (Pantry) {
                            //Pantry option 1
                            case 1:
                                System.out.println("\nYou're weak and die");
                                gameOver();
                                break;
                            //Pantry option 2
                            case 2:
                                System.out.println("\nYou died because your too slow & can't run");
                                gameOver();
                                break;
                        }
                        break;
                }
                break;
            //Go option 2
            case 2:
                System.out.println("You leave");
                gameOver();
                break;
        }
    }


    static void house()
    {
        System.out.println("" +
                " _   |~  _\n" +
                "[_]--'--[_]\n" +
                "|'|\"\"`\"\"|'|\n" +
                "| | /^\\ | |\n" +
                "|_|_|I|_|_|");
    }

    static void intro()
    {
        System.out.println(" WELCOME TO A TINY ADVENTURE");
        System.out.println
                (
                        "My name in NPC i will be the narrator of this adventure.\n" +
                                "Now lets Begin..."
                );
    }

    static void gameOver()
    {
        System.out.println("<  Game Over  >");
        System.out.println("<   Made By   >");
        System.out.println("<  Johnathan  >");

    }
}