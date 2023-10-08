package habitable_worlds;

/*
 * Authors - Ayush Ahir, Navdeep Gill, Jaspreet Jawanda. 
 * Description - This Program is for ranking/grading a planet for life support and development of the future.
 *
 */

import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	// Method to get the name of the exoplanet and store it in a file
	public static String getName() throws IOException {
		FileWriter fw = new FileWriter("DATABASE.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		String name;
		System.out.println("Enter your exoplanet's name:");
		name = scan.nextLine();
		name = scan.nextLine();
		pw.println("Name: " + name);
		pw.close();
		return name;
	}

	// Method to read data from the database file
	public static int readDataFromDatabase(String[] names, int[] scores) throws FileNotFoundException {
		Scanner fileScanner;
		try {
			fileScanner = new Scanner(new File("DATABASE.txt"));
		} catch (FileNotFoundException e) {
			System.err.println("DATABASE.txt not found.");
			throw e;
		}

		int index = 0;
		while (fileScanner.hasNextLine()) {
			String line = fileScanner.nextLine();
			if (line.startsWith("Name: ")) {
				// Extract the name and store it in the names array
				names[index] = line.substring(6); // Removes "Name: " from the line
			} else if (line.startsWith("Score: ")) {
				// Extract the score and store it in the scores array
				scores[index] = Integer.parseInt(line.substring(7)); // Removes "Score: " from the line
				index++;
			}
		}

		fileScanner.close();
		return index; // Return the count of valid entries
	}

	 // Method to ask a series of questions and evaluate the exoplanet
	public static int choice() {

		int timeschosen = 0;
		String answer = "yes";

		System.out.println("Does the exoplanet fall within the habitable zone of its host star?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println("Does the exoplanet have a stable and moderate surface temperature?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println("Does the exoplanet have a suitable atmosphere for supporting life?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's atmosphere primarily composed of gases conducive to life (e.g., oxygen, nitrogen)?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println("Does the exoplanet have a stable and consistent source of liquid water on its surface?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's surface free from extreme environmental hazards (e.g., high radiation, frequent extreme weather)?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println("Is the exoplanet's geology stable and suitable for supporting life?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println("Does the exoplanet have a magnetic field to protect against harmful solar radiation?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println("Is the exoplanet's orbit relatively circular and stable?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet located within a system with other celestial bodies that could provide beneficial interactions for potential life (e.g., moon for tidal stability)?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Does the exoplanet have abundant natural resources such as minerals, metals, and elements essential for sustaining life and technological development?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Does the exoplanet have a diverse range of ecosystems and biodiversity, indicating potential availability of biological resources for sustenance?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet rich in organic materials or compounds that could support the development of complex life forms?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet have an ecosystem that is conducive to agriculture or farming for sustaining a population?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet have renewable energy sources, such as sunlight or geothermal energy, available in sufficient quantities for sustainable energy production?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet located in proximity to asteroid belts or other celestial bodies that could provide additional resources through mining or utilization?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet have stable tectonic activity that may create geological features useful for resource extraction or energy generation?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet have adequate freshwater or accessible water sources for consumption, agriculture, and other essential needs?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Are there signs of geological formations, such as caves or underground reservoirs, that could potentially contain valuable resources or provide shelter for life?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet show evidence of a climate or environmental conditions conducive to resource extraction and utilization, like moderate temperatures and manageable weather patterns?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's surface gravity within a range suitable for Earth-like life (approximately 0.8 to 1.2 times Earth's gravity)?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's gravity strong enough to retain a stable and breathable atmosphere for potential life forms?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Does the exoplanet have a gravity level that allows for the formation and maintenance of liquid bodies like oceans and lakes without excessive evaporation or escape?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's gravity conducive to the development of plant life, allowing for a functional ecosystem and potential food sources?");
		answer = scan.nextLine();

		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Does the exoplanet's gravity permit the existence of structures and organisms capable of withstanding its effects and living comfortably?");

		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's gravity sufficiently strong to enable natural geological processes, such as plate tectonics, which may be important for habitability and resource availability?");

		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Does the exoplanet's gravity allow for the retention of a protective magnetosphere, shielding the surface from harmful solar and cosmic radiation?");

		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's gravity consistent across its surface, minimizing extreme variations that could affect stability and habitability?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Does the exoplanet have a gravitational pull that enables the retention of a stable, moderate-density atmosphere over long periods of time?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's gravity influenced by neighboring celestial bodies in a manner that stabilizes its orbit and enhances the potential for habitability?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet located within a distance from Earth that is feasible for human exploration and potential colonization with current technology?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's distance from Earth within the range of our current deep-space exploration capabilities?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}

		System.out.println(
				"Is the exoplanet's distance from Earth less than 50 light-years, making it reachable with foreseeable advancements in space travel technology?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet relatively young in age, indicating potential for geological and environmental dynamics suitable for habitability?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's age within a range that suggests its habitability has been maintained for a substantial portion of its existence?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's age within a range that aligns with the emergence and evolution of complex life forms, based on Earth's evolutionary timeline?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's age consistent with the potential for the development of technological civilizations, similar to or beyond Earth's current level of advancement?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet located within a star system that could be feasibly reached using current propulsion technologies within a human lifetime?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet located within our Milky Way galaxy, making it reachable with our current understanding of interstellar travel?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println(
				"Is the exoplanet's distance and age combination conducive to planning and executing an unmanned mission for further study and observation using existing spacecraft technology?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		System.out.println("Is the distance to exoplanet's achivable in one lifetime?");
		answer = scan.nextLine();
		if (answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
			timeschosen = timeschosen + 2;
		}
		return timeschosen;// Return the total score
	}

	// Method to calculate gravity based on mass and radius
	public static int calculateGravity() {

		final double gravConstant = 6.6743 * Math.pow(10, -11);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("What is the mass of the exoplanet (in kg)");
		double mass = scan.nextDouble();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("What is the radius of the planet (in m)");
		double radius = scan.nextDouble();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("						Data base has been updated.");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");
		double gravity = (gravConstant * mass) / Math.pow(radius, 2);

		if (gravity < 0.981)
			return -1;// Return the gravity score
		else if (gravity > 19.62)
			return -2;// Return the gravity score
		else
			return 2;// Return the gravity score

	}
	
	// Method to display the main menu and allow the user to add an exoplanet or play the game
	public static int menu() throws IOException {
		int totalScore = 0;
		int option = 0;
		String name;
		FileWriter fw = new FileWriter("DATABASE.txt", true);
		PrintWriter pw = new PrintWriter(fw);
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println(" ~+\n" + "                 *       +\n" + "           '                  |\n"
				+ "       ()    .-.,=\"``\"=.    - o -\n" + "             '=/_       \\     |\n"
				+ "          *   |  '=._    |\n" + "               \\     `=./`,        '\n"
				+ "            .   '=.__.=' `='      *\n" + "   +                         +\n"
				+ "        O      *        '       .\"");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Welcome........");
		System.out.println("Choose your option");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("1. Add exoplanet to the database");
		System.out.println("2. Play the game of compareing the plants");
		System.out.println("-----------------------------------------------------------------------------");
		option = scan.nextInt();

		if (option == 1) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("This program will help you find if your new planet is habitable");
			System.out.println("After this we will be asking you a few questions, please reply with yes or no.");
			System.out.println("-----------------------------------------------------------------------------");

			name = getName();
			pw.println("Name: " + name);
			totalScore = choice();
			totalScore += calculateGravity();
			pw.println("Score: " + totalScore);
			pw.close();
		} else if (option == 2) {
			game();
		}

		return totalScore;
	}

	// Method to play the comparison game
	public static void game() throws IOException {

		String[] namesArray = new String[100]; // Assuming a maximum of 100 entries
		int[] scoresArray = new int[100]; // Assuming a maximum of 100 entries
		int entryCount = readDataFromDatabase(namesArray, scoresArray);
		Random rand = new Random();
		int planetA = 0;
		int planetB = 0;
		int option = 0;

		// Print the names and scores (for demonstration purposes)
		for (int i = 0; i < namesArray.length && namesArray[i] != null; i++) {
			System.out.println("Name: " + namesArray[i] + ", Score: " + scoresArray[i]);
		}

		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-----------------------------------------------------------------------------");

		System.out.println("        _-o#&&*''''?d:>b\\_");
		System.out.println("      _o/\"`''  '',, dMF9MMMMMHo_");
		System.out.println("   .o&#'        `\"MbHMMMMMMMMMMMHo.");
		System.out.println(" .o\"\" '         vodM*$&&HMMMMMMMMMM?.");
		System.out.println(",'              $M&ood,~'`(&##MMMMMMH\\");
		System.out.println("/               ,MMMMMMM#b?#bobMMMMHMMML");
		System.out.println("&              ?MMMMMMMMMMMMMMMMM7MMM$R*Hk");
		System.out.println("?$              :MMMMMMMMMMMMMMMMMMM/HMMM|`*L");
		System.out.println("|               |MMMMMMMMMMMMMMMMMMMMbMH'   T,");
		System.out.println("$H#:            `*MMMMMMMMMMMMMMMMMMMMb#}'  `?");
		System.out.println("]MMH#             \"\"*\"\"\"\"*#MMMMMMMMMMMMM'    -");
		System.out.println("MMMMMb_                   |MMMMMMMMMMMP'     :");
		System.out.println("HMMMMMMMHo                 `MMMMMMMMMT       .");
		System.out.println("?MMMMMMMMP                  9MMMMMMMM}       -");
		System.out.println("-?MMMMMMM                  |MMMMMMMMM?,d-    '");
		System.out.println(" :|MMMMMM-                 `MMMMMMMT .M|.   :");
		System.out.println("  .9MMM[                    &MMMMM*' `'    .");
		System.out.println("   :9MMk                    `MMM#\"        -");
		System.out.println("     &M}                     `          .-");
		System.out.println("      `&.                             .");
		System.out.println("        `~,   .                     ./");
		System.out.println("            . _                  .-");
		System.out.println("              '`--._,dd###pp=\"\"");

		System.out.println("Welcome to the best game to compare plants that you would live on!");
		System.out.println("-----------------------------------------------------------------------------");

		for (int i = 0; i <= entryCount; i++) {
			planetA = rand.nextInt(entryCount);
			planetB = rand.nextInt(entryCount);
			if (planetA == planetB) {
				planetB = rand.nextInt(entryCount);
			}
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("Choose one planet");
			System.out.println("1. " + namesArray[planetA]);
			System.out.println("2. " + namesArray[planetB]);
			option = scan.nextInt();
			if (option == 1) {
				System.out.println("Winner! " + namesArray[planetA]);
				System.out.println("-----------------------------------------------------------------------------");
			} else if (option == 2) {
				System.out.println("Winner! " + namesArray[planetB]);
				System.out.println("-----------------------------------------------------------------------------");
			}
		}

	}
	  
	// Main method to start the program
	public static void main(String[] args) throws IOException {
		menu();

	}

}