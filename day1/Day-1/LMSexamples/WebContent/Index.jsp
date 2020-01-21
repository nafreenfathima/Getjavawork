<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE >
<html>
<head>
<meta http-equal="Content-type" content="text/html;charset="ISO-8859-1">
<title>Insert title here</title>
<html>
    <head>
        <h1> Oracle _ Java Test Application</h1>
     
       <script type="text/javascript">
       xmlHttp=null;
       try
       {
    	   xmlHttp=new XMLHttpRequest();
       }catch(e)
       {
    	   try
    	   {
    		   xmlHttp=new ActiveXobject("Microsoft.XMLHTTP");
    	   }catch(e)
    	   {
    		   alert("your browserdoes not support XMLHTTP");
    		   
    	   }
    	   
    	   }
      function getEMPDetails()
      {
    	  
     alert("Trying to retrive Values....");
     url"http://localhost:8088/oracletest/GetEmpInfo";
     xmlHttp.open("GET"url,false);
     xmlHttp.send(null);
     document.getElementById("result").innerHTML=xmlHttp.responseText;
      
      }
   
   </script>
       </head>
    <body>
        <from action="getemp.html" method="post"></from>
        First Name:<input type="text" name="fname"><br>
        Last Name:<input type="text" name="lname"><br>
        <input type="button" value="Insert Into Database">
        <hr>
        <input type="button" value="Get Emp Values">
        </from>
        </body>
</html>