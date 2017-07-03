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

/**
 * This is outer class contains state values
 * containing inner private city class.
 * @author Nitin Gangasagar
 */

public class State
{
	
//Initializing variables
 
	private String stateName = "Texas";
 private int statePopulation = 7000000;
 private City city_capital;
 private City populatedcity;
 
 //Declaring Constructor
 
 public State(String stateName, int statepopulation, String capitalname, int capnamepop, String city, int cityp)
  {
   this.stateName = stateName;
   this.statePopulation = statepopulation;
   city_capital = new City(city, cityp);
   populatedcity = new City(capitalname, capnamepop);
  }
 // Getting Values for Private variables
 
 /**
  * Method to get value for private StateName variable. 
  *
  * @return StateName value retured
  */
 
 public String getStateName()
  {
   return stateName;
  }
 
 /**
  * Method to get value for private statePopulation variable.
  *  
  * @return statePopulation value returned.
  */
 public int getstatePopulation()
  {
   return statePopulation;
  }
 
 //Defining Private Non-Static Inner City Class 
 /**
  * This is private inner city class inside state class providing better grouping.
  * 
  * @author Nitin Gangasagar
  */
 
 private class City
  {
   private String cityName;
   private int cityPopulation;
   public City(String city, int cityp)
    {
     cityName = city;
     cityPopulation = cityp;
    }
   
 //Getting values for private variables
  /**
   * Method to get value for private cityName variable.
   *  
   * @return cityName value returned.
   */
   public String getCityName() {
    return cityName;
   }
   /**
    * Method to get value for private cityPopulation variable.
    *  
    * @return cityPopulation value returned.
    */
   public int getcityPopulation() {
    return cityPopulation;
   }
   
  //Defining display method for city objects  
   /**
    * Method to display city and city population 
    *  
    * @return No return type.
    */
   public void displayCity()
    {
     System.out.println("City Name: " + cityName);
     System.out.println("City Population: " + cityPopulation);
    }
  }

 //Calling State and Capital Objects 
 /**
  * Method to display state name, state population, city name and city population 
  *  
  * @return No return type.
  */
 public void display()
 {
  System.out.println("State Name: "+stateName);
  System.out.println("State Population: "+statePopulation);
  city_capital.displayCity();
  populatedcity.displayCity();
 }
}