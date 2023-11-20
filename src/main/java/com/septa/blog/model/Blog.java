package com.septa.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Blog {

        @Id

        @GeneratedValue (strategy = GenerationType.IDENTITY)
        private long id;

        private String title;

        private String content;

        private int dateCreated;

        private int dateUpdated;

        public Blog() {

        }

        public long getId() {
                return id;
        }

        public void setId(long id) {
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
