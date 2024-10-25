package com.cms.pojo;

import lombok.Data;



/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:25
 */


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Maintenance {
//    private enum statusenum {pending,in_progress,completed,closed};
    private Integer id;
    private Integer cableID;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime faultdate;
    private String faultDescription;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private LocalDateTime repairdate;
    private String repairDescription;
    private String operator1;
    private String operator2;
    private String operator3;
    private String status;
    private Float cost;
}
