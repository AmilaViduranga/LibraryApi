package com.library.Topics;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {
	
	@Autowired
	private TopicsService service;
	
	@RequestMapping("/topics")
	public List<TopicsModel> getAll() {
		return service.getTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public TopicsModel getTopic(@PathVariable int id) {
		return service.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method=RequestMethod.POST)
	public void add(@RequestBody TopicsModel topic) {
		this.service.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.PUT)
	public void update(@RequestBody TopicsModel topic, @PathVariable int id) {
		this.service.updateTopic(topic, id);
	}
	
	@RequestMapping(value="/topics/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		this.service.deleteTopic(id);
	}
}
