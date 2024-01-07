package com.Study.Service.Impl;

import com.Study.Service.MessageService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//It is a Advance messiging service and coming with AI powered smart features.
@Service
public class sprinAdvancedMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello this is an advance message.";
    }
}
//from developer branch
