import java.util.Scanner;

public class Driver {
	static Scanner scn= new Scanner(System.in);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 7;
		int speed= 6;
		int strength = 5;
		System.out.println("Enter your name:");
		String name = scn.nextLine();
		System.out.println("Enter your gender:");
		String gender = scn.nextLine();
		System.out.println("Welcome " + name + ", in this game you will be you will be battling many differnt characters,and if you have the money,strength,");
		System.out.println("and the speed to defeat them, you will reign supreme. To start out, you have 6 speed, 5 strength, and 7 dollars.You will need to choose what to do in");
		System.out.println("each situation not knowing where your opponent stands.");
		
		{
		    System.out.println("Do you want to begin?(1 or 2)");
		    String input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("Terrific, lets get started.");
		    	
		    } else {
		    	System.out.println("If you want to play later just run the game later :)");
		    	return;
		    }
	
		  }

		System.out.println("As the Sun Slowly rises from the east, and your room slowly starts to fill with light, you reluctantly rise from your bed. You walk towards your closet,");
		System.out.println("What do you want to wear today? You can wear your power suit, which will make you stronger, or your lightweight suit, which will make you faster.");
		
		{
		    System.out.println("1.Power Suit 2. Lightweight Suit?(1 or 2)");
		    String input = getInput("Power Suit", "Lightweight Suit");
		    if(input.equals("1")) {
		    	System.out.println("You chose the power suit.");
		    	strength+=2;
		    } else {
		    	System.out.println("You chose the lightweight suit.");
		    	speed+=2;
		    }
	
		  }
		System.out.println("Once dressed, you start your descent down the stairs of your vacant appartment building. At the door you notice something unusual, its a letter");
		System.out.println("made out to yourself. You diligently open the letter. It reads,\"Morning " + name + ", due to your recent activities, you have become a");
		System.out.println("large threat to the people of Gotham City. I, Commissioner Gordon, have put a bounty on your head. I have instructed the bounty hunters that they have");
		System.out.println("permission to use lethal force if necessary. The people of Gotham are already scared, let's not have any more trouble " + name + ", let's settle this with no more deaths...");
		System.out.println("Commissioner Gordon.\"");
		System.out.println("");
		System.out.println("Petrified, you don't know what to do, you try to speak, but words don't come out. You can't remember anything...");
		System.out.println("\"What happened last night\", you think to yourself... You need to remember what happened last night");
		System.out.println("You need to think");
		System.out.println("What did you do last night?");
		System.out.println("You...");
		String deed = scn.nextLine();
		System.out.println("\"O my gosh, I remember, I remember it all, I " + deed + ".");
		System.out.println("You drop to your knees, not knowing what to think, but you quickly realize that sitting in your apartment is suicide, you have to move, and fast.");
		System.out.println("As you exit you apartment building, you notice someone following you.");
		System.out.println("You wanting to get the first strike, turn around ready for anything.");
		System.out.println("");
		System.out.println("You realize your follower is none other than Gomez from the indie game FEZ. Gomez isn't known as a fighter but more of an intellegent player.");
		System.out.println("You think to yourself about how to handle Gomez, do you want to Fight him, Pay him $5 and in return earn his mercy, or Run?");
		String input = getInput("Fight", "Pay", "Run");
		switch(input) {
		  case("1"):
		  {
		    if(strength >= 2) {
		    	System.out.println("With Gomez's intellegence he puts up a good fight, but with your strength, you win!");
		    	strength-=3;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("Do you wish to search Gomez's Body?");
				input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("You found $3 and 1 strength pill!");
				    	money+=3;
				    	strength+=1;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    } else {
				    	System.out.println("You chose not to search his body and found no goods.");
				    }
		    } else {
		    	System.out.println("With Gomez's smarts, he defeats you.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("2"):
		  {
		    System.out.println("You choose to help finance Gomez and his adventures, are you sure you want to spend your only $5?(1 or 2)?");
		    input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("Terrific, Gomez gets his money and you get to live another day.");
		    	money -= 5;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	
		    } else {
		    	System.out.println("Gomez realizes that you will be a hard fight, so he lets you be on your way.");
		    	
		    }
		    break;
		  }
		  case("3"):
		  {
		    if(speed >= 2) {
		    	System.out.println("With Gomez running after you, you keep on running, until Gomez gets distracted by a golden cube and bails.");
		    	speed-=2;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    } else {
		    	System.out.println("Due to your lack of speed, Gomez catches up to you and makes you bow down to him.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  default:
			  System.out.println("Gomez did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
		}
		System.out.println("");
		System.out.println("Congratulations on defeating your first hitman. You now need to decided where you want to go.");
		System.out.println("You can either go to the infamous city of Dunwall, where you will be hopefully safe from Gordons' jurisdiction,");
		System.out.println("or you could go to Empire Bay, where you would still be in Gordon's jurisdiction, but you will have the dense urban atmosphere to help you");
		

		{
			System.out.println("Which will it be, 1.Dunwall or 2.Empire Bay? (1 or 2)");
		    input = getInput("Dunwall", "Empire Bay");
		    if(input.equals("1")) {
		    	System.out.println("You chose Dunwall.");
		    	System.out.println("As you enter Dunwall, you see an uneasy sight. Dunwall is littered with Corvo wanted posters, and guards are at work patrolling the rat infested streets.");
		    	System.out.println("You start to walk through the back allys of Dunwall, remaining in the shawdows, but out of the corner of your eye, you spot a figure, appearing and dissapearing all around you.");
		    	System.out.println("You realize you are walking in Corvo territory.Corvo , from Dishonored, was once the bodygaurd of Empress Kaldwin of Dunwall. ");
		    	System.out.println("When Corvo was fasly accused of killing the Empress and abducting her daughter, Emily Kaldwin, Corvo needed revenge and he needed to avenge the Emperess."); 
				System.out.println("Corvo is a stealthy killer, but if the problem were to arise, Corvo would have no problem using a gun.");
				System.out.println("He is also equiped with various powers, such as the blink power which makes him the fastest player you'll face."); 
				System.out.println("You need to act, and fast. What do you want to do, Fight him, Pay him $5 and in return earn his mercy, or Run?");
				input = getInput("Fight", "Pay", "Run");
				switch(input) {
				  case("1"):
				  {
				    if(strength >= 5) {
				    	System.out.println("As Corvo tries to stealhly sneak up on you, you spot him, and without him even noticing, you slice him in half, you win!");
				    	strength-=3;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    	System.out.println("Do you wish to search Corvo's Body?");
						input = getInput("Yes", "No");
						    if(input.equals("1")) {
						    	System.out.println("You found 2 speed pill and a strength pill!");
						    	speed+=2;
						    	strength+=1;
						    	System.out.println("You have "+ strength + " strength");
						    	System.out.println("You have "+ money + " dollars");
						    	System.out.println("You have "+ speed + " speed");
						    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Dunwall.");
						    } else {
						    	System.out.println("You chose not to search his body and found no goods.");
						    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Dunwall.");
						    }
				    } else {
				    	System.out.println("With Corvo's impressive skills and his range of powers, he mercilessly stabs you!");
				    	System.out.println("Game Over");
				    	return;
				    }
				    break;
				  }
				  case("2"):
				  {
				    System.out.println("You choose to pay Corvo, are you sure you want to spend $5?(1 or 2)?");
				    input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("Unfortunatly, it is going to take more to convince Corvo to let you free, he is asking for $10, do you want to pay?(1 or 2).");
				    	input = getInput("Yes", "No");
				    	if(input.equals("1")){
				    		System.out.println("Corvo takes your money and silently dissapears.");
					    	money -= 10;
					    	System.out.println("You have "+ strength + " strength");
					    	System.out.println("You have "+ money + " dollars");
					    	System.out.println("You have "+ speed + " speed");
					    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Dunwall.");
				    	} else {
					    	System.out.println("With your decision to keep your money,Corvo swiftly pulls out his knife and stabs you in the neck.");
					    	System.out.println("Game Over");
					    	return;
				    	}
				    }
				     else {
				    	System.out.println("With your decision to keep your money, Corvo swiftly pulls out his knife and stabs you in the neck.");
				    	System.out.println("Game Over");
				    	return;
				    }
				    break;
				   }
				  
				  case("3"):
				  {
				    if(speed >= 10) {
				    	System.out.println("As you turn around to escape corvo, he uses his blink power, but he blinks to the ocean and you get away.");
				    	speed-=2;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Dunwall.");
				    	
				    } else {
				    	System.out.println("As you turn around to escape corvo, he uses his blink power, and appears infront of you with a blade through your heart, you die.");
				    	System.out.println("Game Over");
				    	return;
				    }
				  
				  }
				  default:
					  System.out.println("Corvo did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
				}
		    } else {
		    	System.out.println("You chose Empire Bay");
		    	System.out.println("As you enter Empire Bay, you are welcomed with happy faces and cool cars. You feel relieved, but wrongfully so.");  
		    	System.out.println("Out of no where, a black sedan pulls up, the window of the car lowers, and there with his gun poised, is Vito Scalleta from Mafia II.");
		    	System.out.println("Vito excels in urban warfare. Vito is a good gunsman, and is very quick."); 
				System.out.println("Do you want to Fight him, Pay him $5 and in return earn his mercy, or Run?");
				input = getInput("Fight", "Pay", "Run");
				switch(input) {
				  case("1"):
				  {
				    if(strength >= 4) {
				    	System.out.println("With your impressive strength, and Vito's not so impressive strength, you win!");
				    	strength-=3;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    	System.out.println("Do you wish to search Vito's Body?");
						input = getInput("Yes", "No");
						    if(input.equals("1")) {
						    	System.out.println("You found 1 speed pill and 1 strength pill!");
						    	speed+=1;
						    	strength+=1;
						    	System.out.println("You have "+ strength + " strength");
						    	System.out.println("You have "+ money + " dollars");
						    	System.out.println("You have "+ speed + " speed");
						    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Empire Bay.");
						    } else {
						    	System.out.println("You chose not to search his body and found no goods.");
						    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Empire Bay.");
						    }
				    } else {
				    	System.out.println("With Vito's skills in weapons, and his impressive strength, he guns you down!");
				    	System.out.println("Game Over");
				    	return;
				    }
				    break;
				  }
				  case("2"):
				  {
				    System.out.println("You choose to help finance the mafia, are you sure you want to spend $5?(1 or 2)?");
				    input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("Terrific, Vito gets his money and you get to live another day.");
				    	money -= 5;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Empire Bay.");
				    	
				    } else {
				    	System.out.println("With your decision to keep your money, Vito slowly pulls out a silenced pistol, points it directly at your forehead, and you get a bullet through your head.");
				    	System.out.println("Game Over");
				    	return;
				    }
				    break;
				  }
				  case("3"):
				  {
				    if(speed >= 5) {
				    	System.out.println("With bullets flying past your head, you run fast enough and barely get away.");
				    	speed-=2;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    	System.out.println("Now that you have encourted another foe, you realize that such urban cities are not safe, you must leave Empire Bay.");
				    } else {
				    	System.out.println("Due to your lack of speed, you get a bullet through your head.");
				    	System.out.println("Game Over");
				    	return;
				    }
				    break;
				  }
				  default:
					  System.out.println("Vito did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
				}
		    }
	
		  }

		System.out.println("");
		System.out.println("You decided that you need to go to the paradise islands where Far Cry 3 takes place.");
		System.out.println("You decided to embark on a boat to travel to the islands.");
		System.out.println("Once there, you meet a man named Dennis, who says he can provide you weapons, you just need to convince him why he should help.");
		System.out.println("");
		System.out.println("\"Hello " + name + ", My name is Dennis, I am from this island and I have a wide selection of weapons that you could have, you just need to convince me why you should get them");
		System.out.println("You can either be nice to Dennis, rude to him, or ignore him.");
		input = getInput("Be nice", "Be rude", "Ignore him");
		switch(input) {
		  case("1"):
		  {
			System.out.println("Do you want to tell Dennis");
		    input = getInput("\"Dennis you look really good today and I like the way you decorated your shop.\"", "\"Dennis, with your weapons I could protect myself and help kill Jason Brody, the man responsible for Citra's death.\"");
		    if(input.equals("1")) {
		    		System.out.println("\"Well thank you " + name +", but that wont get you my weapons!\"");
				    System.out.println("You did not get the weapons.");
				    System.out.println("You have "+ strength + " strength");
				    System.out.println("You have "+ money + " dollars");
				    System.out.println("You have "+ speed + " speed");
			
				    
		    } else {
		    	System.out.println("\"Well thank you " + name + ", if you got Jason, it would mean alot, here you go\"");
		    	System.out.println("You got the weapons");
		    	strength+=5;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    }
		    break;
		}
		  case("2"):
		  {
				System.out.println("Do you want to tell Dennis...");
			    input = getInput("\"Dennis you suck, I hate you, and I want your weapons to kill Jason Brody.\"", "\"Dennis you are ugly\"");
			    if(input.equals("1")) {
			    		System.out.println("\"Well your a jerk " + name +", but if it is to kill Jason Bordy, than I cannot deny you!\"");
			    		strength+=2;
					    System.out.println("You have "+ strength + " strength");
					    System.out.println("You have "+ money + " dollars");
					    System.out.println("You have "+ speed + " speed");
				
					    
			    } else {
			    	System.out.println("\"Well your uglier " + name + ", you don't get my weapons!\"");
			    	System.out.println("You have "+ strength + " strength");
			    	System.out.println("You have "+ money + " dollars");
			    	System.out.println("You have "+ speed + " speed");
			    }
			    break;
			}
		  case("3"):
		  {
				System.out.println("You chose to ignore Dennis, and after awhile he just left and you did not get the weapons.");
				System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
			    break;
			}
		  default:
			  System.out.println("Dennis did not understand your choice. Hit Run and try again, this time picking Nice, Rude, or Ignore!");
		}
    
		 System.out.println("Now that you have left Dennis' shop, you start to wander throughout the forest, looking for shelter, when all of a sudden, a car pulls up, with Jason Brody on the turret.");
		System.out.println(" Although Jason started as a scared American boy held captive by pirates, he ended up being one of"); 
		System.out.println("the most powerful warriors the island ever saw. He is good with guns but not the fastest."); 
		System.out.println("Do you want to Fight him, Pay him $5 and in return earn his mercy, or Run?");
		input = getInput("Fight", "Pay", "Run");
		switch(input) {
		  case("1"):
		  {
		    if(strength >= 7) {
		    	System.out.println("Although Jason is good with weapons, his gun jammed, and you quickly ran up and stabbed him, you win!");
		    	strength-=3;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("Do you want to search Jason's Body?");
				input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("You found nothing!");
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    } else {
				    	System.out.println("You chose not to search his body and found no goods.");
				    }
				    System.out.println("With Jason dealt with, you decide that its time you go back to Dennis and tell him your latest accomplishment");
					 System.out.println("You take a stroll through the beautiful island and meet up with Dennis at his shop");
					 System.out.println("\"What do you need this time\", Dennis inquired, and in response, you told him...");
					 input = getInput("\"Dennis I just wanted to say thank you for the guns, and you know what I did with them, I used them to kill Jason Brody!\"", "\"Dennis I still hate you and your ugly but I did kill Jason Brody.\"");
					 	if(input.equals("1"))
					 	{
					 		 System.out.println("\"Wow, I am so thankful " + name +", for this great deed, I will give you even more guns! And guess what " + name + ",");
					 		 System.out.println("I found a place that I think will be safe for you, Hong Kong!\"");
					 		 strength+=2;
					 		System.out.println("You have "+ strength + " strength");
					    	System.out.println("You have "+ money + " dollars");
					    	System.out.println("You have "+ speed + " speed");
					 	
					 	}else{
					 		System.out.println("Hmm, well I am not impressed " + name + ", not one bit. But for killing Jason Brody, I will tell you1 that I found a place where you will be safe, Hong Kong");
					 	}
		    } else {
		    	System.out.println("With Jason's knowledge on fire arms and guerilla warfare, you were no match to him!");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("2"):
		  {
		    System.out.println("You want to help Jason get more weapons with your money, are you sure you want to spend $5?(1 or 2)?");
		    input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("With Jason on his way with your money, you are safe.");
		    	money -= 5;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("You take a stroll through the beautiful island and meet up with Dennis at his shop");
				 System.out.println("\"What do you need this time\", Dennis inquired, and in response, you told him...");
				 input = getInput("\"Dennis I just wanted to say thank you for the guns, I tried to kill Jason but he was to strong, I had to surrender!\"", "\"Dennis I still hate you and your ugly but do you know where I could go to be safe?\"");
				 	if(input.equals("1"))
				 	{
				 		 System.out.println("\"Wow, I am thankful " + name +", for your effort. And guess what " + name + ",");
				 		 System.out.println("I found a place that I think will be safe for you, Hong Kong!\"");

				 	}else{
				 		System.out.println("Your ugly " + name + ". But becuase I am nice, I will tell that I found a place where you will be safe, Hong Kong");
				 	}
		    	
		    } else {
		    	System.out.println("Your decision to withhold the money does not end well for you, Jason calls upon his Rackyat Warriors and order them to give you a slow and painful death.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("3"):
		  {
		    if(speed >= 5) {
		    	System.out.println("You sprint as fast as you can, Jason trailing not too far behind you, but as you spot a car in your close vicinity, you hop in and leave Jason in the dust.");
		    	speed-=2;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("You take a stroll through the beautiful island and meet up with Dennis at his shop");
				 System.out.println("\"What do you need this time\", Dennis inquired, and in response, you told him...");
				 input = getInput("\"Dennis I just wanted to say thank you for the guns,I tried to kill Brody, but he was to strong, I had to flee!\"", "\"Dennis I still hate you and your ugly but do you know where I could go for shelter?\"");
				 if(input.equals("1"))
				 {
				 		 System.out.println("\"Wow, I am thankful " + name +", for your effort. And guess what " + name + ",");
				 		 System.out.println("I found a place that I think will be safe for you, Hong Kong!\"");

				 	}else{
				 		System.out.println("Your ugly " + name + ". But becuase I am nice, I will tell that I found a place where you will be safe, Hong Kong");
				 	}
		    	
		    } else {
		    	System.out.println("Although you are a fast runner by now, Jason starts his car and runs you down.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  default:
			  System.out.println("Jason did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
		}
		
		
		 System.out.println("");
		 System.out.println("With Dennis' advice, you decided to take a plane to Hong Kong, where you hope no hitmen will be waiting for you there, but only time will tell.");
		 System.out.println("As your plane touches down on Hong Kong territory, you feel relieved. You exit the airport and stop at some shops where they sell guns and running shoes");
		 System.out.println("Do you want the 1. guns, or the 2. shoes?");
		 input = getInput("Guns", "Shoes");
		 	if(input.equals("1"))
		 	{
		 		System.out.println("You chose the guns");
		 		strength+=2;
		 	}else{
		 		System.out.println("You chose the running shoes");
		 		speed+=2;
		 	}
		System.out.println("After your stop at the shops, you have decided that you need some sleep after all of these horrific fights.");
		System.out.println("You can either stay at 1.The Grand Hong Kong Hotel or the 2. Central Hong Kong Hotel");
		input = getInput("Grand Hong Kong Hotel","Central Hong Kong Hotel");
			if(input.equals("1"))
			{
				System.out.println("You chose to stay at the Grand Hong Kong Hotel.");
				System.out.println("You buy yourself a room for $5, and get some much need sleep.");
				money-=5;
				System.out.println("As the sun rises on the east side, and your room slowly fills with light, you wake up and get dressed.");
				System.out.println("You can either wear the 1. power suit, or the 2. lightweight suit?");
				    System.out.println("1.Power Suit 2. Lightweight Suit?(1 or 2)");
				    input = getInput("Power Suit", "Lightweight suit");
				    if(input.equals("1")) {
				    	System.out.println("You chose the power suit.");
				    	strength+=2;
				    } else {
				    	System.out.println("You chose the lightweight suit.");
				    	speed+=2;
				    }
				    
			
			System.out.println("You start to decend down the Hotel Stairs and you start to get hungry, very hungry. The only problem is that all of your money is back at your home in Gotham City");
			System.out.println("You realize there is a risk, but you need your supplies, you take a plane to Gotham City.");
			
		}else{
			
				System.out.println("You chose to stay at the Central Hong Kong Hotel.");
				System.out.println("You buy yourself a room for $5, and get some much need sleep.");
				money-=5;
				System.out.println("As the sun rises on the east side, and your room slowly fills with light, you wake up and get dressed.");
				System.out.println("You can either wear the 1. power suit, or the 2. lightweight?");

				{
				    System.out.println("1.Power Suit 2. Lightweight Suit?(1 or 2)");
				    input = getInput("Power Suit", "Lightweight Suit");
				    if(input.equals("1")) {
				    	System.out.println("You chose the power suit.");
				    
				    } else {
				    	System.out.println("You chose the lightweight suit.");
				    
				    }
				    
				  }
			
		
		System.out.println("You start your decent down the stairs, when you are all of a sudden confronted by a muscular man");
		System.out.println("His face seems familier to you, You think, think, and you remember his name... is Wei Shen from Sleeping Dogs.");
		System.out.println("Wei is a very strong challenger with skills with guns and kong fu."); 		
		System.out.println("Do you want to Fight him, Pay him $5 and in return earn his mercy, or Run?");
		input = getInput("Fight", "Pay", "Run");
		switch(input) {
		  case("1"):
		  {
		    if(strength >= 10) {
		    	System.out.println("As Wei comes at you doing a karate move, you don't watch the theatrics and shoot him in the face, you win!");
		    	strength-=3;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("Do you wish to search Wei's Body?");
				input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("You found 2 strength pill!");
				    	strength+=2;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    } else {
				    	System.out.println("You chose not to search his body and found no goods.");
				    }
		    } else {
		    	System.out.println("Wei runs at you, and before you could even blink, he is beating you to a pulp, and once you are rendered useless, he shoves you into a fan, cutting your face into little tiny pieces!");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("2"):
		  {
		    System.out.println("You choose to pay the undercover cop, are you sure you want to spend $5?(1 or 2)?");
		    input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("Unfortunatly for you, Wei being a cop, will not accept a bribe, He will only accept 3 strength pills.");
		    	input = getInput("Yes", "No");
		    	if(input.equals("1")){
		    		System.out.println("Corvo takes your pills and drives off.");
			    	strength -= 6;
			    	System.out.println("You have "+ strength + " strength");
			    	System.out.println("You have "+ money + " dollars");
			    	System.out.println("You have "+ speed + " speed");
		    	} else {
			    	System.out.println("Because you chose to keep your strength pills and stand your ground, Wei grabs your face, and shoves it to the ground. As you lay there nearly unconcious, Wei starts his car and runs you over.");
			    	System.out.println("Game Over");
			    	return;
		    	}
		    	
		    } else {
		    	System.out.println("With your decision to keep your money, Wei grabs your face, and shoves it to the ground. As you lay there nearly unconcious, Wei starts his car and runs you over.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("3"):
		  {
		    if(speed >= 4) {
		    	System.out.println("As you start to run, Wei hops in his car and as he gets close to you he tries to shoot you, but gets distracted and drives into another car, you escape.");
		    	speed-=2;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    } else {
		    	System.out.println("As you start to run, Wei hops in his car and as he gets close to you, he peeks his head out of the windo and shoots you down.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  default:
			  System.out.println("Wei did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
		}
		System.out.println("You win the battle, but you are huffing and puffing, you are hungry, very hungry. The only problem is that all of your money is back at your home in Gotham City");
		System.out.println("You realize there is a risk, but you need your supplies, you take a plane to Gotham City");
			}
		System.out.println("");
		System.out.println("Your plane is high in the sky, and you are relaxed.");
		System.out.println("The intercom calls out, \"Hello folks, this is your captain speaking, we will be starting out decent momentarily.\"");
		System.out.println("As the plane starts to decend, it all of a sudden starts to get hot, very hot.");
		System.out.println("BOOM!");
		System.out.println("The engine explodes and flames start to spread out everywhere.");
		System.out.println("The plane starts to plummet towards the sea floor.");
		System.out.println("Panic and chaos breakouts amoung the passengers as the plane picks up speed and after only a couple of seconds, the plane hits the sea surface.");
		System.out.println("");
		System.out.println("");
		System.out.println("You wake up as the sun starts to fall to the west. It's been hours since the crash.");
		System.out.println("You look around and find nobody, just the plane and you.");
		System.out.println("Some how, you are wearing a life jacket, some one must have put you in it, but who did it is still unknown.");
		System.out.println("Out of the corner of your eye, you spot a lighthouse down towards the horizon.You swim as fast as you can to the lighthouse");
		System.out.println("As you approach the lighthouse, you spot a ladder, which you promptly climb and enter the light house.");
		System.out.println("As you ascend the stairs, you see dead bodies on each floor. Each body has a bag on their head with signs around their neck exclaiming \"GO BACK\".");
		System.out.println("Once you get to the top floor of the light house, you find a chamber, in which a chair sits in the middle.");
		System.out.println("You go to the chair and find a switch, you flip the switch and the chamber closes.");
		System.out.println("Moments after that, the chamber starts to rise, and rise and rise until you reach the clouds.");
		System.out.println("The chamber begins to slow down, and the doors to the chamber open, revealing the paradise in the skies, Columbia.");
		System.out.println("You exit the chamber with a wide smile, you feel safe, you feel cozy, but that feeling leaves your body rather quickly when");
		System.out.println("the most famous duo in the skies, Booker Dewitt and Anna/Elizabeth Dewitt emerge");
		System.out.println("This duo battled Zachary Comstock and his army. They are powerful and fast but something to note is that while Booker kills, Anna/Elizabeth re-supplies."); 
		System.out.println("Do you want to Fight them, Pay them $5 and in return earn their mercy, or Run?");
		input = getInput("Fight", "Pay", "Run");
		switch(input) {
		  case("1"):
		  {
		    if(strength >= 11) {
		    	System.out.println("As Booker jumps on a skyline and aims his rifle at you, he accidently summons songbird, who in confusion, kills Booker, you win!");
		    	strength-=3;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("Do you wish to search Booker's Body?");
				input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("You found 2 speed pill and 2 strength pill!");
				    	speed+=2;
				    	strength+=2;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    } else {
				    	System.out.println("You chose not to search his body and found no goods.");
				    }
		    } else {
		    	System.out.println("With Booker's varitey of vigors, he chooses the Bucking Bronco vigor to send you air born, and then pulls out his rifle to finish the job!");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("2"):
		  {
		    System.out.println("You choose to help Bookers cause and pay him, are you sure you want to spend $5?(1 or 2)?");
		    input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("Perfect, Booker takes his money and goes on his way.");
		    	money -= 5;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	
		    } else {
		    	System.out.println("With your decision to keep your money, Booker decides that he will kill you in one of the worst ways imaginable, by the Murder of Crows vigor, you lose.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("3"):
		  {
		    if(speed >= 8) {
		    	System.out.println("As you turn around to run, Booker and Anna/Elizabeth start to sprint after you, and just as you turn the corner, Comstock's men emerge, taking care of Booker.");
		    	speed-=2;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    } else {
		    	System.out.println("As you turn around to book it, booker starts to sprint after you. Once Booker catches up to you, he uses the Devil's Kiss vigor to finish you off.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  default:
			  System.out.println("Booker and Anna/Elizabeth did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
		}
		System.out.println("With Columbia now classified as unsafe for you, you hop back into the chamber and take it down to the lighthouse");
		System.out.println("You steal a boat that is tied to the lighthouse entrance and start your drive to Gotham");
		System.out.println("Along the way you spot another vessel called Drake's Fortune");
		System.out.println("You label this boat as no trouble and you countinue your journey. As your boat and Drake's Fortune start to get closer and closer");
		System.out.println("Drake's Fortune opens fire on your boat.");
		System.out.println("As they start to shoot at you, you are able to piece together the puzzle, and realize that on that boat is none other than Drake and his Partner Sully from the Uncharted Series");
		System.out.println(" Do you want to Fight them, Pay them $5 and in return earn their mercy, or Run?");
		input = getInput("Fight", "Pay", "Run");
		switch(input) {
		  case("1"):
		  {
			  
		    if(strength >= 11) {
		    	System.out.println("As Drake and Sully start to empty rounds on you, you realize that they are nearly out of ammo, and you take advantage of this by waiting a few minutes until they are scrambaling for ammo, then you pull your gun over your cover and destroy them!");
		    	strength-=3;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    	System.out.println("Do you wish to search Drake's Body?");
				input = getInput("Yes", "No");
				    if(input.equals("1")) {
				    	System.out.println("You found $5!");
				    	money+=5;
				    	System.out.println("You have "+ strength + " strength");
				    	System.out.println("You have "+ money + " dollars");
				    	System.out.println("You have "+ speed + " speed");
				    } else {
				    	System.out.println("You chose not to search his body and found no goods.");
				    }
		    } else {
		    	System.out.println("With Drake and Sully's masterful shooting, they gun you down!");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  case("2"):
		  {
		    System.out.println("You choose to add to Drake and Sully's fortune, are you sure you want to spend $5?(1 or 2)?");
		    input = getInput("Yes", "No");
		    if(input.equals("1")) {
		    	System.out.println("Unfortunatly for you, a mere $5 means nothing to Drake and Sully, so they shoot you in the face.");
		    	System.out.println("Game Over");
		    	return;
		    	
		    } else {
		    	System.out.println("You chose to keep your money, and luckly that was the right decision because Drake and Sully didn't want your mere $5, they let you live.");
		    }
		    break;
		  }
		  case("3"):
		  {
		    if(speed >= 7) {
		    	System.out.println("You start to run away from Drake and Sully, only to realize that Sully has fallen, and Drake has decided to help Sully and forget about you.");
		    	speed-=2;
		    	System.out.println("You have "+ strength + " strength");
		    	System.out.println("You have "+ money + " dollars");
		    	System.out.println("You have "+ speed + " speed");
		    } else {
		    	System.out.println("Due to Drake's skill in freeruning, he runs past you with ease and turns around with two AK-47, leaving you no choice but to surrender and die with dignity.");
		    	System.out.println("Game Over");
		    	return;
		    }
		    break;
		  }
		  default:
			  System.out.println("Drake and Sully did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
			  }
		System.out.println("Now that Drake and Sully are taken care of, you continue your route to Gotham city");
		 System.out.println("After hours of driving you finally spot land, but it's not what you expected");
		 System.out.println("Instead of seeing a urban city infront of your eyes, you see a much more rural area of land.");
		 System.out.println("Once you get on land, you walk through an area with dead clickers and runners spread out throughout the city.");
		 System.out.println("Clearly, this area has not recovered well from the outbreak years ago.");
		 System.out.println("As you continue down the lonley street, two figures appear, a girl, and a man");
		 System.out.println("\"Hey Joel, up here!\", the girl shouts. when hearing the name you realize that this duo is Joel and Ellie from the Last of Us.");
		 System.out.println("This duo is one of the strongest out there, being the few people that survived the horrific outbreak in their area.");
		System.out.println("Do you want to Fight them, Pay them $5 and in return earn their mercy, or Run?");
			input = getInput("Fight", "Pay", "Run");
			switch(input) {
			  case("1"):
			  {
			    if(strength >= 15) {
			    	System.out.println("Joel and Ellie start to shoot at you and you shoot back! You aim for Joel, but shoot Ellie in the leg. Joel being worried about Ellie,");
			    	System.out.println("picks her up and runs to protect her. Joel still is a threat however, so you take him out and leave Ellie to fend for herself.");
			    	strength-=3;
			    	System.out.println("You have "+ strength + " strength");
			    	System.out.println("You have "+ money + " dollars");
			    	System.out.println("You have "+ speed + " speed");
			    	System.out.println("Do you wish to search Joel's Body?");
					input = getInput("Yes", "No");
					    if(input.equals("1")) {
					    	System.out.println("You found 1 speed pill!");
					    	speed+=1;
					    	System.out.println("You have "+ strength + " strength");
					    	System.out.println("You have "+ money + " dollars");
					    	System.out.println("You have "+ speed + " speed");
					    } else {
					    	System.out.println("You chose not to search his body and found no goods.");
					    }
			    } else {
			    	System.out.println("With Joel and Ellie's top notch survival skills, you are no match to zombies, and  they gun you down!");
			    	System.out.println("Game Over");
			    	return;
			    }
			    break;
			  }
			  case("2"):
			  {
			    System.out.println("You choose to pay Joel and Ellie, are you sure you want to spend $5?(1 or 2)?");
			    input = getInput("Yes", "No");
			    if(input.equals("1")) {
			    	System.out.println("Perfect, Joel and Ellie get their money and you get to live another day.");
			    	money -= 5;
			    	System.out.println("You have "+ strength + " strength");
			    	System.out.println("You have "+ money + " dollars");
			    	System.out.println("You have "+ speed + " speed");
			    	
			    } else {
			    	System.out.println("With your decision to keep your money, Joel runs towards you and pulverizes you with his nail bat.");
			    	System.out.println("Game Over");
			    	return;
			    }
			    break;
			  }
			  case("3"):
			  {
			    if(speed >= 9) {
			    	System.out.println("With Joel and Ellie's bullets whizzing past your head, you run fast enough and barely get away.");
			    	speed-=2;
			    	System.out.println("You have "+ strength + " strength");
			    	System.out.println("You have "+ money + " dollars");
			    	System.out.println("You have "+ speed + " speed");
			    } else {
			    	System.out.println("Due to your lack of speed, Joel uses his rifle to give you a bullet through your head.");
			    	System.out.println("Game Over");
			    	return;
			    }
			    break;
			  }
			  default:
				  System.out.println("Joel and Ellie did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
			}
			System.out.println("After that battle, you continue your journry to Gotham City.");
			 System.out.println("You are rather worried of what the outcome will be because if you don't go about this the right way,");
			 System.out.println("You could end up dead by GCPD before you even get to your apartment.");
			 System.out.println("Your main worry however is the Dark Knight.");
			 System.out.println("Although it has been almost a decade since anyone has last seen the Caped Crusader, you need to be ready for anything.");
				System.out.println("To get to your apartment you can take two routes.");
				System.out.println("The other route you could take would be to hire a taxi to drive you to your apartment.");
				System.out.println("Right behind your house is a shopping mall, if you enter the city through the shopping mall, the crowd could very well hide you until you got home.");
				input = getInput("Taxi Route","Shopping Mall Route");
					if(input.equals("1"))
					{
						System.out.println("You chose to hire a Taxi.");
						System.out.println("You hire a taxi for $5, and get on your way.");
						money-=5;
						System.out.println("As the taxi starts to approach your house, you see that you have vistors, the GCPD"); 	
						System.out.println("The GCPD are Gotham's finest, they are expertly trained with fire arms.");
						System.out.println("Do you want to Fight them or Run?");
						input = getInput("Fight", "Run");
						switch(input) {
						  case("1"):
						  {
						    if(strength >= 9) {
						    	System.out.println("You realize that going guns blazing won't end well for you. Instead you decide to hit them with a flash grenade and pick them off one by one, you win!");
						    	strength-=3;
						    	System.out.println("You have "+ strength + " strength");
						    	System.out.println("You have "+ money + " dollars");
						    	System.out.println("You have "+ speed + " speed");
						    	System.out.println("Do you wish to search the cops' Bodies?");
								input = getInput("Yes", "No");
								    if(input.equals("1")) {
								    	System.out.println("You found 2 strength pills and $5!");
								    	strength+=2;
								    	money+=5;
								    	System.out.println("You have "+ strength + " strength");
								    	System.out.println("You have "+ money + " dollars");
								    	System.out.println("You have "+ speed + " speed");
								    	System.out.println("With Gotham's finest taken care of, you enter your apartment and head up the stairs.");
								    } else {
								    	System.out.println("You chose not to search their bodies and found no goods.");
								    }
								    System.out.println("With Gotham's finest taken care of, you enter your apartment and head up the stairs.");
						    } else {
						    	System.out.println("As you start to open fire, they do the same to you, and with no cover, you are shot to bits in seconds.");
						    	System.out.println("Game Over");
						    	return;
						    }
						    break;
						  }
						  
						  case("2"):
						  {
						    if(speed >= 6) {
						    	System.out.println("As you start to run, the GCPD all scramble to get into their cars, but by the time they get their engines running, you are long gone.");
						    	speed-=2;
						    	System.out.println("You have "+ strength + " strength");
						    	System.out.println("You have "+ money + " dollars");
						    	System.out.println("You have "+ speed + " speed");
						    	System.out.println("With Gotham's finest taken care of, you enter your apartment and head up the stairs.");
						    } else {
						    	System.out.println("As you start to run, the GCPD open fire, and unfortunatly for you, GCPD officer Aaron Cash uses his sniper rifle to get a bullet through your skull .");
						    	System.out.println("Game Over");
						    	return;
						    }
						    break;
						  }
						  default:
							  System.out.println("The GCPD did not understand your choice. Hit Run and try again, this time picking FIGHT, PAY, or RUN!");
						}
						    
						

				}else{
					
						System.out.println("You chose to take the Shopping Mall Route.");
						System.out.println("You enter the shopping mall, and stick to a crowd that is heading in the direction you are going to.");
						System.out.println("As you approach the exit, the crowd starts to disperse, leaving you vulnerable.");
						System.out.println("As you reach for the handle to the door, a dark figure drops down between you and the door.");
						System.out.println("You turn around and sprint the otherway, but before you even turn, he's there, the Batman is there...");
						System.out.println("The Batman throws a punch your way, but you...");
						{
						    System.out.println("1.Lean back and dodge the punch or 2. Throw a punch back his way?(1 or 2)");
						    input = getInput("Dodge", "Punch");
						    if(input.equals("1")) {
						    	System.out.println("You lean back and dodge his punch.");
						    	System.out.println("With the Batman recovering from his missed punch, you can either wip out your gun and kill the Batman");
						    	System.out.println("or you could Throw a punch at Batman");
						    	input = getInput("Shoot", "Punch");
						    	if(input.equals("1")) {
						    		System.out.println("With Batman unprepared, you wip out your gun and attempt to shoot him");
						    		System.out.println("As you raise your gun to shoot, Batman blocks your hand, but you pull the trigger and shoot Batman in his leg");
						    		System.out.println("With Batman maimed, you can either try to shoot him in the head again");
						    		System.out.println("or you could run");
						    		input = getInput("Shoot","Run");
						    		if(input.equals("1")) {
						    			System.out.println("You aim your gun for the second time, this time you send a bullet straight through Batman's skull");
						    			System.out.println("With Batman taken care of, you run to your apartment and head up the stairs.");
						    		}else{
						    			System.out.println("You start to sprint out the door, but before you even make it there, batman sends off multiple batarangs that knock you unconcious");
						    			System.out.println("You wake up behind bars, now you wait for you trial");
						    			System.out.println("Game Over");
						    			return;
						    		}
						    	}else{
						    		System.out.println("You throw a punch towards Batman, but due to your lack of knowledge on hand to hand combat, you lose");
					    			System.out.println("Game Over");
					    			return;
						    	}
						    		
						    } else {
						    	System.out.println("With all your might you throw a punch at the Batman, and as your hands collide, an unimagineable pain comes to your hand.");
						    	strength-=2;
						    		if(strength <=0){
						    			System.out.println("The pain for you is to much and you fall to the ground");
						    			System.out.println("You wake up behind bars, now you wait for your trial.");
						    			System.out.println("Game Over");
						    			return;
						    		}else{
						    			System.out.println("Now do you want to use your gun to finish the Batman");
						    			System.out.println("or do you want to throw a punch again?");
						    			if(input.equals("1")) {
								    		System.out.println("With Batman dazed, you wip out your gun and attempt to shoot him");
								    		System.out.println("As you raise your gun to shoot, Batman blocks your hand, but you pull the trigger and shoot Batman in his leg");
								    		System.out.println("With Batman maimed, you can either try to shoot him in the head again");
								    		System.out.println("or you could run");
								    		input = getInput("Shoot","Run");
								    		if(input.equals("1")) {
								    			System.out.println("You aim your gun for the second time, this time you send a bullet straight through Batman's skull");
								    			System.out.println("With Batman taken care of, you run to your apartment and head up the stairs.");
								    		}else{
								    			System.out.println("You start to sprint out the door, but before you even make it there, batman sends off multiple batarangs that knock you unconcious");
								    			System.out.println("You wake up behind bars, now you wait for you trial");
								    			System.out.println("Game Over");
								    			return;
								    		}
						    			}else{
						    				System.out.println("You throw another punch, but this time Batman is more aware and he grabs your hand and flips you to the ground");
						    				System.out.println("Batman then puts one foot on your chest, and with his swift fist, knocks you out");
						    				System.out.println("You wake up behind bars, now you wait for your trial.");
						    				System.out.println("Game Over");
						    			} 
						    		}
						    	}
							}
						}
					System.out.println("Once at your appartment, you feel confident that there are no more bounty hunters in your area.");
					System.out.println("You click on your television and start to pack your bag");
					System.out.println("");
					System.out.println("\"Breaking news!\", the television exclaims");
					System.out.println("Then the televison switched to a shot of the news reporter told Gotham City about the terrible fight that took place in their city");
					System.out.println("The news reporter continued by saying, \"" + name + ", the " + gender + " who " + deed + " has traveled all around the world in the past few days");
					System.out.println("killing the bounty hunters who were sent after this " + gender +". At this point there are no other bounty hunters who are after " + name + ".");
					System.out.println("We do not no where " + name + " is so please stay alert and safe.");
					System.out.println("This is Vicki Vale signing off, good night Gotham\"");
					System.out.println("");
					System.out.println("With that news, you decide to stay at your appartment for the night.");
					System.out.println("");
					System.out.println("As the Sun Slowly rises from the east, and your room slowly starts to fill with light, you reluctantly rise from your bed. You walk towards your closet,");
					System.out.println("What do you want to wear today? You can wear your power suit or your lightweight suit");
					
					{
					    System.out.println("1.Power Suit 2. Lightweight Suit?(1 or 2)");
					    input = getInput("Power Suit", "Lightweight Suit");
					    if(input.equals("1")) {
					    	System.out.println("You chose the power suit.");
					    	strength+=2;
					    } else {
					    	System.out.println("You chose the lightweight suit.");
					    	speed+=2;
					    }
				
					  }

					System.out.println("Once dressed, you start your descent down the stairs of your vacant appartment building. At the door you notice something unusual, its a letter");
					System.out.println("made out to yourself. You diligently open the letter and it reads,\"This little piggy went to the morgue.\"");
					System.out.println("And right as you finish the letter, the door is kicked in, revealing a neon figure on the other side");
					System.out.println("The figure takes out his gun and leaves a bullet through your head.");
					System.out.println("Who was the figure that killed you?");
					input = scn.nextLine();		
					if(input.equals("Rex Power Colt")) {
				    	System.out.println("Congratulations, you have defeated all bounty hunters and found out who killed you!");
				    	System.out.println("You ended with " + money + " amount of money, " + strength + " amount of strength, and " + speed + " amount of speed");
				    	System.out.println("Thanks for playing.");
				    	return;
				    } else {
				    	System.out.println("You did not correctly identify your killer, you lose.");
				    	System.out.println("You ended with " + money + " amount of money, " + strength + " amount of strength, and " + speed + " amount of speed");
				    	System.out.println("Game Over");
				    	return;
				    }
					}
					
	 
	/**
	 * This function gets either a 1, 2, or 3 from the user as a string
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 * @return
	 */
	public static String getInput(String arg1, String arg2, String arg3)
	{
		String input;
		do
		{
			System.out.println("Select: ");
			System.out.println("1. " + arg1);
			System.out.println("2. " + arg2);
			System.out.println("3. " + arg3);
			input = scn.nextLine();
		} while(!(input.equals("1") || input.equals("2") || input.equals("3")));
		return input;
	}
	
	public static String getInput(String arg1, String arg2)
	{
		String input;
		do
		{
			System.out.println("Select: ");
			System.out.println("1. " + arg1);
			System.out.println("2. " + arg2);
			input = scn.nextLine();
		} while(!(input.equals("1") || input.equals("2")));
		return input;
	}


public static String getInput(String arg1)
{
	String input;
	do
	{
		input = scn.nextLine();
	} while(!input.equals(arg1));
	return input;
}

}