package io.javaJamil.springBootLearning.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic("Spring", "Java framework", "Java framework description"),
                new Topic("Nest", "Node framework", "Node framework description"),
                new Topic("Next", "React framework", "React framework description")
        );
    }
}
