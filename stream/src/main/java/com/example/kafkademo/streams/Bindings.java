package com.example.kafkademo.streams;

import io.confluent.developer.User;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;

interface Bindings {

    // TODO: change <student-id>-users-filtered
    String USERS_FILTERED = "ajit-users-filtered";

    // TODO: change <student-id>-users
    String USERS = "ajit-users";

    @Input(USERS)
    KStream<String, User> usersI();

    @Output(USERS_FILTERED)
    KStream<String, User> filteredUsers();
}