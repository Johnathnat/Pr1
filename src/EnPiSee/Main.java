package EnPiSee;

import java.util.Scanner;

public class Main {

    Player player = new Player();

    public static void main(String[] args) {
        /*start of the game*/
        Main mane = new Main();
        mane.game();
    }

    public void game()
    {
        player = new Player();
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

/*Introduction to the game*/
    static void intro() {
        System.out.println("Hi!");
        System.out.println(
            """
            My name is En Pisee! And this is my game! I will be your narrator for this adventure.
            You! Will be the hero of my story! Making challenging choices, taking horrifying risks,
            and hopefully defeating the evil dragon and beat my game!!
            Are you up for the challenge?
            """
        );
        System.out.println(
            """
            1) 'Heck yes!!'
            2) 'WTF are you??'
            """
        );
        System.out.print("> ");
        Scanner keyboard = new Scanner(System.in);
        /*Fist input going up or down*/
        int welcome = Integer.parseInt(keyboard.next());
        switch (welcome) {
            /*progress*/
            case 1:
                System.out.println("'Heck yes!!'");
                break;

            /*Go option 2*/
            case 2:
                System.out.println("'WTF are you??'");
                break;
        }
    }

/*Introduction to the Village*/
    static void village() {
        int i = 0;
        while (i < 5) {
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
            switch (village) {
                /*village option: Insult*/
                case 1:
                    System.out.println("1)'No, seriously. WTF are you?'");
                    i = i + 1;
                    /*game over*/
                    break;
                /*village option: Pity*/
                case 2:
                    i = 6;
                    System.out.println("2) Take pity on the villagers");

                    break;
                /*village option: Sympathise*/
                case 3:
                    System.out.println("3) Sympathise with the villagers");
                    i = 6;
                    break;

                /*village option: disgust*/
                case 4:
                    System.out.println("4) Look at them in disgust");
                    i = 6;
                    break;
            }
        }
        if (i == 5) {
            /*NPC leaves ending*/
            System.out.println("Ok! That does it!! If you're just going to be rude! I won't tell you my excellent story.");
            System.out.println("Good bye!!");
            gameOver();
        }
    }

/*Weapon Choice*/
    private void weapons() {
        System.out.println(
            """
            You decide to take action and attempt to slay the dragon, freeing the villagers
            from their bindings so that they might live. You head to the local weapons
            merchant and find 4 weapons. Which do you take?
            """
        );
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
        switch (weaponChoice) {
            /*weapon option: Sword and shield*/
            case 1:
                System.out.println("Sword and shield");
                this.player.setWeapon(Items.Weapons.swordAndShield);
                break;
            /*weapon option: Long Sword*/
            case 2:
                System.out.println("Long Sword");
                this.player.setWeapon(Items.Weapons.longSword);
                break;
            /*weapon option: Dark Dagger*/
            case 3:
                System.out.println("Dark Dagger");
                this.player.setWeapon(Items.Weapons.darkDagger);
                break;
            /*weapon option: Lighter*/
            case 4:
                System.out.println("Lighter");
                this.player.setWeapon(Items.Weapons.lighter);
                break;
        }
    }

/*Old Crone Encounter*/
    private void oldCrone() {
        boolean restartEncounter= false;
        while(!restartEncounter) {
            System.out.println
                    (
                        """
                        You venture toward the Dragon's cave. An old crone approaches you, offering you
                        aid. Do you accept?
                        """
                    );
            System.out.println
                    (
                        """
                        1) Accept
                        2) Ignore
                        3) Berate
                        """
                    );
            System.out.print(">  ");

            Scanner keyboard = new Scanner(System.in);
            int crone = Integer.parseInt(keyboard.next());
            switch (crone) {
                /*crone option: Accept*/
                case 1:
                    System.out.println("Accept");
                    if (player.getWeapon() == Items.Weapons.swordAndShield)
                    {
                        this.player.setPotion(true);
                        System.out.println(
                            """
                            She hands you a potion. It glows with a mysterious power. You store it for later.
                            """
                        );
                        restartEncounter= true;
                        break;
                    }
                    else
                    {
                        System.out.println(
                            """
                            She hands you a potion. You drink the potion but nothing happens.
                            """
                        );
                        restartEncounter= true;
                    }
                    break;
                /*crone option: Ignore*/
                case 2:
                    System.out.println(
                        """
                        You ignore the crone. She smelt funny anyway.
                        """
                    );
                    restartEncounter= true;
                    break;
                /*crone option: Berate*/
                case 3:
                    System.out.println(
                        """         
                        'Be gone from my sight, you foul smelling wench!' You sneer. The crone
                        smiles. Her yellow teeth showing the many years of dental neglect as a
                        strange, green smoke surrounds the pair of you. You feel strange. Prickly
                        even. You can't see, but you have been turned into a cactus.
                        """
                    );
                    restart();


                    break;

            }
        }

    }

/*River Encounter*/
    private void river() {
        boolean crossing = false;
        while (!crossing) {
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
            switch (river) {
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
                    crossing = true;
                    break;
            }
        }
    }

/*Bomb Encounter*/
    private void bomb()
    {
        boolean restartEncounter=true;
        while(restartEncounter)
        {
            System.out.println(
                    """
                            You venture on. Eventually, coming across an ornate chest! You open the chest and reach inside an-
                            OH MY GOD!!! IT'S A LIT BOMB!! Quick! Throw it away!!
                            """);
            System.out.println(
                    """
                            1) Throw bomb
                            2) Hold on to bomb
                            3) Give bomb to En Pisee
                            4) Extinguish bomb
                            """);
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int quickThink = Integer.parseInt(keyboard.next());
            switch (quickThink) {
                case 1:
                    System.out.println("You hurl the bomb away and it explodes harmlessly.");
                    restartEncounter=false;
                    break;
                case 2:
                    System.out.println("What? Why would yo-\n");
                    System.out.println("The bomb explodes in your hands. Sending pieces of you flying everywhere.");
                    restart();
                    break;
                case 3:
                    System.out.println("huh? what????");
                    gameOver();
                    break;
                case 4:
                    System.out.println("Extinguish bomb");
                    if (player.getWeapon() == Items.Weapons.lighter) {
                        this.player.seBomb(true);
                        System.out.println(
                            """
                            You use the lid of the lighter to put out the bomb fuse. I have no clue how that worked.
                            """
                        );
                        restartEncounter=false;
                    } else {
                        System.out.println("You try to extinguish the bomb. To no avail. It explodes in your face.");
                        restart();
                        break;
                    }

            }
        }

    }

/*Mountain Encounter*/
    private void climb() {
        int climbing = 0;
        while (climbing < 5) {
            System.out.println(
                """
                You start getting closer to the cave, but the only way to get to the cave seems to be up
                a dangerous cliff side. What do you do?
                """
            );
            System.out.println(
                """
                1) Scale unsafe cliff side
                2) Take the scenic route
                3) Wait for a lift 
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int route = Integer.parseInt(keyboard.next());
            switch (route) {
                case 1:
                    System.out.println(
                        """
                        You attempt to scale the cliff, but a rock breaks as you push off and you fall and
                        become a pizza splat on the ground.
                        """
                    );
                    restart();
                    break;
                case 2:
                    System.out.println(
                        """
                        You take the scenic route. Taking in the beautiful views as you safely make your
                        way to the top.
                        """
                    );
                    climbing = 5;
                    break;
                case 3:
                    if (climbing < 5) {
                        System.out.println("Oh for god's sake. Just go!");
                    } else {
                        System.out.println("You wait for a lift, but no one comes.");
                        climbing = climbing + 1;
                    }
                    break;
            }
        }
    }

/*Cave Encounter*/
    private void cave() {
        boolean restartEncounter=true;
        boolean batEncounter = false;
        while(restartEncounter)
        {
            System.out.println(
                """
                You reach the Dragon's cave. Walking through the dark tunnels, you find it hard to
                navigate through. You trip on a rock that you didn't see, and 100 red eyes appear
                from the ceiling. A swarm of bats charge towards you!
                """
            );
            if (!batEncounter)
            {
                System.out.println(
                    """
                    1) Say hi to bats
                    2) Use weapon on broken wall
                    3) Run through dangerous cave
                    """
                );
                System.out.print(">  ");
                Scanner keyboard = new Scanner(System.in);
                int caveChoice = Integer.parseInt(keyboard.next());
                boolean batAttack = true;
                while (batAttack)
                {
                    switch (caveChoice)
                    {
                        case 1:
                            System.out.println(
                                    """
                                    The bats still charge towards you!
                                    """);
                            System.out.println(
                                """
                                1) Remain friendly
                                2) Run and hide (back to cave options without bat option)
                                """
                            );
                            int bats = Integer.parseInt(keyboard.next());
                            switch (bats) {
                                case 1:
                                    System.out.println("You are swarmed by the bats. When they finally leave, the only thing left of you is a skeleton.");
                                    restart();
                                    break;
                                case 2:
                                    System.out.println("You duck behind rock and the bats rush by.");
                                    batAttack = false;
                                    batEncounter=true;
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("You take your weapon and break a near by wall and get away from the bats.");
                            restartEncounter = false;
                            batAttack = false;
                            batEncounter = true;
                            break;
                        case 3:
                            System.out.println(
                                """
                                You run through the dark cave. Running into a wall and causing a stalagmite...
                                stalactite? One of those point rock thingies to fall on top of you.
                                """
                            );
                            restart();
                            break;
                    }
                }
            }
            else
            {
                System.out.println(
                    """
                    1)
                    2) Use weapon on broken wall
                    3) Run through dangerous cave
                    """
                );
                System.out.print(">  ");
                Scanner keyboard = new Scanner(System.in);
                int caveChoice = Integer.parseInt(keyboard.next());
                switch (caveChoice) {
                    case 1:
                        System.out.println("Nope not doing that again!");
                        break;
                    case 2:
                        System.out.println("You take your weapon and break a near by wall and get away from the bats.");
                        restartEncounter = false;
                        break;
                    case 3:
                        System.out.println(
                            """
                            You run through the dark cave. Running into a wall and causing a stalagmite...
                            stalactite? One of those point rock thingies to fall on top of you.
                            """
                        );
                        restart();
                        break;
                }
            }
        }
    }

/*Dragon Encounter*/
    private void dragon() {
        int meetingDragon = 0;
        while (meetingDragon < 5) {
            System.out.println(
                """
                Finally, you reach the Dragon's lair. The hulking, beast lays resting atop its hoard.
                How do you approach?
                """
            );
            System.out.println(
                """
                1) Insult the dragon
                2) Challenge
                3) Drink potion
                4) Sneak up to dragon                                                                                     
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int meeting = Integer.parseInt(keyboard.next());
            switch (meeting) {
                case 1:
                    System.out.println(
                        """
                        'WAKE UP YOU SCALEY GIT!' You yell. The Dragon opens one eye, looks at you,
                        and with a yawn opens it's maw and blasts you with it's ning breath. Killing
                        you instantly.
                        """
                    );
                    restart();
                    break;
                case 2:
                    System.out.println(
                        """
                        'I challenge thee, vile beast!' You bellow.
                        """
                    );
                    meetingDragon = 6;
                    dragonChallenge1();

                    break;
                case 3:
                    if (player.getPotion()) {
                        System.out.println(
                            """
                            You chug the entirety of your potion, throw the glass down on the ground
                            and yell 'Awaken, vile beast, you shall torment the good people of that
                            village any longer!'
                            """
                        );
                    } else {
                        System.out.println(
                            """
                            You reach for a potion you don't have, shrug and call the dragon a cunt.
                            It bolts up and glares at you.
                            """
                        );
                    }
                    meetingDragon = 6;
                    dragonChallenge1();
                    break;
                case 4:
                    System.out.println("progress to sneak");
                    if (player.getWeapon() == Items.Weapons.darkDagger || player.getWeapon() == Items.Weapons.lighter){
                        System.out.println(
                            """
                            You duck down low and cautiously make your way behind the dragon. Slowly
                            making your way past the beast's hoarded treasures.
                            """
                        );
                    dragonSneak1();
                    }
                    else {
                        System.out.println(
                            """
                            You duck down low and cautiously make your way behind the dragon. However,
                            you trip on an unseen rock and collapse onto the treasure. You hope the noise
                            did not wake the beast. You look up to see it staring down at you. 'Nice try.'
                            It scoffs before biting and swallowing you whole.
                            """
                        );
                        restart();
                    }

                    meetingDragon = 6;
                    break;
            }
        }
    }


/*Dragon encounter part 1 challenge approach
 * This is the start of an encounter
 * and the player has chosen the challenge approach
 */
    private void dragonChallenge1() {
        boolean challenge1 = false;
        while (!challenge1) {
            System.out.println(
                """
                The Dragon stands atop it' hoard, staring you down. It's chest inflates and it's eyes
                glow an electric blue as it readies it's lightening breath toward you.
                """
            );
            System.out.println(
                """
                1) Dodge
                2) Charge
                3) Dance off
                4) Just a joke bro!                                                                                       
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal1 = Integer.parseInt(keyboard.next());
            switch (chal1) {
                case 1:
                    System.out.println(
                        """
                        You run toward the dragon, diving to the left and narrowly missing the Dragon's
                        lightening breath as it sizzles past you.
                        """
                    );
                    challenge1 = true;
                    dragonChallenge2();
                    break;
                case 2:
                    System.out.println(
                        """
                        You charge the Dragon. Bellowing a battle cry. The Dragon rears back and electrocutes
                        you with its lightening breath, turning you to ashe before you even get close.
                        """
                    );
                    restart();
                    break;
                case 3:
                    System.out.println(
                        """
                        You start dancing. Your moves, incredible. Timing, immaculate. It's almost as if 
                        dancing was your true calling. The dragon, crushes you with it's colossal tail mid 
                        dance. It's a dragon fight! Not a dance contest.
                        """
                    );
                    restart();
                    break;
                case 4:
                    System.out.println(
                        """
                        With a look of disappointment, the dragon sighs and slaps you with its mighty claw. 
                        Sending you flying into the cave wall and killing you on impact.
                        """
                    );
                    restart();
                    break;
            }
        }
    }


/*Dragon encounter part 2 challenge approach
 * This is the next part of an encounter
 * and the player has chosen the challenge approach
 */
    private void dragonChallenge2() {
        boolean challenge2 = false;
        while (!challenge2) {
            System.out.println(
                """
                The Dragon growls. How dare this intruder insult them by not dying faster. They whirl around,
                their tail heading straight for you.
                """
            );
            System.out.println(
                """
                1) Strike
                2) Dodge
                3) Leap
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal2 = Integer.parseInt(keyboard.next());
            switch (chal2) {
                case 1:
                    System.out.println(
                        """
                        You swing your mighty weapon. Carving through the tail, causing the Dragon to 
                        cry out in agony.
                        """
                    );
                    challenge2 = true;
                    dragonChallenge3();
                    break;
                case 2:
                    System.out.println(
                        """
                        You drop and slide under the tail. Narrowly avoiding the tail as you feel the air 
                        rush over you from the tail swipe.
                        """
                    );
                    challenge2 = true;
                    dragonChallenge3();
                    break;
                case 3:
                    System.out.println(
                        """
                        You leap into the air and get smacked by the tail. You fly into the air and just 
                        before you splat into the cave wall, you swear you hear the Dragon say 'HOME RUN!'.
                        You then coat the wall in a new colour called hint of internal organs.
                        """
                    );
                    restart();
                    break;
            }
        }
    }


/*Dragon encounter Part 3 challenge approach
 * This is the final part of an encounter
 * and the player has chosen the challenge approach
 */
    private void dragonChallenge3() {
        boolean challenge3 = false;
        while (!challenge3) {
            System.out.println(
                """
                'ENOUGH!!' The Dragon bellows! 'I will not have you insult my presence any longer!!'
                It charges you, looking to swallow you whole!
                """
            );
            System.out.println(
                """
                1) Leap into the maw of the beast
                2) Dodge
                3) Charge
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int chal3 = Integer.parseInt(keyboard.next());
            switch (chal3) {
                case 1:
                    if (player.getWeapon() == Items.Weapons.swordAndShield && player.getPotion()) {
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
                            """
                        );
                        heroEnding();
                    } else {
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
                            """
                        );
                        neutralEnding();
                    }
                    challenge3 = true;
                    break;
                case 2:
                    System.out.println(
                        """
                        You attempt to dodge again, but you only move yourself directly into the dragon's
                        teeth as it's jaw clamps down, carving your body in two.
                        """
                    );
                    restart();
                    break;
                case 3:
                    System.out.println(
                        """
                        You charge the beast, running straight into it's teeth. Resulting in you becoming
                        a hard earned snack.
                        """
                    );
                    restart();
                    break;
            }
        }
    }


/*Dragon encounter Part 1 Sneak approach
 * This is the first part of an encounter
 * and the player has chosen the sneak approach
 */
    private void dragonSneak1() {
        boolean sneak1 = false;
        while (!sneak1) {
            System.out.println(
                """
                You get behind the dragon, but you knock over some coins! The sound causes the dragon
                to raise it's head suddenly and start looking around.
                """
            );
            System.out.println(
                """
                1) Freeze
                2) Hide
                3) Say Hi
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking1 = Integer.parseInt(keyboard.next());
            switch (sneaking1) {
                case 1:
                    System.out.println(
                        """
                        You once heard that a dragon's vision is based on movement.
                        You heard wrong.
                        The Dragon crushes you with it's tail.
                        """
                    );
                    restart();
                    break;
                case 2:
                    System.out.println(
                        """
                        You duck behind a pile of treasure. The Dragon takes a moment, before return to it's
                        rest.
                        """
                    );
                    sneak1 = true;
                    dragonSneak2();
                    break;
                case 3:
                    System.out.println(
                        """
                        The Dragon looks at you, bewildered. Then smiles.
                        'Goodbye.'
                        It blasts you with it's lightening breath.
                        """
                    );
                    restart();
                    break;
            }
        }
    }


/*Dragon encounter Part 2 Sneak approach
 * This is the next part of an encounter
 * and the player has chosen the sneak approach
 */
    private void dragonSneak2() {
        boolean sneak2 = false;

        while (!sneak2) {
            System.out.println(
                """
                You edge ever closer to the beast. It's large, powerful form lay resting peacefully
                as you close in on it's belly.
                """
            );
            System.out.println(
                """
                1) Lighter
                2) Sneak
                3) Sneeze
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking2 = Integer.parseInt(keyboard.next());
            switch (sneaking2) {
                case 1:
                    if(player.getWeapon() == Items.Weapons.lighter && player.getBomb()) {
                        System.out.println(
                            """
                            You approach the tail of the Dragon. Pull out your lighter and ignite their
                            tail. The fire catches disturbingly well. The beast screams and fails as it
                            begins to burn. It's scales beginning to crisp and flake off the body whilst
                            it slowly burns to death. You slew the beast. The dragon is no more. Some
                            saying it's pained howls haunting the caves forever.
                            """
                        );
                        sneak2 = true;
                        wtfEnding1();
                    }
                    else {
                        System.out.println(
                            """
                            You approach the tail of the Dragon. Pull out your lighter and ignite their
                            tail. The fire catches disturbingly well. The beast screams and fails as it
                            begins to burn. It's scales beginning to crisp and flake off the body whilst
                            it slowly burns to death. You slew the beast. The dragon is no more. Some
                            saying it's pained howls haunting the caves forever.
                            """
                        );
                        sneak2 = true;
                        evilEnding();
                    }
                    break;
                case 2:
                    System.out.println(
                        """
                        You make your way under the dragon's soft, under belly.
                        """
                    );
                    sneak2 = true;
                    dragonSneak3();
                    break;
                case 3:
                    System.out.println(
                        """
                        'A-A-ACHOO!' Your sneeze echos through the cave. Waking the dragon who's head
                        snaps to look at you. It looks at you with a level of disappointment you
                        normally only reserved for parents.
                        'Really?' The Dragon asks, before briefly getting up, and then crushing you
                        underneath it's large body.
                        """
                    );
                    restart();
                    break;
            }
        }
    }


/*Dragon encounter Part 3 Sneak approach
* This is the third part of an encounter
* and the player has chosen the sneak approach
*/
    private void dragonSneak3() {
        boolean sneak3 = false;
        while (!sneak3) {
            System.out.println(
                """
                You manage to reach the soft belly of the best. The Dragon, still sleeping and
                unaware of your presence. Prey to your next decision.
                """
            );
            System.out.println(
                """
                1) Gut
                2) Tickle
                3) Stab
                """
            );
            System.out.print(">  ");
            Scanner keyboard = new Scanner(System.in);
            int sneaking3 = Integer.parseInt(keyboard.next());
            switch (sneaking3) {
                case 1:
                    if (player.getWeapon() == Items.Weapons.darkDagger) {
                        System.out.println(
                            """
                            You slide your dagger into the belly and begin running. Cutting a gaping
                            hole in their stomach. The Dragon cries out in pain. It rolls over to 
                            see what happened which cause it's insides to fall out of it's body. It
                            gasps in horror and as the light leaves it's eyes, the last thing it sees
                            is the beast who did this to them. You slew the dragon, but upon taking in
                            the immense pile of treasure in this cave, you make a decision. You take
                            the Dragon's place. The village you, seemingly, set out to save is now your
                            victim. They now must all give their valuables and food to you. They only
                            live because you see fit for them to live to serve your needs. Your legend
                            set, as the beast who slew a dragon.
                            """
                        );
                    } else if (player.getWeapon() == Items.Weapons.lighter) {
                        System.out.println(
                            """
                            You approach the tail of the Dragon. Pull out your lighter and ignite their
                            tail. The fire catches disturbingly well. The beast screams and fails as it
                            begins to burn. It's scales beginning to crisp and flake off the body whilst
                            it slowly burns to death. It screams in horror and the last thing it sees is
                            the monster who did this to them. You slew the dragon but upon taking in the
                            immense pile of treasure in this cave, you make a decision. You take the
                            Dragon's place. The village you, seemingly, set out to save is now your
                            victim. They now must all give their valuables and food to you. They only
                            live because you see fit for them to live to serve your needs. Your legend
                            set, as the monster who slew a dragon.
                            """
                        );
                    }
                    sneak3 = true;
                    evilEnding();
                    break;
                case 2:
                    System.out.println(
                        """
                        You begin tickling the beast. It erupts in roars of laughter! In it's
                        uncontrollable laughter, it rolls over and crushes you.
                        """
                    );
                    restart();
                    break;
                case 3:
                    if (player.getWeapon() == Items.Weapons.darkDagger) {
                        System.out.println(
                            """
                            You stab your dagger into the beast. It's head snaps up and whirls
                            around to face you.
                            'Ow!' It says, sounding heavily insulted. It blasts you with it's
                            lightening breath. Frying you to a crisp before returning to it's
                            rest.
                            """
                        );
                    } else if (player.getWeapon() == Items.Weapons.lighter) {
                        System.out.println(
                            """
                            You jab the lighter into the belly of the Dragon. Nothing happens.
                            You try again. And again. And again and again and again. The
                            Dragon lets out a tired grunt and rolls over you. You suffocate
                            underneath it.
                            """
                        );
                    }
                    restart();
                    break;
            }
        }
    }


/*
 * Normal Ending.
 */
    static void neutralEnding() {
        System.out.println("Yay! You beat the game!! You slew the dragon and saved the village!");
        System.out.println("Pity you died though. You could have survived that fight and-");
        System.out.println("Well, I can't say more.");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }

/*
 * Hero Ending.
 * This is when the player chooses the sword and
 *  shield and also takes the potion.
 */
    static void heroEnding() {
        System.out.println("You did it!! You saved the village and survived the final confrontation with the dragon!");
        System.out.println("I'm really glad you got the Hero ending. I was really worried you might get the-");
        System.out.println("...");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }

/*
 * Evil Endings.
 */
    static void evilEnding() {
        System.out.println("Well, you did it. I guess.");
        System.out.println("You killed the dragon, but then you enslaved the village. I'm surprised this was the route you took but you chose this.");
        System.out.println("Could have been worse though!");
        System.out.println("Thanks for playing!! Hope to see you again one day. Maybe I can tell you a different story.");
        gameOver();
    }
/*
* WTF Endings.
*/
    static void wtfEnding1() {
        System.out.println("Yay! Y-You did it!! You saved the village! The dragon is dead!");
        System.out.println("Thanks for playing! I'm g-going to leave now!");
        System.out.println("1) Walk to the village...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding2();
        } else {
            wtfEnding2();
        }
    }

    static void wtfEnding2() {
        System.out.println("What are you doing? The game's over. You can stop playing now!");
        System.out.println("1) Walk up to a villager...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding3();
        } else {
            wtfEnding3();
        }
    }

    static void wtfEnding3() {
        System.out.println("The game is done! You can leave now!");
        System.out.println("1) Burn a villager...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding4();
        } else {
            wtfEnding4();
        }
    }

    static void wtfEnding4() {
        System.out.println("'The villager screams as they are burnt alive'");
        System.out.println("I-I didn't say that! That's not my story!");
        System.out.println("1) Light and throw the bomb...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding5();
        } else {
            wtfEnding5();
        }
    }

    static void wtfEnding5() {
        System.out.println("'The bomb explodes. Villagers scream as their homes are destroyed. The explosion causes a fire which spreads to the rest of the close knit village. Smoke billows from every house and building.'");
        System.out.println("Stop it! Stop ruining my game!!");
        System.out.println("1) Walk towards En Pisee...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding6();
        } else {
            wtfEnding6();
        }
    }

    static void wtfEnding6() {
        System.out.println("Wait, no. Keep back!");
        System.out.println("1) Burn En Pisee...");
        Scanner keyboard = new Scanner(System.in);
        int wtf1 = Integer.parseInt(keyboard.next());
        if (wtf1 == 1) {
            wtfEnding7();
        } else {
            wtfEnding7();
        }
    }

    static void wtfEnding7() {
        String scream = "AAAAAAAAAAAAAAAAA";
        for (int A = 0; A < 100; A++)
            System.out.print(scream);
        gameOver();
    }

    /* Restart function runs any time the
    * player makes the wrong choice and
    * gives them the option to either restart
    * or end the game*/
    void restart() {
        System.out.println("1) Try again");
        System.out.println("2) Restart game");
        System.out.println("3) End game");
        Scanner keyboard = new Scanner(System.in);
        int restartOption = Integer.parseInt(keyboard.next());
        switch (restartOption) {
            case 1:
                break;
            case 2:
                game();
                break;
            case 3:
                gameOver();
                break;
        }

    }
    /* The Game Over function runs any time the game ends */
    static void gameOver() {
        System.out.print("");
        System.out.println(
                            """
                            <  Game Over >
                            <     By     >
                            < John & Ana >
                            """
                            );
        System.out.println(" ");
        System.exit(0);
    }

/*End*/
}

