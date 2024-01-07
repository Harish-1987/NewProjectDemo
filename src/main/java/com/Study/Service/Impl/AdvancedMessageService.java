package com.Study.Service.Impl;

import com.Study.Service.MessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class sprinAdvancedMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello this is an advance message.";
    }
}
