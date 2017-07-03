/////////////////////////////////////////////////////////////////////////////// 
// Title:            Project 1 												 //
// Files:            - 														 //
// Semester:         Spring 2017 											 //
// 																			 //
// Author:           Nitin Gangasagar 										 //
// Email:            nsg150230@utdallas.edu 								 //
// CS Login:         - 														 //
// Lecturer's Name:  Nassim Sohaee											 //
// Course Section:   6323.501 												 //
//  																		 //
///////////////////////////////////////////////////////////////////////////////

package project1;
//Importing Scanner package for Inputs from user
import java.util.Scanner;
//Initializing Parent Class

/**
 * This class takes required values from user.
 * and displays the output.
 * @author Nitin Gangasagar
 */

public class TestState {
 //Main Class Call
public static void main(String[] args)
 {
//Taking Values One by One from user
	
  Scanner input = new Scanner(System.in);
  
  //State Name
  System.out.println("Enter The State Name: ");
  	String stateName = input.nextLine();
  	
  //State Population
  	System.out.println("Enter The State Population: ");
  	int statePopulation = input.nextInt();
  	input.nextLine();
  	
  //Capital City
  System.out.println("Enter The Cpital City: ");
  	String capitalCity = input.nextLine();
  	
  //Capital City Population
  	System.out.println("Enter The Capital City Population: ");
  int capitalPopulation = input.nextInt();
  input.nextLine();
  
  //Most Populous City
  System.out.println("Enter the Most populous City Name: ");
  String cityName = input.nextLine();
  
  //Populous City Population
  System.out.println("Enter Populous City Population: ");
  int cityPopulation = input.nextInt();
  input.nextLine();
  input.close();
  //Displaying Values
  State state1 = new State(stateName, statePopulation, cityName, cityPopulation, capitalCity,capitalPopulation );
  state1.display();
  
 }
}