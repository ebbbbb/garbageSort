package cn.lxsir.uniapp.service;

import cn.lxsir.uniapp.entity.QuestionBank;
import cn.lxsir.uniapp.entity.SpeechClassify;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 语音识别记录 服务类
 * </p>
 *
 */
public interface SpeechClassifyService extends IService<SpeechClassify> {

    void speechHandle(String fileName, String speechResult, List<QuestionBank> list, String speechStr, QuestionBank questionBankOne);
}
