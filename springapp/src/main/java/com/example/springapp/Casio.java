package com.example.springapp;
public class Casio implements Calculator{
   
    int num1,num2;
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public int add() {
        int sum;
       sum=num1+num2;
       //System.out.println(num1+num2);      
        return sum;
        // TODO Auto-generated method stub    
    }
    public int sub() {
        // TODO Auto-gene      
         int diff;
        diff=num2-num1;
        // System.out.println(num2-num1);      
          return diff;
              // Get username from parameters
String username = request.getParameter("username");
// Create a statement from database connection
Statement statement = connection.createStatement();  
// Create unsafe query by concatenating user defined data with query string
String query = "SELECT secret FROM Users WHERE (username = '" + username + "' AND NOT role = 'admin')";
// ... OR ...
// Insecurely format the query string using user defined data 
String query = String.format("SELECT secret FROM Users WHERE (username = '%s' AND NOT role = 'admin')", username);
// Execute query and return the results
ResultSet result = statement.executeQuery(query);
    }

}
