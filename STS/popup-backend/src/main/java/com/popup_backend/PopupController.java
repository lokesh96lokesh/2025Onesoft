package com.popup_backend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/popups")
@CrossOrigin(origins = "*")
public class PopupController {
	@Autowired
    private PopupService service;

    @PostMapping
    public PopupEvent logPopup(@RequestBody PopupEvent event) {
        return service.saveEvent(event);
    }

    @GetMapping
    public List<PopupEvent> fetchPopups() {
        return service.getAllEvents();
    }
}
