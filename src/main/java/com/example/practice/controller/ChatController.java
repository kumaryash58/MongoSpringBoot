package com.example.practice.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@RestController
@RequestMapping("/api/chat")
//@CrossOrigin(origins = "http://localhost:4200") // Allow frontend access
public class ChatController {

	private final String LOCAL_AI_URL = "http://127.0.0.1:5005/chat"; // Your local AI server

	@PostMapping
	public ResponseEntity<String> chatWithAI(@RequestBody Map<String, String> request) {
		String userMessage = request.get("message");

		// Prepare request body
		Map<String, String> requestBody = new HashMap<>();
		requestBody.put("message", userMessage);

		// Set headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		// Make the request to the local AI server
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Map<String, String>> entity = new HttpEntity<>(requestBody, headers);
		ResponseEntity<String> response = restTemplate.exchange(LOCAL_AI_URL, HttpMethod.POST, entity, String.class);

		return ResponseEntity.ok(response.getBody());
	}
}