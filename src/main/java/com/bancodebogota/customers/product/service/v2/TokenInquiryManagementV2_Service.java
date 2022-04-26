package com.bancodebogota.customers.product.service.v2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.5.1
 * 2022-03-24T11:00:08.056-05:00
 * Generated source version: 3.5.1
 *
 */
@WebServiceClient(name = "TokenInquiryManagementV2",
                  wsdlLocation = "file:/C:/Users/RentAdvisor/Documents/Igualte/Workspace/eclipse/DDTGA-TRANSVERSAL-TOKEN-INQUIRY-MANAGEMENT-PROXY/src/main/resources/wsdl/TokenInquiryManagementV2.wsdl",
                  targetNamespace = "urn://bancodebogota.com/customers/product/service/v2/")
public class TokenInquiryManagementV2_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn://bancodebogota.com/customers/product/service/v2/", "TokenInquiryManagementV2");
    public final static QName TokenInquiryManagementV2Port = new QName("urn://bancodebogota.com/customers/product/service/v2/", "TokenInquiryManagementV2Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/RentAdvisor/Documents/Igualte/Workspace/eclipse/DDTGA-TRANSVERSAL-TOKEN-INQUIRY-MANAGEMENT-PROXY/src/main/resources/wsdl/TokenInquiryManagementV2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(TokenInquiryManagementV2_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/RentAdvisor/Documents/Igualte/Workspace/eclipse/DDTGA-TRANSVERSAL-TOKEN-INQUIRY-MANAGEMENT-PROXY/src/main/resources/wsdl/TokenInquiryManagementV2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public TokenInquiryManagementV2_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public TokenInquiryManagementV2_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TokenInquiryManagementV2_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public TokenInquiryManagementV2_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public TokenInquiryManagementV2_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public TokenInquiryManagementV2_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns TokenInquiryManagementV2
     */
    @WebEndpoint(name = "TokenInquiryManagementV2Port")
    public TokenInquiryManagementV2 getTokenInquiryManagementV2Port() {
        return super.getPort(TokenInquiryManagementV2Port, TokenInquiryManagementV2.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TokenInquiryManagementV2
     */
    @WebEndpoint(name = "TokenInquiryManagementV2Port")
    public TokenInquiryManagementV2 getTokenInquiryManagementV2Port(WebServiceFeature... features) {
        return super.getPort(TokenInquiryManagementV2Port, TokenInquiryManagementV2.class, features);
    }

}
