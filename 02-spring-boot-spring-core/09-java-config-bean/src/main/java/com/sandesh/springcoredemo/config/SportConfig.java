package com.sandesh.springcoredemo.config;

import com.sandesh.springcoredemo.common.Coach;
import com.sandesh.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Java-Based Configuration Class using @Configuration
 *
 * WHY USE @Configuration + @Bean instead of @Component?
 * ==================================================
 *
 * 1. EXPLICIT BEAN DEFINITION & CONTROL:
 *    - @Configuration provides explicit control over bean creation and lifecycle
 *    - You can see all beans defined in one place (centralized configuration)
 *    - Great for understanding app structure and dependencies
 *
 * 2. COMPLEX INITIALIZATION LOGIC:
 *    - Use @Bean when you need conditional logic, multiple constructors,
 *      or complex setup in the method body before returning the bean
 *    - @Component works with simple beans that use default constructor
 *
 * 3. THIRD-PARTY CLASSES:
 *    - @Bean is the ONLY way to configure external library classes
 *    - You can't add @Component to classes you don't own (e.g., from JAR dependencies)
 *    - Example: Configuring DataSource, RestTemplate, etc.
 *
 * 4. MULTIPLE IMPLEMENTATIONS:
 *    - You can create multiple beans of the same interface type
 *    - Each @Bean method returns a different implementation
 *    - With @Component, it's harder to manage multiple implementations
 *
 * 5. BEAN INTERDEPENDENCIES:
 *    - Beans can depend on other @Bean methods in the same class
 *    - Promotes loose coupling and easier testing
 *
 * 6. SEPARATION OF CONCERNS:
 *    - Config classes are separate from business logic
 *    - Makes code more organized and maintainable
 *    - Your domain classes stay focused on their responsibilities
 */

@Configuration
public class SportConfig {

    /**
     * Creates and registers a SwimCoach bean in the Spring container
     * Bean ID = "swimCoach" (method name becomes the default bean ID)
     * Type = Coach (interface/parent class - allows flexibility in implementation)
     *
     * @return A new instance of SwimCoach configured as a Spring bean
     */
    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
    /**
     * We can also give a custom bean ID by specifying it in the @Bean annotation
     * for example: @Bean("mySwimCoach")
     * */
}
