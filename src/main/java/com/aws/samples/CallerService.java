package com.aws.samples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.eks.model.EksException;
import software.amazon.awssdk.services.eks.model.ListClustersRequest;
import software.amazon.awssdk.services.sts.StsClient;
import software.amazon.awssdk.services.sts.model.GetCallerIdentityRequest;
import software.amazon.awssdk.services.sts.model.StsException;

import java.util.List;

@Service
public class CallerService {
    @Autowired
    private StsClient stsClient;

    public String getCaller() {
        try {
            GetCallerIdentityRequest request = GetCallerIdentityRequest.builder().build();
            return stsClient.getCallerIdentity(request).arn();
        } catch (StsException e) {
            System.err.println(e.awsErrorDetails().errorMessage());
            throw e;
        }
    }
}
