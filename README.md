# JavaFinalProject_Talingting_Kenneth_LanceGWAPO


**Project Title**
ConverterBUDDYniKENNETH: Personal Universal Converter

**Problem Statement**
Converting everyday measurements manually (like Celsius to Fahrenheit or Minutes to Days) is tedious, prone to mathematical errors, and requires memorizing specific formulas. Furthermore, most standard calculators only convert one unit at a time, but users often need to see how a single value translates into multiple different units simultaneously.

* **The Problem Solved:** This application automates the mathematical computation of four major measurement categories. It takes a single user input and instantly calculates equivalent values in multiple units (e.g., converting Minutes into Seconds, Hours, and Days all at once), saving time and ensuring accuracy.

**Program Features**
This application includes the following features implemented using Java:

* **Automated Calculation:** Instantly computes conversions using precise mathematical formulas (e.g., ).
* **Multi-Unit Output:** Displays one input value in 3-4 different unit formats simultaneously (e.g., Mass shows lbs, oz, and grams).
* **Smart Logic (Temperature):** Uses logical checks to alert the user if a temperature reaches the freezing or boiling point of water.
* **Time Conversion Module:** A unique feature that converts Minutes into Seconds, Hours, and Days.
* **Object-Oriented Design:** Utilizes a custom `CalcEngine` class to handle all mathematical logic separately from the main menu.
* **Robust Error Handling:** Uses `hasNextDouble()` checks to prevent the program from crashing if a user enters letters instead of numbers.
* **Interactive Interface:** Uses a `while` loop menu system that allows continuous usage without restarting the program.

**How to Run the Program**

* **Accepting User Inputs:** The program uses the `Scanner` class to pause the console and wait for you to select a category from the menu and type your value (e.g., 1500 minutes).
* **Object-Oriented Processing:** Once you enter the data, the program calls a specific method within the `CalcEngine` object (like `computeTime`), which automatically runs the specific formulas for that category.
* **Logical Evaluation:** The application uses a `switch` statement to route your menu choice and `if-else` structures inside the Temperature tool to check if the value is  (Freezing) or  (Boiling).
* **Data Presentation:** Your results are formatted using `printf` and `println` to ensure decimal points are clean and readable.
* **The "Continuous" Loop:** The entire menu is wrapped in a `while` loop. After displaying your results, the program automatically loops back to the main menu, allowing you to perform another conversion immediately.
* **Handling User Choice:** If you type a number `1-4`, the specific tool runs. If you type `5` (Quit), the loop breaks, and the program displays a goodbye message before terminating execution.
