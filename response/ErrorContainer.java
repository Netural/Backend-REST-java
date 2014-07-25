package at.da.rest.example.response;

public class ErrorContainer{
	
	public Error error;
	
	public ErrorContainer(String type, String message){
		setError(new Error(type, message));
	}

	private void setError(Error error) {
		this.error = error;
	}
	
	public String getType(){
		if(error != null){
			return error.getType();
		}
		return null;
	}
	public String getMessage(){
		if(error != null){
			return error.getType();
		}
		return null;
	}
	public void setType(String type){
		if(error != null){
			error.setType(type);
		}else{
			error = new Error();
			setType(type);
		}
	}
	public void setMessage(String message){
		if(error != null){
			error.setMessage(message);
		}else{
			error = new Error();
			setMessage(message);
		}
	}
}
