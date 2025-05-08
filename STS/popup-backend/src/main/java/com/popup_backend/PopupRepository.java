package com.popup_backend;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PopupRepository extends JpaRepository<PopupEvent, Long> {

}
