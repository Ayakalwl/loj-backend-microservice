package com.lxy.lojbackendjudgeservice.judge.codesandbox;


import com.lxy.lojbackendmodel.model.codesandbox.ExecuteCodeRequest;
import com.lxy.lojbackendmodel.model.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {
    /**
     * 通用接口方法
     *
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}