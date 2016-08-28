package com.chohee;

import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Chohee on 8/27/16.
 */
public class MagicExistsCondition implements org.springframework.context.annotation.Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        return environment.containsProperty("magic"); //check for "magic" property

    }
}
