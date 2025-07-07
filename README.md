# Stick Hero Game

This is a classic arcade-style game where the player controls a character who must cross a series of pillars by extending a stick. The length of the stick must be precise enough to reach the next pillar without overshooting it. The game features a scoring system, cherry collection, and a revive mechanic.

## Features

*   **Dynamic Pillar Generation:** The game dynamically generates pillars of varying widths and distances, creating a unique and challenging experience with each playthrough.
*   **Stick Growth Mechanic:** The player can control the length of the stick by holding down the mouse button, requiring precise timing and estimation.
*   **Character Animation:** The character is animated to walk across the stick, fall, and flip, providing visual feedback to the player.
*   **Scoring and Cherry Collection:** The game features a scoring system that rewards players for accurate stick placement and a cherry collection system that allows players to revive their character.
*   **Revive Mechanic:** Players can use collected cherries to revive their character after falling, giving them a second chance to continue playing.

## How to Run

1.  Clone the repository to your local machine.
2.  Open the project in your favorite Java IDE.
3.  Build the project using Maven.
4.  Run the `HelloApplication` class to start the game.

## Technologies Used

*   **Programming Language:** Java
*   **Framework:** JavaFX
*   **Build Tool:** Maven

## Design Patterns

*   **Singleton Pattern:** The `GameController` and `CherryClass` are implemented as singletons, ensuring that only one instance of each class is created throughout the application. This is useful for managing global game state and resources.
*   **Factory Pattern:** The `FactoryObject` class is a simple factory that creates and manages game objects, such as pillars. This pattern decouples the object creation logic from the game's main loop, making it easier to add new types of objects in the future.
*   **State Pattern:** The `gameState` variable in the `GameController` can be considered a simple implementation of the state pattern, as it is used to manage the different states of the game (e.g., running, paused, game over).
*   **Multithreading:** The game uses a separate thread to handle the character's movement animation, ensuring that the UI remains responsive while the animation is in progress.