package com.cms.pojo;

import lombok.Data;

import java.time.LocalDate;


/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:17
 */

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drawings {

      private Integer drawingID;
      private String drawingVersion;
      @DateTimeFormat(pattern = "yyyy-MM-dd")
      private LocalDate drawingdate;
      private String drawingname;
      private String createby;
      private String filepath;
      private String filetype;

}
