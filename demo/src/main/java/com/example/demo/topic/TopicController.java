package com.example.demo.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;
    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getTopics();
    }
    @RequestMapping("/topic/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST ,value="/topics")
    public void addTopic(@RequestBody Topic topic){
       topicService.addTopic(topic);
    }
    @RequestMapping(method = RequestMethod.PUT, value="/topic/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        topicService.updateTopic(topic,id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topic/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }
}
