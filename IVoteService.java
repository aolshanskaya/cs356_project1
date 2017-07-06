package cs356_a1;

import java.util.*;

public class IVoteService {
	
	private Map<Student, Answer> answerMap = new HashMap<>();
	private Question question;
	private Answer[] answers;
	
	public IVoteService(Question question){
		this.question = question;
		this.answers = question.getAnswerOptions();
	}
	
	public void mapSubmission(Answer a , Student s){
		if(answerMap.containsKey(s))
			answerMap.replace(s , a);
		else
			answerMap.put(s , a);
	}
	
	private void outputQuestionAnswers(){
		System.out.println(question.getQuestion());
		for(int i = 0 ; i < answers.length ; i++)
			if(answers[i].getExplanation() != null)
				System.out.println(answers[i].getOption() + ") " + answers[i].getExplanation());
			else
				System.out.println(answers[i].getOption());
	}
	
	private int countNumAnswerSubmissions(Answer a){
		int submissions = 0;
		
		for(Student s : answerMap.keySet()){
			if(answerMap.get(s) == a)
				submissions++;
		}
		
		return submissions;
	}
	
	public void outputStats(){
		outputQuestionAnswers();
		System.out.println("\nSTUDENT ANSWERS:");
		System.out.println("Total number of students : " + answerMap.keySet().size());
		for(int i = 0 ; i < answers.length ; i++){
			System.out.println(answers[i].getOption() + " : " + countNumAnswerSubmissions(answers[i]));
		}
	}
}
