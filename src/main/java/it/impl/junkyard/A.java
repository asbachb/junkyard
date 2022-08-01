package it.impl.junkyard;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class A {
    
    @Inject
    B b;
    
    public void a() {
        System.out.println("a()");
        b.b();
    }
}
