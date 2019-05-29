
package com.fh.service.personmanager;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.fh.service.personmanager package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DetailById_QNAME = new QName("http://personmanager.service.fh.com/", "detailById");
    private final static QName _DetailByIdResponse_QNAME = new QName("http://personmanager.service.fh.com/", "detailByIdResponse");
    private final static QName _ListByUnitCode_QNAME = new QName("http://personmanager.service.fh.com/", "listByUnitCode");
    private final static QName _ListByUnitCodeResponse_QNAME = new QName("http://personmanager.service.fh.com/", "listByUnitCodeResponse");
    private final static QName _ServiceException_QNAME = new QName("http://personmanager.service.fh.com/", "ServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.fh.service.personmanager
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DetailById }
     * 
     */
    public DetailById createDetailById() {
        return new DetailById();
    }

    /**
     * Create an instance of {@link DetailByIdResponse }
     * 
     */
    public DetailByIdResponse createDetailByIdResponse() {
        return new DetailByIdResponse();
    }

    /**
     * Create an instance of {@link ListByUnitCode }
     * 
     */
    public ListByUnitCode createListByUnitCode() {
        return new ListByUnitCode();
    }

    /**
     * Create an instance of {@link ListByUnitCodeResponse }
     * 
     */
    public ListByUnitCodeResponse createListByUnitCodeResponse() {
        return new ListByUnitCodeResponse();
    }

    /**
     * Create an instance of {@link ServiceException }
     * 
     */
    public ServiceException createServiceException() {
        return new ServiceException();
    }

    /**
     * Create an instance of {@link UserVo }
     * 
     */
    public UserVo createUserVo() {
        return new UserVo();
    }

    /**
     * Create an instance of {@link UserTypeVo }
     * 
     */
    public UserTypeVo createUserTypeVo() {
        return new UserTypeVo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personmanager.service.fh.com/", name = "detailById")
    public JAXBElement<DetailById> createDetailById(DetailById value) {
        return new JAXBElement<DetailById>(_DetailById_QNAME, DetailById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personmanager.service.fh.com/", name = "detailByIdResponse")
    public JAXBElement<DetailByIdResponse> createDetailByIdResponse(DetailByIdResponse value) {
        return new JAXBElement<DetailByIdResponse>(_DetailByIdResponse_QNAME, DetailByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByUnitCode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personmanager.service.fh.com/", name = "listByUnitCode")
    public JAXBElement<ListByUnitCode> createListByUnitCode(ListByUnitCode value) {
        return new JAXBElement<ListByUnitCode>(_ListByUnitCode_QNAME, ListByUnitCode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListByUnitCodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personmanager.service.fh.com/", name = "listByUnitCodeResponse")
    public JAXBElement<ListByUnitCodeResponse> createListByUnitCodeResponse(ListByUnitCodeResponse value) {
        return new JAXBElement<ListByUnitCodeResponse>(_ListByUnitCodeResponse_QNAME, ListByUnitCodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://personmanager.service.fh.com/", name = "ServiceException")
    public JAXBElement<ServiceException> createServiceException(ServiceException value) {
        return new JAXBElement<ServiceException>(_ServiceException_QNAME, ServiceException.class, null, value);
    }

}
