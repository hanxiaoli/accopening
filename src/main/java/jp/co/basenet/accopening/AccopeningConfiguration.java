package jp.co.basenet.accopening;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AccopeningConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
