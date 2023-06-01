import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a verb:");
        String word1 = scan.nextLine();

        System.out.println("Enter a verb ending in 'ing':");
        String word2 = scan.nextLine();


        System.out.println("Enter a plural noun:");
        String word3 = scan.nextLine();


        System.out.println("Enter an adjective:");
        String word4 = scan.nextLine();


        System.out.println("Enter a noun:");
        String word5 = scan.nextLine();


        System.out.println("Enter a colour:");
        String word6 = scan.nextLine();


        System.out.println("Enter a plural noun:");
        String word7 = scan.nextLine();


        System.out.println("Enter a number:");
        String word8 = scan.nextLine();


        System.out.println("Enter a type of liquid:");
        String word9 = scan.nextLine();


        System.out.println("Enter as adjective:");
        String word10 = scan.nextLine();


        System.out.println("Enter a noun:");
        String word11 = scan.nextLine();


        System.out.println("Enter an adverb:");
        String word12 = scan.nextLine();


        System.out.println("Enter a silly word:");
        String word13 = scan.nextLine();

        
        System.out.println("Enter a body part:");
        String word14 = scan.nextLine();


        System.out.println("Enter an exclamation:");
        String word15 = scan.nextLine();


        System.out.println("Enter a verb:");
        String word16 = scan.nextLine();


        System.out.println("Enter an adverb:");
        String word17 = scan.nextLine();


        System.out.println("Here is your creation:");

        System.out.println("Me: You ready to " + word1 + " tonight?");
        System.out.println("You: Yeah! what time are you " + word2 + " here?");
        System.out.println("Me: In a bit. Did you get the " + word3 + " for tonight?");
        System.out.println("You: I am pretty sure, but let's do a/an " + word4 + " rundown.");
        System.out.println("Me: Okay, we need a/an " + word5 + " of beer, plenty of " 
        + word6 + " cups, some ping-pong " + word7 + ", " + word8 + " of them" + " , food, a couple bottles of " + word9 
        + " , and a/an " + word10 + " playlist. Oh, do you have those " + word11 
        + " brownies? Those were " + word12 + " amzing");
        System.out.println("Me: " + word13 + "!" + "How many people RSVP on  " + word14 + "-book?");
        System.out.println("You: Oh, " + word15 + "!");
        System.out.println("Me: You forgot to " + word16 + " the invites??");
        System.out.println("You: Maybe. This is going to be " + word17 + " boring with just us, huh?");

    }
}