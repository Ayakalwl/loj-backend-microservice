package com.lxy.lojbackendjudgeservice.judge;

import com.lxy.lojbackendjudgeservice.judge.strategy.DefaultJudgeStrategy;
import com.lxy.lojbackendjudgeservice.judge.strategy.JavaLanguageJudgeStrategy;
import com.lxy.lojbackendjudgeservice.judge.strategy.JudgeContext;
import com.lxy.lojbackendjudgeservice.judge.strategy.JudgeStrategy;
import com.lxy.lojbackendmodel.model.codesandbox.JudgeInfo;
import com.lxy.lojbackendmodel.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}