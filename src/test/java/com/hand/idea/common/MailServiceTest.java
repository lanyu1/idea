package com.hand.idea.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

/**
 * Created by yuLan on 2018/1/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MailServiceTest {
    @Autowired
    private MailService mailService;
    @Autowired
    private TemplateEngine templateEngine;
    @Test
    public void testSimpleMail() throws Exception {
        mailService.sendSimpleMail("ly1563274504@163.com","测试邮件"," 你好");
    }
    @Test
    public void sendTemplateMail() {
        //创建邮件正文
        Context context = new Context();
        context.setVariable("id", "1");
        String emailContent = templateEngine.process("sendEmail", context);
        mailService.sendHtmlMail("ly1563274504@163.com","主题：这是模板邮件",emailContent);
    }
}
