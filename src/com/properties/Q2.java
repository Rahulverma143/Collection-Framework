package com.properties;
import java.util.*;
import java.io.*;
public class Q2 {

	    public static void main(String[] args) throws Exception {
	        // Create Properties object
	        Properties props = new Properties();

	        // Add properties
	        props.setProperty("username", "admin");
	        props.setProperty("password", "12345");
	        props.setProperty("url", "jdbc:mysql://localhost:3306/test");

	        // Display properties
	        System.out.println("Username: " + props.getProperty("username"));
	        System.out.println("Password: " + props.getProperty("password"));

	        // Save properties to a file
	        FileOutputStream fos = new FileOutputStream("config.properties");
	        props.store(fos, "Database Configuration");
	        fos.close();

	        // Load properties from the file
	        FileInputStream fis = new FileInputStream("config.properties");
	        Properties newProps = new Properties();
	        newProps.load(fis);
	        System.out.println("\nLoaded from file:");
	        System.out.println("Username: " + newProps.getProperty("username"));
	        System.out.println("URL: " + newProps.getProperty("url"));
	        fis.close();
	    }
	}
