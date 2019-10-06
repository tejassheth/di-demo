package edu.learn.didemo.config;

import edu.learn.didemo.examplebean.FakeDataSource;
import edu.learn.didemo.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
// one way
@PropertySources({
    @PropertySource("classpath:datasource.properties"),
    @PropertySource("classpath:jms.properties")
})
/* 2nd way
@PropertySource({"classpath:datasource.properties","classpath:jms.properties"})
*/


/* 3rd way
@PropertySource("classpath:datasource.properties")
@PropertySource("classpath:jms.properties")
 */
public class PropertyConfig {
    @Autowired
    Environment environment;
    @Value("${guru.username}")
    String username;

    @Value("${guru.password}")
    String password;

    @Value("${guru.url}")
    String URL;

    @Value("${guru.jms.username}")
    String jmsUsername;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.url}")
    String jmsURL;


    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource= new FakeDataSource();
        fakeDataSource.setUsername(username);
        fakeDataSource.setURL(URL);
        fakeDataSource.setPassword(password);
        return  fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker= new FakeJmsBroker();
        fakeJmsBroker.setUsername(jmsUsername);
        fakeJmsBroker.setURL(jmsURL);
        fakeJmsBroker.setPassword(jmsPassword);
        return  fakeJmsBroker;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer= new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
