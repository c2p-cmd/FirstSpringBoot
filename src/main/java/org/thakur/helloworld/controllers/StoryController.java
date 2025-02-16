package org.thakur.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thakur.helloworld.models.Story;
import org.thakur.helloworld.services.StoryService;

import java.util.List;

@RestController
@RequestMapping("/stories")
public class StoryController {
    private final StoryService storyService;

    public StoryController(StoryService storyService) {
        this.storyService = storyService;
    }

    @GetMapping
    public List<Story> getAll() {
        return storyService.getAllStories();
    }

    @GetMapping("/random")
    public Story getRandom() {
        return storyService.getRandomStory();
    }

    @GetMapping("/author/{author}")
    public List<Story> getByAuthor(@PathVariable String author) {
        return storyService.getStoriesByAuthor(author);
    }
}
