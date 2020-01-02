package com.turbo.turboSenseFinal;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TurboSenseFinalApplication extends SpringBootServletInitializer  {

	 @Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(TurboSenseFinalApplication.class);
	   }
	public static void main(String[] args) {
		SpringApplication.run(TurboSenseFinalApplication.class, args);
	}

//	   @Bean
//	    public InternalResourceViewResolver resolver() {
//	        InternalResourceViewResolver vr = new InternalResourceViewResolver();
//	        vr.setPrefix("/WEB-INF/jsps/");
//	        vr.setSuffix(".jsp");
//	        return vr;
//	    }
}
