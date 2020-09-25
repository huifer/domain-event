package com.github.huifer.domain.event.sb.entity;

import org.junit.Assert;
import org.junit.Test;

public class UserEntityTest {


	@Test
	public void create() {
		UserEntity demo = UserEntity.Create("demo");
		Assert.assertEquals(1, demo.getEvents().size());
		UserEntity update_name = demo.update("update name");
		Assert.assertEquals(1, update_name.getEvents().size());
	}

}