package io.javaJamil.springBootLearning.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = Arrays.asList(
            new Topic("1", "Java framework", "Java framework description"),
            new Topic("2", "Node framework", "Node framework description"),
            new Topic("3", "React framework", "React framework description")
    );

    public List<Topic> getAllTopics() {
        return topics;
    }
}
