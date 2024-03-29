
**END_POINT**
POST /exams/{examId} - Registers a student for the specific exam

**Postman Collection** 
[LearningNavigator.postman_collection.json](https://github.com/mrstrange47/Krayush25_LearningNavigator/files/14807548/LearningNavigator.postman_collection.json)

**Problem Description**
The exam registration service is a critical component of a Learning Management System. Generally, exam registration requires thorough Authentication and Authorization. For this assessment, your task is to develop a simplified version of the exam registration service that meets the specified requirements below.

**Requirements**
The API must handle CRUD operations for Students, Subjects, and Exams


**Each Student has the following fields:**

Student Registration ID (Unique Identifier)
Student Name
List of enrolled Subjects
List of registered Exams

**Each Subject has the following fields:**

Subject ID (Unique Identifier)
Subject Name
List of registered Students

**Each Exam has the following fields:**

Exam ID (Unique Identifier)
Subject
List of enrolled Students

**----------------------------------------------------------------------**
The entities must use Foreign Key relationships wherever necessary.
Students can register for the exam only after enrolling in the corresponding subject.
Handle common errors gracefully and return appropriate HTTP codes (Ex. 404, User not found).
Use GlobalExceptionHandler and @ControllerAdvice to organize and streamline Exception Handling.
