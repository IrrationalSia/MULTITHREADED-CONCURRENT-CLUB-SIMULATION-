Simulation of a Club 

This application generates a club atmosphere complete with dancing dancers and bar patrons. A graphical user interface and Java threads are used to visualize the simulation.

Requirements

A Java IDE or compiler (such as IntelliJ IDEA, Eclipse, or the command line) must be version 8 or newer of the Java Development Kit (JDK) carrying out the program.

1. Compile: Open a terminal or command window and navigate to the directory containing the source code files.

2. Compile the source code for Java: Use the command line to compile each Java file:
                             javac -d . *.java

3. conclude the game. Run "ClubSimulation" using the given input parameters as the main class. The input parameters are as follows: 
  - The number of club patrons 
  - The quantity of grid cells pointing in the X direction
  - The proportion of grid cells oriented toward the Y axis
  - The maximum number of people who can enter the club at once

Using instruction:

   "java clubSimulation 20 10 10 5"

With this command, a 10x10 grid, a maximum of 5 players inside the club at once, and 20 clubgoers will all be present in the game.

4. Manage the simulation
   - Click "Start" to launch the experiment.
   - Click the "Pause" button to stop/start the simulation.
   - Click the "Quit" button to put an end to the simulation.

5. Check out the game: In the graphical user interface, colored ovals that symbolize clubgoers depict the club's mood.
   - The entrance and exit are recorded, and the bar area is highlighted.
   - At the bottom, you'll see the counters for insiders, waiters, and departing visitors.

Attendees will move around the club, dance, stop by the bar, and eventually leave while you watch the simulation. You may watch their movements and interactions as the simulation progresses.

7. You can end the simulation by closing the simulation window, typing Ctrl+C in the terminal, or simply pressing the 'quit' button.

Notes 
  - The application uses Java threads to simulate clubgoer behavior, and a graphical user interface to display the simulation.
  - The input parameters (club attendance, grid size, and maximum club capacity) are provided when the software is launched.
  - The simulation can be started, paused, and ended by using the buttons on the GUI.

