import java.util.Scanner;


public class JTesting {

    private static int weapon;

    public enum Weapons{none, swordAndShield, longSword, darkDagger, lighter};
    public static Weapons myWeapon = Weapons.none;
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
        System.out.println
                (
                        """
                            My name is En Pisee! And this is my game! I will be your narrator for this adventure.
                            You! Will be the hero of my story! Making challenging choices, taking horrifying risks,
                            and hopefully defeating the evil dragon and beat my game!!
                            Are you up for the challenge?
                        """
                );
        System.out.println
                (
                        """
                            1) 'Heck yes!!'
                            2) 'WTF are you??'
                        """
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
            System.out.println(
                    """
                            You, in a world of dragons and knights in shining armour, find yourself in a village.
                            The village people are tired and ragged. Labouring long hours to appease the great,
                            blue dragon who over sees the village. It demands that all food and precious materials
                            of the village be given to them. The villagers are barely able to keep themselves alive
                            whilst keeping the dragon from killing them all.
                    """
            );
            System.out.println(
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
        System.out.println(
                """
                        You decide to take action and attempt to slay the dragon, freeing the villagers
                        from their bindings so that they might live. You head to the local weapons
                        merchant and find 4 weapons. Which do you take?
                """);
        System.out.println(
                """
                                1) Sword and shield
                                2) Long Sword
                                3) Dark Dagger
                                4) Lighter
                """
                );
        System.out.print(">  ");
        Scanner keyboard = new Scanner(System.in);
        int weaponChoice = Integer.parseInt(keyboard.next());

        weapon = 0;
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
            System.out.println(
                   """
                            You venture toward the Dragon's cave. An old crone approaches you, offering you
                            aid. Do you accept?
                    """);
            System.out.println(
                    """
                            1) Accept
                            2) Ignore
                            3) Berate
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);

            int crone = Integer.parseInt(keyboard.next());
            switch (crone) {
                //crone option: Accept
                case 1:
                    System.out.println("Accept");
                    if (weapon == 1) {
                        potion = true;
                        System.out.println(
                                """
                                            She hands you a potion. It glows with a mysterious power. You store it for later.
                                """);
                        return potion;
                    }
                    else {
                        System.out.println(
                                """
                                            She hands you a potion. You drink the potion but nothing happens.
                                """);
                    }
                    hag = true;
                    break;
                    //crone option: Ignore
            case 2:
                System.out.println(
                        """
                                You ignore the crone. She smelt funny anyway.
                        """);
                hag = true;
                break;
            //crone option: Berate
            case 3:
                System.out.println(
                        """         
                                'Be gone from my sight, you foul smelling wench!' You sneer. The crone
                                smiles. Her yellow teeth showing the many years of dental neglect as a
                                strange, green smoke surrounds the pair of you. You feel strange. Prickly
                                even. You can't see, but you have been turned into a cactus.
                        """);
                restart();
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
            System.out.println(
                    """
                            You leave the village and come across a river. The current is strong. You can see the water
                            crashing into the rocks. What do you do?
                    """);
            System.out.println(
                    """
                            1) Swim through
                            2) Grab a nearby person and use them to get across
                            3) Hop across rocks
                            4) Take the bridge
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int river = Integer.parseInt(keyboard.next());
            switch (river)
            {
                case 1:
                    System.out.println("You jump into the water. The current carries you away, causing you to drown.");
                    restart();
                    break;
                case 2:
                    System.out.println("You grab a nearby villager and attempt to use him as a raft. You both drown. No clue what you were expecting here.");
                    restart();
                    break;
                case 3:
                    System.out.println("You look cool... until you slip on a mossy rock and fall and drown");
                    restart();
                    break;
                case 4:
                    System.out.println("Using common sense, you walk to and cross over using the nearby bridge.");
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
            System.out.println(
                    """
                            You venture on. Eventually, coming across an ornate chest! You open the chest and reach inside an-
                            OH MY GOD!!! IT'S A LIT BOMB!! Quick! Throw it away!!
                    """);
            System.out.println(
                    """
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
                    System.out.println("You hurl the bomb away and it explodes harmlessly.");
                    what2do=true;
                    break;
                case 2:
                    System.out.println("What? Why would yo-");
                    System.out.println("The bomb explodes in your hands. Sending pieces of you flying everywhere.");
                    restart();
                    break;
                case 3:
                    System.out.println("huh? what????");
                    gameOver();
                    break;
                case 4:
                }
                    System.out.println(
                    """
                            You use the lid of the lighter to extinguish the fuse on the bomb. I have no clue how that worked.
                    """);
            //if lighter held can pick, if not, blows up
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
            System.out.println(
                    """
                            You start getting closer to the cave, but the only way to get to the cave seems to be up
                            a dangerous cliff side. What do you do?
                    """);
            System.out.println(
                    """
                            1) Scale unsafe cliffside (player dies, reset option)
                            2) Take the scenic route (progress)
                            3) Wait for a lift 
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int route = Integer.parseInt(keyboard.next());
            switch (route)
            {
                case 1:
                    System.out.println(
                            """
                                    You attempt to scale the cliff, but a rock breaks as you push off and you fall and
                                    become a pizza splat on the ground.
                            """);
                    restart();
                    break;
                case 2:
                    System.out.println(
                            """
                                    You take the scenic route. Taking in the beautiful views as you safely make your
                                    way to the top.
                            """);
                    climbing=5;
                    break;
                case 3:
                    if (climbing==5)
                    {
                        System.out.println("Oh for god's sake. Just go!");
                    }
                    else
                    {
                        System.out.println("You wait for a lift, but no one comes.");
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
            System.out.println(
                    """
                            You reach the Dragon's cave. Walking through the dark tunnels, you find it hard to
                            navigate through. You trip on a rock that you didn't see, and 100 red eyes appear
                            from the ceiling. A swarm of bats charge towards you!
                            
                    """);
            System.out.println(
                    """
                            1) Say hi to bats (trigger bat encounter)
                            2) Use weapon on broken wall (progress)
                            3) Run through dangerous cave (killed by stilagtite? Stilagmite? The pointy ceiling things. Restart option)
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
                        System.out.println(
                                """
                                        The bats still charge towards you!
                                """);
                        System.out.println(
                                """
                                        1) Remain friendly
                                        2) Run and hide (back to cave options without bat option)
                                """);
                        int bats = Integer.parseInt(keyboard.next());
                        switch (bats) {
                            case 1:
                                System.out.println("You are swarmed by the bats. When they finally leave, the only thing left of you is a skeleton.");
                                restart();
                                break;
                            case 2:
                                System.out.println("You duck behind rock and the bats rush by.");
                                carve=6;
                                break;
                        }
                        break;
                    }
                    System.out.println("Option not available");
                case 2:
                    System.out.println("You take your weapon and break a near by wall and get away from the bats.");
                    carve=6;
                    break;
                case 3:
                    System.out.println(
                            """
                                    You run through the dark cave. Running into a wall and causing a stalagmite...
                                    stalactite? One of those point rock thingies to fall on top of you.
                            """);
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
            System.out.println(
                    """
                            Finally, you reach the Dragon's lair. The hulking, beast lays resting atop its hoard.
                            How do you approach?
                    """);
            System.out.println(
                    """
                            1) Insult the dragon
                            2) Challenge
                            3) Drink potion 
                            4) Sneak up to dragon (able to sneak behind them)                                                                                      
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int meeting = Integer.parseInt(keyboard.next());
            switch (meeting)
            {
                case 1:
                    System.out.println(
                            """
                                    'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one eye, looks at you,
                                    and with a yawn opens it's maw and blasts you with it's ning breath. Killing
                                    you instantly.
                            """);
                    restart();
                    break;
                case 2:
                    System.out.println(
                            """
                                    'I challenge thee, vile beast!' You bellow.
                            """);
                    meetingDragon=6;
                    dragonChallenge1();

                    break;
                case 3:
                    if (oldCrone()==true) {
                        System.out.println(
                                """
                                        You chug the entirety of your potion, throw the glass down on the ground
                                        and yell 'Awaken, vile beast, you shall torment the good people of that
                                        village any longer!'
                                """);
                        }
                    else {
                        System.out.println(
                                """
                                        You reach for a potion you don't have, shrug and call the dragon a cunt.
                                        It bolts up and glares at you.
                                """);
                    }
                    meetingDragon=6;
                    dragonChallenge1();
                    break;
                case 4:
                    System.out.println("progress to sneak");
                    if (myWeapon == Weapons.darkDagger || Weapons.lighter) {
                        System.out.println(
                                """
                                        You duck down low and cautiously make your way behind the dragon. Slowly
                                        making your way past the beast's hoarded treasures.
                                """);
                        dragonSneak1();
                    }
                    else {
                        System.out.println(
                                """
                                        You duck down low and cautiously make your way behind the dragon. However,
                                        you trip on an unseen rock and collapse onto the treasure. You hope the noise
                                        did not wake the beast. You look up to see it staring down at you. 'Nice try.'
                                        It scoffs before biting and swallowing you whole.
                                """);
                        restart();
                    }

                    meetingDragon=6;
                    break;
            }
        }
    }
    private static void dragonChallenge1()
    {
        boolean challenge1=false ;
        while (!challenge1)
        {
            System.out.println(
                    """
                            The Dragon stands atop it' hoard, staring you down. It's chest inflates and it's eyes
                            glow an electric blue as it readies it's lightening breath toward you.
                    """);
            System.out.println(
                    """
                            1) Dodge
                            2) Charge
                            3) Dance off
                            4) Just a joke bro!                                                                                       
                    """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal1 = Integer.parseInt(keyboard.next());
            switch (chal1)
            {
                case 1:
                    System.out.println(
                    """
                            You run toward the dragon, diving to the left and narrowly missing the Dragon's
                            lightening breath as it sizzles past you.
                    """);
                    challenge1=true;
                    dragonChallenge2();
                    break;
                case 2:
                    System.out.println(
                    """
                            You charge the Dragon. Bellowing a battle cry. The Dragon rears back and electrocutes
                            you with its lightening breath, turning you to ashe before you even get close.
                    """);
                    restart();
                    break;
                case 3:
                    System.out.println(
                    """
                            You start dancing. Your moves, incredible. Timing, immaculate. It's almost as if 
                            dancing was your true calling. The dragon, crushes you with it's colossal tail mid 
                            dance. It's a dragon fight! Not a dance contest.
                    """);
                    restart();
                    break;
                case 4:
                    System.out.println(
                    """
                            With a look of disappointment, the dragon sighs and slaps you with its mighty claw. 
                            Sending you flying into the cave wall and killing you on impact.
                    """);
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
            System.out.println(
            """
                    The Dragon growls. How dare this intruder insult them by not dying faster. They whirl around,
                    their tail heading straight for you.
            """);
            System.out.println(
            """
                    1) Strike
                    2) Dodge");
                    3) Leap
            """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal2 = Integer.parseInt(keyboard.next());
            switch (chal2)
            {
                case 1:
                    System.out.println(
                            """
                                    You swing your mighty weapon. Carving through the tail, causing the Dragon to 
                                    cry out in agony.
                            """);
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 2:
                    System.out.println(
                            """
                                You drop and slide under the tail. Narrowly avoiding the tail as you feel the air 
                                rush over you from the tail swipe.
                            """);
                    challenge2=true;
                    dragonChallenge3();
                    break;
                case 3:
                    System.out.println(
                            """
                                You leap into the air and get smacked by the tail. You fly into the air and just 
                                before you splat into the cave wall, you swear you hear the Dragon say 'HOME RUN!'.
                                You then coat the wall in a new colour called hint of internal organs.
                            """);
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
            System.out.println(
                    """
                            'ENOUGH!!' The Dragon bellows! 'I will not have you insult my presence any longer!!'
                             It charges you, looking to swallow you whole!
                    """);
            System.out.println(
                    """
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
                    if (myWeapon == Weapons.swordAndShield && potion=true){
                        System.out.println(
                                """
                                                You leap into the maw of the Dragon. He swallows you whole and you feel yourself slide
                                                down the gullet of the beast. You don't have much time. You use all of your remaining
                                                strength to slice and cut the innards of the Dragon. You hear their muffled screams of
                                                pain, their cries of pain slowly being turned into gargled screams as blood fills their
                                                throat. You fear that you may not survive the insides of the dragon, even though you
                                                slew the beast. However, the potion you drank gave you the resiliance to not only 
                                                survive, but cut your way out. You saved the village and lived to tell the tale. Thanks
                                                to you, the village thrives. Your story is shared across the land, a statue erected in
                                                the village square and you are heralded as a hero.
                                """);
                        heroEnding();
                    }
                    else {
                        System.out.println(
                                """
                                                You leap into the maw of the Dragon. He swallows you whole and you feel yourself slide
                                                down the gullet of the beast. You don't have much time. You use all of your remaining
                                                strength to slice and cut the innards of the Dragon. You hear their muffled screams of
                                                pain, their cries of pain slowly being turned into gargled screams as blood fills their
                                                throat. However, it doesn't stop you being trapped inside them. Whether you drowned in
                                                the dragon's blood, suffocated inside them or died in their stomach. What is known 
                                                though, is that you saved the village. Thanks to your heroic sacrifice, the village 
                                                thrives. Stories are made in your name, a statue erected in the village square and the
                                                village will never forget the hero who sacrificed themselves, so they may live freely.
                                        """);
                        neutralEnding();
                    }
                    challenge3=true; //Ana, work out a way to set code for the alt endings depending on weapon
                    break;
                case 2:
                    System.out.println(
                    """
                            You attempt to dodge again, but you only move yourself directly into the dragon's
                            teeth as it's jaw clamps down, carving your body in two.
                    """);
                    restart();
                    break;
                case 3:
                    System.out.println(
                    """
                            You charge the beast, running straight into it's teeth. Resulting in you becoming
                            a hard earned snack.
                    """);
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

    public class weapon {
        private int weapon;
        public int getWeapon() {
            return weapon;
        }
        public void setWeapon(int newWeapon) {
            this.weapon = newWeapon;
        }
    }

    static void gameOver()
    {
        System.out.print("");
        System.out.println("<  Game Over >");
        System.out.println("<  Made By  >");
        System.out.println("<  Johnathon and Ana  >");
        System.out.println(" ");
        System.exit(0);
    }

}