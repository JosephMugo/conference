package org.JosephMugo;

import org.JosephMugo.repository.SpeakerRepository;
import org.JosephMugo.repository.StubSpeakerRepositoryImpl;
import org.JosephMugo.service.SpeakerService;
import org.JosephMugo.service.SpeakerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        return new SpeakerServiceImpl(getSpeakerRepository());
    }

    @Bean(name="speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new StubSpeakerRepositoryImpl();
    }
}
