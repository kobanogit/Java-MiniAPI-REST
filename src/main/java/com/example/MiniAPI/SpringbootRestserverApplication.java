package com.example.MiniAPI;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.example.MiniAPI.controller", "com.example.MiniAPI.service", "com.example.MiniAPI.DAO", "com.example.MiniAPI.DAO.impl"})
//@SpringBootApplication
//@ComponentScan({"com.example.MiniAPI.controller","com.example.MiniAPI.service"})
//@EntityScan("com.example.MiniAPI.service.vo")
//@EnableJpaRepositories("com.example.MiniAPI.DAO.impl")
public class SpringbootRestserverApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootRestserverApplication.class);
    }
    
    public static void main(String[] args) {
//        SpringApplication.run(SpringbootRestserverApplication.class, args);
        SpringApplication sa = new SpringApplication(
        		SpringbootRestserverApplication.class);
          sa.run(args);
    }
    
    @Bean
    public Mapper mapper() {
        return new DozerBeanMapper();
    }
    
    
    
	/*// Workin DAO
	public static void main(String[] args) {
		
		Customer cust1 = new Customer(1, "john", "Loop1");
		Customer cust2 = new Customer(2, "jack", "Pool2");
		
		
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(cust1);
            session.save(cust2);
            transaction.commit();
            
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }
        
        
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List<Customer> customers = session.createQuery("from Customer", Customer.class).list();
            customers.forEach(c -> System.out.println(c.getFirstName()));
            
        } catch (Exception e) {
        	e.printStackTrace();
        	
            if (transaction != null)
                transaction.rollback();

            e.printStackTrace();
        }*/
}