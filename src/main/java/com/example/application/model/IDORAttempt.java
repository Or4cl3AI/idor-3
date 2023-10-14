```java
package com.example.application.model;

import java.time.LocalDateTime;

public class IDORAttempt {
    private String userId;
    private String resourceId;
    private LocalDateTime timestamp;

    public IDORAttempt(String userId, String resourceId, LocalDateTime timestamp) {
        this.userId = userId;
        this.resourceId = resourceId;
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
```