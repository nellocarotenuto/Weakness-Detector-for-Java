
package org.apache.camel.component.linkedin.api.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import org.apache.camel.component.linkedin.api.LongAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.apache.camel.component.linkedin.api.model package. 
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

    private final static QName _Timestamp_QNAME = new QName("", "timestamp");
    private final static QName _ContentType_QNAME = new QName("", "content-type");
    private final static QName _Body_QNAME = new QName("", "body");
    private final static QName _AppId_QNAME = new QName("", "app-id");
    private final static QName _ErrorCode_QNAME = new QName("", "error-code");
    private final static QName _Message_QNAME = new QName("", "message");
    private final static QName _RequestId_QNAME = new QName("", "request-id");
    private final static QName _Id_QNAME = new QName("", "id");
    private final static QName _FirstName_QNAME = new QName("", "first-name");
    private final static QName _LastName_QNAME = new QName("", "last-name");
    private final static QName _Headline_QNAME = new QName("", "headline");
    private final static QName _Description_QNAME = new QName("", "description");
    private final static QName _IsHeadquarters_QNAME = new QName("", "is-headquarters");
    private final static QName _IsActive_QNAME = new QName("", "is-active");
    private final static QName _Street1_QNAME = new QName("", "street1");
    private final static QName _Street2_QNAME = new QName("", "street2");
    private final static QName _City_QNAME = new QName("", "city");
    private final static QName _State_QNAME = new QName("", "state");
    private final static QName _PostalCode_QNAME = new QName("", "postal-code");
    private final static QName _CountryCode_QNAME = new QName("", "country-code");
    private final static QName _RegionCode_QNAME = new QName("", "region-code");
    private final static QName _Phone1_QNAME = new QName("", "phone1");
    private final static QName _Phone2_QNAME = new QName("", "phone2");
    private final static QName _Fax_QNAME = new QName("", "fax");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Code_QNAME = new QName("", "code");
    private final static QName _CurrentStatus_QNAME = new QName("", "current-status");
    private final static QName _Title_QNAME = new QName("", "title");
    private final static QName _SubmittedUrl_QNAME = new QName("", "submitted-url");
    private final static QName _ShortenedUrl_QNAME = new QName("", "shortened-url");
    private final static QName _SubmittedImageUrl_QNAME = new QName("", "submitted-image-url");
    private final static QName _ThumbnailUrl_QNAME = new QName("", "thumbnail-url");
    private final static QName _ResolvedUrl_QNAME = new QName("", "resolved-url");
    private final static QName _EyebrowUrl_QNAME = new QName("", "eyebrow-url");
    private final static QName _Url_QNAME = new QName("", "url");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _CurrentStatusTimestamp_QNAME = new QName("", "current-status-timestamp");
    private final static QName _NumRecommenders_QNAME = new QName("", "num-recommenders");
    private final static QName _NumConnections_QNAME = new QName("", "num-connections");
    private final static QName _NumConnectionsCapped_QNAME = new QName("", "num-connections-capped");
    private final static QName _Summary_QNAME = new QName("", "summary");
    private final static QName _PublicProfileUrl_QNAME = new QName("", "public-profile-url");
    private final static QName _Interests_QNAME = new QName("", "interests");
    private final static QName _Associations_QNAME = new QName("", "associations");
    private final static QName _Honors_QNAME = new QName("", "honors");
    private final static QName _Number_QNAME = new QName("", "number");
    private final static QName _Year_QNAME = new QName("", "year");
    private final static QName _Month_QNAME = new QName("", "month");
    private final static QName _Day_QNAME = new QName("", "day");
    private final static QName _Level_QNAME = new QName("", "level");
    private final static QName _IsCurrent_QNAME = new QName("", "is-current");
    private final static QName _UniversalName_QNAME = new QName("", "universal-name");
    private final static QName _LogoUrl_QNAME = new QName("", "logo-url");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Size_QNAME = new QName("", "size");
    private final static QName _Ticker_QNAME = new QName("", "ticker");
    private final static QName _Specialty_QNAME = new QName("", "specialty");
    private final static QName _BlogRssUrl_QNAME = new QName("", "blog-rss-url");
    private final static QName _TwitterId_QNAME = new QName("", "twitter-id");
    private final static QName _SquareLogoUrl_QNAME = new QName("", "square-logo-url");
    private final static QName _FoundedYear_QNAME = new QName("", "founded-year");
    private final static QName _EndYear_QNAME = new QName("", "end-year");
    private final static QName _EmailDomain_QNAME = new QName("", "email-domain");
    private final static QName _WebsiteUrl_QNAME = new QName("", "website-url");
    private final static QName _DescriptionSnippet_QNAME = new QName("", "description-snippet");
    private final static QName _SkillsAndExperience_QNAME = new QName("", "skills-and-experience");
    private final static QName _SchoolName_QNAME = new QName("", "school-name");
    private final static QName _Degree_QNAME = new QName("", "degree");
    private final static QName _Notes_QNAME = new QName("", "notes");
    private final static QName _Activities_QNAME = new QName("", "activities");
    private final static QName _FieldOfStudy_QNAME = new QName("", "field-of-study");
    private final static QName _PictureUrl_QNAME = new QName("", "picture-url");
    private final static QName _RecommendationText_QNAME = new QName("", "recommendation-text");
    private final static QName _RecommendationSnippet_QNAME = new QName("", "recommendation-snippet");
    private final static QName _WebUrl_QNAME = new QName("", "web-url");
    private final static QName _ProductId_QNAME = new QName("", "product-id");
    private final static QName _Text_QNAME = new QName("", "text");
    private final static QName _Reply_QNAME = new QName("", "reply");
    private final static QName _ImAccountType_QNAME = new QName("", "im-account-type");
    private final static QName _ImAccountName_QNAME = new QName("", "im-account-name");
    private final static QName _ProviderAccountId_QNAME = new QName("", "provider-account-id");
    private final static QName _ProviderAccountName_QNAME = new QName("", "provider-account-name");
    private final static QName _MainAddress_QNAME = new QName("", "main-address");
    private final static QName _PhoneType_QNAME = new QName("", "phone-type");
    private final static QName _Subject_QNAME = new QName("", "subject");
    private final static QName _ConnectType_QNAME = new QName("", "connect-type");
    private final static QName _UpdateKey_QNAME = new QName("", "update-key");
    private final static QName _UpdateType_QNAME = new QName("", "update-type");
    private final static QName _IsCommentable_QNAME = new QName("", "is-commentable");
    private final static QName _SequenceNumber_QNAME = new QName("", "sequence-number");
    private final static QName _IsLikable_QNAME = new QName("", "is-likable");
    private final static QName _NumLikes_QNAME = new QName("", "num-likes");
    private final static QName _PartnerJobId_QNAME = new QName("", "partner-job-id");
    private final static QName _ContractId_QNAME = new QName("", "contract-id");
    private final static QName _CustomerJobCode_QNAME = new QName("", "customer-job-code");
    private final static QName _Active_QNAME = new QName("", "active");
    private final static QName _ExpirationTimestamp_QNAME = new QName("", "expiration-timestamp");
    private final static QName _LocationDescription_QNAME = new QName("", "location-description");
    private final static QName _PostingTimestamp_QNAME = new QName("", "posting-timestamp");
    private final static QName _Salary_QNAME = new QName("", "salary");
    private final static QName _SiteJobUrl_QNAME = new QName("", "site-job-url");
    private final static QName _ReferralBonus_QNAME = new QName("", "referral-bonus");
    private final static QName _Display_QNAME = new QName("", "display");
    private final static QName _EmailAddress_QNAME = new QName("", "email-address");
    private final static QName _ApplicationUrl_QNAME = new QName("", "application-url");
    private final static QName _TrackingPixelUrl_QNAME = new QName("", "tracking-pixel-url");
    private final static QName _ShortDescription_QNAME = new QName("", "short-description");
    private final static QName _Count_QNAME = new QName("", "count");
    private final static QName _IsOpenToNonMembers_QNAME = new QName("", "is-open-to-non-members");
    private final static QName _SiteGroupUrl_QNAME = new QName("", "site-group-url");
    private final static QName _ContactEmail_QNAME = new QName("", "contact-email");
    private final static QName _Locale_QNAME = new QName("", "locale");
    private final static QName _AllowMemberInvites_QNAME = new QName("", "allow-member-invites");
    private final static QName _SmallLogoUrl_QNAME = new QName("", "small-logo-url");
    private final static QName _LargeLogoUrl_QNAME = new QName("", "large-logo-url");
    private final static QName _CreationTimestamp_QNAME = new QName("", "creation-timestamp");
    private final static QName _ContentDomain_QNAME = new QName("", "content-domain");
    private final static QName _ContentUrl_QNAME = new QName("", "content-url");
    private final static QName _ImageUrl_QNAME = new QName("", "image-url");
    private final static QName _SiteGroupPostUrl_QNAME = new QName("", "site-group-post-url");
    private final static QName _NumResults_QNAME = new QName("", "num-results");
    private final static QName _Selected_QNAME = new QName("", "selected");
    private final static QName _ShowGroupLogoInProfile_QNAME = new QName("", "show-group-logo-in-profile");
    private final static QName _AllowMessagesFromMembers_QNAME = new QName("", "allow-messages-from-members");
    private final static QName _EmailAnnouncementsFromManagers_QNAME = new QName("", "email-announcements-from-managers");
    private final static QName _EmailForEveryNewPost_QNAME = new QName("", "email-for-every-new-post");
    private final static QName _IsApplied_QNAME = new QName("", "is-applied");
    private final static QName _IsSaved_QNAME = new QName("", "is-saved");
    private final static QName _SavedTimestamp_QNAME = new QName("", "saved-timestamp");
    private final static QName _AppliedTimestamp_QNAME = new QName("", "applied-timestamp");
    private final static QName _Feature_QNAME = new QName("", "feature");
    private final static QName _NumRecommendations_QNAME = new QName("", "num-recommendations");
    private final static QName _Disclaimer_QNAME = new QName("", "disclaimer");
    private final static QName _Order_QNAME = new QName("", "order");
    private final static QName _PostRole_QNAME = new QName("", "post-role");
    private final static QName _EventType_QNAME = new QName("", "event-type");
    private final static QName _TimeGranularity_QNAME = new QName("", "time-granularity");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.apache.camel.component.linkedin.api.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link Error }
     * 
     */
    public Error createError() {
        return new Error();
    }

    /**
     * Create an instance of {@link MailboxItem }
     * 
     */
    public MailboxItem createMailboxItem() {
        return new MailboxItem();
    }

    /**
     * Create an instance of {@link Recipients }
     * 
     */
    public Recipients createRecipients() {
        return new Recipients();
    }

    /**
     * Create an instance of {@link Recipient }
     * 
     */
    public Recipient createRecipient() {
        return new Recipient();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link ContactInfo }
     * 
     */
    public ContactInfo createContactInfo() {
        return new ContactInfo();
    }

    /**
     * Create an instance of {@link Country }
     * 
     */
    public Country createCountry() {
        return new Country();
    }

    /**
     * Create an instance of {@link Connections }
     * 
     */
    public Connections createConnections() {
        return new Connections();
    }

    /**
     * Create an instance of {@link CurrentShare }
     * 
     */
    public CurrentShare createCurrentShare() {
        return new CurrentShare();
    }

    /**
     * Create an instance of {@link Content }
     * 
     */
    public Content createContent() {
        return new Content();
    }

    /**
     * Create an instance of {@link Visibility }
     * 
     */
    public Visibility createVisibility() {
        return new Visibility();
    }

    /**
     * Create an instance of {@link Source }
     * 
     */
    public Source createSource() {
        return new Source();
    }

    /**
     * Create an instance of {@link ServiceProvider }
     * 
     */
    public ServiceProvider createServiceProvider() {
        return new ServiceProvider();
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link Author }
     * 
     */
    public Author createAuthor() {
        return new Author();
    }

    /**
     * Create an instance of {@link RelationToViewer }
     * 
     */
    public RelationToViewer createRelationToViewer() {
        return new RelationToViewer();
    }

    /**
     * Create an instance of {@link RelatedConnections }
     * 
     */
    public RelatedConnections createRelatedConnections() {
        return new RelatedConnections();
    }

    /**
     * Create an instance of {@link Distance }
     * 
     */
    public Distance createDistance() {
        return new Distance();
    }

    /**
     * Create an instance of {@link MembershipState }
     * 
     */
    public MembershipState createMembershipState() {
        return new MembershipState();
    }

    /**
     * Create an instance of {@link IsFollowing }
     * 
     */
    public IsFollowing createIsFollowing() {
        return new IsFollowing();
    }

    /**
     * Create an instance of {@link IsLiked }
     * 
     */
    public IsLiked createIsLiked() {
        return new IsLiked();
    }

    /**
     * Create an instance of {@link AvailableActions }
     * 
     */
    public AvailableActions createAvailableActions() {
        return new AvailableActions();
    }

    /**
     * Create an instance of {@link Action }
     * 
     */
    public Action createAction() {
        return new Action();
    }

    /**
     * Create an instance of {@link ApiStandardProfileRequest }
     * 
     */
    public ApiStandardProfileRequest createApiStandardProfileRequest() {
        return new ApiStandardProfileRequest();
    }

    /**
     * Create an instance of {@link Headers }
     * 
     */
    public Headers createHeaders() {
        return new Headers();
    }

    /**
     * Create an instance of {@link HttpHeader }
     * 
     */
    public HttpHeader createHttpHeader() {
        return new HttpHeader();
    }

    /**
     * Create an instance of {@link SiteStandardProfileRequest }
     * 
     */
    public SiteStandardProfileRequest createSiteStandardProfileRequest() {
        return new SiteStandardProfileRequest();
    }

    /**
     * Create an instance of {@link Certifications }
     * 
     */
    public Certifications createCertifications() {
        return new Certifications();
    }

    /**
     * Create an instance of {@link Certification }
     * 
     */
    public Certification createCertification() {
        return new Certification();
    }

    /**
     * Create an instance of {@link Authority }
     * 
     */
    public Authority createAuthority() {
        return new Authority();
    }

    /**
     * Create an instance of {@link StartDate }
     * 
     */
    public StartDate createStartDate() {
        return new StartDate();
    }

    /**
     * Create an instance of {@link EndDate }
     * 
     */
    public EndDate createEndDate() {
        return new EndDate();
    }

    /**
     * Create an instance of {@link Patents }
     * 
     */
    public Patents createPatents() {
        return new Patents();
    }

    /**
     * Create an instance of {@link Patent }
     * 
     */
    public Patent createPatent() {
        return new Patent();
    }

    /**
     * Create an instance of {@link Date }
     * 
     */
    public Date createDate() {
        return new Date();
    }

    /**
     * Create an instance of {@link Status }
     * 
     */
    public Status createStatus() {
        return new Status();
    }

    /**
     * Create an instance of {@link Office }
     * 
     */
    public Office createOffice() {
        return new Office();
    }

    /**
     * Create an instance of {@link Inventors }
     * 
     */
    public Inventors createInventors() {
        return new Inventors();
    }

    /**
     * Create an instance of {@link Inventor }
     * 
     */
    public Inventor createInventor() {
        return new Inventor();
    }

    /**
     * Create an instance of {@link Publications }
     * 
     */
    public Publications createPublications() {
        return new Publications();
    }

    /**
     * Create an instance of {@link Publication }
     * 
     */
    public Publication createPublication() {
        return new Publication();
    }

    /**
     * Create an instance of {@link Authors }
     * 
     */
    public Authors createAuthors() {
        return new Authors();
    }

    /**
     * Create an instance of {@link PublicationAuthor }
     * 
     */
    public PublicationAuthor createPublicationAuthor() {
        return new PublicationAuthor();
    }

    /**
     * Create an instance of {@link Publisher }
     * 
     */
    public Publisher createPublisher() {
        return new Publisher();
    }

    /**
     * Create an instance of {@link Skills }
     * 
     */
    public Skills createSkills() {
        return new Skills();
    }

    /**
     * Create an instance of {@link Skill }
     * 
     */
    public Skill createSkill() {
        return new Skill();
    }

    /**
     * Create an instance of {@link Proficiency }
     * 
     */
    public Proficiency createProficiency() {
        return new Proficiency();
    }

    /**
     * Create an instance of {@link Years }
     * 
     */
    public Years createYears() {
        return new Years();
    }

    /**
     * Create an instance of {@link NameType }
     * 
     */
    public NameType createNameType() {
        return new NameType();
    }

    /**
     * Create an instance of {@link Languages }
     * 
     */
    public Languages createLanguages() {
        return new Languages();
    }

    /**
     * Create an instance of {@link Language }
     * 
     */
    public Language createLanguage() {
        return new Language();
    }

    /**
     * Create an instance of {@link Positions }
     * 
     */
    public Positions createPositions() {
        return new Positions();
    }

    /**
     * Create an instance of {@link Position }
     * 
     */
    public Position createPosition() {
        return new Position();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link CompanyType }
     * 
     */
    public CompanyType createCompanyType() {
        return new CompanyType();
    }

    /**
     * Create an instance of {@link StockExchange }
     * 
     */
    public StockExchange createStockExchange() {
        return new StockExchange();
    }

    /**
     * Create an instance of {@link Specialties }
     * 
     */
    public Specialties createSpecialties() {
        return new Specialties();
    }

    /**
     * Create an instance of {@link Locations }
     * 
     */
    public Locations createLocations() {
        return new Locations();
    }

    /**
     * Create an instance of {@link NumFollowers }
     * 
     */
    public NumFollowers createNumFollowers() {
        return new NumFollowers();
    }

    /**
     * Create an instance of {@link EmailDomains }
     * 
     */
    public EmailDomains createEmailDomains() {
        return new EmailDomains();
    }

    /**
     * Create an instance of {@link CompanyStatus }
     * 
     */
    public CompanyStatus createCompanyStatus() {
        return new CompanyStatus();
    }

    /**
     * Create an instance of {@link EmployeeCountRange }
     * 
     */
    public EmployeeCountRange createEmployeeCountRange() {
        return new EmployeeCountRange();
    }

    /**
     * Create an instance of {@link JobFunctions }
     * 
     */
    public JobFunctions createJobFunctions() {
        return new JobFunctions();
    }

    /**
     * Create an instance of {@link JobFunction }
     * 
     */
    public JobFunction createJobFunction() {
        return new JobFunction();
    }

    /**
     * Create an instance of {@link Industries }
     * 
     */
    public Industries createIndustries() {
        return new Industries();
    }

    /**
     * Create an instance of {@link Industry }
     * 
     */
    public Industry createIndustry() {
        return new Industry();
    }

    /**
     * Create an instance of {@link JobType }
     * 
     */
    public JobType createJobType() {
        return new JobType();
    }

    /**
     * Create an instance of {@link ExperienceLevel }
     * 
     */
    public ExperienceLevel createExperienceLevel() {
        return new ExperienceLevel();
    }

    /**
     * Create an instance of {@link ThreeCurrentPositions }
     * 
     */
    public ThreeCurrentPositions createThreeCurrentPositions() {
        return new ThreeCurrentPositions();
    }

    /**
     * Create an instance of {@link ThreePastPositions }
     * 
     */
    public ThreePastPositions createThreePastPositions() {
        return new ThreePastPositions();
    }

    /**
     * Create an instance of {@link Educations }
     * 
     */
    public Educations createEducations() {
        return new Educations();
    }

    /**
     * Create an instance of {@link Education }
     * 
     */
    public Education createEducation() {
        return new Education();
    }

    /**
     * Create an instance of {@link MemberUrlResources }
     * 
     */
    public MemberUrlResources createMemberUrlResources() {
        return new MemberUrlResources();
    }

    /**
     * Create an instance of {@link MemberUrl }
     * 
     */
    public MemberUrl createMemberUrl() {
        return new MemberUrl();
    }

    /**
     * Create an instance of {@link RecommendationsGiven }
     * 
     */
    public RecommendationsGiven createRecommendationsGiven() {
        return new RecommendationsGiven();
    }

    /**
     * Create an instance of {@link Recommendation }
     * 
     */
    public Recommendation createRecommendation() {
        return new Recommendation();
    }

    /**
     * Create an instance of {@link RecommendationType }
     * 
     */
    public RecommendationType createRecommendationType() {
        return new RecommendationType();
    }

    /**
     * Create an instance of {@link Recommender }
     * 
     */
    public Recommender createRecommender() {
        return new Recommender();
    }

    /**
     * Create an instance of {@link Recommendee }
     * 
     */
    public Recommendee createRecommendee() {
        return new Recommendee();
    }

    /**
     * Create an instance of {@link Likes }
     * 
     */
    public Likes createLikes() {
        return new Likes();
    }

    /**
     * Create an instance of {@link Like }
     * 
     */
    public Like createLike() {
        return new Like();
    }

    /**
     * Create an instance of {@link RecommendationsReceived }
     * 
     */
    public RecommendationsReceived createRecommendationsReceived() {
        return new RecommendationsReceived();
    }

    /**
     * Create an instance of {@link MemberGroups }
     * 
     */
    public MemberGroups createMemberGroups() {
        return new MemberGroups();
    }

    /**
     * Create an instance of {@link MemberGroup }
     * 
     */
    public MemberGroup createMemberGroup() {
        return new MemberGroup();
    }

    /**
     * Create an instance of {@link SiteGroupRequest }
     * 
     */
    public SiteGroupRequest createSiteGroupRequest() {
        return new SiteGroupRequest();
    }

    /**
     * Create an instance of {@link PersonActivities }
     * 
     */
    public PersonActivities createPersonActivities() {
        return new PersonActivities();
    }

    /**
     * Create an instance of {@link ImAccounts }
     * 
     */
    public ImAccounts createImAccounts() {
        return new ImAccounts();
    }

    /**
     * Create an instance of {@link ImAccount }
     * 
     */
    public ImAccount createImAccount() {
        return new ImAccount();
    }

    /**
     * Create an instance of {@link TwitterAccounts }
     * 
     */
    public TwitterAccounts createTwitterAccounts() {
        return new TwitterAccounts();
    }

    /**
     * Create an instance of {@link TwitterAccount }
     * 
     */
    public TwitterAccount createTwitterAccount() {
        return new TwitterAccount();
    }

    /**
     * Create an instance of {@link DateOfBirth }
     * 
     */
    public DateOfBirth createDateOfBirth() {
        return new DateOfBirth();
    }

    /**
     * Create an instance of {@link PhoneNumbers }
     * 
     */
    public PhoneNumbers createPhoneNumbers() {
        return new PhoneNumbers();
    }

    /**
     * Create an instance of {@link PhoneNumber }
     * 
     */
    public PhoneNumber createPhoneNumber() {
        return new PhoneNumber();
    }

    /**
     * Create an instance of {@link Following }
     * 
     */
    public Following createFollowing() {
        return new Following();
    }

    /**
     * Create an instance of {@link People }
     * 
     */
    public People createPeople() {
        return new People();
    }

    /**
     * Create an instance of {@link ItemContent }
     * 
     */
    public ItemContent createItemContent() {
        return new ItemContent();
    }

    /**
     * Create an instance of {@link InvitationRequest }
     * 
     */
    public InvitationRequest createInvitationRequest() {
        return new InvitationRequest();
    }

    /**
     * Create an instance of {@link Authorization }
     * 
     */
    public Authorization createAuthorization() {
        return new Authorization();
    }

    /**
     * Create an instance of {@link Network }
     * 
     */
    public Network createNetwork() {
        return new Network();
    }

    /**
     * Create an instance of {@link NetworkStats }
     * 
     */
    public NetworkStats createNetworkStats() {
        return new NetworkStats();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Updates }
     * 
     */
    public Updates createUpdates() {
        return new Updates();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateContent }
     * 
     */
    public UpdateContent createUpdateContent() {
        return new UpdateContent();
    }

    /**
     * Create an instance of {@link UpdateAction }
     * 
     */
    public UpdateAction createUpdateAction() {
        return new UpdateAction();
    }

    /**
     * Create an instance of {@link OriginalUpdate }
     * 
     */
    public OriginalUpdate createOriginalUpdate() {
        return new OriginalUpdate();
    }

    /**
     * Create an instance of {@link UpdatedFields }
     * 
     */
    public UpdatedFields createUpdatedFields() {
        return new UpdatedFields();
    }

    /**
     * Create an instance of {@link UpdateField }
     * 
     */
    public UpdateField createUpdateField() {
        return new UpdateField();
    }

    /**
     * Create an instance of {@link UpdateComments }
     * 
     */
    public UpdateComments createUpdateComments() {
        return new UpdateComments();
    }

    /**
     * Create an instance of {@link UpdateComment }
     * 
     */
    public UpdateComment createUpdateComment() {
        return new UpdateComment();
    }

    /**
     * Create an instance of {@link Job }
     * 
     */
    public Job createJob() {
        return new Job();
    }

    /**
     * Create an instance of {@link PostingDate }
     * 
     */
    public PostingDate createPostingDate() {
        return new PostingDate();
    }

    /**
     * Create an instance of {@link ExpirationDate }
     * 
     */
    public ExpirationDate createExpirationDate() {
        return new ExpirationDate();
    }

    /**
     * Create an instance of {@link JobPoster }
     * 
     */
    public JobPoster createJobPoster() {
        return new JobPoster();
    }

    /**
     * Create an instance of {@link SiteJobRequest }
     * 
     */
    public SiteJobRequest createSiteJobRequest() {
        return new SiteJobRequest();
    }

    /**
     * Create an instance of {@link Poster }
     * 
     */
    public Poster createPoster() {
        return new Poster();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link HowToApply }
     * 
     */
    public HowToApply createHowToApply() {
        return new HowToApply();
    }

    /**
     * Create an instance of {@link Renewal }
     * 
     */
    public Renewal createRenewal() {
        return new Renewal();
    }

    /**
     * Create an instance of {@link Question }
     * 
     */
    public Question createQuestion() {
        return new Question();
    }

    /**
     * Create an instance of {@link QuestionCategories }
     * 
     */
    public QuestionCategories createQuestionCategories() {
        return new QuestionCategories();
    }

    /**
     * Create an instance of {@link QuestionCategory }
     * 
     */
    public QuestionCategory createQuestionCategory() {
        return new QuestionCategory();
    }

    /**
     * Create an instance of {@link Answers }
     * 
     */
    public Answers createAnswers() {
        return new Answers();
    }

    /**
     * Create an instance of {@link Answer }
     * 
     */
    public Answer createAnswer() {
        return new Answer();
    }

    /**
     * Create an instance of {@link CompanyJobUpdate }
     * 
     */
    public CompanyJobUpdate createCompanyJobUpdate() {
        return new CompanyJobUpdate();
    }

    /**
     * Create an instance of {@link CompanyStatusUpdate }
     * 
     */
    public CompanyStatusUpdate createCompanyStatusUpdate() {
        return new CompanyStatusUpdate();
    }

    /**
     * Create an instance of {@link Share }
     * 
     */
    public Share createShare() {
        return new Share();
    }

    /**
     * Create an instance of {@link Attribution }
     * 
     */
    public Attribution createAttribution() {
        return new Attribution();
    }

    /**
     * Create an instance of {@link ShareTargetReach }
     * 
     */
    public ShareTargetReach createShareTargetReach() {
        return new ShareTargetReach();
    }

    /**
     * Create an instance of {@link ShareTargets }
     * 
     */
    public ShareTargets createShareTargets() {
        return new ShareTargets();
    }

    /**
     * Create an instance of {@link CompanyPersonUpdate }
     * 
     */
    public CompanyPersonUpdate createCompanyPersonUpdate() {
        return new CompanyPersonUpdate();
    }

    /**
     * Create an instance of {@link OldPosition }
     * 
     */
    public OldPosition createOldPosition() {
        return new OldPosition();
    }

    /**
     * Create an instance of {@link NewPosition }
     * 
     */
    public NewPosition createNewPosition() {
        return new NewPosition();
    }

    /**
     * Create an instance of {@link CompanyProfileUpdate }
     * 
     */
    public CompanyProfileUpdate createCompanyProfileUpdate() {
        return new CompanyProfileUpdate();
    }

    /**
     * Create an instance of {@link Editor }
     * 
     */
    public Editor createEditor() {
        return new Editor();
    }

    /**
     * Create an instance of {@link ProfileField }
     * 
     */
    public ProfileField createProfileField() {
        return new ProfileField();
    }

    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }

    /**
     * Create an instance of {@link CountsByCategory }
     * 
     */
    public CountsByCategory createCountsByCategory() {
        return new CountsByCategory();
    }

    /**
     * Create an instance of {@link CountForCategory }
     * 
     */
    public CountForCategory createCountForCategory() {
        return new CountForCategory();
    }

    /**
     * Create an instance of {@link Category }
     * 
     */
    public Category createCategory() {
        return new Category();
    }

    /**
     * Create an instance of {@link GroupCategory }
     * 
     */
    public GroupCategory createGroupCategory() {
        return new GroupCategory();
    }

    /**
     * Create an instance of {@link Posts }
     * 
     */
    public Posts createPosts() {
        return new Posts();
    }

    /**
     * Create an instance of {@link Post }
     * 
     */
    public Post createPost() {
        return new Post();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Creator }
     * 
     */
    public Creator createCreator() {
        return new Creator();
    }

    /**
     * Create an instance of {@link Attachment }
     * 
     */
    public Attachment createAttachment() {
        return new Attachment();
    }

    /**
     * Create an instance of {@link Comments }
     * 
     */
    public Comments createComments() {
        return new Comments();
    }

    /**
     * Create an instance of {@link Comment }
     * 
     */
    public Comment createComment() {
        return new Comment();
    }

    /**
     * Create an instance of {@link Companies }
     * 
     */
    public Companies createCompanies() {
        return new Companies();
    }

    /**
     * Create an instance of {@link CompanySearch }
     * 
     */
    public CompanySearch createCompanySearch() {
        return new CompanySearch();
    }

    /**
     * Create an instance of {@link Facets }
     * 
     */
    public Facets createFacets() {
        return new Facets();
    }

    /**
     * Create an instance of {@link Facet }
     * 
     */
    public Facet createFacet() {
        return new Facet();
    }

    /**
     * Create an instance of {@link Buckets }
     * 
     */
    public Buckets createBuckets() {
        return new Buckets();
    }

    /**
     * Create an instance of {@link Bucket }
     * 
     */
    public Bucket createBucket() {
        return new Bucket();
    }

    /**
     * Create an instance of {@link GroupMemberships }
     * 
     */
    public GroupMemberships createGroupMemberships() {
        return new GroupMemberships();
    }

    /**
     * Create an instance of {@link GroupMembership }
     * 
     */
    public GroupMembership createGroupMembership() {
        return new GroupMembership();
    }

    /**
     * Create an instance of {@link EmailDigestFrequency }
     * 
     */
    public EmailDigestFrequency createEmailDigestFrequency() {
        return new EmailDigestFrequency();
    }

    /**
     * Create an instance of {@link Groups }
     * 
     */
    public Groups createGroups() {
        return new Groups();
    }

    /**
     * Create an instance of {@link JobBookmarks }
     * 
     */
    public JobBookmarks createJobBookmarks() {
        return new JobBookmarks();
    }

    /**
     * Create an instance of {@link JobBookmark }
     * 
     */
    public JobBookmark createJobBookmark() {
        return new JobBookmark();
    }

    /**
     * Create an instance of {@link JobSuggestions }
     * 
     */
    public JobSuggestions createJobSuggestions() {
        return new JobSuggestions();
    }

    /**
     * Create an instance of {@link Jobs }
     * 
     */
    public Jobs createJobs() {
        return new Jobs();
    }

    /**
     * Create an instance of {@link JobSearch }
     * 
     */
    public JobSearch createJobSearch() {
        return new JobSearch();
    }

    /**
     * Create an instance of {@link Products }
     * 
     */
    public Products createProducts() {
        return new Products();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link Features }
     * 
     */
    public Features createFeatures() {
        return new Features();
    }

    /**
     * Create an instance of {@link ProductDeal }
     * 
     */
    public ProductDeal createProductDeal() {
        return new ProductDeal();
    }

    /**
     * Create an instance of {@link SalesPersons }
     * 
     */
    public SalesPersons createSalesPersons() {
        return new SalesPersons();
    }

    /**
     * Create an instance of {@link Video }
     * 
     */
    public Video createVideo() {
        return new Video();
    }

    /**
     * Create an instance of {@link Recommendations }
     * 
     */
    public Recommendations createRecommendations() {
        return new Recommendations();
    }

    /**
     * Create an instance of {@link ProductCategory }
     * 
     */
    public ProductCategory createProductCategory() {
        return new ProductCategory();
    }

    /**
     * Create an instance of {@link PeopleSearch }
     * 
     */
    public PeopleSearch createPeopleSearch() {
        return new PeopleSearch();
    }

    /**
     * Create an instance of {@link IsCompanyShareEnabled }
     * 
     */
    public IsCompanyShareEnabled createIsCompanyShareEnabled() {
        return new IsCompanyShareEnabled();
    }

    /**
     * Create an instance of {@link HistoricalFollowStatistics }
     * 
     */
    public HistoricalFollowStatistics createHistoricalFollowStatistics() {
        return new HistoricalFollowStatistics();
    }

    /**
     * Create an instance of {@link HistoricalFollowStatistic }
     * 
     */
    public HistoricalFollowStatistic createHistoricalFollowStatistic() {
        return new HistoricalFollowStatistic();
    }

    /**
     * Create an instance of {@link HistoricalStatusUpdateStatistics }
     * 
     */
    public HistoricalStatusUpdateStatistics createHistoricalStatusUpdateStatistics() {
        return new HistoricalStatusUpdateStatistics();
    }

    /**
     * Create an instance of {@link HistoricalStatusUpdateStatistic }
     * 
     */
    public HistoricalStatusUpdateStatistic createHistoricalStatusUpdateStatistic() {
        return new HistoricalStatusUpdateStatistic();
    }

    /**
     * Create an instance of {@link CompanyStatistics }
     * 
     */
    public CompanyStatistics createCompanyStatistics() {
        return new CompanyStatistics();
    }

    /**
     * Create an instance of {@link StatusUpdateStatistics }
     * 
     */
    public StatusUpdateStatistics createStatusUpdateStatistics() {
        return new StatusUpdateStatistics();
    }

    /**
     * Create an instance of {@link FollowStatistics }
     * 
     */
    public FollowStatistics createFollowStatistics() {
        return new FollowStatistics();
    }

    /**
     * Create an instance of {@link Seniorities }
     * 
     */
    public Seniorities createSeniorities() {
        return new Seniorities();
    }

    /**
     * Create an instance of {@link Seniority }
     * 
     */
    public Seniority createSeniority() {
        return new Seniority();
    }

    /**
     * Create an instance of {@link ViewsByMonth }
     * 
     */
    public ViewsByMonth createViewsByMonth() {
        return new ViewsByMonth();
    }

    /**
     * Create an instance of {@link ViewByMonth }
     * 
     */
    public ViewByMonth createViewByMonth() {
        return new ViewByMonth();
    }

    /**
     * Create an instance of {@link Date1 }
     * 
     */
    public Date1 createDate1() {
        return new Date1();
    }

    /**
     * Create an instance of {@link ShareTarget }
     * 
     */
    public ShareTarget createShareTarget() {
        return new ShareTarget();
    }

    /**
     * Create an instance of {@link Tvalues }
     * 
     */
    public Tvalues createTvalues() {
        return new Tvalues();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createTimestamp(Long value) {
        return new JAXBElement<Long>(_Timestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkUpdateContentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content-type")
    public JAXBElement<NetworkUpdateContentType> createContentType(NetworkUpdateContentType value) {
        return new JAXBElement<NetworkUpdateContentType>(_ContentType_QNAME, NetworkUpdateContentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "body")
    public JAXBElement<String> createBody(String value) {
        return new JAXBElement<String>(_Body_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "app-id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createAppId(String value) {
        return new JAXBElement<String>(_AppId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "error-code")
    public JAXBElement<String> createErrorCode(String value) {
        return new JAXBElement<String>(_ErrorCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "message")
    public JAXBElement<String> createMessage(String value) {
        return new JAXBElement<String>(_Message_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "request-id")
    public JAXBElement<String> createRequestId(String value) {
        return new JAXBElement<String>(_RequestId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "first-name")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "last-name")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "headline")
    public JAXBElement<String> createHeadline(String value) {
        return new JAXBElement<String>(_Headline_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description")
    public JAXBElement<String> createDescription(String value) {
        return new JAXBElement<String>(_Description_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-headquarters")
    public JAXBElement<Boolean> createIsHeadquarters(Boolean value) {
        return new JAXBElement<Boolean>(_IsHeadquarters_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-active")
    public JAXBElement<Boolean> createIsActive(Boolean value) {
        return new JAXBElement<Boolean>(_IsActive_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street1")
    public JAXBElement<String> createStreet1(String value) {
        return new JAXBElement<String>(_Street1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "street2")
    public JAXBElement<String> createStreet2(String value) {
        return new JAXBElement<String>(_Street2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "city")
    public JAXBElement<String> createCity(String value) {
        return new JAXBElement<String>(_City_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "postal-code")
    public JAXBElement<String> createPostalCode(String value) {
        return new JAXBElement<String>(_PostalCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "country-code")
    public JAXBElement<String> createCountryCode(String value) {
        return new JAXBElement<String>(_CountryCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "region-code")
    public JAXBElement<String> createRegionCode(String value) {
        return new JAXBElement<String>(_RegionCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone1")
    public JAXBElement<String> createPhone1(String value) {
        return new JAXBElement<String>(_Phone1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone2")
    public JAXBElement<String> createPhone2(String value) {
        return new JAXBElement<String>(_Phone2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "fax")
    public JAXBElement<String> createFax(String value) {
        return new JAXBElement<String>(_Fax_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "code")
    public JAXBElement<String> createCode(String value) {
        return new JAXBElement<String>(_Code_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "current-status")
    public JAXBElement<String> createCurrentStatus(String value) {
        return new JAXBElement<String>(_CurrentStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "title")
    public JAXBElement<String> createTitle(String value) {
        return new JAXBElement<String>(_Title_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "submitted-url")
    public JAXBElement<String> createSubmittedUrl(String value) {
        return new JAXBElement<String>(_SubmittedUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "shortened-url")
    public JAXBElement<String> createShortenedUrl(String value) {
        return new JAXBElement<String>(_ShortenedUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "submitted-image-url")
    public JAXBElement<String> createSubmittedImageUrl(String value) {
        return new JAXBElement<String>(_SubmittedImageUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "thumbnail-url")
    public JAXBElement<String> createThumbnailUrl(String value) {
        return new JAXBElement<String>(_ThumbnailUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "resolved-url")
    public JAXBElement<String> createResolvedUrl(String value) {
        return new JAXBElement<String>(_ResolvedUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "eyebrow-url")
    public JAXBElement<String> createEyebrowUrl(String value) {
        return new JAXBElement<String>(_EyebrowUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "url")
    public JAXBElement<String> createUrl(String value) {
        return new JAXBElement<String>(_Url_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "current-status-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createCurrentStatusTimestamp(Long value) {
        return new JAXBElement<Long>(_CurrentStatusTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-recommenders")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createNumRecommenders(Long value) {
        return new JAXBElement<Long>(_NumRecommenders_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-connections")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createNumConnections(Long value) {
        return new JAXBElement<Long>(_NumConnections_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-connections-capped")
    public JAXBElement<Boolean> createNumConnectionsCapped(Boolean value) {
        return new JAXBElement<Boolean>(_NumConnectionsCapped_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "summary")
    public JAXBElement<String> createSummary(String value) {
        return new JAXBElement<String>(_Summary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "public-profile-url")
    public JAXBElement<String> createPublicProfileUrl(String value) {
        return new JAXBElement<String>(_PublicProfileUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "interests")
    public JAXBElement<String> createInterests(String value) {
        return new JAXBElement<String>(_Interests_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "associations")
    public JAXBElement<String> createAssociations(String value) {
        return new JAXBElement<String>(_Associations_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "honors")
    public JAXBElement<String> createHonors(String value) {
        return new JAXBElement<String>(_Honors_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "number")
    public JAXBElement<String> createNumber(String value) {
        return new JAXBElement<String>(_Number_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "year")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createYear(Long value) {
        return new JAXBElement<Long>(_Year_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "month")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createMonth(Long value) {
        return new JAXBElement<Long>(_Month_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "day")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createDay(Long value) {
        return new JAXBElement<Long>(_Day_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProficiencyLevelType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "level")
    public JAXBElement<ProficiencyLevelType> createLevel(ProficiencyLevelType value) {
        return new JAXBElement<ProficiencyLevelType>(_Level_QNAME, ProficiencyLevelType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-current")
    public JAXBElement<Boolean> createIsCurrent(Boolean value) {
        return new JAXBElement<Boolean>(_IsCurrent_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "universal-name")
    public JAXBElement<String> createUniversalName(String value) {
        return new JAXBElement<String>(_UniversalName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "logo-url")
    public JAXBElement<String> createLogoUrl(String value) {
        return new JAXBElement<String>(_LogoUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "size")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSize(String value) {
        return new JAXBElement<String>(_Size_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "ticker")
    public JAXBElement<String> createTicker(String value) {
        return new JAXBElement<String>(_Ticker_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "specialty")
    public JAXBElement<String> createSpecialty(String value) {
        return new JAXBElement<String>(_Specialty_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "blog-rss-url")
    public JAXBElement<String> createBlogRssUrl(String value) {
        return new JAXBElement<String>(_BlogRssUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "twitter-id")
    public JAXBElement<String> createTwitterId(String value) {
        return new JAXBElement<String>(_TwitterId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "square-logo-url")
    public JAXBElement<String> createSquareLogoUrl(String value) {
        return new JAXBElement<String>(_SquareLogoUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "founded-year")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createFoundedYear(Long value) {
        return new JAXBElement<Long>(_FoundedYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "end-year")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createEndYear(Long value) {
        return new JAXBElement<Long>(_EndYear_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email-domain")
    public JAXBElement<String> createEmailDomain(String value) {
        return new JAXBElement<String>(_EmailDomain_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "website-url")
    public JAXBElement<String> createWebsiteUrl(String value) {
        return new JAXBElement<String>(_WebsiteUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "description-snippet")
    public JAXBElement<String> createDescriptionSnippet(String value) {
        return new JAXBElement<String>(_DescriptionSnippet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "skills-and-experience")
    public JAXBElement<String> createSkillsAndExperience(String value) {
        return new JAXBElement<String>(_SkillsAndExperience_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "school-name")
    public JAXBElement<String> createSchoolName(String value) {
        return new JAXBElement<String>(_SchoolName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "degree")
    public JAXBElement<String> createDegree(String value) {
        return new JAXBElement<String>(_Degree_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "notes")
    public JAXBElement<String> createNotes(String value) {
        return new JAXBElement<String>(_Notes_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "activities")
    public JAXBElement<String> createActivities(String value) {
        return new JAXBElement<String>(_Activities_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "field-of-study")
    public JAXBElement<String> createFieldOfStudy(String value) {
        return new JAXBElement<String>(_FieldOfStudy_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "picture-url")
    public JAXBElement<String> createPictureUrl(String value) {
        return new JAXBElement<String>(_PictureUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recommendation-text")
    public JAXBElement<String> createRecommendationText(String value) {
        return new JAXBElement<String>(_RecommendationText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "recommendation-snippet")
    public JAXBElement<String> createRecommendationSnippet(String value) {
        return new JAXBElement<String>(_RecommendationSnippet_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "web-url")
    public JAXBElement<String> createWebUrl(String value) {
        return new JAXBElement<String>(_WebUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "product-id")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createProductId(Long value) {
        return new JAXBElement<Long>(_ProductId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "text")
    public JAXBElement<String> createText(String value) {
        return new JAXBElement<String>(_Text_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "reply")
    public JAXBElement<String> createReply(String value) {
        return new JAXBElement<String>(_Reply_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImAccountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "im-account-type")
    public JAXBElement<ImAccountType> createImAccountType(ImAccountType value) {
        return new JAXBElement<ImAccountType>(_ImAccountType_QNAME, ImAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "im-account-name")
    public JAXBElement<String> createImAccountName(String value) {
        return new JAXBElement<String>(_ImAccountName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provider-account-id")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createProviderAccountId(Long value) {
        return new JAXBElement<Long>(_ProviderAccountId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "provider-account-name")
    public JAXBElement<String> createProviderAccountName(String value) {
        return new JAXBElement<String>(_ProviderAccountName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "main-address")
    public JAXBElement<String> createMainAddress(String value) {
        return new JAXBElement<String>(_MainAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "phone-type")
    public JAXBElement<PhoneType> createPhoneType(PhoneType value) {
        return new JAXBElement<PhoneType>(_PhoneType_QNAME, PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "subject")
    public JAXBElement<String> createSubject(String value) {
        return new JAXBElement<String>(_Subject_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InviteConnectType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "connect-type")
    public JAXBElement<InviteConnectType> createConnectType(InviteConnectType value) {
        return new JAXBElement<InviteConnectType>(_ConnectType_QNAME, InviteConnectType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "update-key")
    public JAXBElement<String> createUpdateKey(String value) {
        return new JAXBElement<String>(_UpdateKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NetworkUpdateReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "update-type")
    public JAXBElement<NetworkUpdateReturnType> createUpdateType(NetworkUpdateReturnType value) {
        return new JAXBElement<NetworkUpdateReturnType>(_UpdateType_QNAME, NetworkUpdateReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-commentable")
    public JAXBElement<Boolean> createIsCommentable(Boolean value) {
        return new JAXBElement<Boolean>(_IsCommentable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "sequence-number")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createSequenceNumber(Long value) {
        return new JAXBElement<Long>(_SequenceNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-likable")
    public JAXBElement<Boolean> createIsLikable(Boolean value) {
        return new JAXBElement<Boolean>(_IsLikable_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-likes")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createNumLikes(Long value) {
        return new JAXBElement<Long>(_NumLikes_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "partner-job-id")
    public JAXBElement<String> createPartnerJobId(String value) {
        return new JAXBElement<String>(_PartnerJobId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contract-id")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createContractId(Long value) {
        return new JAXBElement<Long>(_ContractId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "customer-job-code")
    public JAXBElement<String> createCustomerJobCode(String value) {
        return new JAXBElement<String>(_CustomerJobCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "active")
    public JAXBElement<Boolean> createActive(Boolean value) {
        return new JAXBElement<Boolean>(_Active_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "expiration-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createExpirationTimestamp(Long value) {
        return new JAXBElement<Long>(_ExpirationTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location-description")
    public JAXBElement<String> createLocationDescription(String value) {
        return new JAXBElement<String>(_LocationDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "posting-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createPostingTimestamp(Long value) {
        return new JAXBElement<Long>(_PostingTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "salary")
    public JAXBElement<String> createSalary(String value) {
        return new JAXBElement<String>(_Salary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "site-job-url")
    public JAXBElement<String> createSiteJobUrl(String value) {
        return new JAXBElement<String>(_SiteJobUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "referral-bonus")
    public JAXBElement<String> createReferralBonus(String value) {
        return new JAXBElement<String>(_ReferralBonus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "display")
    public JAXBElement<Boolean> createDisplay(Boolean value) {
        return new JAXBElement<Boolean>(_Display_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email-address")
    public JAXBElement<String> createEmailAddress(String value) {
        return new JAXBElement<String>(_EmailAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "application-url")
    public JAXBElement<String> createApplicationUrl(String value) {
        return new JAXBElement<String>(_ApplicationUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tracking-pixel-url")
    public JAXBElement<String> createTrackingPixelUrl(String value) {
        return new JAXBElement<String>(_TrackingPixelUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "short-description")
    public JAXBElement<String> createShortDescription(String value) {
        return new JAXBElement<String>(_ShortDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "count")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createCount(Long value) {
        return new JAXBElement<Long>(_Count_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-open-to-non-members")
    public JAXBElement<Boolean> createIsOpenToNonMembers(Boolean value) {
        return new JAXBElement<Boolean>(_IsOpenToNonMembers_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "site-group-url")
    public JAXBElement<String> createSiteGroupUrl(String value) {
        return new JAXBElement<String>(_SiteGroupUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contact-email")
    public JAXBElement<String> createContactEmail(String value) {
        return new JAXBElement<String>(_ContactEmail_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "locale")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocale(String value) {
        return new JAXBElement<String>(_Locale_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "allow-member-invites")
    public JAXBElement<Boolean> createAllowMemberInvites(Boolean value) {
        return new JAXBElement<Boolean>(_AllowMemberInvites_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "small-logo-url")
    public JAXBElement<String> createSmallLogoUrl(String value) {
        return new JAXBElement<String>(_SmallLogoUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "large-logo-url")
    public JAXBElement<String> createLargeLogoUrl(String value) {
        return new JAXBElement<String>(_LargeLogoUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creation-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createCreationTimestamp(Long value) {
        return new JAXBElement<Long>(_CreationTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content-domain")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createContentDomain(String value) {
        return new JAXBElement<String>(_ContentDomain_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "content-url")
    public JAXBElement<String> createContentUrl(String value) {
        return new JAXBElement<String>(_ContentUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "image-url")
    public JAXBElement<String> createImageUrl(String value) {
        return new JAXBElement<String>(_ImageUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "site-group-post-url")
    public JAXBElement<String> createSiteGroupPostUrl(String value) {
        return new JAXBElement<String>(_SiteGroupPostUrl_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-results")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createNumResults(Long value) {
        return new JAXBElement<Long>(_NumResults_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "selected")
    public JAXBElement<Boolean> createSelected(Boolean value) {
        return new JAXBElement<Boolean>(_Selected_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "show-group-logo-in-profile")
    public JAXBElement<Boolean> createShowGroupLogoInProfile(Boolean value) {
        return new JAXBElement<Boolean>(_ShowGroupLogoInProfile_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "allow-messages-from-members")
    public JAXBElement<Boolean> createAllowMessagesFromMembers(Boolean value) {
        return new JAXBElement<Boolean>(_AllowMessagesFromMembers_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email-announcements-from-managers")
    public JAXBElement<Boolean> createEmailAnnouncementsFromManagers(Boolean value) {
        return new JAXBElement<Boolean>(_EmailAnnouncementsFromManagers_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "email-for-every-new-post")
    public JAXBElement<Boolean> createEmailForEveryNewPost(Boolean value) {
        return new JAXBElement<Boolean>(_EmailForEveryNewPost_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-applied")
    public JAXBElement<Boolean> createIsApplied(Boolean value) {
        return new JAXBElement<Boolean>(_IsApplied_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "is-saved")
    public JAXBElement<Boolean> createIsSaved(Boolean value) {
        return new JAXBElement<Boolean>(_IsSaved_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "saved-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createSavedTimestamp(Long value) {
        return new JAXBElement<Long>(_SavedTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "applied-timestamp")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createAppliedTimestamp(Long value) {
        return new JAXBElement<Long>(_AppliedTimestamp_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "feature")
    public JAXBElement<String> createFeature(String value) {
        return new JAXBElement<String>(_Feature_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "num-recommendations")
    @XmlJavaTypeAdapter(LongAdapter.class)
    public JAXBElement<Long> createNumRecommendations(Long value) {
        return new JAXBElement<Long>(_NumRecommendations_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "disclaimer")
    public JAXBElement<String> createDisclaimer(String value) {
        return new JAXBElement<String>(_Disclaimer_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Order }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "order")
    public JAXBElement<Order> createOrder(Order value) {
        return new JAXBElement<Order>(_Order_QNAME, Order.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PostRole }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "post-role")
    public JAXBElement<PostRole> createPostRole(PostRole value) {
        return new JAXBElement<PostRole>(_PostRole_QNAME, PostRole.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "event-type")
    public JAXBElement<EventType> createEventType(EventType value) {
        return new JAXBElement<EventType>(_EventType_QNAME, EventType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimeGranularity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "time-granularity")
    public JAXBElement<TimeGranularity> createTimeGranularity(TimeGranularity value) {
        return new JAXBElement<TimeGranularity>(_TimeGranularity_QNAME, TimeGranularity.class, null, value);
    }

}
