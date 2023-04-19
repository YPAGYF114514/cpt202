// package com.cpt202.team.config;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.CorsRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class CorsConfig {

//     @Bean
//     public WebMvcConfigurer corsConfigurer() {
//         return new WebMvcConfigurer() {
//             @Override
//             public void addCorsMappings(CorsRegistry registry) {
//                 registry.addMapping("/**")
//                         .allowedOrigins("*") // 根据实际需求调整允许的跨域来源
//                         .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS")
//                         .allowedHeaders("*")
//                         .allowCredentials(true);
//             }
//         };
//     }
// }
