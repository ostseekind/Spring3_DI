package melanie.maronde.spring3.di.annotations;


//render a text message provided by MessageProvider
public interface MessageRenderer {

    public void render();
    public void setMessageProvider(MessageProvider provider);
    public MessageProvider getMessageProvider();
}

