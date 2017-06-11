package com.janita.secret.common.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by Janita on 2017/6/11- 16:01
 * 该类是:用户密保问题及答案
 */
@Data
public class QuestionAnswer implements Serializable{

    private String questionId;

    private String userId;

    private String question;

    //MD5
    private String answer;

    private Long createTime;

    private Long updateTime;
}
