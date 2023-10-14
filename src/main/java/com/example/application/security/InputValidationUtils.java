```java
package com.example.application.security;

import org.springframework.util.StringUtils;

public class InputValidationUtils {

    public static boolean isValidInput(String input) {
        return !StringUtils.isEmpty(input);
    }

    public static String sanitizeInput(String input) {
        if (StringUtils.isEmpty(input)) {
            return "";
        }
        return input.trim();
    }
}
```