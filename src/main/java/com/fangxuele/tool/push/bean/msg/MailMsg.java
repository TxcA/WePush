package com.fangxuele.tool.push.bean.msg;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.File;
import java.util.List;

/**
 * <pre>
 * 邮件消息体
 * </pre>
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2019/6/23.
 */
@Getter
@Setter
@ToString
public class MailMsg {

    /**
     * 标题
     */
    private String mailTitle;

    /**
     * 抄送
     */
    private String mailCc;

    /**
     * 附件
     */
    private List<File> mailFiles;

    /**
     * 内容
     */
    private String mailContent;

}
