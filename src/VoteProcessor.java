import java.util.ArrayList;
public class VoteProcessor {
	int pope = 0;
	int edward = 0;
	String calculateElectionWinner(ArrayList<String> votes) {
		String winner = "";
		ArrayList<String> votesLower = new ArrayList<String>();
		for (int i = 0; i < votes.size(); i++) {
			votesLower.add(votes.get(i).toLowerCase());
		}
		for(int i = 0; i < votesLower.size(); i++) {
			if (votesLower.get(i).equals("pope francis")) {
				pope++;
			}
			if (votesLower.get(i).equals("edward snowden")) {
				edward++;
			}
		}
		if (pope > edward) {
			winner = "pope francis";
		}
		if (edward > pope) {
			winner = "edward snowden";
		}
		if (edward == pope) {
			winner = "TIE";
		}
		return winner;
	}
}
