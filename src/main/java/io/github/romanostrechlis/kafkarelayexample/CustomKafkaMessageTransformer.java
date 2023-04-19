package io.github.romanostrechlis.kafkarelayexample;

import io.github.romanostrechlis.kafkarelay.transform.ITransformKafkaMessage;

public class CustomKafkaMessageTransformer implements ITransformKafkaMessage {

    @Override
    public String transformToA(String messageFromB) {
        return messageFromB + "__transformed_to_fit_cluster_A";
    }

    @Override
    public String transformToB(String messageFromA) {
        return messageFromA + "__transformed_to_fit_cluster_B";
    }
}
