/*
 * An XML document type.
 * Localname: buyStocks
 * Namespace: http://services.samples/xsd
 * Java type: samples.services.xsd.BuyStocksDocument
 *
 * Automatically generated - do not modify.
 */
package samples.services.xsd;


/**
 * A document containing one buyStocks(@http://services.samples/xsd) element.
 *
 * This is a complex type.
 */
public interface BuyStocksDocument extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuyStocksDocument.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s629D11655CF680B3DF8383C72F1AB281").resolveHandle("buystocksd7efdoctype");
    
    /**
     * Gets the "buyStocks" element
     */
    samples.services.xsd.BuyStocksDocument.BuyStocks getBuyStocks();
    
    /**
     * Sets the "buyStocks" element
     */
    void setBuyStocks(samples.services.xsd.BuyStocksDocument.BuyStocks buyStocks);
    
    /**
     * Appends and returns a new empty "buyStocks" element
     */
    samples.services.xsd.BuyStocksDocument.BuyStocks addNewBuyStocks();
    
    /**
     * An XML buyStocks(@http://services.samples/xsd).
     *
     * This is a complex type.
     */
    public interface BuyStocks extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(BuyStocks.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s629D11655CF680B3DF8383C72F1AB281").resolveHandle("buystocks399eelemtype");
        
        /**
         * Gets array of all "order" elements
         */
        samples.services.xsd.Order[] getOrderArray();
        
        /**
         * Gets ith "order" element
         */
        samples.services.xsd.Order getOrderArray(int i);
        
        /**
         * Returns number of "order" element
         */
        int sizeOfOrderArray();
        
        /**
         * Sets array of all "order" element
         */
        void setOrderArray(samples.services.xsd.Order[] orderArray);
        
        /**
         * Sets ith "order" element
         */
        void setOrderArray(int i, samples.services.xsd.Order order);
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order" element
         */
        samples.services.xsd.Order insertNewOrder(int i);
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order" element
         */
        samples.services.xsd.Order addNewOrder();
        
        /**
         * Removes the ith "order" element
         */
        void removeOrder(int i);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static samples.services.xsd.BuyStocksDocument.BuyStocks newInstance() {
              return (samples.services.xsd.BuyStocksDocument.BuyStocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static samples.services.xsd.BuyStocksDocument.BuyStocks newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (samples.services.xsd.BuyStocksDocument.BuyStocks) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static samples.services.xsd.BuyStocksDocument newInstance() {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static samples.services.xsd.BuyStocksDocument parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static samples.services.xsd.BuyStocksDocument parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static samples.services.xsd.BuyStocksDocument parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static samples.services.xsd.BuyStocksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static samples.services.xsd.BuyStocksDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (samples.services.xsd.BuyStocksDocument) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
