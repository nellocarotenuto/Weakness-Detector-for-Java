/*
 * XML Type:  order
 * Namespace: http://services.samples/xsd
 * Java type: samples.services.xsd.Order
 *
 * Automatically generated - do not modify.
 */
package samples.services.xsd.impl;
/**
 * An XML order(@http://services.samples/xsd).
 *
 * This is a complex type.
 */
public class OrderImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements samples.services.xsd.Order
{
    private static final long serialVersionUID = 1L;
    
    public OrderImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SYMBOL$0 = 
        new javax.xml.namespace.QName("", "symbol");
    private static final javax.xml.namespace.QName BUYERID$2 = 
        new javax.xml.namespace.QName("", "buyerID");
    private static final javax.xml.namespace.QName PRICE$4 = 
        new javax.xml.namespace.QName("", "price");
    private static final javax.xml.namespace.QName VOLUME$6 = 
        new javax.xml.namespace.QName("", "volume");
    
    
    /**
     * Gets the "symbol" element
     */
    public java.lang.String getSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOL$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "symbol" element
     */
    public org.apache.xmlbeans.XmlString xgetSymbol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYMBOL$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "symbol" element
     */
    public void setSymbol(java.lang.String symbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SYMBOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SYMBOL$0);
            }
            target.setStringValue(symbol);
        }
    }
    
    /**
     * Sets (as xml) the "symbol" element
     */
    public void xsetSymbol(org.apache.xmlbeans.XmlString symbol)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SYMBOL$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SYMBOL$0);
            }
            target.set(symbol);
        }
    }
    
    /**
     * Gets the "buyerID" element
     */
    public java.lang.String getBuyerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUYERID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "buyerID" element
     */
    public org.apache.xmlbeans.XmlString xgetBuyerID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUYERID$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "buyerID" element
     */
    public void setBuyerID(java.lang.String buyerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BUYERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BUYERID$2);
            }
            target.setStringValue(buyerID);
        }
    }
    
    /**
     * Sets (as xml) the "buyerID" element
     */
    public void xsetBuyerID(org.apache.xmlbeans.XmlString buyerID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BUYERID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BUYERID$2);
            }
            target.set(buyerID);
        }
    }
    
    /**
     * Gets the "price" element
     */
    public double getPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "price" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPrice()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRICE$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "price" element
     */
    public void setPrice(double price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRICE$4);
            }
            target.setDoubleValue(price);
        }
    }
    
    /**
     * Sets (as xml) the "price" element
     */
    public void xsetPrice(org.apache.xmlbeans.XmlDouble price)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRICE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PRICE$4);
            }
            target.set(price);
        }
    }
    
    /**
     * Gets the "volume" element
     */
    public int getVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "volume" element
     */
    public org.apache.xmlbeans.XmlInt xgetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VOLUME$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "volume" element
     */
    public void setVolume(int volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUME$6);
            }
            target.setIntValue(volume);
        }
    }
    
    /**
     * Sets (as xml) the "volume" element
     */
    public void xsetVolume(org.apache.xmlbeans.XmlInt volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(VOLUME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(VOLUME$6);
            }
            target.set(volume);
        }
    }
}
