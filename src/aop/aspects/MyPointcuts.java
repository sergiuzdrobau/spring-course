package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    @Pointcut("execution(public * *(..))")
    public void allPublicMethods(){
    }

    @Pointcut("execution(public String *(..))")
    public void allPublicStringMethods(){
    }

    @Pointcut("allPublicMethods() && !allPublicStringMethods()")
    public void allPublicMethodsExceptStrings(){
    }

    @Pointcut("execution(public void get*())")
    public void allPublicVoidGetMethods(){
    }

    @Pointcut("execution(public * return*())")
    public void allPublicReturnMethods(){
    }
}
