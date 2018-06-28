package com.library;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfiguration config = new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		new SchemaExport(config).create(false, true);
    	SpringApplication.run(App.class, args);
    }
}
