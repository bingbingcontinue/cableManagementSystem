package com.cms.pojo;

import lombok.Data;

/**
 * @Author：bingfeng
 * @Date：2024/9/23 19:22
 */
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Interface {
//    private enum statusenum {normal,faulty,spare};
    private String interfaceID;
    private String interfaceTYpe;
    private String status;
    private String deviceID;
    private String position;


}
