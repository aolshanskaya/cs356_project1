package cs356_a1;

public class MultChoiceQuestion implements Question{

	private String question;
	private Answer[] answerOptions;
	
	private static int defaultAnswers = 5;
	
	public MultChoiceQuestion(String question){
		this(question , defaultAnswers);
	}
	
	public MultChoiceQuestion(String question , int numAnswers){
		this.question = question;
		Answer[] temp = new Answer[numAnswers];
		answerOptions = temp;
		configureAnswers();
	}
	
	public MultChoiceQuestion(String question , String[] answerExplanations){
		this.question = question;
		Answer[] temp = new Answer[answerExplanations.length];
		answerOptions = temp;
		configureAnswers();
		setAnswerExplanations(answerExplanations);
	}
	
	private void setAnswerExplanations(String[] explanations){
		for(int i = 0 ; i < explanations.length ; i++)
			answerOptions[i].setExplanation(explanations[i]);
	}
	
	private void configureAnswers(){
		for(int i = 0 ; i < answerOptions.length; i++){
			Answer a = new MultChoiceAnswer(Character.toString((char)('A'+ i)));
			answerOptions[i] = a;
		}
	}

	public String getQuestion(){
		return question;
	}
	
	public Answer[] getAnswerOptions(){
		return answerOptions;
	}
	
	public int getNumAnswers(){
		return answerOptions.length;
	}
	
	
}
