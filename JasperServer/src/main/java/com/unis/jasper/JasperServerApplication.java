package com.unis.jasper;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class JasperServerApplication {

	public static void main(String[] args) {
		deleteDirectory("src/main/resources/reportsCompile/" );
		SpringApplication.run(JasperServerApplication.class, args);
	}
	
	static public void deleteDirectory( String emplacement )
	{
	  File path = new File( emplacement );
	  if( path.exists() )
	  {
	    File[] files = path.listFiles();
	    for( int i = 0 ; i < files.length ; i++ )
	    {
	      if( files[ i ].isDirectory() )
	      {
	        deleteDirectory( path+"\\"+files[ i ] );
	      }
	      files[ i ].delete();
	    }
	  }
	}

}
