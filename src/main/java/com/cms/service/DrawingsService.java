package com.cms.service;

import com.cms.pojo.Drawings;

import java.util.List;

public interface DrawingsService {
    int addDrawings(Drawings drawings);
    int deleteDrawingsById(int drawingID);
    int updateDrawings(Drawings drawings);
    Drawings queryDrawingsById(int drawingID);
    List<Drawings> qureyAllDrawings();
    List<Drawings> queryDrawingsByColumn(String queryColumn, String queryParam);

}
