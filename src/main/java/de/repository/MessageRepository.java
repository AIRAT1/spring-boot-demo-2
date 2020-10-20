package de.repository;

import de.domain.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
    Page<Message> findByTag(String tag, Pageable pageable);
    Page<Message> findAll(Pageable pageable);
}
