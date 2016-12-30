package srboost.costCalculator;

import java.text.NumberFormat;
import java.util.Scanner;

import javax.swing.text.NumberFormatter;

/**
 * This class calculates the amount of money needed to boost a player to their
 * desired rank. Calculations are based on $$ per 100 SR (Dependent on rank)
 * 
 * @author Kevin
 *
 */
public class TestCalculation {

	/** Scanner for input (Java-Only) */
	public static Scanner in = new Scanner(System.in);

	/** The customer's current SR at time of purchase */
	private static int startingSR;

	/** The SR which the customer wishes for */
	private static int desiredSR;


	//This is the cost in $$ per 100 sr within each rank. (ie. if amtBronze was
	//$1, it would take $2 to go from 100 --> 300)
	private static double amtBronze = .50;
	private static double amtSilver = .75;
	private static double amtGold = 1.0;
	private static double amtPlatinum = 1.5;
	private static double amtDiamond = 2;
	private static double amtMaster = 7.5;
	private static double amtGrandmaster = 75;

	/**Formatter for instantly converting doubles into currency values*/
	private static NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	public static void main(String[] args) 
	{
		/**
		 * Boolean to control the flow of the program; if false, program stops
		 */
		boolean continueSearching = true;
		while (continueSearching) 
		{
			getRanks();
			printSeparator();
			calculateCost();
		}

	}



	/**
	 * Private helper method that obtains the rank information about the client.
	 * Contains own check to see if any values are incorrect
	 */
	private static void getRanks() 
	{
		System.out.print("Enter your current Skill Rating: ");
		startingSR = in.nextInt();

		System.out.print("\nEnter your desired Skill Rating: ");
		desiredSR = in.nextInt();

		//Test to see if any values are incorrect
		if (startingSR >= 5000 || startingSR < 1 || desiredSR > 5000 || desiredSR <= 1 || (startingSR >= desiredSR)) 
		{
			System.out.println("A value was incorrect! Please try again... \n");
			getRanks();
		}
	}

	/**Private helper method that calculates the total cost of the boost, while also printing out some key details
	 * 
	 */
	private static void calculateCost()
	{
		//The SR variable used to calculate the SR gains in each tier
		int SR = startingSR;

		//Variables to keep track of how much SR is needed to be gained through each tier
		int SRGainBronze = 0;
		int SRGainSilver = 0;
		int SRGainGold = 0;
		int SRGainPlatinum = 0;
		int SRGainDiamond = 0;
		int SRGainMaster = 0;
		int SRGainGrandmaster = 0;

		//Total SR needed to go from starting to desired
		int totalSRGain = desiredSR - startingSR;

		//The total cost
		double cost = 0;





		/**THE FOLLOWING IF STATEMENTS FOLLOW THE SAME LOGIC:
		 * 1. Scan tiers bronze through grandmaster
		 * 2. If desired rank is above current tier that is being scanned, add appropriate ammount to SRGain variable
		 * 3. Otherwise, calculate remaining rank needed
		 */

//BRONZE-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above bronze
		if(desiredSR > 1500)
		{
			//Check that the starting SR isn't already above bronze
			if (SR < 1500)
			{
				//Add appropriate amount to SRGainBronze
				SRGainBronze = 1500 - SR;

				//Update SR variable, for we have accounted for the bronze tier
				SR = 1500;
			}
		}

		//Runs if desiredSR is within bronze tier
		else
		{
			//Add appropriate amount to SRGainBronze
			SRGainBronze = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}

//SILVER-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above silver
		if(desiredSR > 2000)
		{
			//Check that the starting SR isn't already above silver
			if (SR < 2000)
			{
				//Add appropriate amount to SRGainSilver
				SRGainSilver = 2000 - SR;

				//Update SR variable, for we have accounted for the silver tier
				SR = 2000;
			}
		}

		//Runs if desiredSR is within silver tier
		else
		{
			//Add appropriate amount to SRGainSilver
			SRGainSilver = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}

//GOLD-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above gold
		if(desiredSR > 2500)
		{
			//Check that the starting SR isn't already above gold
			if (SR < 2500)
			{
				//Add appropriate amount to SRGainGold
				SRGainGold = 2500 - SR;

				//Update SR variable, for we have accounted for the gold tier
				SR = 2500;
			}
		}

		//Runs if desiredSR is within gold tier
		else
		{
			//Add appropriate amount to SRGainGold
			SRGainGold = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}

//Platinum-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above platinum
		if(desiredSR > 3000)
		{
			//Check that the starting SR isn't already above platinum
			if (SR < 3000)
			{
				//Add appropriate amount to SRGainPlatinum
				SRGainPlatinum = 3000 - SR;

				//Update SR variable, for we have accounted for the platinum tier
				SR = 3000;
			}
		}

		//Runs if desiredSR is within platinum tier
		else
		{
			//Add appropriate amount to SRGainPlatinum
			SRGainPlatinum = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}


//DIAMOND-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above diamond
		if(desiredSR > 3500)
		{
			//Check that the starting SR isn't already above diamond
			if (SR < 3500)
			{
				//Add appropriate amount to SRGainDiamond
				SRGainDiamond = 3500 - SR;

				//Update SR variable, for we have accounted for the diamond tier
				SR = 3500;
			}
		}

		//Runs if desiredSR is within diamond tier
		else
		{
			//Add appropriate amount to SRGainDiamond
			SRGainDiamond = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}

//MASTER-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above master
		if(desiredSR > 4000)
		{
			//Check that the starting SR isn't already above master
			if (SR < 4000)
			{
				//Add appropriate amount to SRGainMaster
				SRGainMaster = 4000 - SR;

				//Update SR variable, for we have accounted for the master tier
				SR = 4000;
			}
		}

		//Runs if desiredSR is within master tier
		else
		{
			//Add appropriate amount to SRGainMaster
			SRGainMaster = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}

//GRANDMASTER-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		//Check that the desired rank is above grandmaster
		if(desiredSR > 5000)
		{
			//Check that the starting SR isn't already above grandmaster
			if (SR < 5000)
			{
				//Add appropriate amount to SRGainGrandmaster
				SRGainGrandmaster = 5000 - SR;

				//Update SR variable, for we have accounted for the grandmaster tier
				SR = 5000;
			}
		}

		//Runs if desiredSR is within grandmaster tier
		else
		{
			//Add appropriate amount to SRGainGrandmaster
			SRGainGrandmaster = desiredSR - SR;

			//Update SR variable, for we have reached the desired rank
			SR = desiredSR;
		}
		
		/**
		 * CALCULATIONS
		 */
		cost += (SRGainBronze * amtBronze)/100.0;
		cost += (SRGainSilver * amtSilver)/100.0;
		cost += (SRGainGold * amtGold)/100.0;
		cost += (SRGainPlatinum * amtPlatinum)/100.0;
		cost += (SRGainDiamond * amtDiamond)/100.0;
		cost += (SRGainMaster * amtMaster)/100.0;
		cost += (SRGainGrandmaster * amtGrandmaster)/100.0;
		printSeparator();
		
		System.out.println("Total Skill Rating Gain: " + totalSRGain + "SR for " + formatter.format(cost));
		System.out.println("\nBreakdown:");
		System.out.println("Skill rating gains in bronze tier: " + SRGainBronze + "SR for " + formatter.format(SRGainBronze*amtBronze/100.0));
		System.out.println("Skill rating gains in silver tier: " + SRGainSilver + "SR for " + formatter.format(SRGainSilver*amtSilver/100.0));
		System.out.println("Skill rating gains in gold tier: " + SRGainGold + "SR for " + formatter.format(SRGainGold*amtGold/100.0));
		System.out.println("Skill rating gains in platinum tier: " + SRGainPlatinum + "SR for " + formatter.format(SRGainPlatinum*amtPlatinum/100.0));
		System.out.println("Skill rating gains in diamond tier: " + SRGainDiamond + "SR for " + formatter.format(SRGainDiamond*amtDiamond/100.0));
		System.out.println("Skill rating gains in master tier: " + SRGainMaster + "SR for " + formatter.format(SRGainMaster*amtMaster/100.0));
		System.out.println("Skill rating gains in grandmaster tier: " + SRGainGrandmaster + "SR for " + formatter.format(SRGainGrandmaster*amtGrandmaster/100.0));
		
		printSeparator();

	}

	/**
	 * Prints a separator line
	 */
	private static void printSeparator()
	{
		System.out.print("\n-----------------------------------------------\n");
	}

}
