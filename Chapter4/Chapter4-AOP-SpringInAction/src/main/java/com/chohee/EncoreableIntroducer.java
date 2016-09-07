package com.chohee;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by Chohee on 9/6/16.
 */

@Aspect
public class EncoreableIntroducer {

    @DeclareParents(value="com.chohee.Performance+", defaultImpl=DefaultEncorable.class)
    public static Encoreable encoreable;

}
