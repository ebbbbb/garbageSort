package cn.lxsir.uniapp.service;

import cn.lxsir.uniapp.entity.QuestionBank;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.Map;

/**
 * <p>
 * 题库表 服务类
 * </p>
 *
 */
public interface QuestionBankService extends IService<QuestionBank> {

    Map<String,Object> searchQuestionByUniName(String name);

    Map<String,Object> uploadExcel(String filePath);


}
