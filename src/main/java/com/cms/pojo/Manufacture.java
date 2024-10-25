package com.cms.pojo;

import lombok.Data;

import java.time.LocalDate;

/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:30
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Manufacture {
    private Integer batchnumber;
    private String supplier;
    private String productmodel;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate productdate;
    private Float diameter;
    private String diameterUnits;
    private String material;
    private String insulationMaterial;
    private String shieldingLayer;
    private String guaranteeperiod;
    private Float price;


}
