package com.Study.Service.Impl;


import com.Study.Service.MessageService;
import jakarta.persistence.Cacheable;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//FEATURE BRANCH MODIFICATION

@Service
public class SimpleMessageService implements MessageService {

    @Override
    public String getMessage() {
        return "Hello this is Simple Message.";
    }
}
