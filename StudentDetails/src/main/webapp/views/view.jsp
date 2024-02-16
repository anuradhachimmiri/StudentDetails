<%@ page contentType="text/html;charset=UTF-8" language="java" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<center>
<h1>View All Students Details</h1>
<table border="1">
    <tr>
        <th>Student Roll Numbers</th>
        <th>Student Name</th>
        <th>Course</th>
        <th>Hibernate</th>
        <th>Spring</th>
        <th>Spring Boot</th>
        <th>Total Marks</th>
        <th>Percentage</th>
        <th>Grade</th>
        <th>Result</th>
        <th>DELETE</th>
        <th>EDIT</th>
    </tr>
    <c:forEach var="student" items="${students}">
        <tr>
        <td>${student.studentRollNumber}</td>
        <td>${student.studentName}</td>
        <td>${student.course}</td>
        <td>${student.hibernateMarks}</td>
        <td>${student.springMarks}</td>
        <td>${student.springBootMarks}</td>
        <td>${student.totalMarks}</td>
        <td>${student.percentage}</td>
        <td>${student.grade}</td>
        <td>${student.result}</td>
        <td>
            <a href="/delete/${student.studentRollNumber}">Delete</a>
        </td>
        <td>
            <a href="/edit/${student.studentRollNumber}">edit</a>
        </td>
    </tr>
    </c:forEach>
</table>
</center>