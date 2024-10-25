package com.cms.pojo;

import lombok.Data;

import java.time.LocalDate;


/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:20
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Installation {

    private Integer cableID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate installationDate;
    private String operator1;
    private String operator2;
    private String operator3;


}
