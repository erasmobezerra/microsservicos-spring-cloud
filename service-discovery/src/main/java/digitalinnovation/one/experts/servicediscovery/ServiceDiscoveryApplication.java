package digitalinnovation.one.experts.servicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
	/*  O service-discovery vai se conectar ao config-server para buscar
		as configurações de servidor do próprio service-discovery.
	*/
@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscoveryApplication {
	/*  Service Discovery / Registry, será responsável por gerenciar o status e a
		localização dos Microservices em nossa rede. Para isso usaremos o Eureka, uma
		ferramenta desenvolvida pela Netflix e disponibilizada para a comunidade.

		O Netflix Eureka é um módulo do Netflix OSS, o qual permite com que serviços
		sejam registrados através do Eureka Server e descobertos através do Eureka
		Client, facilitando esse controle de aplicação distribuída.

		Saiba mais:
		https://medium.com/@michellibrito/netflix-eureka-comunica%C3%A7%C3%A3o-entre-microservices-383d32d39506
	*/
	public static void main(String[] args) {
		SpringApplication.run(ServiceDiscoveryApplication.class, args);
	}

}
