package de.codepitbull.karaf.testservicebundle;

import org.osgi.service.component.annotations.Component;

@Component(service = ProvidedService.class)
public class ProvidedServiceImpl implements ProvidedService{
    public String hello() {
        return "world";
    }
}
