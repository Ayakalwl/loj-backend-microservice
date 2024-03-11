package com.lxy.lojbackendjudgeservice.judge.strategy;

import com.lxy.lojbackendmodel.model.codesandbox.JudgeInfo;
import com.lxy.lojbackendmodel.model.dto.question.JudgeCase;
import com.lxy.lojbackendmodel.model.entity.Question;
import com.lxy.lojbackendmodel.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}