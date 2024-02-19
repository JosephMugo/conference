package org.JosephMugo.service;

import org.JosephMugo.model.Speaker;
import org.JosephMugo.repository.SpeakerRepository;
import org.JosephMugo.repository.StubSpeakerRepositoryImpl;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new StubSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
