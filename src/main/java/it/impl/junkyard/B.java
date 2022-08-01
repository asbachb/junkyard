package it.impl.junkyard;

import jakarta.enterprise.context.RequestScoped;

@RequestScoped
public class B {
    
    public void b() {
        System.out.println("b()");
    }
}
