package io.javaJamil.springBootLearning.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("1", "Java framework", "Java framework description"),
            new Topic("2", "Node framework", "Node framework description"),
            new Topic("3", "React framework", "React framework description")
    ));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public Topic addTopic(Topic topic) {
        topics.add(topic);
        return topic;
    }

    public Topic updateTopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                break;
            }
        }
        return topic;
    }

    public List<Topic> deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equals(id));
        return topics;
    }
}
