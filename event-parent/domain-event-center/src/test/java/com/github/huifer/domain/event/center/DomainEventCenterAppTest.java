package com.github.huifer.domain.event.center;

import java.util.HashMap;
import java.util.Map;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class DomainEventCenterAppTest {
	@Autowired
	private MongoTemplate mongoTemplate;

	@org.junit.Test
	public void main() {
		MongoCollection<Document> aaaa = mongoTemplate.createCollection("aaaa");
		Map<String, String> map = new HashMap<>();

		map.put("a", "1");
		mongoTemplate.save(map);
	}
}