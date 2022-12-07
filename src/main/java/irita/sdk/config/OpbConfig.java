package irita.sdk.config;

import io.grpc.netty.shaded.io.netty.handler.ssl.SslProvider;

public class OpbConfig {
    private  String projectID;
    private  String projectKey;
    private  String chainAccountAddr;
    private  String apiKey;
    private  String apiChainType;

    private boolean enableTLS;
    private SslProvider sslProvider;

    public OpbConfig(String projectID, String projectKey, String chainAccountAddr) {
        this.projectID = projectID;
        this.projectKey = projectKey;
        this.chainAccountAddr = chainAccountAddr;
    }

    public OpbConfig(String apiKey, String apiChainType) {
        this.apiKey = apiKey;
        this.apiChainType = apiChainType;
    }

    public String getProjectID() {
        return projectID;
    }

    public String getProjectKey() {
        return projectKey;
    }

    public String getChainAccountAddr() {
        return chainAccountAddr;
    }

    public boolean isEnableTLS() {
        return enableTLS;
    }

    public void setRequireTransportSecurity(boolean enabled) {
        this.enableTLS = enabled;
    }

    public void setEnableTLS(boolean enableTLS) {
        this.enableTLS = enableTLS;
    }

    public SslProvider getSslProvider() {
        return sslProvider;
    }

    public void setSslProvider(SslProvider sslProvider) {
        this.sslProvider = sslProvider;
    }

    public String getApiKey() {
        return apiKey;
    }

    public String getApiChainType() {
        return apiChainType;
    }
}
