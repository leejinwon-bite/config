import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//implementation 'org.modelmapper:modelmapper:3.1.1'

@Configuration
public class RootConfig {
  @Bean
  public ModelMapper getMapper() {
    ModelMapper modelMapper = new ModelMapper();
    modelMapper.getConfiguration()
      .setFieldMatchingEnabled(true)
      .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
      .setMatchingStrategy(MatchingStrategies.LOOSE);
      
    return modelMapper;
  }
}
