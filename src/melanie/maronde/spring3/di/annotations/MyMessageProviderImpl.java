package melanie.maronde.spring3.di.annotations;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service("messageProvider")
public class MyMessageProviderImpl implements MessageProvider {

	private String message;
	
	@Autowired
	public MyMessageProviderImpl(@Value("This is a configurable message") String message) {
		this.message = message;
	}

    public String getMessage() {
        return message;
    }
}

