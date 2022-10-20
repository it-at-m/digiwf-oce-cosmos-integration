package io.muenchendigital.digiwf.ocecosmos.integration.api.mapper;

import io.muenchendigital.digiwf.ocecosmos.integration.api.dto.request.TemplateJobRequestDto;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DataTypes;
import io.muenchendigital.digiwf.ocecosmos.integration.model.request.DeliveryTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;

public class OceCosmosMapperTest {

    private static final String CLIENT_ID = "TEST-ID";
    private OceCosmosMapper mapper;

    @BeforeEach
    public void init() {
        mapper = Mappers.getMapper(OceCosmosMapper.class);
        mapper.setClientId(CLIENT_ID);
    }

    @Test
    public void allFieldsTest() {
        var dto = getPrefilledDto();

        var request = mapper.dto2Model(dto);

        assertThat(request.getJobType(), is(dto.getJobType()));
        assertThat(request.getTemplateName(), is(dto.getTemplateName()));
        assertThat(request.getDeliveryType(), is(dto.getDeliveryType()));
        assertThat(request.getDataType(), is(dto.getDataType()));
        assertThat(request.getApplicationName(), is(dto.getApplicationName()));
        assertThat(request.getDebtor(), is(dto.getDebtor()));
        assertThat(request.getEmail(), is(dto.getEmail()));
        assertThat(request.getPickupLocation(), is(dto.getPickupLocation()));
        assertThat(request.isPrintJob(), is(dto.getPrintJob()));
        assertThat(request.isMailJob(), is(dto.getMailJob()));
        assertThat(request.isArchiveJob(), is(dto.getArchiveJob()));
        assertThat(request.getFileName(), is(dto.getFileName()));
        assertThat(request.getFile(), nullValue());
        assertThat(request.getUserId(), is(dto.getUserId()));
        assertThat(request.getHostName(), is(dto.getHostName()));
    }

    @Test
    public void allDefaultFieldsTest() {
        var dto = TemplateJobRequestDto.builder().build();

        var appNameDefault = "appNameDefault";
        var jobTypeDefault = "jobTypeDefault";
        var debtorDefault = "debtorDefault";
        var printJobDefault = false;
        var mailJobDefault = false;
        var archiveJobDefault = false;
        var hostNameDefault = "hostNameDefault";
        var userIdDefault = "userIdDefault";
        var dataTypeDefault = DataTypes.CSV;

        mapper.setApplicationNameDefault(appNameDefault);
        mapper.setJobTypeDefault(jobTypeDefault);
        mapper.setDebtorDefault(debtorDefault);
        mapper.setPrintJobDefault(printJobDefault);
        mapper.setMailJobDefault(mailJobDefault);
        mapper.setArchiveJobDefault(archiveJobDefault);
        mapper.setHostNameDefault(hostNameDefault);
        mapper.setUserIdDefault(userIdDefault);
        mapper.setDataTypeDefault(dataTypeDefault);

        var request = mapper.dto2Model(dto);

        assertThat(request.getApplicationName(), is(appNameDefault));
        assertThat(request.getJobType(), is(jobTypeDefault));
        assertThat(request.getDebtor(), is(debtorDefault));
        assertThat(request.isPrintJob(), is(printJobDefault));
        assertThat(request.isMailJob(), is(mailJobDefault));
        assertThat(request.isArchiveJob(), is(archiveJobDefault));
        assertThat(request.getHostName(), is(hostNameDefault));
        assertThat(request.getUserId(), is(userIdDefault));
        assertThat(request.getDataType(), is(dataTypeDefault));

    }

    private TemplateJobRequestDto getPrefilledDto() {
        return TemplateJobRequestDto.builder()
                .applicationName("Test-App")
                .templateName("test-template")
                .jobType("SAMMELJOB")
                .deliveryType(DeliveryTypes.DIENSTVERSAND)
                .dataType(DataTypes.JSON)
                .debtor("testdebtor")
                .email("test@test.de")
                .mailJob(true)
                .printJob(true)
                .archiveJob(true)
                .pickupLocation("test-location")
                .fileName("test.json")
                .file("{\"test\" : \"testvalue\"}".getBytes())
                .build();
    }


}
