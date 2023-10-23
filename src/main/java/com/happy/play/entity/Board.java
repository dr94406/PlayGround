package com.happy.play.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Schema(description = "게시판 정보")
@Getter
public class Board {

    @Schema(description = "게시글 아이디", defaultValue = "auto_increment")
    private int id;

    @Schema(description = "게시글 작성자", example = "khm")
    private String author;

    @Schema(description = "게시글 제목", example = "안녕하세요.")
    private String title;

    @Schema(description = "게시글 내용", example = "게시판이 조용하네요.")
    private String content;
}
