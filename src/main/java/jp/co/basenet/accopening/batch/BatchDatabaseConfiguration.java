package jp.co.basenet.accopening.batch;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class BatchDatabaseConfiguration {

	// @Bean
	// @Primary
	// public DataSourceProperties batchDataSourceProperties() {
	// return new DataSourceProperties();
	// }

	// @Bean
	// public HikariDataSource batchDataSource() {
	// return new
	// DataSourceProperties().initializeDataSourceBuilder().type(HikariDataSource.class).build();
	// }
	//
	// @Bean
	// public EntityManagerFactory entityManagerFactory() {
	//
	// LocalContainerEntityManagerFactoryBean entityManagerFactoryBean = new
	// LocalContainerEntityManagerFactoryBean();
	// // entityManagerFactoryBean.setJpaVendorAdapter(vendorAdaptor());
	// entityManagerFactoryBean.setDataSource(batchDataSource());
	// entityManagerFactoryBean.setPersistenceProviderClass(HibernatePersistenceProvider.class);
	// //
	// entityManagerFactoryBean.setPackagesToScan(ENTITYMANAGER_PACKAGES_TO_SCAN);
	// // entityManagerFactoryBean.setJpaProperties(jpaHibernateProperties());
	//
	// return entityManagerFactoryBean.getObject();
	// }
}
