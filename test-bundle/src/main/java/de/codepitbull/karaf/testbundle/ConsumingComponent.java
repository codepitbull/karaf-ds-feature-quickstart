package de.codepitbull.karaf.testbundle;

import de.codepitbull.karaf.testservicebundle.ProvidedService;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ConsumingComponent {
    @Reference
    private ProvidedService providedService;

    @Activate
    public void activate() {
        System.out.println("hello " + providedService.hello());
    }

    public ProvidedService getProvidedService() {
        return providedService;
    }

    public void setProvidedService(ProvidedService providedService) {
        this.providedService = providedService;
    }
}
