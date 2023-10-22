package com.happy.play.controller;

import com.happy.play.entity.Board;
import com.happy.play.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class BoardController {

    private final BoardMapper boardMapper;

    @Autowired
    public BoardController(BoardMapper boardMapper) {
        this.boardMapper = boardMapper;
    }

    /* insert */
    @PostMapping(path = "/board/save")
    public int save(@RequestBody Board board) {
        return boardMapper.save(board);
    }

    /* select */
    @GetMapping(path = "/board/find")
    public List<Board> find() {
        return boardMapper.find();
    }

    /* update */
    @PutMapping(path = "/board/update")
    public int update(@RequestBody Board board) {
        return boardMapper.update(board);
    }
    /* delete */
    @DeleteMapping(path = "/board/delete/{id}")
    public int delete(@RequestBody Board board, @PathVariable int id) {
        return boardMapper.delete(id);
        }
}
