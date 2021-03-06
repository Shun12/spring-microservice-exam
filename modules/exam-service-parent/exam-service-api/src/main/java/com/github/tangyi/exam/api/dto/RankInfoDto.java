package com.github.tangyi.exam.api.dto;

import lombok.Data;

/**
 * 排名详情
 * @author tangyi
 * @date 2019/12/8 23:33
 */
@Data
public class RankInfoDto {

	private Long userId;

	/**
	 * 姓名
	 */
	private String name;

	/**
	 * 头像地址
	 */
	private String avatarUrl;

	/**
	 * 分数
	 */
	private Double score;

	/**
	 * 排名
	 */
	private Integer rankNum;

}
