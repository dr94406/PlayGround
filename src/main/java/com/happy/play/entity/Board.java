package com.happy.play.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Board {

    private int id;
    private String author;
    private String title;
    private String content;
}
