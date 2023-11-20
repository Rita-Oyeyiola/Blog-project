package com.septa.blog.dto;

public class BlogDTO {

        private Long id;

        private String title;

        private String content;

        private int dateCreated;

        private int dateUpdated;

        public BlogDTO () {

        }

        public BlogDTO(Long id, String title, String content, int dateCreated, int dateUpdated){
            this.id = id;
            this.title = title;
            this.content = content;
            this.dateCreated = dateCreated;
            this.dateUpdated = dateUpdated;
        }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(int dateCreated) {
        this.dateCreated = dateCreated;
    }

    public int getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(int dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    @Override
    public String toString() {
        return "BlogDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", dateCreated=" + dateCreated +
                ", dateUpdated=" + dateUpdated +
                '}';
    }

}
