package melanie.maronde.spring3.di.xml;


//render a text message provided by MessageProvider
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}

