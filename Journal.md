# Journal
Phase 0 - Blueprint 
My plan is to create a coffee pot simulation that keeps track of how much coffee is currently in the pot and its maximum capacity. The user will be able to brew coffee, pour coffee, check the pot's status, and exit the program.
The Model will keep track of the coffee amount, the View will handle displaying the menu and receiving user input, and the Controller will process commands and make sure the user cannot pour more coffee than the pot contains or exceed the pot's capacity.
I don't have any major confusion about the challenge right now. I believe I have a decent understanding of the MVC pattern and how its three parts work together.

Phase 1- The Pot - The Model
I built a CoffeePotModel for my coffee pot simulator. I created private fields to track the current volume and maximum capacity of the pot. I added a constructor to create the pot and a getter to retrieve the current amount of coffee. I also created methods to brew and pour coffee and added exception handling to prevent invalid amounts and exceeding the pot's capacity.
The Model is responsible for managing and validating its own state. It is important for the Model to validate its own data instead of relying on other classes because the Model controls its own data.