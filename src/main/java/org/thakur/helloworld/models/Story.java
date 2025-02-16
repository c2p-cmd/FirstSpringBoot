package org.thakur.helloworld.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Objects;

@Document(collection = "stories")
public class Story {
    @Id
    private String _id;
    private String title, author, story, moral;

    public Story(String _id, String title, String author, String story, String moral) {
        this._id = _id;
        this.title = title;
        this.author = author;
        this.story = story;
        this.moral = moral;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public String getMoral() {
        return moral;
    }

    public void setMoral(String moral) {
        this.moral = moral;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Story story)) return false;
        return Objects.equals(get_id(), story.get_id()) && Objects.equals(getTitle(), story.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(get_id(), getTitle());
    }

    @Override
    public String toString() {
        return "Story{" +
                "_id='" + _id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", story='" + story + '\'' +
                ", moral='" + moral + '\'' +
                '}';
    }
}
