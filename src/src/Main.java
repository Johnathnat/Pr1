package src;

import java.util.Scanner;

/**
 * beans
 */
public class Main {
    /**
     * Variables
     * Hero Item (sword and shield)
     * Neutral Item (long sword)
     * Evil Item (dark dagger)
     * WTF item (lighter)
     *
     * @return
     */
    static boolean SwordShield(boolean hero)
    {
        //hero=false;
        return hero;
    }
    static boolean LongSword(boolean neutral)
    {
        //neutral=false;
        return neutral;
    }
    static boolean DarkDagger(boolean evil)
    {
        //evil=false;
        return evil;
    }
    static boolean lighter(boolean WTF)
    {
        //WTF=false;
        return WTF;
    }

    static boolean vitality (boolean potion)
    {
        //potion=false;
        return potion;
    }

    public static void main(String[] args) {
        bulkOfGame();
    }
    static void intro()
    {
        System.out.println(" WELCOME TO EN PISEE'S EXCELLENT ADVENTURE!");
        System.out.println
                (
                        "My name in Enpisee i will be the narrator of this adventure.\n" +
                                "Now lets Begin..."
                );
    }
    static void bulkOfGame()
    {

        Scanner keyboard = new Scanner(System.in);
        //start of the game
        intro();
        house();
        System.out.println
                (
                        "\nNPC welcome" +
                        "\n1) Progress" +
                        "\n2) Insult"
                );
        System.out.print("> ");

        int welcome = Integer.parseInt(keyboard.next());
        switch (welcome)
        {
            //progress
            case 1:
                System.out.println("Progress");
            break;

            //Go option 2
            case 2:
                System.out.println("Insulted");
            break;
        }

        //Village
        int i = 0;
        while (i < 5)
        {
            System.out.println
                    (
                            "En Pisee introduces the village and their story" +
                                    "\n1) insult " +
                                    "\n2) pity villagers " +
                                    "\n3) Sympathise with villagers" +
                                    "\n4) Look at them in disgust"
                    );
            System.out.print(">  ");
            int village = Integer.parseInt(keyboard.next());
            switch (village)
            {
                //village option: Insult
                case 1:
                    System.out.println("Insult");
                    i = i+1;
                    //game over
                    break;
                //village option: Pity
                case 2:
                    i=6;
                    System.out.println("Pity");

                    break;
                //village option: Sympathise
                case 3:
                    System.out.println("Sympathise");
                    i=6;
                    break;

                //village option: disgust
                case 4:
                    System.out.println("Disgust");
                    i=6;
                    break;
            }
        }
        if (i == 5)
        {
            //NPC leaves ending
            System.out.println("NPC leaves");
            gameOver();
        }


        //Choose your weapon
        else
        {
            System.out.println
                    (
                            "En Pisee sets player up to pick their items" +
                                    "\n1) Sword and shield " +
                                    "\n2) Long Sword " +
                                    "\n3) Dark Dagger" +
                                    "\n4) Lighter"
                    );
            System.out.print(">  ");
            int weapon = Integer.parseInt(keyboard.next());
            switch (weapon)
            {
                //weapon option: Sword and shield
                case 1:
                    System.out.println("Sword and shield");
                    boolean hero=SwordShield(true);

                    break;
                //weapon option: Long Sword
                case 2:
                    System.out.println("Long Sword");
                    LongSword(true);

                    break;
                //weapon option: Dark Dagger
                case 3:
                    System.out.println("Dark Dagger");
                    DarkDagger(true);
                    break;

                //weapon option: Lighter
                case 4:
                    System.out.println("Lighter");
                    lighter(true);
                    break;
            }

            //Old Crone
            boolean hag = false;
            while (hag==false)
            {
                System.out.println
                        (
                                "An old crone. Offering aid to the player." +
                                        "\n1) Accept" +
                                        "\n2) Ignore" +
                                        "\n3) Berate"
                        );
                System.out.print(">  ");
                int crone = Integer.parseInt(keyboard.next());
                switch (crone)
                {
                    //crone option: Accept
                    case 1:
                        System.out.println("Accept");
                        /**if (hero==true)
                        {
                            vitality(true);
                            System.out.println("you're given a potion and feel great");
                        }
                        else if (netral==true)
                        {
                            System.out.println("you're given a potion and nothing happens");
                        }
                        else
                        {
                            System.out.println("nothing happens");
                        }*/
                        hag=true;
                        break;
                    //crone option: Ignore
                    case 2:
                        System.out.println("Ignore");
                        hag=true;
                        break;
                    //crone option: Berate
                    case 3:
                        System.out.println("Berate");
                        System.out.println("you become a cactus");
                        System.out.println("1) Restart" +
                                "\n2) End Game");
                        System.out.print(">  ");
                        int cactus = Integer.parseInt(keyboard.next());
                        if (cactus==2)
                        {
                            gameOver();
                            hag=true;
                            break;
                        }
                        break;
                }
            }


        }
    }
    static void gameOver()
    {
        System.out.println("<     Game Over     >");
        System.out.println("<      Made By      >");
        System.out.println("<  Johnathan & Ana  >");

    }
    //player
    static void player()
    {
    }

    //paths

    //Ascii Art
    static void house()
    {
        System.out.println("" +
                " _   |~  _\n" +
                "[_]--'--[_]\n" +
                "|'|\"\"`\"\"|'|\n" +
                "| | /^\\ | |\n" +
                "|_|_|I|_|_|");
    }

}