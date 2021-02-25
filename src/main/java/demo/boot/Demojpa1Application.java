package demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)

public class Demojpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demojpa1Application.class, args);
		System.out.println("Spring boot demo");
	}

}
