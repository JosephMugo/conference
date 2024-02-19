package org.JosephMugo.repository;

import org.JosephMugo.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
