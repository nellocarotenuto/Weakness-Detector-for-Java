// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.model;

/**
 * Information about the issue tracking (or bug tracking) system
 * used to manage this
 *         project.
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class IssueManagement
    implements java.io.Serializable, java.lang.Cloneable, org.apache.maven.model.InputLocationTracker
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the issue management system, e.g. Bugzilla.
     */
    private String system;

    /**
     * URL for the issue management system used by the project.
     */
    private String url;

    /**
     * Field locations.
     */
    private java.util.Map<Object, InputLocation> locations;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method clone.
     * 
     * @return IssueManagement
     */
    public IssueManagement clone()
    {
        try
        {
            IssueManagement copy = (IssueManagement) super.clone();

            if ( copy.locations != null )
            {
                copy.locations = new java.util.LinkedHashMap( copy.locations );
            }

            return copy;
        }
        catch ( java.lang.Exception ex )
        {
            throw (java.lang.RuntimeException) new java.lang.UnsupportedOperationException( getClass().getName()
                + " does not support clone()" ).initCause( ex );
        }
    } //-- IssueManagement clone()

    /**
     * 
     * 
     * @param key
     * @return InputLocation
     */
    public InputLocation getLocation( Object key )
    {
        return ( locations != null ) ? locations.get( key ) : null;
    } //-- InputLocation getLocation( Object )

    /**
     * Get the name of the issue management system, e.g. Bugzilla.
     * 
     * @return String
     */
    public String getSystem()
    {
        return this.system;
    } //-- String getSystem()

    /**
     * Get uRL for the issue management system used by the project.
     * 
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    } //-- String getUrl()

    /**
     * 
     * 
     * @param key
     * @param location
     */
    public void setLocation( Object key, InputLocation location )
    {
        if ( location != null )
        {
            if ( this.locations == null )
            {
                this.locations = new java.util.LinkedHashMap<Object, InputLocation>();
            }
            this.locations.put( key, location );
        }
    } //-- void setLocation( Object, InputLocation )

    /**
     * Set the name of the issue management system, e.g. Bugzilla.
     * 
     * @param system
     */
    public void setSystem( String system )
    {
        this.system = system;
    } //-- void setSystem( String )

    /**
     * Set uRL for the issue management system used by the project.
     * 
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    } //-- void setUrl( String )

}
