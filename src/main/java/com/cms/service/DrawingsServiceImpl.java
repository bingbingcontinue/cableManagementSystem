package com.cms.service;

import com.cms.dao.DrawingsMapper;
import com.cms.pojo.Cable;
import com.cms.pojo.Drawings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrawingsServiceImpl implements DrawingsService{

    //service调dao层：组合Dao
    private DrawingsMapper drawingsMapper;
    public void setDrawingsMapper(DrawingsMapper drawingsMapper) {
        this.drawingsMapper = drawingsMapper;
    }
    @Override
    public int addDrawings(Drawings drawings) {
        return drawingsMapper.addDrawings(drawings);
    }

    @Override
    public int deleteDrawingsById(int drawingID) {
        return drawingsMapper.deleteDrawingsById(drawingID);
    }

    @Override
    public int updateDrawings(Drawings drawings) {
        return drawingsMapper.updateDrawings(drawings);
    }

    @Override
    public Drawings queryDrawingsById(int drawingID) {
        return drawingsMapper.queryDrawingsById(drawingID);
    }

    @Override
    public List<Drawings> qureyAllDrawings() {
        return drawingsMapper.qureyAllDrawings();
    }

    @Override
    public List<Drawings> queryDrawingsByColumn(String queryColumn, String queryParam) {
        return drawingsMapper.queryDrawingsByColumn(queryColumn, queryParam);
    }


}
