package com.integrationwizards.common;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.web.bind.annotation.RequestParam;

import com.integrationwizards.util.LogManager;
import com.integrationwizards.util.LogUtil;
import com.integrationwizards.util.StringUtil;

/**
 * Logging data when exception occurred
 * @author 
 *
 */
@Aspect
public class LoggingAspect {
	/**
	 * Create Job PointCut : catching process in controller and service
	 */
	@Pointcut("execution(* com.integrationwizards.controller.CreateJobController.*(..)) "
			+ "|| execution(* com.integrationwizards.service.impl.CreateJobServiceImpl.*(..))")
	public void createJobPointCut() {}
	
	/**
	 * Export Jobs PointCut : catching process in controller and service
	 */
	@Pointcut("execution(* com.integrationwizards.controller.ExportJobsController.*(..)) "
			+ "|| execution(* com.integrationwizards.service.impl.ExportJobsServiceImpl.*(..))")
	public void exportJobsPointCut() {}
	
	@Before("createJobPointCut()")
	public void createJobLog(JoinPoint joinPoint) {
		beforeLog(joinPoint, "createJob");
	}
	
	@Before("exportJobsPointCut()")
	public void exportJobsLog(JoinPoint joinPoint) {
		beforeLog(joinPoint, "exportJobs");
	}
	
	public void beforeLog(JoinPoint joinPoint, String category) {
/*		System.out.println("logBefore() is running!");
		System.out.println(" Entering " + 
				joinPoint.getTarget().getClass().getSimpleName() + "' s " + 
				joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		MethodSignature methodSignature = (MethodSignature) joinPoint.getStaticPart().getSignature();
        Method method = methodSignature.getMethod();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        
        String logId = "";
        
		for (int i = 0; i < args.length; i ++) {			
			System.out.println(" args[" + i + "] -->" + args[i] + ", Annotation : " + parameterAnnotations[i].length);	
			
			if(args[i] instanceof Object) {
				Map<String, Object> map = StringUtil.objToMap(args[i]);
				
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					if(entry.getKey().equals("logId")) {
						logId = String.valueOf(entry.getValue());
						System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
					}
				}
				
				// Get method's parameter name
	            for (Annotation annotation : parameterAnnotations[i]) {
	            	System.out.println(" Annotation => " + annotation + " = " + args[i]);
	                if (!(annotation instanceof ParamName))
	                    continue;
	                ParamName requestParam = (ParamName) annotation;
	                if ("logId".equals(requestParam.value())) {
	                	logId = requestParam.value();
	                }
	                System.out.println("  " + requestParam.value() + " = " + args[i]);
	            }
			}			
		}
		
		if(!StringUtil.isEmptyString(logId)) {
			System.out.println("Finally, LogID : " + logId);
		}*/
        
		System.out.println("******");
	}
	
	public void iterateMap(String key, Object obj) {
		Field[] fields = obj.getClass().getDeclaredFields();
		System.out.println("");
		System.out.println("Enter iternateMap => key : " + key + ", value : " + obj + 
				", fields : " + (fields != null ? fields.length : fields));
		
		
		if(fields != null && fields.length <= 5) {
			System.out.println("Key : " + key + ",, Value : " + obj);
		}
		else {
			Map<String, Object> map = StringUtil.objToMap(obj);
			
			for (Map.Entry<String, Object> entry : map.entrySet()) {				
				if(entry.getValue() instanceof Object) {
					iterateMap(entry.getKey(), entry.getValue());
				}
				System.out.println("Key : " + entry.getKey() + ",,, Value : " + entry.getValue());
			}
		}
	}
	
	public void printFields(Field[] fields, Object o) {
		try {
	        for(Field field : fields){
	            field.setAccessible(true);
	            Object value = field.get(o);
	            System.out.println(field.getName() + "==" + value);
	        }
	    }catch(Exception e){
	        e.printStackTrace();
	    }
	}
	
	
	
	
	@AfterThrowing(pointcut="createJobPointCut()", throwing="excep")
	public void createJobThrowing(JoinPoint joinPoint, Throwable excep) {
		logAfterThrowing(joinPoint, excep, "createJob");
	}
	
	@AfterThrowing(pointcut="exportJobsPointCut()", throwing="excep")
	public void exportJobsThrowing(JoinPoint joinPoint, Throwable excep) {
		logAfterThrowing(joinPoint, excep, "exportJobs");
	}
	
	/**
	 * Catch exceptions after exceptions are thrown
	 * @param joinPoint
	 * @param excep
	 * @param category
	 */
	public void logAfterThrowing(JoinPoint joinPoint, Throwable excep, String category) {

		System.out.println("logAfterThrowing() is running!");
		System.out.println(" Entering " + 
				joinPoint.getTarget().getClass().getSimpleName() + "' s " + 
				joinPoint.getSignature().getName());
		
		Object[] args = joinPoint.getArgs();
		MethodSignature methodSignature = (MethodSignature) joinPoint.getStaticPart().getSignature();
        Method method = methodSignature.getMethod();
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        
        String logId = "";
        
		for (int i = 0; i < args.length; i ++) {			
			System.out.println(" args[" + i + "] -->" + args[i] + ", Annotation : " + parameterAnnotations[i].length);	
			
			if(args[i] instanceof Object) {
				Map<String, Object> map = StringUtil.objToMap(args[i]);
				
				for (Map.Entry<String, Object> entry : map.entrySet()) {
					if(entry.getKey().equals("logId")) {
						logId = String.valueOf(entry.getValue());
						System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
					}
				}
				
				// Get method's parameter name
	            for (Annotation annotation : parameterAnnotations[i]) {
	            	System.out.println(" Annotation => " + annotation + " = " + args[i]);
	                if (!(annotation instanceof ParamName))
	                    continue;
	                ParamName requestParam = (ParamName) annotation;
	                if ("logId".equals(requestParam.value())) {
	                	logId = requestParam.value();
	                }
	                System.out.println("  " + requestParam.value() + " = " + args[i]);
	            }
			}			
		}
		
		if(!StringUtil.isEmptyString(logId)) {
			System.out.println("Finally, LogID : " + logId);
			LogUtil lu = LogManager.getInstance().getLogObj(category, logId);
			
			lu.error("AfterThrowing : " + ExceptionUtils.getStackTrace(excep));			
			for (int i = 0; i < args.length; i ++) {	
				lu.error("AfterThrowing : " + String.valueOf(StringUtil.objToMap(args[i])));
			}
		}
		System.out.println("******");
	}
}
