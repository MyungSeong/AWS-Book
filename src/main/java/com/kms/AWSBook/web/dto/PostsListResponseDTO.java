package com.kms.AWSBook.web.dto;

import com.kms.AWSBook.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDTO {
    private long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDTO(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
        this.modifiedDate = entity.getModifiedDate();
    }
}
