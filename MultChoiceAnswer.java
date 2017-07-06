package cs356_a1;

public class MultChoiceAnswer implements Answer {
	
	private String option;
	private String explanation;


	public MultChoiceAnswer(String option){
		this.option = option;
	}
	
	public String getOption() {
		return option;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}
	
	public String getExplanation() {
		return explanation;
	}

}
