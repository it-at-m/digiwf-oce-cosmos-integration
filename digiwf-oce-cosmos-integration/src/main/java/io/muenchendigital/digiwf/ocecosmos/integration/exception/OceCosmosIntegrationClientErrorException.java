package io.muenchendigital.digiwf.ocecosmos.integration.exception;

public class OceCosmosIntegrationClientErrorException extends Exception {

    public OceCosmosIntegrationClientErrorException(final String message, final Exception exception) {
        super(message, exception);
    }

}
