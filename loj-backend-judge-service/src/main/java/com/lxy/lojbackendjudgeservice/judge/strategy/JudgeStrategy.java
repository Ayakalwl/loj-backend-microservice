package com.lxy.lojbackendjudgeservice.judge.strategy;


import com.lxy.lojbackendmodel.model.codesandbox.JudgeInfo;

public interface JudgeStrategy {

    /**
     * 执行判题
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext);
}