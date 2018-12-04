package com.wujie.toolsmgmt;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import net.minidev.json.writer.BeansMapper.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
public class ToolsMgmt {

    public static void main(String[] args) {
        SpringApplication.run(ToolsMgmt.class,args);
    }

//    // ����YML��ʽ�Զ��������ļ�
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties() {
//        PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();
//        YamlPropertiesFactoryBean yaml = new YamlPropertiesFactoryBean();
//        yaml.setResources(new FileSystemResource("/resources/application.yml"));//File����
////      yaml.setResources(new ClassPathResource("youryml.yml"));//class����
//        configurer.setProperties(yaml.getObject());
//        return configurer;
//    }
}
