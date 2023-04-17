package model;

import java.io.Serializable;


public class ComicManage implements Serializable {
    private int id;
    private String nameStory;
    private Category category;
    private String author;
    private boolean status;

    public ComicManage() {
    }

    public ComicManage(int id, String nameStory, Category category, String author, boolean status) {
        this.id = id;
        this.nameStory = nameStory;
        this.category = category;
        this.author = author;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameStory() {
        return nameStory;
    }

    public void setNameStory(String nameStory) {
        this.nameStory = nameStory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ComicManage{" +
                "id=" + id +
                ", nameStory='" + nameStory + '\'' +
                ", category=" + category +
                ", author='" + author + '\'' +
                ", status=" + status +
                '}';
    }
}
