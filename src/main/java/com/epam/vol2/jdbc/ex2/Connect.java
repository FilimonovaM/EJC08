package com.epam.vol2.jdbc.ex2;

public class Connect {
       public void startConnection(){

           try {
               Class.forName("org.h2.Driver");



           } catch (ClassNotFoundException e) {
               e.printStackTrace();
           }

       }

}
