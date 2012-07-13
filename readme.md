<h1>Example description:</h1>
- java application which prints "Hello World!" to the command line
- MessageProvider: interface to provide text message
- MessageRenderer: interface to render text message from MessageProvider
- MyMessageProviderImpl: provides text message "Hello World!"
- MyMessageRendererImpl: prints to standard out


<h1>AnnotationStyle</h1>
- spring-application-config-xmlStyle (define annotation style and packages to scan)
- @Service to define Beans in Java code
- @Autowired to define setter-injection in MyMessageRendererImpl
- @Value and @Autowired to define constructor injection in MyMessageProviderImpl

<h1>XMLStyle</h1>
- spring-application-config-xmlStyle (define beans, setter injection, constructor injection)

<h1>Nested ApplicationContext</h1>
- nestedContext_parent.xml
- nestedContext_child.xml