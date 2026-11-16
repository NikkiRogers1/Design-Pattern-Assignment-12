# Journal
Phase 0 - Blueprint 
My plan is to create a coffee pot simulation that keeps track of how much coffee is currently in the pot and its maximum capacity. The user will be able to brew coffee, pour coffee, check the pot's status, and exit the program.
The Model will keep track of the coffee amount, the View will handle displaying the menu and receiving user input, and the Controller will process commands and make sure the user cannot pour more coffee than the pot contains or exceed the pot's capacity.
I don't have any major confusion about the challenge right now. I believe I have a decent understanding of the MVC pattern and how its three parts work together.

Phase 1- The Pot - The Model
I built a CoffeePotModel for my coffee pot simulator. I created private fields to track the current volume and maximum capacity of the pot. I added a constructor to create the pot and a getter to retrieve the current amount of coffee. I also created methods to brew and pour coffee and added exception handling to prevent invalid amounts and exceeding the pot's capacity.
The Model is responsible for managing and validating its own state. It is important for the Model to validate its own data instead of relying on other classes because the Model controls its own data.

Phase 2 - The Terminal Interface - The View

I created a CoffeePotView class with three methods: showMenu(), getUserInput(), and displayMessage(). In Main, I added the menu so the program displays the available commands and accepts input from the user. I also added a while loop with an if statement that allows the program to exit when the user types "exit".
When I tested the program, I entered "status" and verified that it printed the input and continued running. When I entered "exit", the program ended the loop and stopped running.
The View is responsible for the menu and what the user interacts with, while the Model is responsible for how the coffee pot works. It is better for each class to have its own responsibilities instead of putting everything into one class because it keeps all the working parts organized. The Model handles the coffee pot's data and behavior, while the View handles what the user interacts with.

Phase 3 - THe Command Center - The Controller
When the user types a command like brew 10 and presses Enter, the View receives the input using getUserInput(). The Controller then receives that input and separates the command from the amount. It determines which action needs to happen and calls the correct method in the Model.
The Model is responsible for changing the coffee pot's volume. For example, when the Controller calls brew(10), the Model increases the current volume by 10 ounces. The Model also checks that the amount is allowed.
After the Model updates the volume, the Controller can request the current volume using getCurrentVolume(). The View then displays the information to the user using displayMessage().
Each class has its own responsibility. The View handles user interaction, the Controller processes commands, and the Model manages the coffee pot's data and behavior.