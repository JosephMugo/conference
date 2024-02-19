package org.JosephMugo.service;

import org.JosephMugo.model.Speaker;
import org.JosephMugo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }


}
