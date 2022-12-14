import java.util.Scanner;

public class JTesting {
    public static void main(String[] args) {
        //start of the game
        intro();
        village();
        weapons();
        oldCrone();
        river();
        bomb();
        climb();
        cave();
        dragon();
    }




    static void intro()
    {
        System.out.println(" WELCOME TO A TINY ADVENTURE");
        System.out.println
                (
                        "My name in NPC i will be the narrator of this adventure.\n" +
                                "Now lets Begin..."
                );

        System.out.println
                (
                        """
                                NPC welcome
                                1) Progress
                                2) Insult"""
                );
        System.out.print("> ");
        Scanner keyboard = new Scanner(System.in);
        //Fist input going up or down
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
    }
    static void village()
    {
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
            Scanner keyboard = new Scanner(System.in);
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
    }
    private static int weapons()
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
        Scanner keyboard = new Scanner(System.in);
        int weaponChoise = Integer.parseInt(keyboard.next());
        int weapon = 0;
        switch (weaponChoise)
        {
            //weapon option: Sword and shield
            case 1:
                System.out.println("Sword and shield");
                weapon= 1;

                break;
            //weapon option: Long Sword
            case 2:
                System.out.println("Long Sword");
                weapon = 2;

                break;
            //weapon option: Dark Dagger
            case 3:
                System.out.println("Dark Dagger");
                weapon = 3;
                break;

            //weapon option: Lighter
            case 4:
                System.out.println("Lighter");
                weapon = 4;

                break;
        }
        return weapon;
    }
    private static boolean oldCrone()
    {
        boolean hag = false;
        boolean potion = false;
        while (hag == false) {
            System.out.println
                    (
                            "An old crone. Offering aid to the player." +
                                    "\n1) Accept" +
                                    "\n2) Ignore" +
                                    "\n3) Berate"
                    );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int crone = Integer.parseInt(keyboard.next());
            switch (crone) {
                //crone option: Accept
                case 1:
                    System.out.println("Accept");
                    if (weapons() == 1) {
                        potion = true;
                        System.out.println("you're given a potion and feel great");
                        return potion;
                    } else if (weapons() == 2) {
                        System.out.println("you're given a potion and nothing happens");
                    } else {
                        System.out.println("nothing happens");
                    }
                    hag = true;
                    break;
                //crone option: Ignore
                case 2:
                    System.out.println("Ignore");
                    hag = true;
                    break;
                //crone option: Berate
                case 3:
                    System.out.println("Berate");
                    System.out.println("you become a cactus");
                    System.out.println("1) Restart" +
                            "\n2) End Game");
                    System.out.print(">  ");
                    int cactus = Integer.parseInt(keyboard.next());
                    if (cactus == 2) {
                        gameOver();
                        hag = true;
                        break;
                    }
                    break;
            }
        }
        return potion;
    }
    private static void river()
    {
        boolean crossing=false;
        while (crossing==false)
        {
            System.out.println("""
                    Venture across river
                    1) Swim through
                    2) Grab a nearby person and use them to get across
                    3) Hop across rocks
                    4) Take the bridge""");
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int river = Integer.parseInt(keyboard.next());
            switch (river)
            {
                case 1:
                    System.out.println("you drown");
                    break;
                case 2:
                    System.out.println("you both drown");
                    break;
                case 3:
                    System.out.println("you look cool... until you fall and drown");
                    break;
                case 4:
                    System.out.println("that works");
                    crossing=true;
                    break;

            }
        }
    }
    private static int bomb()
    {
        int bomb=0;
        boolean what2do=false;
        while (what2do==false)
        {
            System.out.println("""
                    1) Throw bomb
                    2) Hold on to bomb (kills player, reset option)
                    3) Give bomb to En Pisee (kills En Pisee, restart game or section)
                    4) Extinguish bomb (if lighter held)
                                      """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int quickThink = Integer.parseInt(keyboard.next());
            switch (quickThink)
            {
                case 1:
                    System.out.println("Throws bomb");
                    what2do=true;
                    break;
                case 2:
                    System.out.println("you fool");

                    break;
                case 3:
                    System.out.println("huh? what????");
                    break;
                case 4:
                    System.out.println("that worked?");
                    what2do=true;
                    bomb=1;
                    break;
            }

        }
        return bomb;
    }
    private static void climb()
    {
        int climbing=0 ;
        while (climbing<5)
        {
            System.out.println("""
                    1) Scale unsafe cliffside (player dies, reset option)
                    2) Take the scenic route (progress)
                    3) Wait for a lift (loop option, will loop 5 times until En Pisee gets bored and makes the player walk to progress)
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int route = Integer.parseInt(keyboard.next());
            switch (route)
            {
                case 1:
                    System.out.println("you died");
                    break;
                case 2:
                    System.out.println("Take the scenic route");
                    climbing=5;
                    break;
                case 3:
                    if (climbing==5)
                    {
                        System.out.println("omg just go");
                    }
                    else
                    {
                        System.out.println("nope not carrying you");
                    }
                    break;
            }
        }
    }
    private static void cave()
    {
        int carve=0 ;
        while (carve<5)
        {
            System.out.println("""
                    1) Say hi to bats (trigger bat encounter)
                    2) Use weapon on broken wall (progress)
                    3) Walk through dangerous cave (killed by stilagtite? Stilagmite? The pointy ceiling things. Restart option)
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int caveChoice = Integer.parseInt(keyboard.next());
            switch (caveChoice)
            {
                case 1:
                    int batEncounter=0;
                    while (batEncounter<1)
                    {
                        batEncounter=batEncounter+1;
                        System.out.println("""
                                bat encounter
                                1) Remain friendly (swarmed by 100 bats and killed, restart option)
                                2) Run and hide (back to cave options without bat option)""");
                        int bats = Integer.parseInt(keyboard.next());
                        switch (bats) {
                            case 1:
                                System.out.println("you get swarmed");
                                break;
                            case 2:
                                System.out.println("RUN AWAY");
                                break;
                        }
                        break;
                    }
                    System.out.println("Option not available");
                case 2:
                    System.out.println("progress");
                    carve=6;
                    break;
                case 3:
                    System.out.println("caving accident");
                    break;

            }
        }
    }
    private static void dragon()
    {
        int meetingDragon=0 ;
        while (meetingDragon<5)
        {
            System.out.println("""
                    1) Insult dragon (killed by lightening breath)
                    2) Challenge (initiate fight)
                    3) Drink potion (if sword and shield AND took potion)
                    4) Sneak up to dragon (able to sneak behind them)
                                                                                                                
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int meeting = Integer.parseInt(keyboard.next());
            switch (meeting)
            {
                case 1:
                    System.out.println("you die");
                    break;
                case 2:
                    System.out.println("progress to challenge");
                    meetingDragon=6;
                    dragonChallenge1();

                    break;
                case 3:
                    if (oldCrone()==true)
                        System.out.println("progress to challenge with potion with sword and shield");
                    meetingDragon=6;
                    dragonChallenge1();
                    break;
                case 4:
                    System.out.println("progress to sneak");
                    meetingDragon=6;
                    dragonSneak1();
                    break;
            }
        }
    }
    private static void dragonChallenge1()
    {
        boolean challenge1=false ;
        while (!challenge1)
        {
            System.out.println("""
                    1) Dodge
                    2) Charge
                    3) dance off
                    4) just a joke bro!                                                                                       
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal1 = Integer.parseInt(keyboard.next());
            switch (chal1)
            {
                case 1:
                    System.out.println("Progress");
                    challenge1=true;
                    dragonChallenge2();
                    break;
                case 2:
                    System.out.println("die");
                    break;
                case 3:
                    System.out.println("awesome dancing.. still die");
                    break;
                case 4:
                    System.out.println("die");
                    break;
            }
        }
    }
    private static void dragonChallenge2()
    {
        boolean challenge2=false ;
        while (!challenge2)
        {
            System.out.println("""
                    1) Strike
                    2) dodge
                    3) Leap
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal2 = Integer.parseInt(keyboard.next());
            switch (chal2)
            {
                case 1:
                    System.out.println("Progress");
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 2:
                    System.out.println("progress but only just");
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 3:
                    System.out.println("die");
                    break;
            }
        }
    }
    private static void dragonChallenge3()
    {
        boolean challenge3=false ;
        while (!challenge3)
        {
            System.out.println("""
                    1) Leap into the maw of the beast
                    2) Dodge
                    3) Charge
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal3 = Integer.parseInt(keyboard.next());
            switch (chal3)
            {
                case 1:
                    System.out.println("Good ending");
                    challenge3=true;
                    break;
                case 2:
                    System.out.println("progress but only just");
                    break;
                case 3:
                    System.out.println("die");
                    break;
            }
        }
    }
    private static void dragonSneak1()
    {
        boolean sneak1=false ;
        while (!sneak1)
        {
            System.out.println("""
                    1) Freeze
                    2) Hide
                    3) Say Hi
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking1 = Integer.parseInt(keyboard.next());
            switch (sneaking1)
            {
                case 1:
                    System.out.println("die");
                    break;
                case 2:
                    System.out.println("progress");
                    sneak1=true;
                    dragonSneak2();
                    break;
                case 3:
                    System.out.println("you die");
                    break;
            }
        }
    }
    private static void dragonSneak2()
    {
        boolean sneak2=false ;
        while (!sneak2)
        {
            System.out.println("""
                    1) Lighter
                    2) Sneak
                    3) Sneeze
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking2 = Integer.parseInt(keyboard.next());
            switch (sneaking2)
            {
                case 1:
                    System.out.println("WTF ending");
                    sneak2=true;
                    dragonSneak3();
                    break;
                case 2:
                    System.out.println("progress");
                    sneak2=true;
                    dragonSneak3();
                    break;
                case 3:
                    System.out.println("you die");
                    break;
            }
        }
    }
    private static void dragonSneak3()
    {
        boolean sneak3=false ;
        while (!sneak3)
        {
            System.out.println("""
                    1) Gut
                    2) Tickle
                    3) Stab
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking3 = Integer.parseInt(keyboard.next());
            switch (sneaking3)
            {
                case 1:
                    System.out.println("evil endind");
                    break;
                case 2:
                    System.out.println("die");
                    sneak3=true;
                    break;
                case 3:
                    System.out.println("you die");
                    break;
            }
        }
    }


    static void gameOver()
    {
        System.out.println("<  Game Over  >");
        System.out.println("<   Made By   >");
        System.out.println("<  Johnathan  >");

    }
}