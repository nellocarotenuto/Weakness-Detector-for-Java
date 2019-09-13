// =================== DO NOT EDIT THIS FILE ====================
// Generated by Modello 1.9.1,
// any modifications will be overwritten.
// ==============================================================

package org.apache.maven.profiles;

/**
 * 
 *         This is the property specification used to activate a
 * profile. If the value field is empty,
 *         then the existence of the named property will activate
 * the profile, otherwise it does a case-sensitive
 *         match against the property value as well.
 *       
 * 
 * @version $Revision$ $Date$
 */
@SuppressWarnings( "all" )
public class ActivationProperty
    implements java.io.Serializable
{

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * The name of the property to be used to activate a profile.
     */
    private String name;

    /**
     * The value of the property to be used to activate a profile.
     */
    private String value;


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Get the name of the property to be used to activate a
     * profile.
     * 
     * @return String
     */
    public String getName()
    {
        return this.name;
    } //-- String getName()

    /**
     * Get the value of the property to be used to activate a
     * profile.
     * 
     * @return String
     */
    public String getValue()
    {
        return this.value;
    } //-- String getValue()

    /**
     * Set the name of the property to be used to activate a
     * profile.
     * 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    } //-- void setName( String )

    /**
     * Set the value of the property to be used to activate a
     * profile.
     * 
     * @param value
     */
    public void setValue( String value )
    {
        this.value = value;
    } //-- void setValue( String )

}
