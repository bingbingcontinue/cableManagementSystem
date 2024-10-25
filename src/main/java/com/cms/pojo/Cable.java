package com.cms.pojo;

import java.time.LocalDate;
import java.util.List;

/**
 * @Author：bingfeng
 * @Date：2024/9/23 15:07
 */


import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cable {
//    private enum statusenum {normal,faulty,spare};

    private Integer cableID ;
    private String cablename;
    private String systemID;
    private String subsystemID;
    private String status;
    private String usage;
    private Integer uploadID;
    private Integer downloadID;
    private String position;
    private String description;
    private Integer batchnumber;
    private Integer drawingID;
    private Float length;
    private String lengthUnits;
    private String ownner;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate checkDate;
    //子表
    private List<Test> testInfo;
    private List<Maintenance> maintenanceList;
    private List<Installation> installationList;

    //父表
    private List<Interface> intfaceList;
    private List<Drawings> drawingsList;
    private List<Manufacture> manufacturesList;

}
