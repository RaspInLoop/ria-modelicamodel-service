package org.raspinloop.server.modelica.mdt;

import org.raspinloop.server.modelica.mdt.core.IMoClassLoader;
import org.raspinloop.server.modelica.mdt.core.IModelicaProject;
import org.raspinloop.server.modelica.mdt.core.IStandardLibrary;
import org.raspinloop.server.modelica.mdt.internal.core.InnerClassFactory;
import org.raspinloop.server.modelica.mdt.internal.core.LibClassLoader;
import org.raspinloop.server.modelica.mdt.internal.core.StandardLibrary;
import org.raspinloop.server.modelica.mdt.internal.core.StdLibModelicaProject;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCaching
public class Modelica {

	@Bean
	IModelicaProject modelicaProject(){
		return new StdLibModelicaProject();		
	}
	
	@Bean
	IStandardLibrary standardLibrary(){
		return new StandardLibrary( modelicaProject() );
	}
	
	@Bean
	InnerClassFactory innerClassFactory(){
		return new InnerClassFactory();
	}
	
	@Bean
	IMoClassLoader libClassLoader(){
		return new LibClassLoader(standardLibrary());
	}
	
}
