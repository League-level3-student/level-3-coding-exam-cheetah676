import java.util.ArrayList;

public class VoteProcessor {
 public String calculateElectionWinner(ArrayList <String> votes) {
	 int pope = 0;
	 int edward=0;
	 String returnVal= "";
	for(int i=0; i<votes.size(); i++) {
		if(votes.get(i).equalsIgnoreCase("pope francis")) {
		pope++;
	}
		else if(votes.get(i).equalsIgnoreCase("edward snowden")) {
			edward++;
		}
		else {
			System.out.println("What?");
		}
}
	if(pope>edward) {
		returnVal="pope francis";
	}
	else if(edward>pope) {
		returnVal="edward snowden";
	}
	else if(pope==edward) {
		returnVal="TIE";
	}
	else {
		System.out.println("What?");
	}
	return returnVal;
}
}
