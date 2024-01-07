package com.Study;

import com.Study.Service.Impl.MessageProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(StudyApplication.class, args);

		// Get the MessageProcessor bean from the context
		MessageProcessor messageProcessor = context.getBean(MessageProcessor.class);

		// Call the processMessage method
		messageProcessor.processMessage();

		// Close the application context
		context.close();
	}
}
