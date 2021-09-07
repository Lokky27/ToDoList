package todoapp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = "todoapp")
@EnableTransactionManagement
@PropertySource(value = "classpath:db.properties")
public class HibernateConfig
{
    private Environment environment;

    @Autowired
    public void setEnvironment(Environment environment)
    {
        this.environment = environment;
    }

}
