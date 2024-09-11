//package com.example.kafka.config;
////
////import com.example.kafka.model.Order;
////import org.apache.kafka.streams.StreamsBuilder;
////import org.apache.kafka.streams.StreamsConfig;
////import org.apache.kafka.streams.kstream.KStream;
////import org.springframework.beans.factory.annotation.Value;
////import org.springframework.context.annotation.Bean;
////import org.springframework.context.annotation.Configuration;
////import org.springframework.kafka.annotation.EnableKafkaStreams;
////import org.springframework.kafka.support.serializer.JsonSerde;
////
////import java.util.Properties;
////
////@Configuration
////@EnableKafkaStreams
////public class KafkaStreamsConfig {
////
////    @Value("${kafka.bootstrap-servers}")
////    private String bootstrapServers;
////
////    @Bean
////    public Properties streamsConfig() {
////        Properties props = new Properties();
////        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "order-processing-app");
////        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
////        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, JsonSerde.class.getName());
////        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, JsonSerde.class.getName());
////        return props;
////    }
////
////    @Bean
////    public KStream<String, Order> kStream(StreamsBuilder streamsBuilder) {
////        KStream<String, Order> orderStream = streamsBuilder.stream("raw-order-topic");
////
////        orderStream.to("raw-order-topic");
////
////        KStream<String, Order> processedOrderStream = orderStream.mapValues(order -> {
////            double totalAmount = order.getItems().stream()
////                    .mapToDouble(item -> item.getPrice() * item.getQuantity())
////                    .sum();
////            order.setAmount(totalAmount);
////            return order;
////        });
////
////        processedOrderStream.to("processed-order-topic");
////
////        return processedOrderStream;
////    }
////}
////
////
////
//
//
//
//import com.example.kafka.model.Order;
//import org.apache.kafka.common.serialization.Serdes;
//import org.apache.kafka.streams.StreamsBuilder;
//import org.apache.kafka.streams.StreamsConfig;
//import org.apache.kafka.streams.kstream.Consumed;
//import org.apache.kafka.streams.kstream.KStream;
//import org.apache.kafka.streams.kstream.Produced;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.annotation.EnableKafkaStreams;
//import org.springframework.kafka.support.serializer.JsonSerde;
//
//import java.util.Properties;
//
//@Configuration
//@EnableKafkaStreams
//public class KafkaStreamsConfig {
//
//    @Value("${kafka.bootstrap-servers}")
//    private String bootstrapServers;
//
//    @Bean
//    public Properties streamsConfig() {
//        Properties props = new Properties();
//        props.put(StreamsConfig.APPLICATION_ID_CONFIG, "order-processing-app");
//        props.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        props.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
//        props.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, JsonSerde.class.getName());
//        return props;
//    }
//
////
//
//
//    @Bean
//    public KStream<String, Order> kStream(StreamsBuilder streamsBuilder) {
//        JsonSerde<Order> orderSerde = new JsonSerde<>(Order.class);
//
//        // Define the stream processing logic
//        KStream<String, Order> orderStream = streamsBuilder.stream(
//                "raw-order-topic",
//                Consumed.with(Serdes.String(), orderSerde)
//        );
//
//        // Process the stream
//        KStream<String, Order> processedOrderStream = orderStream.mapValues(order -> {
//            double totalAmount = order.getItems().stream()
//                    .mapToDouble(item -> item.getPrice() * item.getQuantity())
//                    .sum();
//            order.setAmount(totalAmount); // Assuming totalAmount is the correct field to set
//            return order;
//        });
//
//        // Output the processed stream to another topic
//        processedOrderStream.to("processed-order-topic", Produced.with(Serdes.String(), orderSerde));
//
//        return processedOrderStream;
//    }
//
//}
//
