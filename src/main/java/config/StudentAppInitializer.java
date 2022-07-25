package config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class StudentAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configFile = {StudentAppConfig.class};

        return configFile;
    }

    @Override
    protected String[] getServletMappings() {
        String[] mappings = {"/"};

        return mappings;
    }
}
