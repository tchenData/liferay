package com.test.portal.cas;

import javax.validation.constraints.NotNull; 
import org.jasig.cas.authentication.handler.PasswordEncoder; 
import com.liferay.portal.kernel.util.DigesterUtil; 
public final class MyPasswordEncoder implements PasswordEncoder { 
   @NotNull 
   private final String algorithm; 
   
   public MyPasswordEncoder(final String algorithm) { 
       this.algorithm = algorithm; 
   } 
   
   public String encode(final String password) { 
   	 String pass = DigesterUtil.digest(algorithm,password); 
       return pass; 
   } 
}