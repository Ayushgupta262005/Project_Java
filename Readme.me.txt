Expense Tracking System
Team member name:
Ayush Gupta [PCE23CR014]  Github link
Mohit Raj [PCE23CR035] Github link
Project Description
The Expense Tracking System is a Java application designed to assist users in managing their personal finances by tracking and recording their expenses. This project allows users to add, view, update, and delete expense entries, promoting better financial awareness and helping users make informed budgeting decisions. The application is console-based, providing a straightforward interface for users to interact with their expense data.
Features
1.	Expense Addition:
o	Users can add new expenses by providing a name, amount, and date.
2.	Expense Viewing:
o	Users can view a list of all recorded expenses, making it easy to track spending.
3.	Expense Deletion:
o	Users can delete specific expense entries by specifying their index in the list.
4.	Expense Update:
o	Users can update existing expenses by modifying their name and amount.
5.	User Command Interface:
o	A command-line interface allows users to interact with the application through simple commands.
6.	Data Management (Future Enhancement):
o	Potential to implement data persistence (e.g., saving expenses to a file or database).
Class Documentation
1. Expense Class
The Expense class represents a single expense entry in the system.
Fields
•	String name: The name or description of the expense (e.g., "Groceries").
•	double amount: The monetary value of the expense.
•	Date date: The date when the expense was incurred.
Constructor
•	public Expense(String name, double amount, Date date): Initializes a new instance of the Expense class with the provided name, amount, and date.
Methods
•	public String getName(): Returns the name of the expense.
•	public double getAmount(): Returns the amount of the expense.
•	public Date getDate(): Returns the date of the expense.
•	@Override public String toString(): Returns a string representation of the expense object, detailing its name, amount, and date.
2. Main Class
The Main class serves as the entry point of the application, providing the command-line interface for user interaction.
Main Method
•	public static void main(String[] args):
o	Initializes an ExpenseManager instance.
o	Prompts the user for commands to manage expenses, including adding, viewing, deleting, and updating expenses.
Command Handling
•	add: Prompts the user to enter expense details and adds a new expense.
•	view: Displays all recorded expenses.
•	delete: Allows the user to delete an expense by index.
•	update: Prompts the user to enter new details to update an existing expense.
•	exit: Exits the application.
Note on Future Enhancements
•	Implementing data persistence would allow expenses to be stored and retrieved even after the application is closed.
•	A graphical user interface (GUI) could enhance user experience and accessibility.

