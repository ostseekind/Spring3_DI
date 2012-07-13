package melanie.maronde.spring3.di.ctx.nesting;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextExample {
	
	public static void main(String[] args) {

        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("classpath:nestedContext_parent.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("classpath:nestedContext_child.xml");
        child.setParent(parent);
        child.refresh();

        SimpleInjectionTarget target1 = (SimpleInjectionTarget) child.getBean("target1");
        SimpleInjectionTarget target2 = (SimpleInjectionTarget) child.getBean("target2");
        SimpleInjectionTarget target3 = (SimpleInjectionTarget) child.getBean("target3");

        System.out.println(target1.getMsg());
        System.out.println(target2.getMsg());
        System.out.println(target3.getMsg());

    }

}
