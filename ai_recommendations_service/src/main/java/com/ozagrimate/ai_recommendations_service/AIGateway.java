package com.ozagrimate.ai_recommendations_service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ai-recommendations")
public class AIGateway {
    AIRecommendationsChat aiRecommendationsChat;

    public AIGateway() {
        aiRecommendationsChat = new AIRecommendationsChat();
    }

    @GetMapping("/recommendation")
    public ResponseEntity <AIRecommendation> getRecommendation(@RequestBody AIPrompt aiPrompt) {
        AIRecommendation aiRecommendation = aiRecommendationsChat.getDummyAIRecommendation(aiPrompt);
        return ResponseEntity.ok(aiRecommendation);
    }
}
