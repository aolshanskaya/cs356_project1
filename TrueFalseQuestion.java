package cs356_a1;

public class TrueFalseQuestion implements Question{

	private String question;
	private Answer t = new TrueFalseAnswer("true");
	private Answer f = new TrueFalseAnswer("false");
	private Answer[] answerOptions = {t , f};
	
	public TrueFalseQuestion(String question){
		this.question = question;
	}
	
	public TrueFalseQuestion(String question , String firstChoice , String secondChoice){
		this.question = question;
		t.setExplanation(firstChoice);
		f.setExplanation(secondChoice);
	}
	
	public String getQuestion(){
		return question;
	}
	
	public void setAnswerExplanation(Answer a , String explanation){
		a.setExplanation(explanation);
	}
	
	public Answer[] getAnswerOptions(){
		return answerOptions;
	}
	
	public int getNumAnswers(){
		return answerOptions.length;
	}
	
}
