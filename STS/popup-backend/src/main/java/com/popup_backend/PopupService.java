package com.popup_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PopupService {
	@Autowired
    PopupRepository repository;

    public PopupEvent saveEvent(PopupEvent event) {
        return repository.save(event);
    }

    public List<PopupEvent> getAllEvents() {
        return repository.findAll();
    }
}
