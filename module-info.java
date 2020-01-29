module CollegeApplication {
	exports com;
	exports com.service.impl;
	exports com.controller;
	exports com.dao.impl;
	exports com.dao;
	exports com.config;
	exports com.service;
	exports com.web;
	exports com.model;

	requires hibernate.jpa;
	requires javax.transaction.api;
	requires slf4j.api;
	requires spring.beans;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires spring.context;
	requires spring.core;
	requires spring.web;
	requires spring.webmvc;
	requires thymeleaf;
	requires thymeleaf.spring4;
	requires tomcat.embed.core;
	requires hibernate.core;
}