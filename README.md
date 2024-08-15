# SGPA Calculator

This Java project is a simple SGPA (Semester Grade Point Average) calculator. It allows users to input details about subjects, including internal and external marks, credit hours, and the total marks for each subject. Based on this input, the program calculates the SGPA for the student.

## Features

- **Subject Details Input**: Input the subject name, internal marks, external marks, credit hours, and total marks.
- **SGPA Calculation**: Automatically calculates the SGPA based on the input marks and credit hours.
- **Flexible Number of Subjects**: Supports input for any number of subjects.

## Classes

### 1. `Subject`
This class holds information about a subject, including:
- `name`: Name of the subject.
- `internalMarks`: Marks obtained internally.
- `externalMarks`: Marks obtained externally.
- `credits`: Credit hours assigned to the subject.
- `maxMarks`: Maximum possible marks for the subject.

**Methods**:
- `setName(String name)`: Sets the subject name.
- `setInternalMarks(int internalMarks)`: Sets the internal marks.
- `setExternalMarks(int externalMarks)`: Sets the external marks.
- `setCredits(double credits)`: Sets the credit hours.
- `setMaxMarks(int maxMarks)`: Sets the maximum marks.
- `getTotalMarksObtained()`: Returns the total marks obtained (internal + external).
- `calculateGradePoints(int totalMarks, double credits, int marksObtained)`: Calculates and returns the grade points based on the marks obtained and credit hours.

### 2. `Student`
This class manages the subjects and calculates the SGPA.
- `numberOfSubjects`: The number of subjects the student is enrolled in.

**Methods**:
- `setNumberOfSubjects(int numberOfSubjects)`: Sets the number of subjects.
- `calculateSGPA()`: Calculates and returns the SGPA based on the subjects' data.

### 3. `Main`
The `StudentGradingSystem` class contains the `main` method and serves as the entry point of the program. It handles user interaction and drives the overall process.

## How to Run

1. **Compile the Java Files**: 
   ```bash
   javac StudentGradingSystem.java

2. Run the code
   java StudentGradingSystem

   
## EXAMPLE
Enter the Number of Subjects:
3
Enter the Subject Name:
Mathematics
Enter the Credits of the Subject:
4
Enter Internal Marks for the Subject:
30
Enter External Marks for the Subject:
70
Enter the Total Marks for the Subject:
100

...

The SGPA is: 8.67



