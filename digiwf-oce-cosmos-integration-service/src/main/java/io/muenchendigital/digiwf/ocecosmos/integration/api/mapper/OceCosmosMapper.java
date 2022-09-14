package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.configuration.MapstructConfiguration;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.CheckAdresseMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListAdressenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListAenderungenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.ListStrassenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenBundesweitDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenGeoMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.SearchAdressenMuenchenDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.StrassenIdDto;
import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.response.AddressDistancesDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.CheckAdresseMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListAdressenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListAenderungenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.ListStrassenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenBundesweitModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenGeoMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.SearchAdressenMuenchenModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.StrassenIdModel;
import io.muenchendigital.digiwf.ocecosmos.integration.model.response.AddressDistancesModel;
import org.mapstruct.Mapper;

@Mapper(config = MapstructConfiguration.class)
public interface OceCosmosMapper {

}
