/*The command line argument is the argument passed to a program at the time when you run it. 
 *  it provides a convenient way to check the behavior of the program for the different values
 */
package assignment8; //here we have created package as assignment8

public class CommandLineArguments { //created the main class 

	public static void main(String[] args) {  //here i have created  the main method 
	
	
			// to give command line arguments in Eclipse right click on the blank space->go to run as ->run configuration->
		//then in the program arguments section provide arguments separated by space.
				

					Integer firstNumber=new Integer(args[0]);//here it takes the value which we passed in the index arguments 
					
					Integer secondNumber=Integer.parseInt(args[3]);  //here in two ways we can  read integer value
					
					System.out.println("given arguments are :12 34 26 30 ");
					System.out.println("the output is :");
					System.out.println(firstNumber+" "+secondNumber);// here  it prints the values of index of size zero and of index size three
					System.out.println( firstNumber + secondNumber );// here it adds the two values of the given arguments
			   	    
			   		   // Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber)
			   		   // = Integer.parseInt("12") + Integer.parseInt("30")
			   		   // = 12 + 30 = 42
			   		   // Because + = ADD when used on integers
				} // otherwise  a  "12" + "30" = "1230" 
	   // Because + = concatenate when used on strings


			}


	


