package com.aws.samples;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CallerServiceTest {
    @Autowired
    private CallerService callerService;

    @Autowired
    private AWSClientConfiguration awsClientConfiguration;

    @Test
    void getCallerTest() {
        String arn = "arn:aws";
        assertThat(callerService.getCaller()).contains(arn);
    }
}