package com.hogwartstest.aitestmini.service;

import com.hogwartstest.aitestmini.dto.PageTableRequest;
import com.hogwartstest.aitestmini.dto.PageTableResponse;
import com.hogwartstest.aitestmini.dto.ResultDto;
import com.hogwartstest.aitestmini.dto.testcase.QueryHogwartsTestCaseListDto;
import com.hogwartstest.aitestmini.dto.testcase.SaveTestCaseListDto;
import com.hogwartstest.aitestmini.entity.HogwartsTestCase;

public interface HogwartsTestCaseService {

	/**
	 *  批量新增测试用例
	 * @param saveTestCaseListDto
	 * @return
	 */
	ResultDto saveList(SaveTestCaseListDto saveTestCaseListDto);

	/**
	 *  删除测试用例信息
	 * @param caseId
	 * @param createUserId
	 * @return
	 */
	ResultDto<HogwartsTestCase> delete(Integer caseId,Integer createUserId);

	/**
	 *  修改测试用例信息
	 * @param hogwartsTestCase
	 * @return
	 */
	ResultDto<HogwartsTestCase> update(HogwartsTestCase hogwartsTestCase);

	/**
	 *  根据id查询测试用例
	 * @param jenkinsId
	 * @param createUserId
	 * @return
	 */
	ResultDto<HogwartsTestCase> getById(Integer caseId,Integer createUserId);

	/**
	 *  查询Jenkins信息列表
	 * @param pageTableRequest
	 * @return
	 */
	ResultDto<PageTableResponse<HogwartsTestCase>> list(PageTableRequest<QueryHogwartsTestCaseListDto> pageTableRequest);

}