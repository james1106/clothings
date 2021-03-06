package ivg.cn.clo.factory.db.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ProtocolConfig;
import com.alibaba.dubbo.config.RegistryConfig;


@Configuration
public class DubboConfiguration {

	
	@Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("factory-db");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://192.168.5.131:10100");
        registryConfig.setClient("curator");
        registryConfig.setProtocol("zookeeper");
        return registryConfig;
    }
    
    @Bean
    public ProtocolConfig protocolConfig() {
    	ProtocolConfig protocolConfig = new ProtocolConfig();
    	
    	protocolConfig.setPort(9100);
    	
    	return protocolConfig;
	}
}
