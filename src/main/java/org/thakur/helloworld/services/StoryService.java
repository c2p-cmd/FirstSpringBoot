package org.thakur.helloworld.services;

import org.springframework.stereotype.Service;
import org.thakur.helloworld.models.Story;
import org.thakur.helloworld.services.repository.StoryRepository;

import java.util.List;
import java.util.Random;

@Service
public class StoryService {
    private final StoryRepository storyRepository;
    final Random random = new Random();

    public StoryService(StoryRepository storyRepository) {
        this.storyRepository = storyRepository;
    }

    public List<Story> getAllStories() {
        return storyRepository.findAll();
    }

    public Story getRandomStory() {
        final List<Story> stories = storyRepository.findAll();
        final int randomIndex = random.nextInt(stories.size());
        return stories.get(randomIndex);
    }

    public List<Story> getStoriesByAuthor(String author) {
        return storyRepository.findByAuthor(author);
    }
}
