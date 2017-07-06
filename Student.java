package cs356_a1;

public class Student {
	private String id;
	boolean submitted = false;
	Answer a;
	
	public Student(String id){
		setID(id);
	}
	
	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}
	
	public boolean getSubmitStatus(){
		return submitted;
	}
	
	public void setSubmitStatus(boolean status){
		this.submitted = status;
	}
	
	public Answer submitAnswer(){
		return a;
	}
	
	public void setAnswer(Answer answer){
		a = answer;
	}
}
