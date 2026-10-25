package com.ozagrimate.ai_recommendations_service;

public class AIRecommendation {
    private String timestamp;
    private String recommendation;
    private int userId;

    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getRecommendation() {
        return recommendation;
    }
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AIRecommendation{" +
                "timestamp=" + timestamp +
                ", recommendation=" + recommendation +
                ", userId=" + userId +
                '}';
    }
}
