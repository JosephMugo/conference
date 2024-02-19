package org.JosephMugo;

import org.JosephMugo.service.SpeakerService;
import org.JosephMugo.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();
        System.out.println(service.findAll().get(0).getFirstName());
    }
}