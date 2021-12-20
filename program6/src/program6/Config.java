package program6;

	
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Config {
	 
@Bean
public Student StudentBean()
{
	return new Student();
}

@Bean
public Marks MarksBean()
{
	return new Marks();
}
}

