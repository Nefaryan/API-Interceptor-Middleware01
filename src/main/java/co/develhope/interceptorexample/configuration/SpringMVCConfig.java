package co.develhope.interceptorexample.configuration;

import co.develhope.interceptorexample.interceptor.APILogginIntercptor;
import co.develhope.interceptorexample.interceptor.LegacyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCConfig implements WebMvcConfigurer {

    @Autowired
    private APILogginIntercptor apiLogginIntercptor;

    @Autowired
    private LegacyInterceptor legacyInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(apiLogginIntercptor);
        registry.addInterceptor(legacyInterceptor);
    }
}
