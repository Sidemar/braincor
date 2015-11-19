package main.java.com.mkyong.core;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import main.java.com.mkyong.config.SpringMongoConfig;
import main.java.com.mkyong.model.User;
//import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	private static ApplicationContext ctx;

	public void grava(User user) {
		ctx = new AnnotationConfigApplicationContext(SpringMongoConfig.class);
		MongoOperations mongoOperation = (MongoOperations) ctx.getBean("mongoTemplate");
		mongoOperation.save(user);
	}
}