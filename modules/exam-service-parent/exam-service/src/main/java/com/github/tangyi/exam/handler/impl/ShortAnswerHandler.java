package com.github.tangyi.exam.handler.impl;

import com.github.tangyi.exam.api.dto.SubjectDto;
import com.github.tangyi.exam.api.module.Answer;
import com.github.tangyi.exam.enums.SubjectTypeEnum;
import com.github.tangyi.exam.handler.AbstractAnswerHandler;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 简答题
 * @author tangyi
 * @date 2019/12/8 22:00
 */
@Slf4j
@AllArgsConstructor
@Component
public class ShortAnswerHandler extends AbstractAnswerHandler {

	@Override
	public SubjectTypeEnum getSubjectType() {
		return SubjectTypeEnum.SHORT_ANSWER;
	}

	@Override
	public List<SubjectDto> getSubjects(List<Answer> answers) {
		return null;
	}

	@Override
	public void judge(Answer answer, SubjectDto subject, List<Double> rightScore) {
		// TODO
	}
}
