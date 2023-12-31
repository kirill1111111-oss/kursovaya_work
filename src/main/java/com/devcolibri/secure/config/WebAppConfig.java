package com.devcolibri.secure.config;


import com.devcolibri.secure.service.UserDetailsServiceImpl;
import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
        import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
        import org.springframework.web.servlet.view.InternalResourceViewResolver;
        import org.springframework.web.servlet.view.JstlView;
        import org.springframework.web.servlet.view.UrlBasedViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({ "com.mkyong.helloworld.web" })
public class WebAppConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }
    @Bean
    public UrlBasedViewResolver setupViewResolver() {
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        resolver.setViewClass(JstlView.class);

        return resolver;
    }
    @Bean
    public UserDetailsService getUserDetailsService(){
        return new UserDetailsServiceImpl();
    }



}
