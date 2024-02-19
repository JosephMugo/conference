package org.JosephMugo.repository;

import org.JosephMugo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class StubSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Joseph");
        speaker.setLastName("Mugo");

        speakers.add(speaker);

        return speakers;
    }
}
