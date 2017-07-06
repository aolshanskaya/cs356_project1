package cs356_a1;

public class SimulationDriver {

	public static void main(String[] args) {
		
		
		Question q1 = new TrueFalseQuestion("Is it true or false?");
		IVoteService tf1 = new IVoteService(q1);
		generateAnswers(tf1 , q1);
		tf1.outputStats();
		
		Question q2 = new TrueFalseQuestion("\nIs it true or false?" , "VERY TRUE" , "VERY FALSE");
		IVoteService tf2 = new IVoteService(q2);
		generateAnswers(tf2 , q2);
		tf2.outputStats();
		
		
		Question q3 = new MultChoiceQuestion("\nWhich is the correct answer?");
		IVoteService mc1 = new IVoteService(q3);
		generateAnswers(mc1 , q3);
		mc1.outputStats();
		
		String[] q4Answers = {"This is the first choice." , "This is the second choice." , "And this is what you put if you don't know."}; 
		Question q4 = new MultChoiceQuestion("\nWhich is the correct answer?" , q4Answers);
		IVoteService mc2 = new IVoteService(q4);
		generateAnswers(mc2 , q4);
		mc2.outputStats();
	}
	

	
	private static void generateAnswers(IVoteService iVote , Question q){
		for(int i = 1 ; i <= randomNumStudents() ; i++){
			Student s = new Student(Integer.toString(i));
			iVote.mapSubmission(randomAnswer(q), s);
		}
	}
	
	private static int randomNumStudents(){
		return (int) (Math.random() * 1000);
	}
	
	private static Answer randomAnswer(Question q){
		Answer[] options = q.getAnswerOptions();
		return options[(int) (Math.random() * q.getNumAnswers())];
	}
	
	

}
