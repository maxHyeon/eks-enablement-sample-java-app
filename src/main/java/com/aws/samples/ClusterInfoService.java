package com.aws.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.eks.EksClient;
import software.amazon.awssdk.services.eks.model.EksException;
import software.amazon.awssdk.services.eks.model.ListClustersRequest;

import java.util.List;

@Service
public class ClusterInfoService {
    @Autowired
    private EksClient eksClient;

    public List<String> listClusters() {
        try {
            ListClustersRequest request = ListClustersRequest.builder().build();
            return eksClient.listClusters(request).clusters();
        } catch (EksException e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            throw e;
        }
    }
}
