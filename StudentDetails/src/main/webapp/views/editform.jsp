<center>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>     
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    <h1 style="color: indigo;">Edit Form</h1>   
      <body bgcolor="pink"> 
            <h1>Edit Student Details Here</h1>   
           <form:form method="GET" action="/editandsave">     
            <table >     
            <tr>   
            <td></td>     
             <td><form:hidden path="studentRollNumber" /></td>   
             </tr>   
             <tr>     
                <td>Name :</td>     
                <td><form:input path="studentName" /></td>   
               </tr>   
             <tr>     
              <td>Course: </td>    
              <td><form:input path="course"  /></td>   
             </tr>   
             <tr>     
              <td>Hibernate Marks:</td>     
              <td><form:input path="hibernateMarks" /></td>   
             </tr>  
             <tr>     
                <td>Spring Marks :</td>     
                <td><form:input path="springMarks" /></td>   
               </tr>   
               <tr>     
                <td>SpringBoot Marks :</td>     
                <td><form:input path="springBootMarks" /></td>   
               </tr>    
             <tr>     
              <td> </td>     
              <td><input type="submit" value="EditSave" /></td>     
             </tr>     
            </table>     
           </form:form>   
           
           </body>
    </center>