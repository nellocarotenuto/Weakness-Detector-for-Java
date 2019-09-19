/*
 * XML Type:  order
 * Namespace: http://services.samples/xsd
 * Java type: samples.services.xsd.Order
 *
 * Automatically generated - do not modify.
 */
package samples.services.xsd;


/**
 * An XML order(@http://services.samples/xsd).
 *
 * This is a complex type.
 */
public interface Order extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Order.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s629D11655CF680B3DF8383C72F1AB281").resolveHandle("order7e0atype");
    
    /**
     * Gets the "symbol" element
     */
    java.lang.String getSymbol();
    
    /**
     * Gets (as xml) the "symbol" element
     */
    org.apache.xmlbeans.XmlString xgetSymbol();
    
    /**
     * Sets the "symbol" element
     */
    void setSymbol(java.lang.String symbol);
    
    /**
     * Sets (as xml) the "symbol" element
     */
    void xsetSymbol(org.apache.xmlbeans.XmlString symbol);
    
    /**
     * Gets the "buyerID" element
     */
    java.lang.String getBuyerID();
    
    /**
     * Gets (as xml) the "buyerID" element
     */
    org.apache.xmlbeans.XmlString xgetBuyerID();
    
    /**
     * Sets the "buyerID" element
     */
    void setBuyerID(java.lang.String buyerID);
    
    /**
     * Sets (as xml) the "buyerID" element
     */
    void xsetBuyerID(org.apache.xmlbeans.XmlString buyerID);
    
    /**
     * Gets the "price" element
     */
    double getPrice();
    
    /**
     * Gets (as xml) the "price" element
     */
    org.apache.xmlbeans.XmlDouble xgetPrice();
    
    /**
     * Sets the "price" element
     */
    void setPrice(double price);
    
    /**
     * Sets (as xml) the "price" element
     */
    void xsetPrice(org.apache.xmlbeans.XmlDouble price);
    
    /**
     * Gets the "volume" element
     */
    int getVolume();
    
    /**
     * Gets (as xml) the "volume" element
     */
    org.apache.xmlbeans.XmlInt xgetVolume();
    
    /**
     * Sets the "volume" element
     */
    void setVolume(int volume);
    
    /**
     * Sets (as xml) the "volume" element
     */
    void xsetVolume(org.apache.xmlbeans.XmlInt volume);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static samples.services.xsd.Order newInstance() {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static samples.services.xsd.Order newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static samples.services.xsd.Order parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static samples.services.xsd.Order parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static samples.services.xsd.Order parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static samples.services.xsd.Order parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static samples.services.xsd.Order parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static samples.services.xsd.Order parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static samples.services.xsd.Order parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static samples.services.xsd.Order parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static samples.services.xsd.Order parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static samples.services.xsd.Order parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static samples.services.xsd.Order parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static samples.services.xsd.Order parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static samples.services.xsd.Order parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static samples.services.xsd.Order parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static samples.services.xsd.Order parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static samples.services.xsd.Order parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (samples.services.xsd.Order) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
