# demoNitesh
Learning Spring

Commit 1: Basic service is working. @Bean is used here (#1)

**Spring Bean Configuration**:

Spring Framework provide three ways to configure beans to be used in the application.
1. Annotation Based Configuration – By using @Service or @Component annotations. Scope details can be provided with @Scope annotation.
2. XML Based Configuration – By creating Spring Configuration XML file to configure the beans. If you are using Spring MVC framework, the xml based configuration can be loaded automatically by writing some boiler plate code in web.xml file.
3. Java Based Configuration – Starting from Spring 3.0, we can configure Spring beans using java programs. Some important annotations used for java based configuration are @Configuration, @ComponentScan and @Bean.



**Spring bean with annotation and java based configuration**:

Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context

