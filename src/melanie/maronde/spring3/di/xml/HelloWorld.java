package melanie.maronde.spring3.di.xml;

import org.springframework.context.support.GenericXmlApplicationContext;


public class HelloWorld {

    public static void main(String[] args) {
    	
    	//ApplicationContext = extension to Bean Factory (responsible for managing components)
    	GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-application-config-xmlStyle.xml");
        ctx.refresh();

        //Dependency lookup
        //Note: Dependency Lookup causes tidier coupling than dependency injection
        MessageProvider provider = (MessageProvider) ctx.getBean("messageProvider");

        //Test
        System.out.println("---Test1: MessageProducer---");
        System.out.println(provider.getMessage());
        
        //Dependency lookup
        //Note: Dependency Lookup causes tidier coupling than dependency injection
        //Within MessageRender: Dependency Injection of MessageProducer
        MessageRenderer renderer = (MessageRenderer) ctx.getBean("messageRenderer");
        
        System.out.println("---Test2: MessageRenderer---");
        renderer.render();

    }
}

