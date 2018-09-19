package com.cssl.pojo;

import lombok.Getter;
import lombok.Setter;

/**
 * @program: ideaWorkSpance2
 * @Date: 2018/8/12 12:58
 * @Author: 刘帅哥
 * @Description:
 */
@Getter
@Setter
public class errorInfo {
    private int errorId;
    private String errorTitle;
    private String errorFilePath;
    private int errorUserId;
}
