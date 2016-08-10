package de.codepitbull.karaf.testservicebundle;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;

@Component
@Service
public class ProvidedServiceImpl implements ProvidedService{
    public String hello() {
        return "world";
    }
}
