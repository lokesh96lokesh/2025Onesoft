package com.popup_backend;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="PopupEvent")
public class PopupEvent {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private LocalDateTime triggeredAt;

    public PopupEvent() {
        this.triggeredAt = LocalDateTime.now();
    }

    public PopupEvent(String message) {
        this.message = message;
        this.triggeredAt = LocalDateTime.now();
    }
}
