Student Subscription & Payment Management System

This Java application provides a simple system to manage student subscription types and payment records. It demonstrates the use of object-oriented programming principles such as encapsulation, class relationships, and file operations in Java.

Features
	•	Manage student data including name, university ID, and program.
	•	Track subscription details with start and end dates.
	•	Record and maintain multiple payment transactions.
	•	Backup and save all student details into a text file (student_details.txt).
	•	Utility class for date parsing.

Technologies Used
	•	Java (JDK 8 or higher)
	•	File I/O (FileWriter, PrintWriter)
	•	Date and time management (java.util.Date, Calendar)
	•	Object-Oriented Programming

Project Structure
	•	Student: Holds the basic information and subscription/payment data.
	•	SubscriptionType: Describes the subscription plan and its duration.
	•	PaymentRecord: Represents individual payment transactions.
	•	Main: Contains the main method, sample data creation, and file backup functionality.
	•	DateUtils: A utility class for parsing date strings in yyyy-MM-dd format.

How to Run
	1.	Clone the repository or download the project files.
	2.	Open the project in your favorite Java IDE.
	3.	Run the Main class.
	4.	The program will create a sample student, assign a subscription, add payment records, and save the data to student_details.txt in the project directory.

Output Example

The generated student_details.txt file will contain:

Name: John Doe
University ID: 123456
Program: Computer Science
Subscription Type: Monthly
Payment Records:
  Payment Date: Mon May 27 15:45:32 UTC 2025, Amount: 10.0
  Payment Date: Mon May 27 15:45:32 UTC 2025, Amount: 20.0

Future Improvements
	•	Add a user interface (CLI or GUI).
	•	Allow dynamic input from users instead of hardcoded data.
	•	Store and read data using serialization or databases.
	•	Add search, update, and delete functionalities.

License

This project is open source and available under the MIT License.