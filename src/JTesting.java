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
        System.out.println("Hi!");
        System.out.println("My name is En Pisee! And this is my game! I will be your narrator for this adventure."+
                            "\nYou! Will be the hero of my story! Making challenging choices, taking horrifying risks,"+
                            "\nand hopefully defeating the evil dragon and beat my game!!"+
                            "\nAre you up for the challenge?"
                            );
        System.out.println
                (
                        """
                                1) 'Heck yes!!'
                                2) 'WTF are you??'"""
                );
        System.out.print("> ");
        Scanner keyboard = new Scanner(System.in);
        //Fist input going up or down
        int welcome = Integer.parseInt(keyboard.next());
        switch (welcome)
        {
            //progress
            case 1:
                System.out.println("'Heck yes!!'");
                break;

            //Go option 2
            case 2:
                System.out.println("'WTF are you??'");
                break;
        }
    }
    static void village()
    {
        int i = 0;
        while (i < 5)
        {
            System.out.println("You, in a world of dragons and knights in shining armour, find yourself in a village");
            System.out.println
                    (
                            """
                                    1) 'No, seriously. WTF are you?'
                                    2) Take pity on the villagers
                                    3) Sympathise with the villagers
                                    4) Look at them in disgust
                            """
                    );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int village = Integer.parseInt(keyboard.next());
            switch (village)
            {
                //village option: Insult
                case 1:
                    System.out.println("1)'No, seriously. WTF are you?'");
                    i = i+1;
                    //game over
                    break;
                //village option: Pity
                case 2:
                    i=6;
                    System.out.println("2) Take pity on the villagers");

                    break;
                //village option: Sympathise
                case 3:
                    System.out.println("3) Sympathise with the villagers");
                    i=6;
                    break;

                //village option: disgust
                case 4:
                    System.out.println("4) Look at them in disgust");
                    i=6;
                    break;
            }
        }
        if (i == 5)
        {
            //NPC leaves ending
            System.out.println("Ok! That does it!! If you're just going to be rude! I won't tell you my excellent story.");
            System.out.println("Good bye!!");
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
        int weaponChoice = Integer.parseInt(keyboard.next());
        int weapon = 0;
        switch (weaponChoice)
        {
            //weapon option: Sword and shield
            case 1:
                System.out.println("Sword and shield");
                weapon = 1;

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
                    if (weapon == 1) {
                        potion = true;
                        System.out.println("you're given a potion");
                        return potion;
                    } else if (weapons() == 2) {
                        System.out.println("you drink the potion and nothing happens");
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
                    restart();
                    break;
                case 2:
                    System.out.println("you both drown");
                    restart();
                    break;
                case 3:
                    System.out.println("you look cool... until you fall and drown");
                    restart();
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
                    restart();
                    break;
                case 3:
                    System.out.println("huh? what????");
                    restart();
                    break;
                case 4:
                }
                    System.out.println("that worked?");
                    what2do=true;
                    bomb=1;
                    break;
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
                    restart();
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
                        climbing = climbing+1;
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
                                restart();
                                break;
                            case 2:
                                System.out.println("RUN AWAY");
                                carve=6;
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
                    restart();
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
                    restart();
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
                    System.out.println("You run toward the dragon, diving to the left and narrowly missing the Dragon's lightening breath as it sizzles past you.");
                    challenge1=true;
                    dragonChallenge2();
                    break;
                case 2:
                    System.out.println("You charge the Dragon. Bellowing a battle cry. The Dragon rears back and electrocutes you with its lightening breath, turning you to ashe before you even get close.");
                    restart();
                    break;
                case 3:
                    System.out.println("You start dancing. Your moves, incredible. Timing, immaculate. It's almost as if dancing was your true calling. The dragon, crushes you with it's colossal tail mid dance. It's a dragon fight! Not a dance contest.");
                    restart();
                    break;
                case 4:
                    System.out.println("With a look of disappointment, the dragon sighs and slaps you with its mighty claw. Sending you flying into the cave wall and killing you on impact.");
                    restart();
                    break;
            }
        }
    }
    private static void dragonChallenge2()
    {
        boolean challenge2=false ;
        while (!challenge2)
        {
            System.out.println("The Dragon growls. How dare this intruder insult them by not dying faster. They whirl around, their tail heading straight for you.");
            System.out.println("1) Strike");
            System.out.println("2) Dodge");
            System.out.println("3) Leap");
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal2 = Integer.parseInt(keyboard.next());
            switch (chal2)
            {
                case 1:
                    System.out.println("You swing your mighty weapon. Carving through the tail, causing the Dragon to cry out in agony.");
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 2:
                    System.out.println("You drop and slide under the tail. Narrowly avoiding the tail as you feel the air rush over you from the tail swipe.");
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 3:
                    System.out.println("You leap into the air and get smacked by the tail. You fly into the air and just before you splat into the cave wall, you swear you hear the Dragon say 'HOME RUN!'. You then coat the wall in a new colour called hint of internal organs.");
                    restart();
                    break;
            }
        }
    }
    private static void dragonChallenge3()
    {
        boolean challenge3=false ;
        while (!challenge3)
        {
            System.out.println("'ENOUGH!!' The Dragon bellows! 'I will not have you insult my presence any longer!!' It charges you, looking to swallow you whole!");
            System.out.println("1) Leap into the maw of the beast");
            System.out.println("2) Dodge");
            System.out.println("3) Charge");
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal3 = Integer.parseInt(keyboard.next());
            switch (chal3)
            {
                case 1:
                    System.out.println("You leap into the maw of the Dragon. He swallows you whole and you feel yourself slide down the gullet of the beast. You don't have much time. You use all of your remaining strength to slice and cut the innards of the Dargon. You hear their muffled screams of pain, their cries of pain slowly being turned into gargled screams as blood fills their throat. However, it doesn't stop you being trapped inside them. Whether you drowned in the dragon's blood, suffocated inside them or died in their stomach. What is known though, is that you saved the village. Thanks to your heroic sacrifice, the village thrives. Stories are made in your name, a statue erected in the village square and the village will never forget the hero who sacrificed themselves, so they may live freely.");
                    challenge3=true; //Ana, work out a way to set code for the alt endings depending on weapon
                    neutralEnding();
                    break;
                case 2:
                    System.out.println("progress but only just");
                    restart();
                    break;
                case 3:
                    System.out.println("die");
                    restart();
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

    static void neutralEnding()
    {
        System.out.println("Yay! You beat the game!! You slew the dragon and saved the village!");
        System.out.println("Pity you died though. You could have survived that fight and-");
        System.out.println("Well, I can't say more.");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }

    static void heroEnding()
    {
        System.out.println("You did it!! You saved the village and survived the final confrontation with the dragon!");
        System.out.println("I'm really glad you got the Hero ending. I was really worried you might get the-");
        System.out.println("...");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }

    static void evilEnding()
    {
        System.out.println("Well, you did it. I guess.");
        System.out.println("You killed the dragon, but then you enslaved the village. I'm surprised this was the route you took but you chose this.");
        System.out.println("Could have been worse though!");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }

    static void wtfEnding1()
    {
        System.out.println("Yay! Y-You did it!! You saved the village! The dragon is dead!");
        System.out.println("Thanks for playing! I'm g-going to leave now!");
        System.out.println("1) Walk to the village...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding2();
        }
        else {
            wtfEnding2();
        }
    }

    static void wtfEnding2()
    {
        System.out.println("What are you doing? The game's over. You can stop playing now!");
        System.out.println("1) Walk up to a villager...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding3();
        }
        else {
            wtfEnding3();
        }
    }

    static void wtfEnding3()
    {
        System.out.println("The game is done! You can leave now!");
        System.out.println("1) Burn a villager...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding4();
        }
        else {
            wtfEnding4();
        }
    }

    static void wtfEnding4()
    {
        System.out.println("'The villager screams as they are burnt alive'");
        System.out.println("I-I didn't say that! That's not my story!");
        System.out.println("1) Light and throw the bomb...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding5();
        }
        else {
            wtfEnding5();
        }
    }

    static void wtfEnding5()
    {
        System.out.println("'The bomb explodes. Villagers scream as their homes are destroyed. The explosion causes a fire which spreads to the rest of the close knit village. Smoke billows from every house and building.'");
        System.out.println("Stop it! Stop ruining my game!!");
        System.out.println("1) Walk towards En Pisee...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding6();
        }
        else {
            wtfEnding6();
        }
    }

    static void wtfEnding6()
    {
        System.out.println("Wait, no. Keep back!");
        System.out.println("1) Burn En Pisee...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1)
        {
            wtfEnding7();
        }
        else {
            wtfEnding7();
        }
    }

    static void wtfEnding7()
    {
        String scream = "AAAAAAAAAAAAAAAAA";
        for (int A = 0; A < 50; A++)
            System.out.print(scream);
        gameOver();
    }
    static void restart()
    {
        System.out.println("1) Try again");
        System.out.println("2) End game");
        Scanner keyboard = new Scanner(System.in);
        int restartOption = Integer.parseInt(keyboard.next());
        switch (restartOption) {
            case 1:
                intro();
                break;
            case 2:
                gameOver();
                break;
        }

    }

    public int getWeapon () {
        int weapon = 0;
        return weapon;
    }

    static void gameOver()
    {
        System.out.print("");
        System.out.println("<  Game Over  >");
        System.out.println("<  Made By   >");
        System.out.println("<  Johnathan and Ana  >");
        System.out.print("");
        System.exit(0);
    }
}