
package com.abbas.restusersoathtest.config;


import feign.okhttp.OkHttpClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@EnableFeignClients(basePackages="com.abbas.restusersoathtest.client")
@Configuration
public class FeignClientConfig {


    @Bean
    public OkHttpClient client() {
        return new OkHttpClient();
    }

}


