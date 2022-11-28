package com.wu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class FilterConfig implements WebMvcConfigurer {

//   @Bean
//     public CorsWebFilter corsWebFilter(){
//         UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//         CorsConfiguration configuration = new CorsConfiguration();
//         configuration.addAllowedHeader("*");
//         configuration.addAllowedMethod("*");
//          configuration.addAllowedOriginPattern("*");
////         configuration.addAllowedOrigin("*");
//         configuration.setAllowCredentials(true);
//         source.registerCorsConfiguration("/**",configuration);
//          return new CorsWebFilter(source);
//      }

    @Bean
    public CorsResponseHeaderFilter corsResponseHeaderFilter() {
        return new CorsResponseHeaderFilter();
    }

    @Bean
    public CorsWebFilter corsWebFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        // 配置跨域
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许哪个请求头
        corsConfiguration.addAllowedHeader("*");
        // 允许哪个方法进行跨域
        corsConfiguration.addAllowedMethod("*");
        // 允许哪个请求来源进行跨域
        // corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedOriginPattern("*");
        // 是否允许携带cookie进行跨域
        corsConfiguration.setAllowCredentials(true);

        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
    }

}


