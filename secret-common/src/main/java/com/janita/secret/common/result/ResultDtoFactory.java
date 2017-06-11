package com.janita.secret.common.result;

import com.janita.secret.common.enums.ResultEnum;

/**
 * Created by Janita on 2017/6/11- 15:22
 * 该类是:
 */
@SuppressWarnings("unchecked")
public class ResultDtoFactory {

    /**
     * 返回正确结果
     * @param data 数据
     * @param <T>   数据
     * @return  dto
     */
    public static <T> ResultDto toSuccess(T data) {
        ResultDto resultDto = new ResultDto<>();
        resultDto.setCode(0);
        resultDto.setMessage("success");
        resultDto.setData(data);

        return resultDto;
    }

    /**
     * 统一返回业务异常dto
     * @param resultEnum    dto中的数据
     * @return  dto
     */
    public static ResultDto toError(ResultEnum resultEnum) {
        ResultDto resultDto = new ResultDto<>();
        resultDto.setCode(resultEnum.getCode());
        resultDto.setMessage(resultEnum.getMessage());
        return resultDto;
    }
}
