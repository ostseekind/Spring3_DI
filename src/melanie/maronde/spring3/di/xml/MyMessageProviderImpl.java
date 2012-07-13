package melanie.maronde.spring3.di.xml;


public class MyMessageProviderImpl implements MessageProvider {

	private String message;
	
	public MyMessageProviderImpl(String message){
		this.message = message;
	}
    public String getMessage() {
        return message;
    }
}

