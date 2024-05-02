package org.example;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music{

	@PostConstruct
	public void doMyInit() {
		System.out.println("Initialization");
	}

	@PreDestroy
	public void doMyDestroy() {
		System.out.println("Destruction");
	}

	@Override
	public String getSong() {
		return "Moonlight Sonata";
	}
}
