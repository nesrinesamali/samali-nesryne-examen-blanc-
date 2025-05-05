package tn.esprit.samalinesryne4arctic7.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@Aspect
public class Aspects {
    @After("execution(* tn.esprit.samalinesryne4arctic7.service.ClientServiceImpl.addClient(..))")
    public void logAfterAddClient() {
        System.out.println("Bienvenue ");
    }
}
