package it.impl.junkyard;

import it.impl.junkyard.A;
import jakarta.inject.Inject;
import org.jboss.weld.junit5.WeldJunit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(WeldJunit5Extension.class)
public class AIT {
    
    @Inject
    A a;
    
    @Test
    public void test() throws Exception {
        a.a();
    }
}
