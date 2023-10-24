package com.happy.play.controller;

import com.happy.play.entity.Board;
import com.happy.play.mapper.BoardMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@Tag(name = "board", description = "게시판 API")
@RequestMapping("/api/v1/board")
public class BoardController {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardController(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    /* insert */
    @PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "게시글 저장", description = "게시글을 저장합니다.")
    public int save(Board board) {
        return boardMapper.save(board);
    }

    /* select */
    @GetMapping(path = "/find", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "게시글 조회", description = "게시글을 조회합니다.")
    public List<Board> find() {
        return boardMapper.find();
    }

    /* update */
    @PutMapping(path = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "게시글 수정", description = "게시글을 수정합니다.")
    public int update(Board board) {
        return boardMapper.update(board);
    }
    /* delete */
    @DeleteMapping(path = "/delete/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @Operation(summary = "게시글 삭제", description = "게시글을 삭제합니다.")
    public int delete(@PathVariable int id) {
        return boardMapper.delete(id);
        }
}
