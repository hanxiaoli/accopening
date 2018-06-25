package jp.co.basenet.accopening.batch.configuration;

import javax.persistence.EntityManagerFactory;

import org.hibernate.jpa.HibernatePersistenceProvider;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
public class BatchDatabaseConfiguration {

	// @Bean
	// @Primary
	// public DataSourceProperties batchDataSourceProperties() {
	// return new DataSourceProperties();
	// }

//	@Bean
//	public HikariDataSource batchDataSource() {
//		return new DataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
//	}
//
//	@Bean
//	public EntityManagerFactory entityManagerFactory() {
//
//		LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new LocalContainerEntityManagerFactoryBean();
//		// entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
//		entityManagerFactoryBean.setDataSource(batchDataSource());
//		entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
//		// entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
//		// entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
//
//		return entityManagerFactoryBean.getObject();
//	}
}
