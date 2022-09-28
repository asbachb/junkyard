package it.impl.junkyard;

import jakarta.inject.Inject;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(WeldJunit5Extension.class)
public class AIT {
    
    @Inject
    C c;
    
    @Test
    public void test() throws Exception {
        c.c();
    }
}
