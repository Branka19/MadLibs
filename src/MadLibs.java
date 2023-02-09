import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
				
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 2 names:\n");
		
		    String name1 = in.nextLine();
		    String name2 = in.nextLine();
	    
	    System.out.println("\nEnter 3 adjectives:\n");

	      String adjective1 = in.nextLine();
	      String adjective2 = in.nextLine();
	      String adjective3 = in.nextLine();

	    System.out.println("\nEnter 6 nouns:\n");
	    
	      String noun1 = in.nextLine();
	      String noun2 = in.nextLine();
	      String noun3 = in.nextLine();
	      String noun4 = in.nextLine();
	      String noun5 = in.nextLine();
	      String noun6 = in.nextLine();

	      System.out.println("\nEnter 1 verb:\n");
	      String verb1 = in.nextLine();

	      System.out.println("\nEnter 1 number:\n");
	      int number = in.nextInt();;

	      System.out.println("\nEnter 1 place:\n");
	      String place1 = in.nextLine();
	      
	      in.close();
	      
	      //The template for the story
	        
	      String story = "This morning %s woke up feeling %s.\n'It is going to be a %s day!'\nOutside, a bunch of %ss were protesting to keep %s in stores.\nThey began to %s to the rhythm of the %s, which made all the %ss very %s.\nConcerned, %s texted %s, who flew %s to %s and dropped %s in a puddle of frozen %s.\n%s woke up in the year %d, in a world where %ss ruled the world.";
	      System.out.printf(story, name1, adjective1, adjective2, noun1, noun2, verb1, noun3, noun4, adjective3, name1, name2, name1, place1, name1, noun5, name1, number, noun6);    
	      
	      
	}

}
