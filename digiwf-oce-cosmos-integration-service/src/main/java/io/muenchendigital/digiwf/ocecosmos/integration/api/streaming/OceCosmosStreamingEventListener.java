package io.muenchendigital.digiwf.ocecosmos.integration.api.streaming;

import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.OceCosmosEventDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.CheckAdresseMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListAdressenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListAenderungenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListStrassenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenBundesweitDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenGeoMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.StrassenIdDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.response.AddressDistancesDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.response.OceCosmosErrorDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.mapper.OceCosmosMapper;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.AenderungResponse;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.BundesweiteAdresseResponse;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.MuenchenAdresse;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.MuenchenAdresseResponse;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.Strasse;
import io.muenchendigital.digiwf.ocecosmos.integration.gen.model.StrasseResponse;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.CheckAdresseMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListAdressenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListAenderungenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListStrassenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenBundesweitModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenGeoMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.StrassenIdModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.response.AddressDistancesModel;
import io.muenchendigital.digiwf.ocecosmos.integration.service.AdressenBundesweitService;
import io.muenchendigital.digiwf.ocecosmos.integration.service.AdressenMuenchenService;
import io.muenchendigital.digiwf.ocecosmos.integration.service.StrassenMuenchenService;
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
