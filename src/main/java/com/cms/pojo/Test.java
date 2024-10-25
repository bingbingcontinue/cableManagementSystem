package com.cms.pojo;

import lombok.Data;

import java.time.LocalDate;

/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:33
 */
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {
//    private enum resultenum{pass,fail};
    private Integer cableID;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate testdate;
    private String testresult;
    private String description;
    private String operator1;
    private String operator2;
    private String operator3;

}
