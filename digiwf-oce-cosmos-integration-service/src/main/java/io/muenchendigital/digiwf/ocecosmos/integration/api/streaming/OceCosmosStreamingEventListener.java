package io.muenchendigital.digiwf.ocecosmos.integration.api.streaming;

import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.OceCosmosEventDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.response.OceCosmosErrorDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.mapper.OceCosmosMapper;
import io.muenchendigital.digiwf.spring.cloudstream.utils.api.streaming.service.CorrelateMessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;

import java.util.Map;
import java.util.function.Consumer;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class OceCosmosStreamingEventListener {

    private static final String RESPONSE = "response";

    private final OceCosmosMapper OceCosmosMapper;

    private final CorrelateMessageService correlateMessageService;



}
