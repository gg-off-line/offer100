package org.spring.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.internet.MimeMessage;

@RestController
public class MailController {
    @Autowired
    JavaMailSender mailSender;

    @RequestMapping("mail")
    public String sendEmail() {
        try {
//            final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
//            final MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom("1464315760@qq.com");
            message.setTo("2980047414@qq.com");
            message.setSubject("测试邮件主题");
            message.setText("测试邮件内容");
            mailSender.send(message);

            return "success";
        }
        catch(Exception ex) {
            System.out.println(ex);
            return "failure";
        }
    }
}
