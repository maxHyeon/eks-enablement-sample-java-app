package com.aws.samples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.eks.EksClient;
import software.amazon.awssdk.services.sts.StsClient;

@Configuration
public class AWSClientConfiguration {
    @Value("${cloud.aws.region}")
    private String region;

    @Bean
    public EksClient amazonEKS() {
        return EksClient.builder()
                .region(Region.of(region))
                .build();
    }
    @Bean
    public StsClient amazonSTS() {
        return StsClient.builder()
                .region(Region.of(region))
                .build();
    }
}
