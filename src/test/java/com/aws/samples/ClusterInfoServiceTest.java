package com.aws.samples;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class ClusterInfoServiceTest {
    @Autowired
    private ClusterInfoService clusterInfoService;

    @Autowired
    private AWSClientConfiguration awsClientConfiguration;

    @Test
    void listClusterTest() {
        List<String> clusters = Arrays.asList("cluster1", "cluster2", "education-eks-doRf42Xk", "test2");
        assertEquals(clusters, clusterInfoService.listClusters());
    }
}