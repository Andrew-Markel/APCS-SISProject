import java.io.File;
import java.util.Collections;
import java.util.Scanner;
import java.io.IOException;

public class RunSIS {

	public static void main(String[] args) throws IOException
		{
		
		
		Roster.fillRoster();
		
		//displaymenu
		switch (Kaitlyn.mainMenu()) {
		case 1: // Add / delete a student (another switch structure) goes here
		case 2: 
			switch (ChangeGrades.gradesOrSchedulePrompt()) {
			case 1: ChangeGrades.changeGrades(); break;
			case 2: ChangeGrades.switchClasses(); break;
			}
			break;
		case 3: // Sort students (another switch structure) goes here
		}
		
			
		//This will sort by GPA
	//	Collections.sort(Roster.roster, new GpaComparator());

		//This will sort by LastName
	//	Collections.sort(Roster.roster, new LastNameComparator());
		
		
		//This will sort by the First class
	//Collections.sort(Roster.roster, new FirstClassComparator());
		
		//This will sort by LastName
	//	Collections.sort(Roster.roster, new SecondClassComparator());
		
		//This will sort by LastName
	//	Collections.sort(Roster.roster, new ThirdClassComparator());
		
//		Roster.printRoster();
	}
}


