package com.seesaw.service;

import com.seesaw.model.Mail;

import java.util.Map;

public interface ThymeleafService {
    String createContent(String template, Mail variables);
}