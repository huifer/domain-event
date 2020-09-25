package com.github.huifer.domain.event.center.model;

import com.github.huifer.domain.event.common.model.register.RegisterParam;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class RegisterEntity {
	@MongoId
	private String id;

	private RegisterParam registerParam;
}
