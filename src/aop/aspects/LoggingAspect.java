package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
@Order(10)
public class LoggingAspect {


    @Before("aop.aspects.MyPointcuts.allPublicMethodsExceptStrings()")
    public void BeforeAllPublicMethods(){
        System.out.println("All Public Methods Except String");
    }


    @Before("aop.aspects.MyPointcuts.allPublicVoidGetMethods()")
    public void beforeGetMethodsFromLibrary(){
        System.out.println("Logging Aspect before getMethod from Library");
    }

    @Before("aop.aspects.MyPointcuts.allPublicReturnMethods()")
    public void beforeReturnMethodsFromLibrary(){
        System.out.println("Logging Aspect before returnMethod from Library");
    }
}
