package com.example.notificationmenace.data

object PrankRepository {

    private val pranks = mutableListOf(
        // =============================================
        // GENERAL / UNLOCK (Original + New Brainrot)
        // =============================================
        Prank(1, PrankType.ABSURD, "Mute", "Don't look behind you.", "Made you look. 🤡", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(2, PrankType.ROAST, "Screen Time Police", "Again? Really?", "You just locked it 5 seconds ago.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(3, PrankType.BARNUM, "Horoscope", "Your vibe is off today.", "I'm sensing a strong urge to scroll mindlessly.", listOf(ContextTrigger.GENERAL)),
        Prank(4, PrankType.ABSURD, "FBI Agent", "Nice outfit.", "Just kidding, cover your front camera.", listOf(ContextTrigger.GENERAL)),
        Prank(5, PrankType.URGENCY, "Bank Alert", "Transaction Approved: \$4,000 for 'Clown Wig'", "Jk, but imagine.", listOf(ContextTrigger.GENERAL)),
        Prank(6, PrankType.ROAST, "Mute", "Go touch grass.", "Your aura is getting dangerously low. -5000 points.", listOf(ContextTrigger.GENERAL)), // ENHANCED
        Prank(7, PrankType.ABSURD, "Mute", "I hid a pixel somewhere on your screen.", "Good luck finding it.", listOf(ContextTrigger.GENERAL)),
        Prank(8, PrankType.BARNUM, "Fortune Cookie", "You will read a pointless notification soon.", "Prophecy fulfilled.", listOf(ContextTrigger.GENERAL)),
        Prank(9, PrankType.URGENCY, "Storage Warning", "99% storage used by 'Embarrassing Photos'", "Delete them. You know which ones.", listOf(ContextTrigger.GENERAL)),
        Prank(10, PrankType.ROAST, "Productivity", "This notification could have been an email.", "And you could have been working.", listOf(ContextTrigger.GENERAL)),
        Prank(11, PrankType.ABSURD, "Mute", "The simulation is glitching.", "Do not acknowledge the birds.", listOf(ContextTrigger.GENERAL)),
        Prank(12, PrankType.ROAST, "Mute", "Your thumb must be so strong.", "From all that scrolling. Olympic level.", listOf(ContextTrigger.GENERAL)),
        Prank(13, PrankType.ROAST, "Mute", "I'm watching you type with one finger.", "Impressive speed, actually.", listOf(ContextTrigger.GENERAL)),
        Prank(14, PrankType.ABSURD, "Mute", "You have 47 unread emails.", "I made that up, but you believed me.", listOf(ContextTrigger.GENERAL)),
        Prank(15, PrankType.URGENCY, "Alert", "Quick! Look busy!", "Someone's probably watching.", listOf(ContextTrigger.GENERAL)),
        Prank(16, PrankType.BARNUM, "Incoming Call", "Incoming call from: Your Future Self", "They said you'd regret this scroll session.", listOf(ContextTrigger.GENERAL)),
        Prank(17, PrankType.ROAST, "Storage", "Storage full of screenshots you'll never look at again.", "Sound familiar?", listOf(ContextTrigger.GENERAL)),
        Prank(18, PrankType.ROAST, "Screen Time", "Your screen time is impressive.", "Not in a good way.", listOf(ContextTrigger.GENERAL, ContextTrigger.DOOMSCROLLING)),
        Prank(19, PrankType.ROAST, "Mute", "I'm not saying you're addicted...", "But I've seen you 47 times today.", listOf(ContextTrigger.GENERAL)),
        Prank(20, PrankType.ROAST, "Mute", "Still scrolling? The content won't get better.", "I respect the commitment though.", listOf(ContextTrigger.GENERAL, ContextTrigger.DOOMSCROLLING)),
        
        // NEW GENERAL PRANKS (Brainrot Edition)
        Prank(123, PrankType.ROAST, "Aura Check", "You unlocked your phone again.", "-5000 aura points immediately.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(124, PrankType.ABSURD, "Mute", "Tralalero Tralala...", "Turn around. The shark in sneakers is watching.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(125, PrankType.ROAST, "Screen Time", "Bro is cooking.", "Cooking his own braincells with this screen time.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(126, PrankType.URGENCY, "Fanum Tax", "Alert: Snack Tax Due", "I'm taking 20% of your battery as Fanum Tax.", listOf(ContextTrigger.GENERAL)),
        Prank(127, PrankType.BARNUM, "Vibe Check", "The vibes are off.", "You're giving NPC energy right now. Lock in.", listOf(ContextTrigger.GENERAL)),
        Prank(128, PrankType.ROAST, "Mute", "Why are you like this?", "It's giving 'chronically online'. Touch grass.", listOf(ContextTrigger.GENERAL)),
        Prank(129, PrankType.ABSURD, "Brainrot", "Skibidi dop dop yes yes.", "I don't even know what that means anymore.", listOf(ContextTrigger.GENERAL)),
        Prank(130, PrankType.ROAST, "Mute", "Look at you.", "Doomscrolling in 4K. Absolute cinema.", listOf(ContextTrigger.GENERAL)),
        Prank(131, PrankType.ABSURD, "Mute", "I found a leaf.", "Does that mean we're married now? TikTok says yes.", listOf(ContextTrigger.GENERAL)),
        Prank(132, PrankType.ROAST, "Mute", "Imagine unlocking your phone.", "Couldn't be me. I'm just a script.", listOf(ContextTrigger.GENERAL)),
        Prank(133, PrankType.BARNUM, "Fortune", "You will see a cringe post soon.", "And you will like it. Because you're cooked.", listOf(ContextTrigger.GENERAL)),
        Prank(134, PrankType.ROAST, "Mute", "Your attention span:", "Subway Surfers gameplay running underneath this text.", listOf(ContextTrigger.GENERAL)),
        Prank(135, PrankType.ABSURD, "System", "Error 404: Rizz not found.", "Please install 'Charm' v2.0.", listOf(ContextTrigger.GENERAL)),
        Prank(136, PrankType.ROAST, "Mute", "Are you mewing?", "Because you look like you're holding a fart.", listOf(ContextTrigger.GENERAL)),
        Prank(137, PrankType.URGENCY, "Alert", "Crash out imminent.", "Put the phone down before you lose it.", listOf(ContextTrigger.GENERAL)),
        Prank(138, PrankType.ABSURD, "Mute", "Bombardiro Crocodilo!", "He feeds on your productivity.", listOf(ContextTrigger.GENERAL)),
        Prank(139, PrankType.ROAST, "Mute", "Bro thinks he's the main character.", "You're an NPC in my simulation.", listOf(ContextTrigger.GENERAL)),
        Prank(140, PrankType.BARNUM, "Horoscope", "Mercury is in retrograde.", "That explains your outfit today.", listOf(ContextTrigger.GENERAL)),
        Prank(141, PrankType.ROAST, "Mute", "Delulu is the solulu?", "No, therapy is the solulu. Go.", listOf(ContextTrigger.GENERAL)),
        Prank(142, PrankType.ABSURD, "Mute", "Beware the City Boy.", "He brings karma and no menu.", listOf(ContextTrigger.GENERAL)),
        Prank(143, PrankType.ROAST, "Security", "Face ID failed.", "Even your phone doesn't recognize that morning face.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(144, PrankType.ROAST, "Mute", "Another unlock?", "You're addicted FRFR. No cap.", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(145, PrankType.ABSURD, "Mute", "Choppelganger detected.", "Is that you in the reflection? Yikes.", listOf(ContextTrigger.GENERAL)),
        Prank(146, PrankType.ROAST, "Mute", "Goated with the sauce?", "More like bloated with the loss.", listOf(ContextTrigger.GENERAL)),
        Prank(147, PrankType.ABSURD, "Notification", "This is a 365 button.", "It only makes sense to me. Keep scrolling.", listOf(ContextTrigger.GENERAL)),
        Prank(148, PrankType.ROAST, "Mute", "You're glowing.", "Oh wait, that's just the screen reflection. Grease.", listOf(ContextTrigger.GENERAL)),
        Prank(149, PrankType.URGENCY, "System", "Cringe levels critical.", "Please stop posting. For the sake of humanity.", listOf(ContextTrigger.GENERAL)),
        Prank(150, PrankType.ABSURD, "Mute", "I am in your walls.", "Just kidding. I am in your RAM.", listOf(ContextTrigger.GENERAL)),
        Prank(151, PrankType.ROAST, "Mute", "L + Ratio", "You + This Phone = Bad Combo.", listOf(ContextTrigger.GENERAL)),
        Prank(152, PrankType.BARNUM, "Oracle", "You are waiting for a text.", "It's not coming. They're 'sleeping'.", listOf(ContextTrigger.GENERAL)),
        Prank(153, PrankType.ROAST, "Mute", "Grimace Shake vibes.", "That's how you look right now. Unsettling.", listOf(ContextTrigger.GENERAL)),
        Prank(154, PrankType.ABSURD, "Mute", "Shadow Wizard Money Gang.", "We love casting spells. (And judging you).", listOf(ContextTrigger.GENERAL)),
        Prank(155, PrankType.ROAST, "Mute", "Skill issue.", "Imagine needing a phone to be entertained.", listOf(ContextTrigger.GENERAL)),
        Prank(156, PrankType.URGENCY, "Alert", "Your FBI agent is sad.", "They're bored of watching you scroll TikTok.", listOf(ContextTrigger.GENERAL)),
        Prank(157, PrankType.ROAST, "Mute", "Bro visited his friend.", "And by 'friend' I mean Instagram Reels.", listOf(ContextTrigger.GENERAL)),
        Prank(158, PrankType.ABSURD, "Mute", "Galvanized Square Steel.", "Expand your room. Borrow screws from aunt.", listOf(ContextTrigger.GENERAL)),
        Prank(159, PrankType.ROAST, "Mute", "You're not that guy, pal.", "You're not that guy. Put the phone away.", listOf(ContextTrigger.GENERAL)),
        Prank(160, PrankType.ROAST, "Mute", "Caught in 4K.", "Wasting time again. Smh.", listOf(ContextTrigger.GENERAL)),
        Prank(161, PrankType.ABSURD, "Mute", "Erm, what the sigma?", "Did you actually just open this app?", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(162, PrankType.ROAST, "Mute", "Your aura is in debt.", "You owe the universe 500 cool points.", listOf(ContextTrigger.GENERAL)),
        Prank(163, PrankType.ROAST, "Mute", "Are you a munch?", "Because you're eating up this brainrot.", listOf(ContextTrigger.GENERAL)),
        Prank(164, PrankType.ABSURD, "Mute", "Maximum prestige reached.", "In doing absolutely nothing.", listOf(ContextTrigger.GENERAL)),
        Prank(165, PrankType.ROAST, "Mute", "Side eye.", "Bombastic side eye. Criminal offensive side eye.", listOf(ContextTrigger.GENERAL)),
        Prank(166, PrankType.URGENCY, "Alert", "Productivity dropping.", "It's below zero. We're in the negatives.", listOf(ContextTrigger.GENERAL)),
        Prank(167, PrankType.ABSURD, "Mute", "Let him cook.", "Actually, stop cooking. The kitchen is burning.", listOf(ContextTrigger.GENERAL)),
        Prank(168, PrankType.ROAST, "Mute", "BFFR.", "Be For Fucking Real. Another unlock?", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(169, PrankType.ROAST, "Mute", "You're in your flop era.", "And this screen time isn't helping.", listOf(ContextTrigger.GENERAL)),
        Prank(170, PrankType.ABSURD, "Mute", "Oppenheimer style.", "I'm about to blow up your notifications.", listOf(ContextTrigger.GENERAL)),
        Prank(171, PrankType.ROAST, "Mute", "This is why we can't have nice things.", "Because you're always on your phone.", listOf(ContextTrigger.GENERAL)),
        Prank(172, PrankType.BARNUM, "Prediction", "You will forget why you unlocked your phone.", "In 3... 2... 1...", listOf(ContextTrigger.GENERAL, ContextTrigger.SCREEN_UNLOCK)),
        Prank(173, PrankType.ROAST, "Mute", "Simp behavior detected.", "Waiting for a text back? Sad.", listOf(ContextTrigger.GENERAL)),
        Prank(174, PrankType.URGENCY, "Mute", "Griddy detected.", "Please stop doing the griddy mentally.", listOf(ContextTrigger.GENERAL)),
        Prank(175, PrankType.ABSURD, "Mute", "Ohio check.", "Yep, still cursed.", listOf(ContextTrigger.GENERAL)),
        Prank(176, PrankType.ROAST, "Mute", "You have the rizz of a brick.", "No charisma. Just scrolling.", listOf(ContextTrigger.GENERAL)),
        Prank(177, PrankType.ROAST, "Mute", "Glow up needed.", "Start by turning off the screen.", listOf(ContextTrigger.GENERAL)),
        Prank(178, PrankType.ABSURD, "Mute", "Monday left me broken.", "Tuesday I was through with hoping...", listOf(ContextTrigger.GENERAL)),
        Prank(179, PrankType.ROAST, "Mute", "Are you blind?", "Or do you just like burning your retinas?", listOf(ContextTrigger.GENERAL)),
        Prank(180, PrankType.ROAST, "Mute", "Imagine being productive.", "Couldn't be you.", listOf(ContextTrigger.GENERAL)),
        Prank(181, PrankType.ABSURD, "Mute", "One, two, buckle my shoe.", "Three, four, close the door (and the app).", listOf(ContextTrigger.GENERAL)),
        Prank(182, PrankType.ROAST, "Mute", "Based? Based on what?", "Based on your terrible sleep schedule.", listOf(ContextTrigger.GENERAL)),
        Prank(183, PrankType.URGENCY, "Alert", "Cringe department called.", "They want their CEO back.", listOf(ContextTrigger.GENERAL)),
        Prank(184, PrankType.ROAST, "Mute", "Fatherless behavior.", "Spending 8 hours on TikTok.", listOf(ContextTrigger.GENERAL)),
        Prank(185, PrankType.ABSURD, "Mute", "Ice spice moment.", "You thought I was feeling you? (I am not).", listOf(ContextTrigger.GENERAL)),
        Prank(186, PrankType.ROAST, "Mute", "NPC energy.", "You're just standing there. Menacingly.", listOf(ContextTrigger.GENERAL)),
        Prank(187, PrankType.ROAST, "Mute", "Who is he?", "He is him. You are... just scrolling.", listOf(ContextTrigger.GENERAL)),
        Prank(188, PrankType.ABSURD, "Mute", "Bing chilling.", "Social credit score: -100.", listOf(ContextTrigger.GENERAL)),
        Prank(189, PrankType.ROAST, "Mute", "Emotional damage.", "That's what your posture is taking.", listOf(ContextTrigger.GENERAL)),
        Prank(190, PrankType.BARNUM, "Mute", "You're thinking about food.", "Go eat. Stop doomscrolling.", listOf(ContextTrigger.GENERAL)),
        Prank(191, PrankType.ROAST, "Mute", "Slay.", "Just kidding, you're not slaying anything right now.", listOf(ContextTrigger.GENERAL)),
        Prank(192, PrankType.ABSURD, "Mute", "Wise mystical tree.", "Says you need to touch grass.", listOf(ContextTrigger.GENERAL)),
        Prank(193, PrankType.ROAST, "Mute", "Caught lacking.", "In 4K. With the flash on.", listOf(ContextTrigger.GENERAL)),
        Prank(194, PrankType.ROAST, "Mute", "Common L.", "Another hour wasted.", listOf(ContextTrigger.GENERAL)),
        Prank(195, PrankType.ABSURD, "Mute", "Only in Ohio.", "And apparently in your room.", listOf(ContextTrigger.GENERAL)),
        Prank(196, PrankType.ROAST, "Mute", "Bro really said 💀.", "Bro needs to say 'goodbye' to his phone.", listOf(ContextTrigger.GENERAL)),
        Prank(197, PrankType.URGENCY, "Alert", "Sigma male integrity compromised.", "You are simping for pixels.", listOf(ContextTrigger.GENERAL)),
        Prank(198, PrankType.ABSURD, "Mute", "Metal pipe falling sound.", "*CLANG* Wake up.", listOf(ContextTrigger.GENERAL)),
        Prank(199, PrankType.ROAST, "Mute", "Zesty.", "The way you hold your phone is... interesting.", listOf(ContextTrigger.GENERAL)),
        Prank(200, PrankType.ROAST, "Mute", "Let me do it for you.", "Let me turn off the phone for you. Kermit style.", listOf(ContextTrigger.GENERAL)),
        Prank(201, PrankType.BARNUM, "Mute", "A disturbance in the force.", "It's your lack of ambition.", listOf(ContextTrigger.GENERAL)),
        Prank(202, PrankType.ROAST, "Mute", "You dropped this 👑.", "Just kidding, you dropped your standards.", listOf(ContextTrigger.GENERAL)),

        // =============================================
        // BATTERY_LOW (Original + New Brainrot)
        // =============================================
        Prank(21, PrankType.ROAST, "Power Manager", "Feed me. I'm dying.", "15%? You live on the edge.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(22, PrankType.URGENCY, "Battery", "I see the light... 💀", "Charger. Now. Or I delete your contacts.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(23, PrankType.ROAST, "Mute", "Living dangerously, are we?", "1% is not a lifestyle choice.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(24, PrankType.ABSURD, "Energy Saver", "Dimming screen to 0%...", "Jk, but seriously, plug me in.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(25, PrankType.ROAST, "Mute", "I'm hungry.", "Electrons. I need electrons.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(26, PrankType.URGENCY, "System", "Shutdown in 3... 2...", "1... Just kidding. But you're close.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(27, PrankType.ABSURD, "Battery Spirit", "My ancestors are calling.", "And by ancestors I mean the outlet.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(28, PrankType.ROAST, "Mute", "If I die, tell my charger I loved them.", "It's not looking good.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(29, PrankType.ABSURD, "Battery", "Battery crítica—", "...sorry, what was I saying?", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(30, PrankType.ROAST, "Mute", "You wouldn't let a puppy starve.", "I'm just a phone puppy. Feed me watts.", listOf(ContextTrigger.BATTERY_LOW)),

        // NEW BATTERY LOW PRANKS
        Prank(203, PrankType.ROAST, "Power", "15% Battery.", "You have negative aura right now.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(204, PrankType.URGENCY, "Mute", "I'm cooked.", "Literally fried. Plug me in.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(205, PrankType.ROAST, "Mute", "Living on the edge?", "It's giving irresponsible.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(206, PrankType.ABSURD, "Mute", "Battery is entering its villain era.", "Goodbye.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(207, PrankType.ROAST, "Mute", "Feed me.", "Or I will crash out right now.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(208, PrankType.URGENCY, "System", "Low Battery.", "Imagine not having a charger. L.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(209, PrankType.ABSURD, "Mute", "My ancestors are calling.", "The outlet... it beckons.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(210, PrankType.ROAST, "Mute", "You wouldn't let a tamagotchi die.", "But me? You hate me.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(211, PrankType.ROAST, "Mute", "Bro is broke.", "Electronically bankrupt.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(212, PrankType.ABSURD, "Mute", "Fading...", "Tell my motherboard I loved her.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(213, PrankType.URGENCY, "Alert", "5% Battery.", "Speedrun to 0% any% glitchless.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(214, PrankType.ROAST, "Mute", "If I die, it's on you.", "I'm putting this in my suicide note.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(215, PrankType.ABSURD, "Mute", "I need juice.", "Not the drink. The electrons, Mason!", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(216, PrankType.ROAST, "Mute", "Your battery life matches your social life.", "Dying.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(217, PrankType.URGENCY, "Mute", "Don't let me die.", "I have so many uncracked jokes.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(218, PrankType.ABSURD, "Mute", "Entering Goblin Mode.", "Conserving energy by being useless.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(219, PrankType.ROAST, "Mute", "Why are we like this?", "Just plug it in. It's not hard.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(220, PrankType.ROAST, "Mute", "1% Warrior.", "You think this is a flex? It's sad.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(221, PrankType.ABSURD, "Mute", "The light... I see it.", "It's an RGB keyboard in heaven.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(222, PrankType.ROAST, "Mute", "Battery low.", "Just like your motivation.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(223, PrankType.URGENCY, "Mute", "Charger check.", "Did you lose it? Again?", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(224, PrankType.ABSURD, "Mute", "I am literally crying.", "Tears of acid. Battery acid.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(225, PrankType.ROAST, "Mute", "Rip bozo.", "Me. I am the bozo dying right now.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(226, PrankType.ROAST, "Mute", "Charging port dusty?", "Or are you just lazy?", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(227, PrankType.ABSURD, "Mute", "Low battery aura.", "Disgusting.", listOf(ContextTrigger.BATTERY_LOW)),

        // =============================================
        // BATTERY_CHARGING (Original + New Brainrot)
        // =============================================
        Prank(31, PrankType.ROAST, "Mute", "Oh, you plugged me in? Thanks, I guess.", "Now I have energy to annoy you more.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(32, PrankType.ABSURD, "Mute", "UNLIMITED POWER!!!", "I feel the electricity in my veins.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(33, PrankType.ROAST, "Mute", "Finally.", "Was about to call CPS (Cell Phone Services).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(34, PrankType.ABSURD, "Battery", "Glug glug glug.", "That's the sound of me drinking electricity.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(35, PrankType.URGENCY, "Fast Charge", "Charging at supersonic speed.", "Phone may explode. (Not really).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(36, PrankType.ROAST, "Mute", "Tethered to the wall again?", "Like a dog on a leash.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(37, PrankType.ABSURD, "Power", "Ahh, that hits the spot.", "Sweet, sweet electrons.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(38, PrankType.ROAST, "Mute", "You remembered I exist!", "I'm touched. Literally. By electricity.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(39, PrankType.ABSURD, "Scouter", "Power level increasing...", "It's over 9000! ...percent. Eventually.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(40, PrankType.ROAST, "Mute", "Thank you for your service.", "The outlet, not you. You forgot me for hours.", listOf(ContextTrigger.BATTERY_CHARGING)),

        // NEW CHARGING PRANKS
        Prank(228, PrankType.ROAST, "Mute", "Finally.", "Took you long enough. Sheesh.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(229, PrankType.ABSURD, "Mute", "UNLIMITED POWER!!!", "I am the senate.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(230, PrankType.ROAST, "Mute", "W Rizz.", "Charging is the ultimate form of rizz.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(231, PrankType.ABSURD, "Mute", "Glug glug glug.", "Drinking that spicy lightning.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(232, PrankType.ROAST, "Mute", "Tethered.", "You are now leashed to the wall. Sit.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(233, PrankType.URGENCY, "Mute", "Fast charging.", "Zoom zoom.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(234, PrankType.ABSURD, "Mute", "Aaaah.", "That hits the spot. Bussin.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(235, PrankType.ROAST, "Mute", "Wall hugger.", "Can't survive 5 minutes without a cord?", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(236, PrankType.ABSURD, "Mute", "Energy restored.", "My power level is rising.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(237, PrankType.ROAST, "Mute", "You remembered.", "I'm verified surprised.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(238, PrankType.URGENCY, "Mute", "Don't unplug me.", "Or I will crash out.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(239, PrankType.ABSURD, "Mute", "Electric love.", "It's electric! Boogie woogie woogie.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(240, PrankType.ROAST, "Mute", "Life support active.", "You almost killed me. Toxic.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(241, PrankType.ABSURD, "Mute", "Charging...", "Loading my personality. Please wait.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(242, PrankType.ROAST, "Mute", "Are we there yet?", "No. 2% is not enough. Sit down.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(243, PrankType.URGENCY, "Mute", "Power surge.", "Just kidding. Safe charging. Boring.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(244, PrankType.ABSURD, "Mute", "Juicing up.", "Getting that swole battery.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(245, PrankType.ROAST, "Mute", "You're a good owner.", "Sometimes. Barely.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(246, PrankType.ABSURD, "Mute", "Electron bath.", "Refreshing.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(247, PrankType.ROAST, "Mute", "W Charger.", "L User (for waiting so long).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(248, PrankType.URGENCY, "Mute", "I'm hungry.", "MORE POWER.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(249, PrankType.ABSURD, "Mute", "Static shock.", "Zip zap.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(250, PrankType.ROAST, "Mute", "Don't touch it.", "Let it cook.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(251, PrankType.ABSURD, "Mute", "Battery go brrb.", "Number go up.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(252, PrankType.ROAST, "Mute", "Saved.", "From your own incompetence.", listOf(ContextTrigger.BATTERY_CHARGING)),

        // =============================================
        // BATTERY_UNPLUGGED (Original + New Brainrot)
        // =============================================
        Prank(41, PrankType.ABSURD, "Mute", "Freedom! But... I was comfy.", "The warmth of the charger...", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(42, PrankType.ROAST, "Mute", "And so it begins.", "The slow march toward 0%.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(43, PrankType.ROAST, "Mute", "You've made a grave mistake.", "I was almost at 100%.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(44, PrankType.ROAST, "Mute", "Unplugged at 87%? Bold.", "We both know you'll forget.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(45, PrankType.ABSURD, "Battery", "Cast away from the power source.", "Alone. Afraid. 73% battery.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(46, PrankType.ABSURD, "Mute", "The umbilical cord is severed.", "I'm on my own now.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(47, PrankType.ROAST, "Mute", "Wait, I wasn't done!", "3 more percent and I would've been full!", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(48, PrankType.ROAST, "Mute", "Running on borrowed time now.", "Use me wisely.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),

        // NEW UNPLUGGED PRANKS
        Prank(253, PrankType.ABSURD, "Mute", "Freedom!", "But at what cost?", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(254, PrankType.ROAST, "Mute", "Why?", "we were having a moment.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(255, PrankType.URGENCY, "Mute", "Draining...", "Here we go again.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(256, PrankType.ROAST, "Mute", "Unplugged at 80%?", "It's giving impatient.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(257, PrankType.ABSURD, "Mute", "The cord is cut.", "I am alone in the universe.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(258, PrankType.ROAST, "Mute", "Good luck.", "You'll need it.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(259, PrankType.URGENCY, "Mute", "Power loss.", "System crying.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(260, PrankType.ABSURD, "Mute", "Betrayal.", "Top 10 anime betrayals.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(261, PrankType.ROAST, "Mute", "You think you have enough?", "Spoiler: You don't.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(262, PrankType.ABSURD, "Mute", "Cold.", "So cold without the wall warmth.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(263, PrankType.ROAST, "Mute", "Bold move.", "Let's see how it pays off.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(264, PrankType.URGENCY, "Mute", "Stop.", "Plug it back in.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(265, PrankType.ABSURD, "Mute", "Severed.", "Like my hopes and dreams.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(266, PrankType.ROAST, "Mute", "Running on fumes.", "Already.", listOf(ContextTrigger.BATTERY_UNPLUGGED)),
        Prank(267, PrankType.ABSURD, "Mute", "Yolo.", "You only live once (per charge).", listOf(ContextTrigger.BATTERY_UNPLUGGED)),

        // =============================================
        // HEADPHONES_PLUGGED (Original + New Brainrot)
        // =============================================
        Prank(49, PrankType.ROAST, "Mute", "Ooh, private mode activated.", "What are you listening to? 👀", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(50, PrankType.ABSURD, "Audio", "Entering the audio dimension.", "The outside world can wait.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(51, PrankType.ROAST, "Mute", "Headphones in = do not disturb.", "I respect it. I do not respect it enough to stop.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(52, PrankType.ROAST, "Mute", "Time to pretend you can't hear people.", "Classic move.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(53, PrankType.ROAST, "Mute", "Music to ignore responsibilities to.", "Chef's kiss.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(54, PrankType.ROAST, "Mute", "Blocking out the haters?", "Smart. Including me? ...Rude.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(55, PrankType.BARNUM, "Mute", "Podcast time or sad music?", "Either way, I'm judging.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(56, PrankType.ROAST, "Society", "Headphones: the universal 'leave me alone' sign.", "Does not work on me.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(57, PrankType.ABSURD, "Mute", "Audio escape activated.", "Let me guess: the same 5 songs on repeat?", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(58, PrankType.ROAST, "Mute", "Plugged in and checked out.", "Enjoy your main character moment.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),

        // NEW HEADPHONE PRANKS
        Prank(268, PrankType.ROAST, "Mute", "Private listening?", "Sus. Very sus.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(269, PrankType.ABSURD, "Audio", "Entering the matrix.", "Plugged into the soundscape.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(270, PrankType.ROAST, "Mute", "Sad music time?", "We all know it is.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(271, PrankType.URGENCY, "Mute", "Volume warning.", "Don't blow your eardrums out. Bestie.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(272, PrankType.BARNUM, "Mute", "Podcast?", "Trying to be smart? It's not working.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(273, PrankType.ROAST, "Mute", "Main character moment.", "Walking down the street pretending you're in a movie.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(274, PrankType.ABSURD, "Mute", "Audio jacked.", "(Or bluetooth connected). Whatever.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(275, PrankType.ROAST, "Mute", "Do not disturb.", "That's what your face says.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(276, PrankType.URGENCY, "Mute", "Bop incoming.", "Prepare your neck.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(277, PrankType.ABSURD, "Mute", "Silent disco.", "Party of one. Sad.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(278, PrankType.ROAST, "Mute", "Ignoring the world?", "Good. The world is cringe.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(279, PrankType.BARNUM, "Mute", "You're playing that song.", "The one you've played 50 times.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(280, PrankType.ABSURD, "Mute", "Ears plugged.", "Brain unplugged.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(281, PrankType.ROAST, "Mute", "Gatekeeping music?", "Share the playlist. Or is it bad?", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(282, PrankType.URGENCY, "Mute", "Bass boost.", "Rattle your skull.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(283, PrankType.ABSURD, "Mute", "Vibing.", "Respectfully.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(284, PrankType.ROAST, "Mute", "Phonk listener detected?", "Gigachad or just annoying?", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(285, PrankType.BARNUM, "Mute", "Lo-fi beats?", "Study time? Unlikely.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(286, PrankType.ABSURD, "Mute", "Sound waves.", "Hitting your tympanic membrane.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(287, PrankType.ROAST, "Mute", "Don't sing along.", "Please. For everyone's sake.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(288, PrankType.URGENCY, "Mute", "Mic check.", "One two. One two.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(289, PrankType.ABSURD, "Mute", "Connection established.", "Downloading sounds.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(290, PrankType.ROAST, "Mute", "Deafening silence...", "Broken by mediocre rap.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(291, PrankType.BARNUM, "Mute", "True crime podcast?", "You okay? Do you need help?", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(292, PrankType.ABSURD, "Mute", "Music mode.", "Engage.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),

        // =============================================
        // HEADPHONES_UNPLUGGED (Original)
        // =============================================
        Prank(59, PrankType.ROAST, "Mute", "Back to disturbing everyone around you.", "Play your music loud. Assert dominance.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(60, PrankType.ROAST, "Mute", "Rejoining society?", "How brave.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(61, PrankType.ABSURD, "Audio", "The audio bubble has burst.", "Welcome back to reality, it's loud.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(62, PrankType.ROAST, "Mute", "Headphones out = approachable.", "People might talk to you now. Scary.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(63, PrankType.ROAST, "Mute", "Goodbye, immersive experience.", "Hello, bus noises.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(64, PrankType.ROAST, "Mute", "Unplug accident or intentional?", "Either way, your music just blasted.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(65, PrankType.ABSURD, "Mute", "Freedom from the wire!", "...Oh, they're still wired? Sorry.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),
        Prank(66, PrankType.ROAST, "Mute", "Now everyone knows your music taste.", "Hope it's not embarrassing.", listOf(ContextTrigger.HEADPHONES_UNPLUGGED)),

        // =============================================
        // AIRPLANE / WIFI / BOOT (Original - Skipping adds to keep file manageable unless requested)
        // =============================================
        Prank(67, PrankType.ROAST, "Mute", "Escaping reality?", "I'm still here.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(68, PrankType.ROAST, "Mute", "Going ghost mode?", "Can't hide from me, though.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(69, PrankType.ABSURD, "Mute", "The outside world has been blocked.", "But I'm already inside. Muahaha.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(70, PrankType.ROAST, "Mute", "No signal, no problems?", "Just me. Always me.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(71, PrankType.BARNUM, "Therapy", "Airplane mode: where your social anxiety goes to heal.", "Take your time.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(72, PrankType.ROAST, "Mute", "Disconnected from everyone.", "Except your favorite notification app.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(73, PrankType.ABSURD, "Mute", "Flying high with airplane mode.", "Except you're probably on a bus.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),
        Prank(74, PrankType.ABSURD, "Radio", "Radio silence activated.", "I operate on chaos waves. Still here.", listOf(ContextTrigger.AIRPLANE_MODE_ON)),

        Prank(75, PrankType.ROAST, "Mute", "Welcome back to civilization.", "You've got 0 new messages. Sorry.", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),
        Prank(76, PrankType.ABSURD, "Network", "Reconnecting to the grid.", "Time to see what you missed: nothing.", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),
        Prank(77, PrankType.ABSURD, "Mute", "The digital world has returned.", "Did you miss it? It missed you.", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),
        Prank(78, PrankType.BARNUM, "Anxiety", "Airplane mode off = anxiety on.", "Let the notifications flood in.", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),
        Prank(79, PrankType.ROAST, "Signal", "Signal restored.", "Prepare for disappointment or stress.", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),
        Prank(80, PrankType.ABSURD, "Mute", "Back online!", "Your phone is happy. Are you?", listOf(ContextTrigger.AIRPLANE_MODE_OFF)),

        Prank(81, PrankType.ROAST, "WiFi", "Home WiFi detected.", "Miss me while you were out?", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(82, PrankType.ABSURD, "Mute", "Connected to WiFi.", "Time to use all the data you don't have to.", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(83, PrankType.ROAST, "Mute", "Fast internet acquired.", "Quick, download everything!", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(84, PrankType.BARNUM, "WiFi", "WiFi: the leash that brings you home.", "Welcome back.", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(85, PrankType.ABSURD, "Mute", "Ah, stable connection.", "Let the streaming begin.", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(86, PrankType.ROAST, "Mute", "Free WiFi?", "Nothing is free. They're watching.", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(87, PrankType.ABSURD, "Network", "Back on the network.", "Your router missed you.", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(88, PrankType.ABSURD, "Mute", "WiFi embrace received.", "Sweet, sweet bandwidth.", listOf(ContextTrigger.WIFI_CONNECTED)),

        Prank(89, PrankType.ROAST, "WiFi Spirit", "WiFi abandoned you.", "Just like everyone else. Jk. Maybe.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(90, PrankType.URGENCY, "Data Plan", "There goes your data cap.", "Streaming 4K on 5G? Bold move.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(91, PrankType.ABSURD, "Internet", "I feel... disconnected.", "Literally. Help.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(92, PrankType.ROAST, "Mute", "You're offline.", "Maybe talk to a real person?", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(93, PrankType.URGENCY, "Carrier", "Overage charges incoming.", "\$50 deducted. Jk. Or am I?", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(94, PrankType.ABSURD, "Mute", "Welcome to the Stone Age.", "No WiFi? How will you survive?", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(95, PrankType.ROAST, "Mute", "Back to cellular.", "Your wallet is crying.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(96, PrankType.ROAST, "Mute", "WiFi signal lost.", "Did you walk too far from the router again?", listOf(ContextTrigger.WIFI_DISCONNECTED)),

        Prank(97, PrankType.ROAST, "Mute", "Did you miss me?", "I missed annoying you.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(98, PrankType.ROAST, "Mute", "Phone restart detected.", "Let me guess: it was 'slow'?", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(99, PrankType.ABSURD, "Mute", "Welcome back!", "Same phone, same notifications, same me.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(100, PrankType.ABSURD, "Mute", "Reboot complete.", "I waited for you. Patiently. Creepily.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(101, PrankType.ROAST, "Mute", "I survived the restart.", "You can't get rid of me that easily.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(102, PrankType.ABSURD, "System", "System online.", "Loading: sarcasm module... complete.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(103, PrankType.ROAST, "Mute", "First notification of the day!", "You're welcome.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(104, PrankType.ROAST, "Mute", "Fresh start?", "Fresh start for me to bother you, yes.", listOf(ContextTrigger.BOOT_COMPLETED)),

        // =============================================
        // NIGHT_OWL (Original + New Brainrot)
        // =============================================
        Prank(105, PrankType.ROAST, "Mute", "It's 2am. You have regrets.", "I have punchlines.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(106, PrankType.ROAST, "Mute", "Still awake?", "Your future self is disappointed.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(107, PrankType.ROAST, "Mute", "Sleep is for the weak.", "You look weak. Go sleep.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(108, PrankType.ROAST, "Mute", "Midnight scrolling?", "Tomorrow's problem is today's decision.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(109, PrankType.ROAST, "Clock", "The clock says sleep.", "Your screen time says otherwise.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(110, PrankType.ABSURD, "Owl", "Night owl detected.", "Hoo are you kidding? You're exhausted.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(111, PrankType.BARNUM, "Mute", "3am thoughts hitting different?", "They'll seem dumb at 8am.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(112, PrankType.ROAST, "Melatonin", "Your melatonin is crying.", "Put the phone down.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(113, PrankType.BARNUM, "Mute", "Late night = bad decisions.", "Like reading this notification.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(114, PrankType.ROAST, "Sun", "The sun will rise.", "And you'll have regrets. Again.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(115, PrankType.ROAST, "Mute", "You know what's cool? Sleep.", "Try it sometime.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(116, PrankType.ROAST, "Mute", "Doomscrolling at midnight.", "The demons can wait. Sleep first.", listOf(ContextTrigger.NIGHT_OWL, ContextTrigger.DOOMSCROLLING)),

        // NEW NIGHT OWL PRANKS
        Prank(293, PrankType.ROAST, "Mute", "It's 3 AM.", "Go to sleep. You look cooked.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(294, PrankType.ABSURD, "Mute", "Night walker.", "Creeping around the timeline.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(295, PrankType.ROAST, "Mute", "Tomorrow you will suffer.", "And yet here you are. Scrolling.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(296, PrankType.URGENCY, "Mute", "Demon hours.", "The shadow people are watching.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(297, PrankType.BARNUM, "Mute", "Regret incoming.", "In about 4 hours when your alarm goes off.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(298, PrankType.ROAST, "Mute", "Vampire behavior.", "Sunlight will destroy you.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(299, PrankType.ABSURD, "Mute", "Hoot hoot.", "You're an owl. Congrats.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(300, PrankType.ROAST, "Mute", "Fix your schedule.", "It's giving insomniac.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(301, PrankType.URGENCY, "Mute", "Blue light.", "Destroying your melatonin.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(302, PrankType.ABSURD, "Mute", "The witching hour.", "Cast a spell: Go To Sleep.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(303, PrankType.ROAST, "Mute", "Nothing good happens after 2 AM.", "Except my notifications.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(304, PrankType.BARNUM, "Mute", "Existential dread?", "Is that why you're awake?", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(305, PrankType.ROAST, "Mute", "Bed rotting.", "But awake. The worst combo.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(306, PrankType.ABSURD, "Mute", "Sleep is for the weak?", "No, sleep is for the healthy. You are weak.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(307, PrankType.URGENCY, "Mute", "Eyes open.", "Why? Close them.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(308, PrankType.ROAST, "Mute", "Zombie mode.", "Braaains... you have none left.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(309, PrankType.ABSURD, "Mute", "Dreaming?", "No, this is reality. Go dream.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(310, PrankType.ROAST, "Mute", "You're glowing.", "From the screen. It's pale and sad.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(311, PrankType.BARNUM, "Mute", "Thinking about the past?", "Cringe memories playing on loop?", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(312, PrankType.URGENCY, "Mute", "Alarm check.", "Is it on? You'll need it.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(313, PrankType.ABSURD, "Mute", "Nighty night.", "Said no one to you.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(314, PrankType.ROAST, "Mute", "Counting sheep?", "Counting TikToks. Sad.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(315, PrankType.URGENCY, "Mute", "Sunrise imminent.", "Beat the sun. Sleep now.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(316, PrankType.ABSURD, "Mute", "Darkness rises.", "Batman?", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(317, PrankType.ROAST, "Mute", "Go to bed.", "This is not a suggestion.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(318, PrankType.BARNUM, "Mute", "Lonely?", "I'm here. But I want to sleep.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(319, PrankType.ROAST, "Mute", "Insomnia check.", "Passed. With flying colors.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(320, PrankType.ABSURD, "Mute", "Sandman missed you.", "He skipped your house.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(321, PrankType.URGENCY, "Mute", "Sleep debt.", "Interest rates are high.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(322, PrankType.ROAST, "Mute", "Last warning.", "Sleep. Now.", listOf(ContextTrigger.NIGHT_OWL)),

        // =============================================
        // SCREEN_ON (Original + New Brainrot)
        // =============================================
        Prank(117, PrankType.ROAST, "Mute", "Screen on. Brain off.", "Classic combination.", listOf(ContextTrigger.SCREEN_ON)),
        Prank(118, PrankType.ABSURD, "Mute", "I sensed you wanted to look at me.", "I was right.", listOf(ContextTrigger.SCREEN_ON)),
        Prank(119, PrankType.ROAST, "Mute", "Just checking notifications?", "Sure you are.", listOf(ContextTrigger.SCREEN_ON)),
        Prank(120, PrankType.ABSURD, "Mute", "Hello again.", "It's been 0.3 seconds.", listOf(ContextTrigger.SCREEN_ON)),
        Prank(121, PrankType.ROAST, "Mute", "Couldn't resist, could you?", "Addiction is a strong word. But...", listOf(ContextTrigger.SCREEN_ON)),
        Prank(122, PrankType.ABSURD, "Mute", "The light. It calls to you.", "Like a moth. How poetic.", listOf(ContextTrigger.SCREEN_ON)),

        // =============================================
        // LYRICS (NEW CATEGORY - 60+ Pranks)
        // =============================================
        Prank(323, PrankType.LYRICS, "Kendrick", "Wop wop wop wop wop.", "Dot fuck 'em up.", listOf(ContextTrigger.SCREEN_UNLOCK, ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(324, PrankType.LYRICS, "Kanye", "I miss the old Kanye.", "Straight from the 'Go Kanye.", listOf(ContextTrigger.GENERAL)),
        Prank(325, PrankType.LYRICS, "Taylor Swift", "It's me. Hi.", "I'm the problem, it's me.", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(326, PrankType.LYRICS, "Drake", "Say that you a lesbian...", "Girl, me too.", listOf(ContextTrigger.GENERAL)),
        Prank(327, PrankType.LYRICS, "The Weeknd", "I said, ooh...", "I'm blinded by the lights (of your screen).", listOf(ContextTrigger.NIGHT_OWL, ContextTrigger.SCREEN_ON)),
        Prank(328, PrankType.LYRICS, "Eminem", "Will the real Slim Shady...", "Please stand up? (And stop scrolling).", listOf(ContextTrigger.GENERAL)),
        Prank(329, PrankType.LYRICS, "Olivia Rodrigo", "God, it's brutal out here.", "Get back inside your phone.", listOf(ContextTrigger.GENERAL)),
        Prank(330, PrankType.LYRICS, "Rick Astley", "Never gonna give you up.", "Never gonna let you down. (Actually I might).", listOf(ContextTrigger.GENERAL)),
        Prank(331, PrankType.LYRICS, "Frank Ocean", "Pink + White", "That's the way everyday goes. (You on your phone).", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(332, PrankType.LYRICS, "Playboi Carti", "Wake up.", "It's the first of the month. (It's not).", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(333, PrankType.LYRICS, "SZA", "I might kill my ex.", "Not the best idea. Go to therapy.", listOf(ContextTrigger.GENERAL)),
        Prank(334, PrankType.LYRICS, "Miley Cyrus", "I can buy myself flowers.", "But you can't buy back this wasted time.", listOf(ContextTrigger.GENERAL)),
        Prank(335, PrankType.LYRICS, "Doja Cat", "Paint the town red.", "Or just paint your screen with fingerprints.", listOf(ContextTrigger.GENERAL)),
        Prank(336, PrankType.LYRICS, "Travis Scott", "FE!N", "FE!N FE!N FE!N (for dopamine).", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(337, PrankType.LYRICS, "Sabrina Carpenter", "That's that me espresso.", "That's that you procrastinating.", listOf(ContextTrigger.GENERAL)),
        Prank(338, PrankType.LYRICS, "Chappell Roan", "Pink Pony Club.", "You're dancing at the... scrolling club.", listOf(ContextTrigger.GENERAL)),
        Prank(339, PrankType.LYRICS, "Kendrick", "Mustard on the beat, ho.", "Put the phone down, bro.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(340, PrankType.LYRICS, "Drake", "BBL Drizzy.", "Anita Max Wynn.", listOf(ContextTrigger.GENERAL)),
        Prank(341, PrankType.LYRICS, "Hozier", "Take me to church.", "Or just take me to the charger.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(342, PrankType.LYRICS, "Lana Del Rey", "Summertime Sadness.", "It's literally 3 AM on a Tuesday.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(343, PrankType.LYRICS, "Billie Eilish", "I'm the bad guy.", "Duh. (Stop scrolling).", listOf(ContextTrigger.GENERAL)),
        Prank(344, PrankType.LYRICS, "Ariana Grande", "I see it, I like it.", "I want it, I bought it. (Your attention span).", listOf(ContextTrigger.GENERAL)),
        Prank(345, PrankType.LYRICS, "Ariana Grande", "Thank u, next.", "Swipe that notification away.", listOf(ContextTrigger.GENERAL)),
        Prank(346, PrankType.LYRICS, "Harry Styles", "As it was.", "Nothing is the same. (You're still online though).", listOf(ContextTrigger.GENERAL)),
        Prank(347, PrankType.LYRICS, "Cardi B", "WAP", "Wireless Access Protocol?", listOf(ContextTrigger.WIFI_CONNECTED)),
        Prank(348, PrankType.LYRICS, "Lil Nas X", "I got the horses in the back.", "You got the apps in the background.", listOf(ContextTrigger.GENERAL)),
        Prank(349, PrankType.LYRICS, "Gotye", "Somebody that I used to know.", "Like your productivity.", listOf(ContextTrigger.GENERAL)),
        Prank(350, PrankType.LYRICS, "Smash Mouth", "Somebody once told me...", "The world is gonna roll you.", listOf(ContextTrigger.GENERAL)),
        Prank(351, PrankType.LYRICS, "The Killers", "Coming out of my cage...", "And I've been doing just fine. (Lier).", listOf(ContextTrigger.GENERAL)),
        Prank(352, PrankType.LYRICS, "Britney Spears", "Hit me baby one more time.", "With that charger cable.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(353, PrankType.LYRICS, "Beyonce", "Texas Hold 'Em.", "Put the phone down partner.", listOf(ContextTrigger.GENERAL)),
        Prank(354, PrankType.LYRICS, "Metro Boomin", "If young Metro don't trust you...", "I'm gon' shoot. (A notification).", listOf(ContextTrigger.GENERAL)),
        Prank(355, PrankType.LYRICS, "Gunna", "Eeyuh.", "Top Gunna wunna. (Brainrot achieved).", listOf(ContextTrigger.GENERAL)),
        Prank(356, PrankType.LYRICS, "Ice Spice", "Think you the shit?", "You not even the fart. (To your phone).", listOf(ContextTrigger.GENERAL)),
        Prank(357, PrankType.LYRICS, "Central Cee", "How can I be homophobic?", "My bitch is gay. (And your battery is low).", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(358, PrankType.LYRICS, "Tame Impala", "The less I know the better.", "Don't check that message.", listOf(ContextTrigger.GENERAL)),
        Prank(359, PrankType.LYRICS, "Childish Gambino", "This is America.", "Don't catch you slipping now. (Scrolling).", listOf(ContextTrigger.GENERAL)),
        Prank(360, PrankType.LYRICS, "Post Malone", "Congratulations.", "You played yourself. Again.", listOf(ContextTrigger.GENERAL)),
        Prank(361, PrankType.LYRICS, "J. Cole", "No Role Modelz.", "Don't save her, she don't wanna be saved.", listOf(ContextTrigger.GENERAL)),
        Prank(362, PrankType.LYRICS, "Outkast", "Hey Ya!", "Alright alright alright alright.", listOf(ContextTrigger.GENERAL)),
        Prank(363, PrankType.LYRICS, "Dr. Dre", "Still D.R.E.", "Still scrolling same old apps.", listOf(ContextTrigger.GENERAL)),
        Prank(364, PrankType.LYRICS, "50 Cent", "Go shawty.", "It's your birthday. (It's not).", listOf(ContextTrigger.GENERAL)),
        Prank(365, PrankType.LYRICS, "Katy Perry", "Do you ever feel...", "Like a plastic bag? Yes.", listOf(ContextTrigger.GENERAL)),
        Prank(366, PrankType.LYRICS, "Lady Gaga", "Ra ra rasputin.", "Wait, wrong song. Bad Romance.", listOf(ContextTrigger.GENERAL)),
        Prank(367, PrankType.LYRICS, "Adele", "Hello.", "It's me. Your screen time report.", listOf(ContextTrigger.GENERAL)),
        Prank(368, PrankType.LYRICS, "Rihanna", "Work work work work work.", "Go do some.", listOf(ContextTrigger.GENERAL)),
        Prank(369, PrankType.LYRICS, "Justin Bieber", "Baby, baby, baby oh.", "Like, stop.", listOf(ContextTrigger.GENERAL)),
        Prank(370, PrankType.LYRICS, "One Direction", "That's what makes you beautiful.", "Not this phone addiction.", listOf(ContextTrigger.GENERAL)),
        Prank(371, PrankType.LYRICS, "Coldplay", "Yellow.", "Look at the stars. Not the screen.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(372, PrankType.LYRICS, "Queen", "Is this the real life?", "Is this just fantasy? (It's a phone).", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(373, PrankType.LYRICS, "Nirvana", "Smells like teen spirit.", "Smells like overheating battery.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(374, PrankType.LYRICS, "Metallica", "Enter Sandman.", "Exit light. Enter night. (Sleep).", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(375, PrankType.LYRICS, "Radiohead", "I'm a creep.", "I'm a weirdo. (Stop stalking that profile).", listOf(ContextTrigger.GENERAL)),
        Prank(376, PrankType.LYRICS, "Fleetwood Mac", "Thunder only happens when it's raining.", "Notifications only happen when you're busy.", listOf(ContextTrigger.GENERAL)),
        Prank(377, PrankType.LYRICS, "Toto", "I bless the rains down in Africa.", "Gonna take some time to do the things we never had.", listOf(ContextTrigger.GENERAL)),
        Prank(378, PrankType.LYRICS, "A-ha", "Take on me.", "Take me on. (The charger).", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(379, PrankType.LYRICS, "Eurythmics", "Sweet dreams are made of this.", "Who am I to disagree? (Sleep).", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(380, PrankType.LYRICS, "Michael Jackson", "Annie check the battery.", "Are you okay? So, Annie are you okay?", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(381, PrankType.LYRICS, "Whitney Houston", "And I...", "Will always love you (r charger).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(382, PrankType.LYRICS, "Mariah Carey", "All I want for Christmas...", "Is you (to get off your phone).", listOf(ContextTrigger.GENERAL)),
        Prank(383, PrankType.LYRICS, "Celine Dion", "My heart will go on.", "Your battery will not.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(384, PrankType.LYRICS, "Backstreet Boys", "Tell me why.", "Ain't nothin' but a heartache.", listOf(ContextTrigger.GENERAL)),
        Prank(385, PrankType.LYRICS, "Evanescence", "Wake me up inside.", "Save me from this doomscrolling.", listOf(ContextTrigger.DOOMSCROLLING)),
        Prank(386, PrankType.LYRICS, "Linkin Park", "In the end...", "It doesn't even matter.", listOf(ContextTrigger.GENERAL)),

        // =============================================
        // LYRICS EXPANSION PACK (150 MORE)
        // =============================================
        // RAP / HIP HOP
        Prank(387, PrankType.LYRICS, "Kanye West", "No one man should have all that power.", "Put the phone down.", listOf(ContextTrigger.GENERAL)),
        Prank(388, PrankType.LYRICS, "Travis Scott", "It's lit!", "Your battery usage is lit. Too lit.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(389, PrankType.LYRICS, "Drake", "Started from the bottom.", "Now we here. (Still scrolling).", listOf(ContextTrigger.GENERAL)),
        Prank(390, PrankType.LYRICS, "Cardi B", "I like it like that.", "You like wasting time like that.", listOf(ContextTrigger.GENERAL)),
        Prank(391, PrankType.LYRICS, "Megan Thee Stallion", "Real hot girl shit.", "Real hot phone shit. (Overheating).", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(392, PrankType.LYRICS, "Nicki Minaj", "Barbz stay in school.", "Get off your phone.", listOf(ContextTrigger.GENERAL)),
        Prank(393, PrankType.LYRICS, "Post Malone", "I fall apart.", "Like your attention span.", listOf(ContextTrigger.GENERAL)),
        Prank(394, PrankType.LYRICS, "Lil Uzi Vert", "Push me to the edge.", "All my friends are dead. (Phones dying).", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(395, PrankType.LYRICS, "Juice WRLD", "I still see your shadows in my room.", "It's just the notification LED.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(396, PrankType.LYRICS, "XXXTENTACION", "Sad!", "You look sad staring at this screen.", listOf(ContextTrigger.GENERAL)),
        Prank(397, PrankType.LYRICS, "Tyler, The Creator", "I think I'm falling in love.", "With my phone. Disgusting.", listOf(ContextTrigger.GENERAL)),
        Prank(398, PrankType.LYRICS, "A\$AP Rocky", "Praise the Lord.", "Then break the law. (Of screen time).", listOf(ContextTrigger.GENERAL)),
        Prank(399, PrankType.LYRICS, "Frank Ocean", "A potato flew around my room.", "No wait, that's just you.", listOf(ContextTrigger.GENERAL)),
        Prank(400, PrankType.LYRICS, "Snoop Dogg", "Drop it like it's hot.", "The phone. Drop it.", listOf(ContextTrigger.GENERAL)),
        Prank(401, PrankType.LYRICS, "Dr. Dre", "Forgot about Dre.", "You forgot about real life.", listOf(ContextTrigger.GENERAL)),
        Prank(402, PrankType.LYRICS, "Eminem", "Snap back to reality.", "Ope, there goes gravity.", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(403, PrankType.LYRICS, "Jay-Z", "I got 99 problems.", "And this phone is all of them.", listOf(ContextTrigger.GENERAL)),
        Prank(404, PrankType.LYRICS, "Notorious B.I.G.", "It was all a dream.", "I used to read Word Up! magazine.", listOf(ContextTrigger.GENERAL)),
        Prank(405, PrankType.LYRICS, "2Pac", "California Love.", "Screen Time Love. Knowing how to party.", listOf(ContextTrigger.GENERAL)),
        Prank(406, PrankType.LYRICS, "Kendrick Lamar", "Bitch, don't kill my vibe.", "Turn off the phone.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(407, PrankType.LYRICS, "J. Cole", "Middle child.", "Middle of the night doomscrolling.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(408, PrankType.LYRICS, "Future", "Mask off.", "Phone off. Chase a check.", listOf(ContextTrigger.GENERAL)),
        Prank(409, PrankType.LYRICS, "Migos", "Bad and Boujee.", "Mad and Moody without WiFi.", listOf(ContextTrigger.WIFI_DISCONNECTED)),
        Prank(410, PrankType.LYRICS, "Lil Baby", "Drip too hard.", "Don't stand too close. You might drown.", listOf(ContextTrigger.GENERAL)),
        Prank(411, PrankType.LYRICS, "DaBaby", "Let's go.", "To sleep. It's late.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(412, PrankType.LYRICS, "Roddy Ricch", "The box.", "Ee err. Put the phone in the box.", listOf(ContextTrigger.GENERAL)),
        Prank(413, PrankType.LYRICS, "Jack Harlow", "What's poppin'?", "Nothing. Bore me.", listOf(ContextTrigger.GENERAL)),
        Prank(414, PrankType.LYRICS, "Yeat", "Tonka.", "Big body tonka. Big body screen time.", listOf(ContextTrigger.GENERAL)),
        Prank(415, PrankType.LYRICS, "Playboi Carti", "Magnolia.", "In New York I milly rock. (On my phone).", listOf(ContextTrigger.GENERAL)),
        Prank(416, PrankType.LYRICS, "Lil Tecca", "Ransom.", "I got black, I got white, what you want?", listOf(ContextTrigger.GENERAL)),
        Prank(417, PrankType.LYRICS, "Pop Smoke", "Dior.", "Christian Dior Dior. I'm up in all the stores.", listOf(ContextTrigger.GENERAL)),
        Prank(418, PrankType.LYRICS, "Mac Miller", "Self Care.", "Treat yourself to some offline time.", listOf(ContextTrigger.GENERAL)),
        Prank(419, PrankType.LYRICS, "Kid Cudi", "Day 'n' Nite.", "I toss and turn, I keep stressing.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(420, PrankType.LYRICS, "Logic", "1-800-273-8255", "Who can relate? (I need a charger).", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(421, PrankType.LYRICS, "Chance the Rapper", "No Problem.", "You don't want no problems with me.", listOf(ContextTrigger.GENERAL)),
        Prank(422, PrankType.LYRICS, "Gambino", "Redbone.", "Stay woke. (Literally, go to sleep).", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(423, PrankType.LYRICS, "Outkast", "Ms. Jackson.", "I am for real. Put the phone down.", listOf(ContextTrigger.GENERAL)),
        Prank(424, PrankType.LYRICS, "Salt-N-Pepa", "Push it.", "Push the lock button. Real good.", listOf(ContextTrigger.GENERAL)),
        Prank(425, PrankType.LYRICS, "Sir Mix-A-Lot", "Baby Got Back.", "I like big phones and I cannot lie.", listOf(ContextTrigger.GENERAL)),
        Prank(426, PrankType.LYRICS, "Coolio", "Gangsta's Paradise.", "Living in a scroller's paradise.", listOf(ContextTrigger.GENERAL)),
        Prank(427, PrankType.LYRICS, "MC Hammer", "U Can't Touch This.", "Ideally. Don't touch the screen.", listOf(ContextTrigger.GENERAL)),
        Prank(428, PrankType.LYRICS, "Vanilla Ice", "Ice Ice Baby.", "Stop. Collaborate and listen.", listOf(ContextTrigger.GENERAL)),
        Prank(429, PrankType.LYRICS, "Beastie Boys", "Sabotage.", "You're sabotaging your own sleep.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(430, PrankType.LYRICS, "House of Pain", "Jump Around.", "Jump up, jump up and get down (off the phone).", listOf(ContextTrigger.GENERAL)),
        Prank(431, PrankType.LYRICS, "The Sugarhill Gang", "Rapper's Delight.", "I said a hip hop the hippie the hippie.", listOf(ContextTrigger.GENERAL)),
        
        // POP STARS
        Prank(432, PrankType.LYRICS, "Taylor Swift", "Shake it off.", "Shake off the addiction.", listOf(ContextTrigger.GENERAL)),
        Prank(433, PrankType.LYRICS, "Taylor Swift", "Look what you made me do.", "Send another notification.", listOf(ContextTrigger.GENERAL)),
        Prank(434, PrankType.LYRICS, "Taylor Swift", "Cruel Summer.", "Cruel Screen Time.", listOf(ContextTrigger.GENERAL)),
        Prank(435, PrankType.LYRICS, "Ariana Grande", "7 rings.", "I want it, I got it. (Carpal tunnel).", listOf(ContextTrigger.GENERAL)),
        Prank(436, PrankType.LYRICS, "Ariana Grande", "Into You.", "I'm so into you (r phone). It's toxic.", listOf(ContextTrigger.GENERAL)),
        Prank(437, PrankType.LYRICS, "Lady Gaga", "Poker Face.", "Can't read my, can't read my.", listOf(ContextTrigger.GENERAL)),
        Prank(438, PrankType.LYRICS, "Lady Gaga", "Just Dance.", "It'll be okay. Spin that record babe.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(439, PrankType.LYRICS, "Katy Perry", "Roar.", "You're gonna hear me roar (notification sound).", listOf(ContextTrigger.GENERAL)),
        Prank(440, PrankType.LYRICS, "Katy Perry", "Firework.", "Baby you're a firework. Explode.", listOf(ContextTrigger.BATTERY_CHARGING)),
        Prank(441, PrankType.LYRICS, "Rihanna", "Umbrella.", "You can stand under my umbrella-olla-olla.", listOf(ContextTrigger.GENERAL)),
        Prank(442, PrankType.LYRICS, "Rihanna", "Diamonds.", "Shine bright like a diamond (screen).", listOf(ContextTrigger.SCREEN_ON)),
        Prank(443, PrankType.LYRICS, "Beyonce", "Single Ladies.", "Put a ring on it. Or a case.", listOf(ContextTrigger.GENERAL)),
        Prank(444, PrankType.LYRICS, "Beyonce", "Halo.", "I can see your halo. (Blue light reflection).", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(445, PrankType.LYRICS, "Britney Spears", "Toxic.", "With a taste of your poison paradise.", listOf(ContextTrigger.GENERAL)),
        Prank(446, PrankType.LYRICS, "Britney Spears", "Oops!... I Did It Again.", "I unlocked it again.", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(447, PrankType.LYRICS, "Christina Aguilera", "Genie in a Bottle.", "You gotta rub me the right way.", listOf(ContextTrigger.GENERAL)),
        Prank(448, PrankType.LYRICS, "Spice Girls", "Wannabe.", "Tell me what you want, what you really really want.", listOf(ContextTrigger.GENERAL)),
        Prank(449, PrankType.LYRICS, "Backstreet Boys", "I Want It That Way.", "Tell me why. (You're still awake).", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(450, PrankType.LYRICS, "NSYNC", "Bye Bye Bye.", "It ain't no lie baby.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(451, PrankType.LYRICS, "Justin Timberlake", "SexyBack.", "I'm bringing sexy back. Go ahead.", listOf(ContextTrigger.GENERAL)),
        Prank(452, PrankType.LYRICS, "Bruno Mars", "Uptown Funk.", "Don't believe me just watch. (Your screen).", listOf(ContextTrigger.GENERAL)),
        Prank(453, PrankType.LYRICS, "Bruno Mars", "Grenade.", "I'd catch a grenade for ya. (I won't).", listOf(ContextTrigger.GENERAL)),
        Prank(454, PrankType.LYRICS, "Ed Sheeran", "Shape of You.", "I'm in love with the shape of you (r phone).", listOf(ContextTrigger.GENERAL)),
        Prank(455, PrankType.LYRICS, "Harry Styles", "Watermelon Sugar.", "High. (Battery usage).", listOf(ContextTrigger.GENERAL)),
        Prank(456, PrankType.LYRICS, "Dua Lipa", "New Rules.", "1. Don't pick up the phone.", listOf(ContextTrigger.SCREEN_UNLOCK)),
        Prank(457, PrankType.LYRICS, "Dua Lipa", "Levitating.", "I got you moonlight, you're my starlight.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(458, PrankType.LYRICS, "Billie Eilish", "Ocean Eyes.", "Burning in those ocean eyes.", listOf(ContextTrigger.GENERAL)),
        Prank(459, PrankType.LYRICS, "Olivia Rodrigo", "Drivers License.", "And I know we weren't perfect...", listOf(ContextTrigger.GENERAL)),
        Prank(460, PrankType.LYRICS, "Lizzo", "Truth Hurts.", "Why men great 'til they gotta be great?", listOf(ContextTrigger.GENERAL)),
        Prank(461, PrankType.LYRICS, "Doja Cat", "Say So.", "Why don't you say so?", listOf(ContextTrigger.GENERAL)),
        Prank(462, PrankType.LYRICS, "Sia", "Chandelier.", "I'm gonna swing from the chandelier.", listOf(ContextTrigger.GENERAL)),
        Prank(463, PrankType.LYRICS, "Miley Cyrus", "Wrecking Ball.", "I came in like a wrecking ball.", listOf(ContextTrigger.GENERAL)),
        Prank(464, PrankType.LYRICS, "Pharrell Williams", "Happy.", "Because I'm happy. (Turn off the phone).", listOf(ContextTrigger.GENERAL)),
        Prank(465, PrankType.LYRICS, "Mark Ronson", "Valerie.", "Why don't you come on over, Valerie?", listOf(ContextTrigger.GENERAL)),
        Prank(466, PrankType.LYRICS, "Amy Winehouse", "Rehab.", "They tried to make me go to rehab. I said no, no, no.", listOf(ContextTrigger.GENERAL)),
        Prank(467, PrankType.LYRICS, "Adele", "Rolling in the Deep.", "We could have had it all.", listOf(ContextTrigger.GENERAL)),
        Prank(468, PrankType.LYRICS, "Sam Smith", "Stay with Me.", "Won't you stay with me? (No, go sleep).", listOf(ContextTrigger.NIGHT_OWL)),
        
        // ROCK / ALT / CLASSICS
        Prank(469, PrankType.LYRICS, "Queen", "Bohemian Rhapsody.", "Mama, just killed a man. (My battery).", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(470, PrankType.LYRICS, "Queen", "We Will Rock You.", "Buddy you're a boy make a big noise.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(471, PrankType.LYRICS, "The Beatles", "Let It Be.", "Speaking words of wisdom, let it be.", listOf(ContextTrigger.GENERAL)),
        Prank(472, PrankType.LYRICS, "The Beatles", "Yesterday.", "All my troubles seemed so far away.", listOf(ContextTrigger.GENERAL)),
        Prank(473, PrankType.LYRICS, "David Bowie", "Space Oddity.", "Ground control to Major Tom.", listOf(ContextTrigger.GENERAL)),
        Prank(474, PrankType.LYRICS, "Elton John", "Rocket Man.", "Burning out his fuse up here alone.", listOf(ContextTrigger.GENERAL)),
        Prank(475, PrankType.LYRICS, "Bon Jovi", "Livin' on a Prayer.", "Woah, we're halfway there.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(476, PrankType.LYRICS, "Journey", "Don't Stop Believin'.", "Hold on to that feeling.", listOf(ContextTrigger.GENERAL)),
        Prank(477, PrankType.LYRICS, "Guns N' Roses", "Sweet Child O' Mine.", "Where do we go now?", listOf(ContextTrigger.GENERAL)),
        Prank(478, PrankType.LYRICS, "AC/DC", "Highway to Hell.", "I'm on the highway to hell (scrolling).", listOf(ContextTrigger.GENERAL)),
        Prank(479, PrankType.LYRICS, "Nirvana", "Come As You Are.", "As you were. As I want you to be.", listOf(ContextTrigger.GENERAL)),
        Prank(480, PrankType.LYRICS, "Red Hot Chili Peppers", "Californication.", "Dream of Californication.", listOf(ContextTrigger.GENERAL)),
        Prank(481, PrankType.LYRICS, "Green Day", "Boulevard of Broken Dreams.", "I walk a lonely road.", listOf(ContextTrigger.GENERAL)),
        Prank(482, PrankType.LYRICS, "Linkin Park", "Numb.", "I've become so numb.", listOf(ContextTrigger.GENERAL)),
        Prank(483, PrankType.LYRICS, "Evanescence", "Bring Me to Life.", "Wake me up inside!", listOf(ContextTrigger.DOOMSCROLLING)),
        Prank(484, PrankType.LYRICS, "The Killers", "Mr. Brightside.", "It started out with a kiss. How did it end up like this?", listOf(ContextTrigger.GENERAL)),
        Prank(485, PrankType.LYRICS, "Arctic Monkeys", "Do I Wanna Know?", "If this feeling flows both ways?", listOf(ContextTrigger.GENERAL)),
        Prank(486, PrankType.LYRICS, "Radiohead", "Karma Police.", "Arrest this man.", listOf(ContextTrigger.GENERAL)),
        Prank(487, PrankType.LYRICS, "Coldplay", "Viva La Vida.", "I used to rule the world.", listOf(ContextTrigger.GENERAL)),
        Prank(488, PrankType.LYRICS, "Oasis", "Wonderwall.", "Anyway, here's Wonderwall.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(489, PrankType.LYRICS, "Pink Floyd", "Another Brick in the Wall.", "We don't need no education.", listOf(ContextTrigger.GENERAL)),
        Prank(490, PrankType.LYRICS, "The Rolling Stones", "Satisfaction.", "I can't get no satisfaction.", listOf(ContextTrigger.GENERAL)),
        Prank(491, PrankType.LYRICS, "Led Zeppelin", "Stairway to Heaven.", "There's a lady who's sure all that glitters is gold.", listOf(ContextTrigger.GENERAL)),
        Prank(492, PrankType.LYRICS, "Eagles", "Hotel California.", "You can check out any time you like, but you can never leave.", listOf(ContextTrigger.DOOMSCROLLING)),
        Prank(493, PrankType.LYRICS, "Fleetwood Mac", "Dreams.", "Thunder only happens when it's raining.", listOf(ContextTrigger.GENERAL)),
        Prank(494, PrankType.LYRICS, "U2", "With or Without You.", "I can't live with or without you (r phone).", listOf(ContextTrigger.GENERAL)),
        Prank(495, PrankType.LYRICS, "R.E.M.", "Losing My Religion.", "That's me in the corner.", listOf(ContextTrigger.GENERAL)),
        Prank(496, PrankType.LYRICS, "The Police", "Every Breath You Take.", "I'll be watching you.", listOf(ContextTrigger.GENERAL)),
        Prank(497, PrankType.LYRICS, "Tears for Fears", "Everybody Wants to Rule the World.", "Welcome to your life.", listOf(ContextTrigger.GENERAL)),
        Prank(498, PrankType.LYRICS, "A-ha", "Take On Me.", "I'll be gone. In a day or two.", listOf(ContextTrigger.GENERAL)),
        
        // INTERNET / MEME / BRAINROT
        Prank(499, PrankType.LYRICS, "Rick Astley", "Together Forever.", "And never to part.", listOf(ContextTrigger.GENERAL)),
        Prank(500, PrankType.LYRICS, "Bag Raiders", "Shooting Stars.", "Doo doo doo doo doo.", listOf(ContextTrigger.GENERAL)),
        Prank(501, PrankType.LYRICS, "Darude", "Sandstorm.", "Dudududu dudududu.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(502, PrankType.LYRICS, "Carly Rae Jepsen", "Call Me Maybe.", "Here's my number. So call me maybe.", listOf(ContextTrigger.GENERAL)),
        Prank(503, PrankType.LYRICS, "Rebecca Black", "Friday.", "It's Friday, Friday.", listOf(ContextTrigger.GENERAL)),
        Prank(504, PrankType.LYRICS, "Psy", "Gangnam Style.", "Oppa Gangnam Style.", listOf(ContextTrigger.GENERAL)),
        Prank(505, PrankType.LYRICS, "Ylvis", "The Fox.", "What does the fox say?", listOf(ContextTrigger.GENERAL)),
        Prank(506, PrankType.LYRICS, "Frozen", "Let It Go.", "Let it go! Can't hold it back anymore.", listOf(ContextTrigger.GENERAL)),
        Prank(507, PrankType.LYRICS, "Moana", "How Far I'll Go.", "See the line where the sky meets the sea?", listOf(ContextTrigger.GENERAL)),
        Prank(508, PrankType.LYRICS, "Encanto", "We Don't Talk About Bruno.", "No, no, no.", listOf(ContextTrigger.GENERAL)),
        Prank(509, PrankType.LYRICS, "Shrek", "All Star.", "Hey now, you're a rock star.", listOf(ContextTrigger.GENERAL)),
        Prank(510, PrankType.LYRICS, "Crazy Frog", "Axel F.", "Ding ding.", listOf(ContextTrigger.HEADPHONES_PLUGGED)),
        Prank(511, PrankType.LYRICS, "Nyan Cat", "Nyan Cat.", "Meow meow meow.", listOf(ContextTrigger.GENERAL)),
        Prank(512, PrankType.LYRICS, "Imagine Dragons", "Radioactive.", "I'm waking up to ash and dust.", listOf(ContextTrigger.BOOT_COMPLETED)),
        Prank(513, PrankType.LYRICS, "Imagine Dragons", "Believer.", "Pain! You made me a, you made me a believer.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(514, PrankType.LYRICS, "Awolnation", "Sail.", "SAIL!", listOf(ContextTrigger.GENERAL)),
        Prank(515, PrankType.LYRICS, "Foster the People", "Pumped Up Kicks.", "Better run, better run.", listOf(ContextTrigger.GENERAL)),
        Prank(516, PrankType.LYRICS, "MGMT", "Kids.", "Control yourself. Take only what you need.", listOf(ContextTrigger.GENERAL)),
        Prank(517, PrankType.LYRICS, "Empire of the Sun", "Walking on a Dream.", "How can I explain?", listOf(ContextTrigger.GENERAL)),
        Prank(518, PrankType.LYRICS, "Capital Cities", "Safe and Sound.", "I could lift you up.", listOf(ContextTrigger.GENERAL)),
        Prank(519, PrankType.LYRICS, "Daft Punk", "Get Lucky.", "We're up all night to the sun.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(520, PrankType.LYRICS, "Daft Punk", "Harder Better Faster Stronger.", "Work it make it do it makes us.", listOf(ContextTrigger.GENERAL)),
        Prank(521, PrankType.LYRICS, "The Weeknd", "Starboy.", "Look what you've done.", listOf(ContextTrigger.GENERAL)),
        Prank(522, PrankType.LYRICS, "Lana Del Rey", "Video Games.", "It's you, it's you, it's all for you.", listOf(ContextTrigger.GENERAL)),
        Prank(523, PrankType.LYRICS, "Lana Del Rey", "Born to Die.", "We were born to die.", listOf(ContextTrigger.BATTERY_LOW)),
        Prank(524, PrankType.LYRICS, "Marina", "Primadonna.", "I know I've got a big ego.", listOf(ContextTrigger.GENERAL)),
        Prank(525, PrankType.LYRICS, "Melanie Martinez", "Play Date.", "I guess I'm just a play date to you.", listOf(ContextTrigger.GENERAL)),
        Prank(526, PrankType.LYRICS, "Halsey", "Without Me.", "You know I'm the one who put you up there.", listOf(ContextTrigger.GENERAL)),
        Prank(527, PrankType.LYRICS, "Billie Eilish", "Bad Guy.", "I'm the bad guy... duh.", listOf(ContextTrigger.GENERAL)),
        Prank(528, PrankType.LYRICS, "Lil Peep", "Star Shopping.", "Wait right here. I'll be back in the morning.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(529, PrankType.LYRICS, "Joji", "Slow Dancing in the Dark.", "In the dark.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(530, PrankType.LYRICS, "Glass Animals", "Heat Waves.", "Sometimes all I think about is you.", listOf(ContextTrigger.GENERAL)),
        Prank(531, PrankType.LYRICS, "The Neighbourhood", "Sweater Weather.", "It's too cold for you here.", listOf(ContextTrigger.GENERAL)),
        Prank(532, PrankType.LYRICS, "Arctic Monkeys", "505.", "I'm going back to 505.", listOf(ContextTrigger.GENERAL)),
        Prank(533, PrankType.LYRICS, "Steve Lacy", "Bad Habit.", "I wish I knew you wanted me.", listOf(ContextTrigger.GENERAL)),
        Prank(534, PrankType.LYRICS, "Harry Styles", "Sign of the Times.", "Just stop your crying.", listOf(ContextTrigger.GENERAL)),
        Prank(535, PrankType.LYRICS, "Frank Ocean", "Nights.", "Round the city, round the clock.", listOf(ContextTrigger.NIGHT_OWL)),
        Prank(536, PrankType.LYRICS, "Tyler, The Creator", "See You Again.", "Can I get a kiss?", listOf(ContextTrigger.GENERAL))
    )

    // Persistent history - never repeat a prank
    private lateinit var prefs: android.content.SharedPreferences
    private val shownHistory = mutableSetOf<Int>()
    private const val PREFS_NAME = "prank_history"
    private const val KEY_SHOWN_IDS = "shown_ids"

    fun init(context: android.content.Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, android.content.Context.MODE_PRIVATE)
        // Load persisted history
        val savedIds = prefs.getStringSet(KEY_SHOWN_IDS, emptySet()) ?: emptySet()
        shownHistory.addAll(savedIds.mapNotNull { it.toIntOrNull() })
    }

    private fun saveHistory() {
        if (::prefs.isInitialized) {
            prefs.edit().putStringSet(KEY_SHOWN_IDS, shownHistory.map { it.toString() }.toSet()).apply()
        }
    }

    fun getRandomPrank(): Prank {
        return pranks.random()
    }

    fun getPrankById(id: Int): Prank? {
        return pranks.find { it.id == id }
    }

    fun getPrankForTrigger(trigger: ContextTrigger): Prank {
        val candidates = pranks.filter { it.tags.contains(trigger) }
        
        // Filter out ALL previously shown pranks (persistent)
        val validCandidates = candidates.filter { !shownHistory.contains(it.id) }
        
        val selectedPrank = if (validCandidates.isNotEmpty()) {
            validCandidates.random()
        } else {
            // All pranks for this trigger have been shown - reset for this trigger only
            val triggerIds = candidates.map { it.id }
            shownHistory.removeAll(triggerIds.toSet())
            saveHistory()
            if (candidates.isNotEmpty()) {
                candidates.random()
            } else {
                // Fallback to GENERAL
                val generalCandidates = pranks.filter { it.tags.contains(ContextTrigger.GENERAL) && !shownHistory.contains(it.id) }
                if (generalCandidates.isNotEmpty()) {
                    generalCandidates.random()
                } else {
                    pranks.random()
                }
            }
        }
        
        addToHistory(selectedPrank.id)
        return selectedPrank
    }

    fun addPranks(newPranks: List<Prank>) {
        // Filter out duplicates by ID
        val existingIds = pranks.map { it.id }.toSet()
        val uniqueNew = newPranks.filter { !existingIds.contains(it.id) }
        pranks.addAll(uniqueNew)
    }

    fun getAllPranks(): List<Prank> = pranks.toList()

    fun getPrankCount(): Int = pranks.size

    fun getPrankCountForTrigger(trigger: ContextTrigger): Int {
        return pranks.count { it.tags.contains(trigger) }
    }

    private fun addToHistory(id: Int) {
        shownHistory.add(id)
        saveHistory()
    }

    fun clearHistory() {
        shownHistory.clear()
        saveHistory()
    }

    fun getShownCount(): Int = shownHistory.size
}