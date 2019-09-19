/*
 * An XML document type.
 * Localname: buyStocks
 * Namespace: http://services.samples/xsd
 * Java type: samples.services.xsd.BuyStocksDocument
 *
 * Automatically generated - do not modify.
 */
package samples.services.xsd.impl;
/**
 * A document containing one buyStocks(@http://services.samples/xsd) element.
 *
 * This is a complex type.
 */
public class BuyStocksDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements samples.services.xsd.BuyStocksDocument
{
    private static final long serialVersionUID = 1L;
    
    public BuyStocksDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUYSTOCKS$0 = 
        new javax.xml.namespace.QName("http://services.samples/xsd", "buyStocks");
    
    
    /**
     * Gets the "buyStocks" element
     */
    public samples.services.xsd.BuyStocksDocument.BuyStocks getBuyStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            samples.services.xsd.BuyStocksDocument.BuyStocks target = null;
            target = (samples.services.xsd.BuyStocksDocument.BuyStocks)get_store().find_element_user(BUYSTOCKS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "buyStocks" element
     */
    public void setBuyStocks(samples.services.xsd.BuyStocksDocument.BuyStocks buyStocks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            samples.services.xsd.BuyStocksDocument.BuyStocks target = null;
            target = (samples.services.xsd.BuyStocksDocument.BuyStocks)get_store().find_element_user(BUYSTOCKS$0, 0);
            if (target == null)
            {
                target = (samples.services.xsd.BuyStocksDocument.BuyStocks)get_store().add_element_user(BUYSTOCKS$0);
            }
            target.set(buyStocks);
        }
    }
    
    /**
     * Appends and returns a new empty "buyStocks" element
     */
    public samples.services.xsd.BuyStocksDocument.BuyStocks addNewBuyStocks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            samples.services.xsd.BuyStocksDocument.BuyStocks target = null;
            target = (samples.services.xsd.BuyStocksDocument.BuyStocks)get_store().add_element_user(BUYSTOCKS$0);
            return target;
        }
    }
    /**
     * An XML buyStocks(@http://services.samples/xsd).
     *
     * This is a complex type.
     */
    public static class BuyStocksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements samples.services.xsd.BuyStocksDocument.BuyStocks
    {
        private static final long serialVersionUID = 1L;
        
        public BuyStocksImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName ORDER$0 = 
            new javax.xml.namespace.QName("", "order");
        
        
        /**
         * Gets array of all "order" elements
         */
        public samples.services.xsd.Order[] getOrderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(ORDER$0, targetList);
                samples.services.xsd.Order[] result = new samples.services.xsd.Order[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "order" element
         */
        public samples.services.xsd.Order getOrderArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                samples.services.xsd.Order target = null;
                target = (samples.services.xsd.Order)get_store().find_element_user(ORDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "order" element
         */
        public int sizeOfOrderArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(ORDER$0);
            }
        }
        
        /**
         * Sets array of all "order" element
         */
        public void setOrderArray(samples.services.xsd.Order[] orderArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(orderArray, ORDER$0);
            }
        }
        
        /**
         * Sets ith "order" element
         */
        public void setOrderArray(int i, samples.services.xsd.Order order)
        {
            synchronized (monitor())
            {
                check_orphaned();
                samples.services.xsd.Order target = null;
                target = (samples.services.xsd.Order)get_store().find_element_user(ORDER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(order);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "order" element
         */
        public samples.services.xsd.Order insertNewOrder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                samples.services.xsd.Order target = null;
                target = (samples.services.xsd.Order)get_store().insert_element_user(ORDER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "order" element
         */
        public samples.services.xsd.Order addNewOrder()
        {
            synchronized (monitor())
            {
                check_orphaned();
                samples.services.xsd.Order target = null;
                target = (samples.services.xsd.Order)get_store().add_element_user(ORDER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "order" element
         */
        public void removeOrder(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(ORDER$0, i);
            }
        }
    }
}
