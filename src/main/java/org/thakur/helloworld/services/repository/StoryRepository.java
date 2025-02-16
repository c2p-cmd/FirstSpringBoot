package org.thakur.helloworld.services.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.thakur.helloworld.models.Story;

import java.util.List;

public interface StoryRepository extends MongoRepository<Story, String> {
    List<Story> findByAuthor(String author);
}
