package com.happy.play.mapper;

import com.happy.play.entity.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public int save(Board board);
    public List<Board> find();
    public int update(Board board);
    public int delete(int id);
}
