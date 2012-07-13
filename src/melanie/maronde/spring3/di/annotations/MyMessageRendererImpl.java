package melanie.maronde.spring3.di.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class MyMessageRendererImpl implements MessageRenderer {

    private MessageProvider messageProvider = null;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("No MessageProvider implementation set.");
        }
        System.out.println(messageProvider.getMessage());
    }
    
    @Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

