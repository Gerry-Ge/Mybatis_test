package org.gerry.aops;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.gerry.main.CodeUtils;

@Aspect
public class PointCuts {
	@Pointcut("Within(org.gerry.test)")
	public void withIn(){
		
	}
	
	@Before("withIn()")
	public void before(){
		CodeUtils.prt("#Before#");
	}

}
=======
package org.gerry.aops;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.gerry.main.CodeUtils;

@Aspect
public class PointCuts {
	@Pointcut("Within(org.gerry.test)")
	public void withIn(){
		
	}
	
	@Before("withIn()")
	public void before(){
		CodeUtils.prt("#Before#");
	}

}
