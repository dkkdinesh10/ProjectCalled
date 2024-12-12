package com.project.caller.caller.config.Service;

import com.hazelcast.core.HazelcastInstance;
import com.project.caller.caller.config.HazelcastConfig;
import org.springframework.stereotype.Service;

@Service
public class SendService {

    public void sendMessage(String message){
        System.out.println("Sending message on hazelcast");
        HazelcastConfig.getClient().getQueue("my-queue").add(message);
    }
}
