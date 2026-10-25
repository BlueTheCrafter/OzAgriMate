package com.ozagrimate.ai_recommendations_service;

import java.util.Random;
public class AIRecommendationsChat {
    private AIRecommendation aiRecommendation;

    public AIRecommendation getDummyAIRecommendation(AIPrompt aiPrompt) {
        aiRecommendation = new AIRecommendation();
        aiRecommendation.setTimestamp("25-10-2026");
        aiRecommendation.setRecommendation("Wheat fields generally need to be watered every 10-15 days, however this can change with soil conditions.");
        aiRecommendation.setUserId(new Random().nextInt(20));
        return aiRecommendation;
    }


}
