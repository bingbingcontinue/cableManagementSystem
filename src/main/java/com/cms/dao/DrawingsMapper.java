package com.cms.dao;

import com.cms.pojo.Cable;
import com.cms.pojo.Drawings;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrawingsMapper {

    int addDrawings(Drawings drawings);
    int deleteDrawingsById(@Param("drawingID") int drawingID);
    int updateDrawings(Drawings drawings);
    Drawings queryDrawingsById(int drawingID);
    List<Drawings> qureyAllDrawings();
    List<Drawings> queryDrawingsByColumn(@Param("queryColumn") String queryColumn,
                                         @Param("queryParam") String queryParam);

}
