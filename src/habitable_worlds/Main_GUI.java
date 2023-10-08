package habitable_worlds;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class Main_GUI {

    // Method to get the name of the exoplanet and store it in a file
    public static String getName() throws IOException {
        String name = JOptionPane.showInputDialog(null, "Enter your exoplanet's name:");
        try (PrintWriter pw = new PrintWriter(new FileWriter("DATABASE.txt", true))) {
            pw.println("Name: " + name);
        }
        return name;
    }

    // Method to read data from the database file
    public static int readDataFromDatabase(String[] names, int[] scores) throws FileNotFoundException {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("DATABASE.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("DATABASE.txt not found.");
            throw e;
        }

        int index = 0;
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Name: ")) {
                    // Extract the name and store it in the names array
                    names[index] = line.substring(6); // Removes "Name: " from the line
                } else if (line.startsWith("Score: ")) {
                    // Extract the score and store it in the scores array
                    scores[index] = Integer.parseInt(line.substring(7)); // Removes "Score: " from the line
                    index++;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from DATABASE.txt");
        }

        try {
            reader.close();
        } catch (IOException e) {
            System.err.println("Error closing the reader.");
        }

        return index; // Return the count of valid entries
    }

    // Method to ask a series of questions and evaluate the exoplanet
    public static int choiceWithGUI() {
        int timeschosen = 0;
        int choice;

        choice = JOptionPane.showOptionDialog(null, "Does the exoplanet fall within the habitable zone of its host star?",
                "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            timeschosen += 2;
        }
      choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a stable and moderate surface temperature?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a suitable atmosphere for supporting life?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's atmosphere primarily composed of gases conducive to life (e.g., oxygen, nitrogen)?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a stable and consistent source of liquid water on its surface?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's surface free from extreme environmental hazards (e.g., high radiation, frequent extreme weather)?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's geology stable and suitable for supporting life?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a magnetic field to protect against harmful solar radiation?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's orbit relatively circular and stable?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet located within a system with other celestial bodies that could provide beneficial interactions for potential life (e.g., moon for tidal stability)?",
        "Habitable Zone", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}
      // Resources (continued - 10 questions)

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have abundant natural resources such as minerals, metals, and elements essential for sustaining life and technological development?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a diverse range of ecosystems and biodiversity, indicating potential availability of biological resources for sustenance?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet rich in organic materials or compounds that could support the development of complex life forms?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have an ecosystem that is conducive to agriculture or farming for sustaining a population?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have renewable energy sources, such as sunlight or geothermal energy, available in sufficient quantities for sustainable energy production?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet located in proximity to asteroid belts or other celestial bodies that could provide additional resources through mining or utilization?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have stable tectonic activity that may create geological features useful for resource extraction or energy generation?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have adequate freshwater or accessible water sources for consumption, agriculture, and other essential needs?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Are there signs of geological formations, such as caves or underground reservoirs, that could potentially contain valuable resources or provide shelter for life?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet show evidence of a climate or environmental conditions conducive to resource extraction and utilization, like moderate temperatures and manageable weather patterns?",
        "Resources", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}
// Gravity (continued - 10 questions)

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's surface gravity within a range suitable for Earth-like life (approximately 0.8 to 1.2 times Earth's gravity)?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's gravity strong enough to retain a stable and breathable atmosphere for potential life forms?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a gravity level that allows for the formation and maintenance of liquid bodies like oceans and lakes without excessive evaporation or escape?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's gravity conducive to the development of plant life, allowing for a functional ecosystem and potential food sources?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet's gravity permit the existence of structures and organisms capable of withstanding its effects and living comfortably?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's gravity sufficiently strong to enable natural geological processes, such as plate tectonics, which may be important for habitability and resource availability?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet's gravity allow for the retention of a protective magnetosphere, shielding the surface from harmful solar and cosmic radiation?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's gravity consistent across its surface, minimizing extreme variations that could affect stability and habitability?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Does the exoplanet have a gravitational pull that enables the retention of a stable, moderate-density atmosphere over long periods of time?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's gravity influenced by neighboring celestial bodies in a manner that stabilizes its orbit and enhances the potential for habitability?",
        "Gravity", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}
// Distance from Earth, Planet Age, and Technological Feasibility (continued - 10 questions)

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet located within a distance from Earth that is feasible for human exploration and potential colonization with current technology?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's distance from Earth within the range of our current deep-space exploration capabilities?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's distance from Earth less than 50 light-years, making it reachable with foreseeable advancements in space travel technology?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet relatively young in age, indicating potential for geological and environmental dynamics suitable for habitability?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's age within a range that suggests its habitability has been maintained for a substantial portion of its existence?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's age within a range that aligns with the emergence and evolution of complex life forms, based on Earth's evolutionary timeline?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's age consistent with the potential for the development of technological civilizations, similar to or beyond Earth's current level of advancement?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet located within a star system that could be feasibly reached using current propulsion technologies within a human lifetime?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet located within our Milky Way galaxy, making it reachable with our current understanding of interstellar travel?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}

choice = JOptionPane.showOptionDialog(null,
        "Is the exoplanet's distance and age combination conducive to planning and executing an unmanned mission for further study and observation using existing spacecraft technology?",
        "Distance and Age", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,
        new Object[]{"Yes", "No"}, JOptionPane.YES_OPTION);
if (choice == JOptionPane.YES_OPTION) {
    timeschosen += 2;
}


        return timeschosen;
    }

    // Method to calculate gravity based on mass and radius
    public static int calculateGravityWithGUI() {
        final double gravConstant = 6.6743 * Math.pow(10, -11);

        String massInput = JOptionPane.showInputDialog(null, "What is the mass of the exoplanet (in kg)?");
        double mass = Double.parseDouble(massInput);

        String radiusInput = JOptionPane.showInputDialog(null, "What is the radius of the planet (in m)?");
        double radius = Double.parseDouble(radiusInput);

        double gravity = (gravConstant * mass) / Math.pow(radius, 2);

        if (gravity < 0.981)
            return -1;
        else if (gravity > 19.62)
            return -2;
        else
            return 2;
    }

    // Method to display the main menu and allow the user to add an exoplanet or play the game
    public static void menuWithGUI() {
        JFrame frame = new JFrame("Habitable Worlds");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JButton addPlanetButton = new JButton("Add exoplanet to the database");
        addPlanetButton.setBounds(20, 30, 250, 30);
        panel.add(addPlanetButton);

        JButton playGameButton = new JButton("Play the comparison game");
        playGameButton.setBounds(20, 70, 250, 30);
        panel.add(playGameButton);

        addPlanetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    addExoplanetToDatabaseWithGUI();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        playGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    gameWithGUI();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Method to play the comparison game
    public static void gameWithGUI() throws IOException {
        String[] namesArray = new String[100]; // Assuming a maximum of 100 entries
        int[] scoresArray = new int[100]; // Assuming a maximum of 100 entries
        int entryCount = readDataFromDatabase(namesArray, scoresArray);

        String[] options = {"1. " + namesArray[0], "2. " + namesArray[1]};
        int planetA, planetB;
        int option;

        while (entryCount > 0) {
            planetA = JOptionPane.showOptionDialog(null, "Choose one planet", "Planet Comparison",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            if (planetA == -1) {
                break;
            }

            planetB = JOptionPane.showOptionDialog(null, "Choose one planet", "Planet Comparison",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
            if (planetB == -1) {
                break;
            }

            option = JOptionPane.showOptionDialog(null, "Winner!", "Winner",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null,
                    new Object[]{options[planetA], options[planetB]}, options[planetA]);
            if (option == -1) {
                break;
            }

            entryCount--;
        }
    }

    // Method to add an exoplanet to the database with GUI
    private static void addExoplanetToDatabaseWithGUI() throws IOException {
        String name = JOptionPane.showInputDialog(null, "Enter your exoplanet's name:");

        int totalScore = choiceWithGUI();

        totalScore += calculateGravityWithGUI();

        try (PrintWriter pw = new PrintWriter(new FileWriter("DATABASE.txt", true))) {
            pw.println("Name: " + name);
            pw.println("Score: " + totalScore);
        }
    }

    // Main method to start the program
    public static void main(String[] args) {
        menuWithGUI();
    }
}
